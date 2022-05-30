import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Pedido {
    List<PedidoCookie> cookies = new ArrayList<>();

    public Pedido() {

    }

    public Pedido(List<PedidoCookie> cookies) {
        this.cookies = cookies;
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
        this.cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas() {
        int totalCaixas = 0;
        for (PedidoCookie pedidoCookie : cookies) {
            totalCaixas += pedidoCookie.getQuantidadeCaixas();
        }
        return totalCaixas;
    }

    public int removerSabor(String sabor) {
        int quantidadeRemovida = 0;

        Iterator<PedidoCookie> it = cookies.iterator();
        while (it.hasNext()) {
            PedidoCookie pedidoCookie = it.next();
            if (pedidoCookie.getSabor().equals(sabor)) {
                it.remove();
                quantidadeRemovida += pedidoCookie.getQuantidadeCaixas();
            }
        }
        return quantidadeRemovida;
    }
}
