import exceptions.OperacaoInvalidaException;

public class ContaBancariaControlada extends ContaBancariaBasica {
    private double saldoMinimo;
    private double valorPenalidade;

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public double getValorPenalidade() {
        return valorPenalidade;
    }

    @Override
    public void aplicarAtualizacaoMensal() throws OperacaoInvalidaException {
        super.aplicarAtualizacaoMensal();

        if (getSaldo() < getSaldoMinimo() || getSaldo() == 0) {
            super.sacar(getValorPenalidade());
        }
    }
}
