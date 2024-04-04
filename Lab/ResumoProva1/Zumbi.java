package Exemplo;

public class Zumbi extends Monstro {
    private int numeroDeCerebrosComidos;

    public Zumbi(int idade, int vida, int energia) {
        super(idade, vida, energia);
    }

    public void atacarComMordida(Monstro monstroAlvo) {
        int dano = 5;
        monstroAlvo.setVida(monstroAlvo.getVida() - dano);

        numeroDeCerebrosComidos++;
    }
}
