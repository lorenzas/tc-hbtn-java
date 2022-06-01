import java.util.Objects;

public class Telefone {
    private String codigoArea;
    private String numero;

    public Telefone(String codigoArea, String numero) {
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

    public String getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return String.format("(%s) %s", getCodigoArea(), getNumero());
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) return true;
        if (objeto == null || getClass() != objeto.getClass()) return false;
        Telefone telefone = (Telefone) objeto;
        return getCodigoArea().equals(telefone.getCodigoArea()) && getNumero().equals(telefone.getNumero());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoArea(), getNumero());
    }
}
