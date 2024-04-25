package Exercicio06;

public class Professor extends Usuario implements CalculaSalario {
    private int numDeAulas;

    @Override
    public void logar() {
        System.out.println("Logando no portal do professor");
    }

    @Override
    public float calculaSalario() {
        return numDeAulas * 40f;
    }
}
