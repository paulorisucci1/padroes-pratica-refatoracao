package locadora.classificacao;

public class ClassificacaoLancamento extends Classificacao {

    public static final int LANCAMENTO = 1;

    @Override
    public int getCodigoPreco() {
        return LANCAMENTO;
    }

    @Override
    public double getValorDoAluguel(int diasAlugado) {
        return diasAlugado * 3;
    }

    @Override
    public int getPontosDeAlugadorFrequente(int diasAlugado) {
        if(diasAlugado > 1) {
            return 2;
        }
        return 1;
    }
}
