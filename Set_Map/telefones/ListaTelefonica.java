import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListaTelefonica {
    private Map<String, ArrayList<Telefone>> listaTelefonica;

    public ListaTelefonica() {
        this.listaTelefonica = new HashMap<>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) {
        ArrayList<Telefone> telefones = buscar(nome);
        if (telefones == null) {
            telefones = new ArrayList<>();
        }
        telefones.add(telefone);
        listaTelefonica.put(nome, telefones);
    }

    public ArrayList<Telefone> buscar(String nome) {
        return listaTelefonica.get(nome);
    }
}
