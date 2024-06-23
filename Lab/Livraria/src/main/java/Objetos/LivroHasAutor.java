package Objetos;

public class LivroHasAutor {
    private int idLivro;
    private int idAutor;

    public LivroHasAutor(int idLivro, int idAutor) {
        this.idLivro = idLivro;
        this.idAutor = idAutor;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public int getIdAutor() {
        return idAutor;
    }

    @Override
    public String toString() {
        return "LivroHasAutor{" +
                "idLivro=" + idLivro +
                ", idAutor=" + idAutor +
                '}';
    }
}
