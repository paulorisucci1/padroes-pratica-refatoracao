package locadora.servico_notificacao;

import locadora.extrato.GeradorDeExtrato;
import locadora.extrato.GeradorDeExtratoHTML;

public class DependencyInjectorServicoDeNotificacao {

    public ServicoDeNotificacao getServicoDeNotificacao() {
        return new ServicoDeNotificacaoEmail(getGeradorDeExtrato());
    }

    private GeradorDeExtrato getGeradorDeExtrato() {
        return new GeradorDeExtratoHTML();
    }
}
