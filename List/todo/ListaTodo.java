import java.util.ArrayList;
import java.util.List;

public class ListaTodo {
    private List<Tarefa> tarefas;

    public ListaTodo() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        for (Tarefa tarefaLista : tarefas) {
            if (tarefaLista.getIdentificador() == tarefa.getIdentificador()) {
                throw new IllegalArgumentException("Tarefa com identificador " + tarefaLista.getIdentificador() + " ja existente na lista");
            }
        }

        tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int identificador) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == identificador) {
                tarefa.setEstahFeita(true);
                return true;
            }
        }
        return false;
    }

    public boolean desfazerTarefa(int identificador) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == identificador) {
                tarefa.setEstahFeita(false);
                return true;
            }
        }
        return false;
    }

    public void desfazerTodas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.setEstahFeita(false);
        }
    }

    public void fazerTodas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.setEstahFeita(true);
        }
    }

    public void listarTarefas(){
        for (Tarefa tarefa : tarefas) {
            System.out.println((tarefa.isEstahFeita() ? "[X]" : "[ ]") + " Id: " + tarefa.getIdentificador() + " - Descricao: " + tarefa.getDescricao());
        }
    }

}
