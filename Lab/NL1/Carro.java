package NL1;

public class Carro {
    private Motor motor;
    private int tipoDePneu;

    public Carro(int tipoDePneu, int potencia, boolean turbo) {
        this.motor = new Motor(potencia, turbo);
        this.tipoDePneu = tipoDePneu;
    }

    public void correr() {
        System.out.println("Vrum vrum");
    }

    @Override
    public String toString() {
        return "Carro{" +
                "motor=" + motor +
                ", tipoDePneu=" + tipoDePneu +
                '}';
    }
}
