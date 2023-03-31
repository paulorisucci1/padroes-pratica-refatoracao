package locadora;

import locadora.classificacao.Classificacao;
import locadora.classificacao.ClassificacaoLancamento;
import locadora.classificacao.ClassificacaoNormal;
import locadora.classificacao.ClassificacaoOnline;

public class VideoGame implements Alugavel {

    public static final int NORMAL = 0;

    public static final int LANCAMENTO = 1;

    public static final int ONLINE = 3;

    private String titulo;

    private String console;

    private Classificacao classificacao;

    public VideoGame(String titulo, int codigoDePreco, String console) {
        this.titulo = titulo;
        this.console = console;
        setCodigoDePreco(codigoDePreco);
    }

    public void setCodigoDePreco(int codigoPreco) {
        switch (codigoPreco) {
            case NORMAL -> {
                this.classificacao = new ClassificacaoNormal();
            }
            case LANCAMENTO -> {
                this.classificacao = new ClassificacaoLancamento();
            }
            case ONLINE -> {
                this.classificacao = new ClassificacaoOnline();
            }
        }
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public double getValorDoAluguel(int diasAlugado) {
        return classificacao.getValorDoAluguel(diasAlugado);
    }

    @Override
    public int getPontosDeAlugadorFrequente(int diasAlugado) {
        return classificacao.getPontosDeAlugadorFrequente(diasAlugado);
    }
}
