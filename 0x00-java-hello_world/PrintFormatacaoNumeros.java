import java.util.Locale;
import java.text.NumberFormat;
public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        NumberFormat formatter = NumberFormat.getInstance(new Locale("en","US"));
        formatter.setMaximumFractionDigits(2);
        System.out.printf("Valor: R$ " + formatter.format(valor));
        System.out.printf("\nTaxa: %.2f%%\n", taxa);
    }
}
