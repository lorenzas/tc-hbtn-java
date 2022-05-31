import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<>();
    }

    public Agencia buscarAgencia(String nome) {
        for (Agencia agencia : agencias) {
            if (agencia.getNome().equals(nome)) {
                return agencia;
            }
        }
        return null;
    }

    public boolean adicionarAgencia(String nome) {
        if (buscarAgencia(nome) == null) {
            agencias.add(new Agencia(nome));
            return true;
        }
        return false;
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valorTransacaoInicial) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        if (agencia != null) {
            if (agencia.buscarCliente(nomeCliente) == null) {
                agencia.novoCliente(nomeCliente, valorTransacaoInicial);
                return true;
            }
        }
        return false;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valorTransacao) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        if (agencia != null) {
            if (agencia.buscarCliente(nomeCliente) != null) {
                agencia.adicionarTransacaoCliente(nomeCliente, valorTransacao);
                return true;
            }
        }
        return false;
    }

    public boolean listarClientes(String nomeAgencia, boolean imprimeTransacoes) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        if (agencia != null) {
            ArrayList<Cliente> clientes = agencia.getClientes();
            for (int i = 0; i < clientes.size(); i++) {
                System.out.printf("Cliente: %s [%d]\n", clientes.get(i).getNome(), i + 1);
                if (imprimeTransacoes) {
                    ArrayList<Double> transacoes = clientes.get(i).getTransacoes();
                    for (int j = 0; j < transacoes.size(); j++) {
                        System.out.printf("  [%d] valor %.2f\n", j + 1, transacoes.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}
