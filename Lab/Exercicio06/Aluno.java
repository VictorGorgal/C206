package Exercicio06;

public class Aluno extends Usuario {
    private int notas[] = new int[100];

    @Override
    public void logar() {
        System.out.println("Logando no portal");
    }
}
