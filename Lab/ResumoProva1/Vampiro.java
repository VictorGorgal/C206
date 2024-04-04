package Exemplo;

public class Vampiro extends Monstro {
    private int medidorDeSangue;
    private boolean formaDeMorcego;

    public Vampiro(int idade, int vida, int energia) {
        super(idade, vida, energia);
    }

    public void transformar() {
        formaDeMorcego = !formaDeMorcego;
    }

    public void recuperarVida() {
        setVida(getVida() + medidorDeSangue);
        medidorDeSangue = 0;
    }

    public void atacarComMordida(Monstro monstroAlvo) {
        int dano = 5;
        monstroAlvo.setVida(monstroAlvo.getVida() - dano);
        medidorDeSangue += dano;
    }
}
