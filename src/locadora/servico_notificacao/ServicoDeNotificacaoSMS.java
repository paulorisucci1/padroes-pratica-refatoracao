package locadora.servico_notificacao;

import locadora.Cliente;
import locadora.extrato.GeradorDeExtrato;

public class ServicoDeNotificacaoSMS extends ServicoDeNotificacao {

    public ServicoDeNotificacaoSMS(GeradorDeExtrato geradorDeExtrato) {
        super(geradorDeExtrato);
    }

    @Override
    public void notificarCliente(Cliente cliente) {
        System.out.println("Enviando a fatura por SMS...");
        System.out.println(geradorDeExtrato.emitirExtrato(cliente));
    }
}
