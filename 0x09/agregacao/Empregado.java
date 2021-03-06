public class Empregado {
    private String nome;
    private int codigo;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Empregado(String nome, int codigo, Endereco endereco) {
        setNome(nome);
        setCodigo(codigo);
        setEndereco(endereco);
    }

    public void apresentar() {
        System.out.print("Codigo: " + this.getCodigo() +
                         "\nNome: " + this.getNome() +
                         "\nBairro: " + this.getEndereco().getBairro() +
                         "\nCidade: " + this.getEndereco().getCidade() +
                         "\nPais: " + this.getEndereco().getPais());
    }
}
