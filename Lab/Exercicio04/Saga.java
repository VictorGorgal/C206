package Exercicio04;

public class Saga {
    private int note;
    private Livro[] livros = new Livro[100];

    public void listarLivros() {
        for (Livro livro : livros) {
            // Nao tem como acessar os parametros dos livros ;-;
            // System.out.println(livro.toString());
        }
    }

    public void adicionarLivro(Livro livro) {
        livros[livros.length] = livro;
    }
}
