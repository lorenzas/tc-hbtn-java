import java.util.ArrayList;
import java.util.List;

public class Celular {
    private List<Contato> contatos = new ArrayList<>();

    public int obterPosicaoContato(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equals(nome)) {
                return i;
            }
        }
        return -1;
    }

    public void adicionarContato(Contato contato) {
        if (obterPosicaoContato(contato.getNome()) != -1) {
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }

        contatos.add(contato);
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) {
        int posicaoAntigo = obterPosicaoContato(contatoAntigo.getNome());
        int posicaoNovo = obterPosicaoContato(novoContato.getNome());
        if (posicaoAntigo == -1) {
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        }

        if (posicaoNovo != -1 && posicaoNovo != posicaoAntigo) {
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        }

        contatos.set(obterPosicaoContato(contatoAntigo.getNome()), novoContato);
    }

    public void removerContato(Contato contato) {
        int posicaoContatoRemover = obterPosicaoContato(contato.getNome());
        if (posicaoContatoRemover == -1) {
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        }

        contatos.remove(posicaoContatoRemover);
    }

    public void listarContatos() {
        for (Contato contato : contatos) {
            System.out.printf("%s -> %s (%s)\n", contato.getNome(), contato.getNumeroDeTelefone(), contato.getTipoNumero());
        }
    }
}
