import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }

        saldo = getSaldo() + valor;
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        }

        if (valor > getSaldo()) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }

        saldo = getSaldo() - valor;
    }

    public double calcularTarifaMensal() {
        final double TARIFA_FIXA = 10;
        double tarifa = getSaldo() * 0.1;
        return (tarifa < TARIFA_FIXA) ? tarifa : TARIFA_FIXA;
    }

    public double calcularJurosMensal() {
        return (getSaldo() > 0) ? getSaldo() * ((getTaxaJurosAnual() / 12) / 100) : 0;
    }

    public void aplicarAtualizacaoMensal() throws OperacaoInvalidaException {
        saldo = getSaldo() - calcularTarifaMensal() + calcularJurosMensal();
    }
}
