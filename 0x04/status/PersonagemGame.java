package status;

public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        if (saudeAtual > 0) {
            this.status = "vivo";
        } else {
            this.status = "morto";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }

    public void tomarDano(int quantidadeDeDano) {
        if (saudeAtual - quantidadeDeDano < 0) {
            setSaudeAtual(0);
        } else {
            setSaudeAtual(saudeAtual - quantidadeDeDano);
        }
    }

    public void receberCura(int quantidadeDeCura) {
        if (saudeAtual + quantidadeDeCura > 100) {
            setSaudeAtual(100);
        } else {
            setSaudeAtual(saudeAtual + quantidadeDeCura);
        }
    }
}
