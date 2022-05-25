package provedores;

public class JadLog implements  ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        Frete frete = new Frete((peso > 2000) ? valor * 0.07 : valor * 0.045, obterTipoProvedorFrete());
        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
}
