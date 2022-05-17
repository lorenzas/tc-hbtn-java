public class InteiroPositivo {
    private int valor;

    public InteiroPositivo(int valor) {
        setValor(valor);
    }

    public InteiroPositivo(String valor) {
        setValor(Integer.parseInt(valor));
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = validaValor(valor);
    }

    public int validaValor(int valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        return valor;
    }

    public boolean ehPrimo() {
        int divisoes = 0;

        for (int i = 1; i <= valor ; i++) {
            if (valor % i == 0) {
                divisoes++;
            }
        }

        return divisoes == 2;
    }
}
