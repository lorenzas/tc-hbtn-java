import atividades.Atividade;

public class MaquinaWorkflow {
    public void executar(Workflow workflow) {
        for (Atividade atividadeWorkflow : workflow.getAtividadesWorkflow()) {
            atividadeWorkflow.executar();
        }
    }
}
