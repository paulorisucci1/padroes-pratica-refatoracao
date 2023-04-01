package locadora;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente {
	private String nome;
	private List<Aluguel> alugueis = new ArrayList<Aluguel>();

	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void adicionaAluguel(Aluguel aluguel) {
		alugueis.add(aluguel);
	}

	public List<Aluguel> getAlugueis() {
		return new ArrayList<>(alugueis);
	}

	public double getValorTotalAlugueis() {
		Iterator<Aluguel> alugueis = this.alugueis.iterator();
		double valorTotalAlugueis = 0;

		while(alugueis.hasNext()) {
			Aluguel aluguel = alugueis.next();

			valorTotalAlugueis += aluguel.getValorDoAluguel();
		}

		return valorTotalAlugueis;
	}

	public int getPontosTotaisDeAlugadorFrequente() {
		Iterator<Aluguel> alugueis = this.alugueis.iterator();
		int pontosTotaisDeAlugadorFrequente = 0;

		while(alugueis.hasNext()) {
			Aluguel aluguel = alugueis.next();

			pontosTotaisDeAlugadorFrequente += aluguel.calcularPontosDeAlugadorFrequente();
		}

		return pontosTotaisDeAlugadorFrequente;
	}

}