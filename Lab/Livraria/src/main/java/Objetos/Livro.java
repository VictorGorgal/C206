package Objetos;

public class Livro {
    private int id;
    private String nome;
    private int avaliacao;
    private int idLivraria;
    private int idEditora;

    public Livro(String nome, int avaliacao, int idLivraria, int idEditora) {
        this.nome = nome;
        this.avaliacao = avaliacao;
        this.idLivraria = idLivraria;
        this.idEditora = idEditora;
    }

    public Livro() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getIdLivraria() {
        return idLivraria;
    }

    public void setIdLivraria(int idLivraria) {
        this.idLivraria = idLivraria;
    }

    public int getIdEditora() {
        return idEditora;
    }

    public void setIdEditora(int idEditora) {
        this.idEditora = idEditora;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", avaliacao=" + avaliacao +
                ", idLivraria=" + idLivraria +
                ", idEditora=" + idEditora +
                '}';
    }
}
