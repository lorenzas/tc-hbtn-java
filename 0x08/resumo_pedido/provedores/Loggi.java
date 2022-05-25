package provedores;

public class Loggi implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        Frete frete = new Frete((peso > 5000) ? valor * 0.12 : valor * 0.04, obterTipoProvedorFrete());
        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}
