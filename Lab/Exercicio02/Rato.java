package Exercicio02;

public class Rato {
    private float velocidade;
    private boolean escondido;

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isEscondido() {
        return escondido;
    }

    public void setEscondido(boolean escondido) {
        this.escondido = escondido;
    }

    public void esconder() {
        this.escondido = true;
    }

    public void procurarComida() {
        this.escondido = false;
    }

    @Override
    public String toString() {
        return "Velocidade: " + this.velocidade + "\n" +
                "Escondido: " + this.escondido;
    }
}
