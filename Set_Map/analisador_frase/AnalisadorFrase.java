import java.util.ArrayList;
import java.util.TreeMap;

public class AnalisadorFrase {
    public static TreeMap contagemPalavras(String frase) {
        TreeMap<String, Integer> contagemPalavras = new TreeMap<>();
        frase = frase.replaceAll("[?!.]", "").toLowerCase();
        String[] palavras = frase.split(" ");
        for (String palavra : palavras) {
            if (!contagemPalavras.containsKey(palavra)) {
                contagemPalavras.put(palavra, 1);
            } else {
                contagemPalavras.replace(palavra, contagemPalavras.get(palavra) + 1);
            }
        }

        return contagemPalavras;
    }
}
