package locadora;

public interface Alugavel {

    String getTitulo();

    double getValorDoAluguel(int diasAlugado);

    int getPontosDeAlugadorFrequente(int diasAlugado);
}
