package Exercicio02;

public class Gato {
    private String cor;
    private int idade;
    private int velocidade;

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void brincar() {
        System.out.println("miau");
    }

    public void caçar(Rato rato) {
        if (rato.isEscondido()) {
            System.out.println("Caça fracassada, rato escondido");
            return;
        }

        if (this.velocidade <= rato.getVelocidade()) {
            System.out.println("Caça fracassada, gato muito lento");
            return;
        }

        System.out.println("Caça sucedida");
    }

    @Override
    public String toString() {
        return "Cor: " + this.cor + "\n" +
                "Idade: " + this.idade + "\n" +
                "Velociade: " + this.velocidade;
    }
}
