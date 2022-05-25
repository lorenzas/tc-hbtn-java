package provedores;

public class Sedex implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        Frete frete = new Frete((peso > 1000) ? valor * 0.1 : valor * 0.05, obterTipoProvedorFrete());
        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}
