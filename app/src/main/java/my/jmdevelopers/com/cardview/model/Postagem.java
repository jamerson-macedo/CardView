package my.jmdevelopers.com.cardview.model;

public class Postagem {
    private String nome;
    private String descricao;
    // para pegar a foto
    private int imagem;

    public Postagem() {
    }

    public Postagem(String nome, String descricao, int imagem) {
        this.nome = nome;
        this.descricao = descricao;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
