import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    private String nome;
    private double preco;
    private double percentualMarkup;
    public Supplier<Double> precoComMarkup = () -> getPreco() + (getPreco() * (getPercentualMarkup() / 100));
    public Consumer<Double> atualizarMarkup = (valor) -> percentualMarkup = valor;

    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
        this.percentualMarkup = 10;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPercentualMarkup() {
        return percentualMarkup;
    }

    public void setPercentualMarkup(double percentualMarkup) {
        this.percentualMarkup = percentualMarkup;
    }
}
