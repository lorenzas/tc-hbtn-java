import java.util.*;

public class Blog {
    private List<Post> postagens;

    public Blog() {
        postagens = new ArrayList<>();
    }

    public void adicionarPostagem(Post postagem) {
        for (Post post : postagens) {
            if (post.equals(postagem)) {
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }
        postagens.add(postagem);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> autores = new TreeSet<>();
        for (Post postagem : postagens) {
            autores.add(postagem.getAutor());
        }
        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> contagemCategoria = new TreeMap<>();
        for (Post postagem : postagens) {
            Categorias categoria = postagem.getCategoria();
            if (contagemCategoria.containsKey(categoria)) {
                contagemCategoria.put(categoria, contagemCategoria.get(categoria) + 1);
            } else {
                contagemCategoria.put(categoria, 1);
            }
        }
        return contagemCategoria;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> postagensDoAutor = new TreeSet<>();
        for (Post postagem : postagens) {
            if (postagem.getAutor().equals(autor)) {
                postagensDoAutor.add(postagem);
            }
        }
        return postagensDoAutor;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> postagensDaCategoria = new TreeSet<>();
        for (Post postagem : postagens) {
            if (postagem.getCategoria().equals(categoria)) {
                postagensDaCategoria.add(postagem);
            }
        }
        return postagensDaCategoria;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> postsPorCategoria = new TreeMap<>();
        for (Post postagem : postagens) {
            postsPorCategoria.put(postagem.getCategoria(), obterPostsPorCategoria(postagem.getCategoria()));
        }
        return postsPorCategoria;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> postsPorCategoria = new TreeMap<>();
        for (Post postagem : postagens) {
            postsPorCategoria.put(postagem.getAutor(), obterPostsPorAutor(postagem.getAutor()));
        }
        return postsPorCategoria;
    }
}
