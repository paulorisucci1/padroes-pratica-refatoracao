package locadora.classificacao;

public class ClassificacaoNormal extends Classificacao {

    public static final int NORMAL = 0;

    @Override
    public int getCodigoPreco() {
        return NORMAL;
    }

    @Override
    public double getValorDoAluguel(int diasAlugado) {
        double valorAluguel = 2;
        if(diasAlugado > 2) {
            valorAluguel += (diasAlugado - 2) * 1.5;
        }
        return valorAluguel;
    }
}
