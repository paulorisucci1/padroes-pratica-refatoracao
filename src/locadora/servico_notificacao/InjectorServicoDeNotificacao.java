package locadora.servico_notificacao;

import locadora.extrato.GeradorDeExtrato;
import locadora.extrato.GeradorDeExtratoHTML;
import locadora.extrato.GeradorDeExtratoTexto;

public class InjectorServicoDeNotificacao {

    public ServicoDeNotificacao getServicoDeNotificacaoEmail() {
        return new ServicoDeNotificacaoEmail(new GeradorDeExtratoHTML());
    }

    public ServicoDeNotificacao getServicoDeNotificacaoSMS() {
        return new ServicoDeNotificacaoSMS(new GeradorDeExtratoTexto());
    }
}
