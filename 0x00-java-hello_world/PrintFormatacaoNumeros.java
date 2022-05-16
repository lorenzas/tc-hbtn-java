import java.util.Locale;
import java.text.NumberFormat;

public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        Locale brasil = new Locale("pt", "BR");
        System.out.printf("Valor: " + NumberFormat.getCurrencyInstance(brasil).format(valor));
        System.out.printf("\nTaxa: %.2f%%\n", taxa);
    }
}
