package Exercicio05;

public class Notebook extends Produto {
    private String processador;
    private String memoria;

    public void instalarAplicativo() {
        System.out.println("Instalando");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Processador: " + processador);
        System.out.println("Memoria: " + memoria);
    }
}
