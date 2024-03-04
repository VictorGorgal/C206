package Exercicio02;

public class Jogador {
    private Arma arma;
    private int energia;
    private int vida;

    public Jogador() {

    }

    public Jogador(Arma arma, int energia, int vida) {
        this.arma = arma;
        this.energia = energia;
        this.vida = vida;
    }

    public void atacar(Jogador alvo) {
        if (this.energia < this.arma.getCustoDeEnergia()) {
            System.out.println("Energia insuficiente!");
            return;
        }

        this.energia -= this.arma.getCustoDeEnergia();
        alvo.vida -= this.arma.getDano();
    }

    @Override
    public String toString() {
        String toReturn = "";

        if (this.arma == null) {
            toReturn += "Arma: Vazio\n";
        } else {
            toReturn += "Arma: \n" +
                    "    Dano: " + this.arma.getDano() + "\n" +
                    "    Custo de energia: " + this.arma.getCustoDeEnergia() + "\n";
        }

        toReturn += "Jogador:\n" +
                "   Energia: " + this.energia + "\n" +
                "   Vida: " + this.vida;

        return toReturn;
    }
}
