import atividades.*;
import java.util.ArrayList;
import java.util.List;

public class Workflow {
    private List<Atividade> atividadesWorkflow = new ArrayList<>();

    public List<Atividade> getAtividadesWorkflow() {
        return atividadesWorkflow;
    }

    public void setAtividadesWorkflow(List<Atividade> atividadesWorkflow) {
        this.atividadesWorkflow = atividadesWorkflow;
    }

    public void registrarAtividade(Atividade atividade) {
        atividadesWorkflow.add(atividade);
    }
}
