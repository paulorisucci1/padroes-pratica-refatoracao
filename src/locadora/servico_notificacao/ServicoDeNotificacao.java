package locadora.servico_notificacao;

import locadora.Cliente;
import locadora.extrato.GeradorDeExtrato;

public abstract class ServicoDeNotificacao {
    protected GeradorDeExtrato geradorDeExtrato;

    public ServicoDeNotificacao(GeradorDeExtrato geradorDeExtrato) {
        this.geradorDeExtrato = geradorDeExtrato;
    }

    public abstract void notificarCliente(Cliente cliente);
}
