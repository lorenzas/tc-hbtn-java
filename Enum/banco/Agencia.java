import java.util.ArrayList;

public class Agencia {
    private String nome;
    private ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public boolean novoCliente(String nome, double valorTransacaoInicial) {
        if (buscarCliente(nome) == null) {
            clientes.add(new Cliente(nome, valorTransacaoInicial));
            return true;
        }
        return false;
    }

    public boolean adicionarTransacaoCliente(String nome, double valorTransacao) {
        Cliente cliente = buscarCliente(nome);
        if (cliente != null) {
            cliente.adicionarTransacao(valorTransacao);
            return true;
        }
        return false;
    }

    public Cliente buscarCliente(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome)) {
                return cliente;
            }
        }
        return null;
    }
}
