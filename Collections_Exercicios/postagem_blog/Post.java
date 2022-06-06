import java.util.Objects;

public class Post implements Comparable<Post> {
    private Autor autor;
    private String titulo;
    private String corpo;
    private Categorias categoria;

    public Post(Autor autor, String titulo, String corpo, Categorias categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return titulo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post outro = (Post) o;
        return getAutor().equals(outro.getAutor()) && getTitulo().equals(outro.getTitulo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAutor(), getTitulo());
    }

    @Override
    public int compareTo(Post outro) {
        return getTitulo().compareTo(outro.getTitulo());
    }
}
