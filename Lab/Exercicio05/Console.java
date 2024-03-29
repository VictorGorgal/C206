package Exercicio05;

public class Console extends Produto {
    private String geracao;
    private String marca;

    public void jogar() {
        System.out.println("Jogando");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Geracao: " + geracao);
        System.out.println("Marca: " + marca);
    }
}
