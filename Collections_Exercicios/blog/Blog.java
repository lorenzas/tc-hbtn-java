import java.util.*;

public class Blog {
    private List<Post> postagens;

    public Blog() {
        postagens = new ArrayList<>();
    }

    public void adicionarPostagem(Post postagem) {
        postagens.add(postagem);
    }

    public Set<String> obterTodosAutores() {
        Set<String> autores = new TreeSet<>();
        for (Post postagem : postagens) {
            autores.add(postagem.getAutor());
        }
        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> contagemCategoria = new TreeMap<>();
        for (Post postagem : postagens) {
            String categoria = postagem.getCategoria();
            if (contagemCategoria.containsKey(categoria)) {
                contagemCategoria.put(categoria, contagemCategoria.get(categoria) + 1);
            } else {
                contagemCategoria.put(categoria, 1);
            }
        }
        return contagemCategoria;
    }
}
