import java.util.List;
import java.util.stream.Collectors;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> listaDeProdutos, CriterioFiltro criterioFiltro) {
        return listaDeProdutos.stream().filter(criterioFiltro::testar).collect(Collectors.toList());
    }
}
