import DAO.*;
import Objetos.*;

import java.util.Scanner;

public class Main {
    private static final LivrariaDAO livrariaDAO = new LivrariaDAO();
    private static final LivroDAO livroDAO = new LivroDAO();
    private static final EditoraDAO editoraDAO = new EditoraDAO();
    private static final LivroHasAutorDAO livroHasAutorDAO = new LivroHasAutorDAO();
    private static final AutorDAO autorDAO = new AutorDAO();

    private static final Scanner input = new Scanner(System.in);

    private static void cadastrarLivraria() {
        System.out.println("Digite o nome: ");
        String nome = input.nextLine();

        Livraria livraria = new Livraria(nome);
        livrariaDAO.insert(livraria);
    }

    private static void cadastrarEditora() {
        System.out.println("Digite o nome: ");
        String nome = input.nextLine();

        Editora editora = new Editora(nome);
        editoraDAO.insert(editora);
    }

    private static void cadastrarAutor() {
        System.out.println("Digite o nome: ");
        String nome = input.nextLine();

        Autor autor = new Autor(nome);
        autorDAO.insert(autor);
    }

    private static Livro generateLivro() {
        System.out.println("Digite o nome: ");
        String nome = input.nextLine();
        System.out.println("Digite a avaliacao entre 0 e 10: ");
        int avaliacao = input.nextInt();
        System.out.println("Digite o id da livraria: ");
        int idLivraria = input.nextInt();
        System.out.println("Digite o id da editora: ");
        int idEditora = input.nextInt();
        input.nextLine();

        return new Livro(nome, avaliacao, idLivraria, idEditora);
    }

    private static void cadastrarLivro() {
        livroDAO.insert(generateLivro());
    }

    private static void cadastrarRelacaoAutorLivro() {
        System.out.println("Digite o id do livro: ");
        int idLivro = input.nextInt();
        System.out.println("Digite o id do autor: ");
        int idAutor = input.nextInt();
        input.nextLine();

        LivroHasAutor livroHasAutor = new LivroHasAutor(idLivro, idAutor);
        livroHasAutorDAO.insert(livroHasAutor);
    }

    private static void atualizarLivro() {
        System.out.println("Digite o id do livro: ");
        int id = input.nextInt();
        input.nextLine();
        Livro livro = generateLivro();
        livro.setId(id);

        livroDAO.update(livro);
    }

    private static void excluirLivro() {
        System.out.println("Digite o id do livro: ");
        int id = input.nextInt();
        input.nextLine();
        Livro livro = new Livro();
        livro.setId(id);

        livroDAO.delete(livro);
    }

    private static void mostrarLivro() {
        System.out.println("Digite o id do livro: ");
        int id = input.nextInt();
        input.nextLine();
        Livro livro = new Livro();
        livro.setId(id);

        if (livroDAO.get(livro)) {
            System.out.println(livro);
        } else {
            System.out.println("Livro nao encontrado");
        }
    }

    private static void mostrarLivraria() {
        livrariaDAO.get(null);
    }

    public static void main(String[] args) {
        System.out.println();

        boolean flag = true;
        while(flag) {
            System.out.println("\nEscolha uma opcao e lembre-se de inserir as informacoes com letras minusculas!");
            System.out.println("1 - cadastrar Livraria");
            System.out.println("2 - cadastrar Editora");
            System.out.println("3 - cadastrar Autor");
            System.out.println("4 - cadastrar Livro");
            System.out.println("5 - cadastrar relacao autor-livro");

            System.out.println("6 - Atualizar Livro");
            System.out.println("7 - Excluir Livro");
            System.out.println("8 - Mostrar Livro");
            System.out.println("9 - Mostrar toda livraria");
            System.out.println("10 - Sair");

            String opStr = input.nextLine();
            int op;
            try {
                op = Integer.parseInt(opStr);
            } catch (NumberFormatException e) {
                System.out.println("Insira um numero valido!");
                continue;
            }

            switch (op) {
                case 1:
                    cadastrarLivraria();
                    break;
                case 2:
                    cadastrarEditora();
                    break;
                case 3:
                    cadastrarAutor();
                    break;
                case 4:
                    cadastrarLivro();
                    break;
                case 5:cadastrarRelacaoAutorLivro();
                    break;
                case 6:
                    atualizarLivro();
                    break;
                case 7:
                    excluirLivro();
                    break;
                case 8:
                    mostrarLivro();
                    break;
                case 9:
                    mostrarLivraria();
                    break;
                case 10:
                    flag = false;
                    break;
                default:
                    System.out.println("Insira uma opcao valida!");
                    break;
            }
        }
    }
}
