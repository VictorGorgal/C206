package Exercicio06;

public class Estagiario extends Usuario implements CalculaSalario {
    private int numDeHorasTrabalhadas;

    @Override
    public void logar() {
        System.out.println("Logando no sistema");
    }

    @Override
    public float calculaSalario() {
        return numDeHorasTrabalhadas * 12.5f;
    }
}
