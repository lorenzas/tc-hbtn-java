import humor.*;
import comida.*;

public class Personagem {
    private int pontosDeFelicidade;

    public int getPontosDeFelicidade() {
        return pontosDeFelicidade;
    }

    public void setPontosDeFelicidade(int pontosDeFelicidade) {
        this.pontosDeFelicidade = pontosDeFelicidade;
    }

    public Humor obterHumorAtual() {
        Humor humorAtual;

        if (pontosDeFelicidade < -5) {
            humorAtual = new Irritado();
        } else if (pontosDeFelicidade <= 0) {
            humorAtual = new Triste();
        } else if (pontosDeFelicidade <= 15) {
            humorAtual = new Feliz();
        } else {
            humorAtual = new MuitoFeliz();
        }

        return humorAtual;
    }

    public void comer(Comida[] comidas) {
        for(Comida comida : comidas) {
            pontosDeFelicidade += comida.getPontosDeFelicidade();
        }
    }

    @Override
    public String toString() {
        return pontosDeFelicidade + " - " + obterHumorAtual().getClass().getSimpleName();
    }
}
