package locadora;

public class Aluguel {
	private Alugavel alugavel;
	private int diasAlugado;
	 
	public Aluguel(Alugavel alugavel, int diasAlugado) {
		this.alugavel = alugavel;
		this.diasAlugado = diasAlugado;
	}
	 
	public Alugavel getAlugavel() {
	      return alugavel;
	   }

	public int getDiasAlugado() {
	      return diasAlugado;
	   }

	public String getTituloDoItemAlugavel() {
		return alugavel.getTitulo();
	}

	public double getValorDoAluguel() {
		return alugavel.getValorDoAluguel(diasAlugado);
	}

	public int calcularPontosDeAlugadorFrequente() {
		return alugavel.getPontosDeAlugadorFrequente(diasAlugado);
	}
}
