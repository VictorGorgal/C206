package Exercicio02;

import javax.swing.*;
import java.io.InputStream;
import java.util.Scanner;

public class Aluno {
    private int matricula;
    private int np1;
    private int np2;
    private int periodo;
    private String nome;

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNp1(int np1) {
        this.np1 = np1;
    }

    public void setNp2(int np2) {
        this.np2 = np2;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int calculaMedia() {
        int media = (this.np1 + this.np2) / 2;

        if (media >= 60) {
            System.out.println("Passou direto");
            return media;
        }

        return calculaNP3(media);
    }

    public int calculaNP3(int media) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira nota da NP3: ");
        int np3 = scanner.nextInt();

        int novaMedia = (media + np3) / 2;

        if (novaMedia >= 50) {
            System.out.println("Passou");
        } else {
            System.out.println("Não passou");
        }

        return novaMedia;
    }

    @Override
    public String toString() {
        return "Matricula: " + this.matricula + "\n" +
                "NP1: " + this.np1 + "\n" +
                "NP2: " + this.np2 + "\n" +
                "periodo: " + this.periodo + "\n" +
                "nome: " + this.nome;
    }
}
