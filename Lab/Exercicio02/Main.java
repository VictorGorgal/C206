package Exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        testExercise1();
        testExercise2();
        testExercise3();
    }

    private static void testExercise1() {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Insira a matrícula: ");
        aluno.setMatricula(scanner.nextInt());
        System.out.println("Insira a NP1: ");
        aluno.setNp1(scanner.nextInt());
        System.out.println("Insira a NP2: ");
        aluno.setNp2(scanner.nextInt());
        System.out.println("Insira o período: ");
        aluno.setPeriodo(scanner.nextInt());
        System.out.println("Insira o nome: ");
        aluno.setNome(scanner.next());

        System.out.println("-----");
        aluno.calculaMedia();
        System.out.println("-----");

        System.out.println(aluno);
    }

    private static void testExercise2() {
        Arma arma = new Arma(25, 10);
        Jogador jogador = new Jogador(arma, 50, 100);
        Jogador alvo = new Jogador(null, 50, 100);

        System.out.println("-----");
        System.out.println(jogador);
        System.out.println("-----");
        System.out.println(alvo);
        System.out.println("-----");

        jogador.atacar(alvo);
        jogador.atacar(alvo);
        jogador.atacar(alvo);
        jogador.atacar(alvo);
        jogador.atacar(alvo);
        jogador.atacar(alvo);

        System.out.println("-----");
        System.out.println(jogador);
        System.out.println("-----");
        System.out.println(alvo);
        System.out.println("-----");
    }

    private static void testExercise3() {
        Gato gato = new Gato();
        Rato rato = new Rato();

        gato.setCor("Laranja");
        gato.setIdade(4);
        gato.setVelocidade(15);

        rato.setVelocidade(20);
        rato.setEscondido(false);

        rato.esconder();
        gato.caçar(rato);
        rato.procurarComida();
        gato.caçar(rato);
        rato.setVelocidade(10);
        gato.caçar(rato);

        System.out.println("-----");
        System.out.println(rato);
        System.out.println("-----");
        System.out.println(gato);
        System.out.println("-----");
    }
}
