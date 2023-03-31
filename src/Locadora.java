//********** import para executar o código conforme modificações da lista01.2.1-GRASP-refactoring
import locadora.Cliente;
import locadora.Aluguel;
import locadora.DVD;
import locadora.extrato.GeradorDeExtrato;
import locadora.extrato.GeradorDeExtratoHTML;
import locadora.extrato.GeradorDeExtratoTexto;
import locadora.servico_notificacao.InjectorServicoDeNotificacao;
import locadora.servico_notificacao.ServicoDeNotificacao;
//********** import para executar o código conforme modificações da lista01.2.2-GRASP-refactoring
//import refactoring1.Cliente;
//************************************************************************************************
//********** import para executar o código conforme modificações da lista01.2.3-GRASP-refactoring
//import refactoring2.Cliente;
//import refactoring2.Aluguel;
//************************************************************************************************


public class Locadora {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Alex Sandro");
		InjectorServicoDeNotificacao injectorServicoDeNotificacao = new InjectorServicoDeNotificacao();
		ServicoDeNotificacao servicoDeNotificacao = injectorServicoDeNotificacao.getServicoDeNotificacaoEmail();

		c1.adicionaAluguel(new Aluguel(new DVD("O Atirador", DVD.NORMAL), 10));
		c1.adicionaAluguel(new Aluguel(new DVD("Luca", DVD.INFANTIL), 2));
		c1.adicionaAluguel(new Aluguel(new DVD("O Gato de Botas 2", DVD.LANCAMENTO), 30));
		c1.adicionaAluguel(new Aluguel(new DVD("Arremessando Alto", DVD.LANCAMENTO), 4));
		c1.adicionaAluguel(new Aluguel(new DVD("Moana", DVD.INFANTIL), 10));
		c1.adicionaAluguel(new Aluguel(new DVD("Uma Noite no Museu", DVD.NORMAL), 3));

		servicoDeNotificacao.notificarCliente(c1);
	}
}
