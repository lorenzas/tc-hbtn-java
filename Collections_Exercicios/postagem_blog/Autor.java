import java.util.Objects;

public class Autor implements Comparable<Autor> {
    private String nome;
    private String sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return String.format("%s %s", nome, sobrenome);
    }

    @Override
    public int compareTo(Autor outro) {
        int comparacaoNome = nome.compareTo(outro.nome);
        if (comparacaoNome != 0) {
            return comparacaoNome;
        } else {
            return sobrenome.compareTo(outro.sobrenome);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor outro = (Autor) o;
        return getNome().equals(outro.getNome()) && getSobrenome().equals(outro.getSobrenome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getSobrenome());
    }
}
