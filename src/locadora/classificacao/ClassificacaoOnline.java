package locadora.classificacao;

public class ClassificacaoOnline extends Classificacao {

    public static final int ONLINE = 3;

    @Override
    public int getCodigoPreco() {
        return ONLINE;
    }

    @Override
    public double getValorDoAluguel(int diasAlugado) {
        if(diasAlugado <= 3) {
            return diasAlugado * 4;
        }
        return diasAlugado * 3;
    }
}
