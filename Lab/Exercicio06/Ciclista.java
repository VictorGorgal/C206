package Exercicio06;

public class Ciclista extends Atleta implements  Equipamento {
    @Override
    public void treinar() {
        System.out.println("Pedalando");
    }

    @Override
    public void colocarEquipamento() {
        System.out.println("Colocando capacete");
    }
}
