package locadora.classificacao;

public abstract class Classificacao {

    public abstract int getCodigoPreco();
    public abstract double getValorDoAluguel(int diasAlugado);
    public int getPontosDeAlugadorFrequente(int diasAlugado) {
        return 1;
    }
}
