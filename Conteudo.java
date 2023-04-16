package dominio;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;
    private String titulo;
    private String descriçao;
    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }
}
