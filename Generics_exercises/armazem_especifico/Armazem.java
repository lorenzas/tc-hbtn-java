import java.util.Map;
import java.util.TreeMap;

public abstract class Armazem<T> implements Armazenavel<T> {
    private Map<String, T> itensArmazenados = new TreeMap<>();

    public Map<String, T> getItensArmazenados() {
        return itensArmazenados;
    }

    public void setItensArmazenados(Map<String, T> itensArmazenados) {
        this.itensArmazenados = itensArmazenados;
    }

    @Override
    public void adicionarAoInventario(String nome, T valor) {
        itensArmazenados.put(nome, valor);
    }

    @Override
    public T obterDoInventario(String nome) {
        return itensArmazenados.get(nome);
    }
}
