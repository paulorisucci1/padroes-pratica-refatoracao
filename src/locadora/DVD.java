package locadora;

import locadora.classificacao.Classificacao;
import locadora.classificacao.ClassificacaoInfantil;
import locadora.classificacao.ClassificacaoLancamento;
import locadora.classificacao.ClassificacaoNormal;

public class DVD implements Alugavel {
	  public static final int NORMAL = 0;
	  public static final int LANCAMENTO = 1;
	  public static final int INFANTIL = 2;

	  private String titulo;

	  private Classificacao classificacao;

	  public DVD(String titulo, int codigoDePreco) {
	    this.titulo = titulo;
	    setCodigoDePreco(codigoDePreco);
	  }
	 
	  public String getTitulo() {
	    return titulo;
	  }
	 
	  public int getCodigoDePreco() {
	    return classificacao.getCodigoPreco();
	  }
	 
	  public void setCodigoDePreco(int codigoDePreco) {
		  switch (codigoDePreco) {
			  case NORMAL -> {
				  this.classificacao = new ClassificacaoNormal();
			  }
			  case LANCAMENTO -> {
				  this.classificacao = new ClassificacaoLancamento();
			  }
			  case INFANTIL -> {
				  this.classificacao = new ClassificacaoInfantil();
			  }
		  }
	  }

	  public double getValorDoAluguel(int diasAlugado) {
		  return classificacao.getValorDoAluguel(diasAlugado);
	  }

	public int getPontosDeAlugadorFrequente(int diasAlugado) {
		return classificacao.getPontosDeAlugadorFrequente(diasAlugado);
	}
}
