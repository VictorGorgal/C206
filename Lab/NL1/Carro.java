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

    public void setTipoDePneu(int tipoDePneu) throws Exception {
        if (tipoDePneu < 1) {
            throw new Exception("Tipo de pneu invalido!");
        }
        if (tipoDePneu > 5) {
            throw new Exception("Tipo de pneu invalido!");
        }

        this.tipoDePneu = tipoDePneu;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "motor=" + motor +
                ", tipoDePneu=" + tipoDePneu +
                '}';
    }
}
