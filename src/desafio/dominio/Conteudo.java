package desafio.dominio;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public Conteudo setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Conteudo setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }
}
