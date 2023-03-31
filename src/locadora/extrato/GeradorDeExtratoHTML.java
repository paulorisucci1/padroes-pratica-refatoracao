package locadora.extrato;

import locadora.Cliente;

public class GeradorDeExtratoHTML extends GeradorDeExtrato {
    public GeradorDeExtratoHTML() {
        super();
    }

    @Override
    protected void adicionarCabecalho(Cliente cliente) {
        extratoBuilder
                .append("<H1>Registro de Alugueis de <EM>")
                .append(cliente.getNome())
                .append("</EM></H1><P>")
                .append(FIM_DE_LINHA);
    }

    @Override
    protected void adicionarRodape(Cliente cliente) {
        extratoBuilder
                .append("<P>Valor total pago: <EM>R$ ")
                .append(cliente.getValorTotalAlugueis())
                .append("</EM>")
                .append(FIM_DE_LINHA)
                .append("<P>Você acumulou <EM>")
                .append(cliente.getPontosTotaisDeAlugadorFrequente())
                .append(" pontos </EM> de alugador frequente");
    }

    @Override
    protected String getQuebraDeLinha() {
        return "<BR>";
    }
}
