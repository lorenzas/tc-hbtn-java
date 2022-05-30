import java.util.List;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> numeros, int numero) {
        return numeros.indexOf(numero);
    }

    public static void adicionarNumero(List<Integer> numeros, int numero) throws Exception {
        int posicao = buscarPosicaoNumero(numeros, numero);

        if (posicao != -1) {
            throw new Exception("Numero jah contido na lista");
        } else {
            numeros.add(numero);
        }
    }

    public static void removerNumero(List<Integer> numeros, int numero) throws Exception {
        int posicao = buscarPosicaoNumero(numeros, numero);

        if (posicao == -1) {
            throw new Exception("Numero nao encontrado na lista");
        } else {
            numeros.remove(posicao);
        }
    }

    public static void substituirNumero(List<Integer> numeros, int numeroSubstituir, int numeroSubstituto) {
        int posicaoSubstituir = buscarPosicaoNumero(numeros, numeroSubstituir);

        if (posicaoSubstituir != -1) {
            numeros.set(posicaoSubstituir, numeroSubstituto);
        } else {
            numeros.add(numeroSubstituto);
        }
    }
}
