import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> listaDeProdutos, Predicate<Produto> criterioFiltro) {
        return listaDeProdutos.stream().filter(criterioFiltro::test).collect(Collectors.toList());
    }
}
