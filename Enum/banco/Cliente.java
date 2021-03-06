import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cliente {
    private String nome;
    private ArrayList<Double> transacoes;

    public Cliente(String nome, double valorTransacaoInicial) {
        this.nome = nome;
        this.transacoes = new ArrayList<>(
                Arrays.asList(valorTransacaoInicial));
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Double> getTransacoes() {
        return transacoes;
    }

    public void adicionarTransacao(double valorTransacao) {
        transacoes.add(valorTransacao);

    }
}
