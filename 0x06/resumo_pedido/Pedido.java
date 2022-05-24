import java.util.Locale;

public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : getItens()) {
            total += (item.getProduto().obterPrecoLiquido() * item.getQuantidade());
        }
        return (total > 0) ? total - total * (getPercentualDesconto()/100) : 0;
    }

    public void apresentarResumoPedido() {
        Locale.setDefault(new Locale("pt", "BR"));
        double totalProdutos = 0;
        double totalItem = 0;
        double desconto = 0;
        System.out.println("------- RESUMO PEDIDO -------");
        for (ItemPedido item : getItens()) {
            totalItem = item.getQuantidade() * item.getProduto().obterPrecoLiquido();
            totalProdutos += totalItem;
            System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %s  Total: %.2f\n",
                    item.getProduto().getClass().getSimpleName(),
                    item.getProduto().getTitulo(),
                    item.getProduto().obterPrecoLiquido(),
                    item.getQuantidade(),
                    totalItem
            );
        }
        desconto = totalProdutos * (getPercentualDesconto()/100);
        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f\n", desconto);
        System.out.printf("TOTAL PRODUTOS: %.2f\n", totalProdutos);
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n", totalProdutos - desconto);
        System.out.println("----------------------------");
    }
}
