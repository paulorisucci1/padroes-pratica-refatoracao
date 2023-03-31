package locadora.extrato;

import locadora.Cliente;

public class GeradorDeExtratoTexto extends GeradorDeExtrato {
    public GeradorDeExtratoTexto() {
        super();
    }

    @Override
    protected void adicionarCabecalho(Cliente cliente) {
        extratoBuilder
                .append("Registro de Alugueis de ")
                .append(cliente.getNome())
                .append(FIM_DE_LINHA);
    }

    @Override
    protected void adicionarRodape(Cliente cliente) {
        extratoBuilder
                .append("Valor total pago: R$ ")
                .append(cliente.getValorTotalAlugueis())
                .append(FIM_DE_LINHA)
                .append("Voce acumulou ")
                .append(cliente.getPontosTotaisDeAlugadorFrequente())
                .append(" pontos de alugador frequente");
    }

    @Override
    protected String getQuebraDeLinha() {
        return "";
    }

}
