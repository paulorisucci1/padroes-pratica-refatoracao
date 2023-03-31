package locadora.classificacao;

public class ClassificacaoInfantil extends Classificacao {

    public static final int INFANTIL = 2;

    @Override
    public int getCodigoPreco() {
        return INFANTIL;
    }

    @Override
    public double getValorDoAluguel(int diasAlugado) {
        double valorAluguel = 1.5;

        if(diasAlugado > 3) {
            valorAluguel += (diasAlugado - 3) * 1.5;
        }

        return valorAluguel;
    }
}
