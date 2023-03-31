package locadora.extrato;

import locadora.Aluguel;
import locadora.Cliente;

public abstract class GeradorDeExtrato {

    protected static final String FIM_DE_LINHA = System.getProperty("line.separator");

    protected StringBuilder extratoBuilder;

    public GeradorDeExtrato() {
        this.extratoBuilder = new StringBuilder();
    }

    public final String emitirExtrato(Cliente cliente) {
        adicionarCabecalho(cliente);
        cliente.getAlugueis().forEach(this::adicionarInformacoesAluguel);
        adicionarRodape(cliente);

        return getExtratoFinalAndClearBuilder();
    }

    private void adicionarInformacoesAluguel(Aluguel aluguel) {
        extratoBuilder
                .append("\t")
                .append(aluguel.getTituloDoItemAlugavel())
                .append("\t R$ ")
                .append(aluguel.getValorDoAluguel())
                .append(getQuebraDeLinha())
                .append(FIM_DE_LINHA);
    }

    protected abstract void adicionarCabecalho(Cliente cliente);

    protected abstract String getQuebraDeLinha();

    protected abstract void adicionarRodape(Cliente cliente);

    private String getExtratoFinalAndClearBuilder() {
        String extratoFinal = extratoBuilder.toString();
        extratoBuilder = new StringBuilder();
        return extratoFinal;
    }
}
