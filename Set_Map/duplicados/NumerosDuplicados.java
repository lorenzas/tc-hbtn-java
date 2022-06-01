import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NumerosDuplicados {
    public static TreeSet<Integer> buscar(int[] numeros) {
        TreeSet<Integer> numerosDuplicados = new TreeSet<>();
        Set<Integer> hashSet = new HashSet<>();
        for (int numero : numeros) {
            if(!hashSet.add(numero)) {
               numerosDuplicados.add(numero);
            }
        }
        return numerosDuplicados;
    }
}
