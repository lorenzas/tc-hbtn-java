import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ListaTelefonica {
    private Map<String, HashSet<Telefone>> listaTelefonica;

    public ListaTelefonica() {
        this.listaTelefonica = new HashMap<>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) {
        HashSet<Telefone> telefones = buscar(nome);
        if (telefones == null) {
            telefones = new HashSet<>();
        } else if (telefones.contains(telefone)) {
            throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
        }

        for (String chave : listaTelefonica.keySet()) {
            if (listaTelefonica.get(chave).contains(telefone)) {
                throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
            }

        }

        telefones.add(telefone);
        listaTelefonica.put(nome, telefones);
    }

    public HashSet<Telefone> buscar(String nome) {
        return listaTelefonica.get(nome);
    }
}
