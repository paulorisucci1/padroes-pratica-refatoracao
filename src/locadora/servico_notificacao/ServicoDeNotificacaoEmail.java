package locadora.servico_notificacao;

import locadora.Cliente;
import locadora.extrato.GeradorDeExtrato;

public class ServicoDeNotificacaoEmail extends ServicoDeNotificacao {

    public ServicoDeNotificacaoEmail(GeradorDeExtrato geradorDeExtrato) {
        super(geradorDeExtrato);
    }

    @Override
    public void notificarCliente(Cliente cliente) {
        System.out.println("Enviando a fatura por email...");
        System.out.println(geradorDeExtrato.emitirExtrato(cliente));
    }
}
