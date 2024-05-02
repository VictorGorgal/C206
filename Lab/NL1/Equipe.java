package NL1;

public class Equipe {
    private Carro carro;
    private Piloto[] pilotos;
    private Piloto pilotoAtual;
    private String nome;

    public Equipe(String nome) {
        this.nome = nome;
        pilotos = new Piloto[4];
    }
}
