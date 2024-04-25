package Exercicio04;

public class Saga {
    private int note;
    private Livro[] livros = new Livro[100];

    public int getNote() {
        return note;
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println("Livro: " + livro.getTitulo() + " Paginas: " + livro.getPaginas());
        }
    }

    public void adicionarLivro(Livro livro) {
        for (int i = 0; i < 100; i++) {
            if (livros[i] == null) {
                livros[i] = livro;
            }
        }
    }
}
