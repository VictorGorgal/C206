package NL1;

public class Main {
    public static void main(String[] args) {
        Equipe equipe = new Equipe("Minha equipe");
        Piloto piloto1 = new Piloto("Piloto1", 21, "Brasil");
        Piloto piloto2 = new Piloto("Piloto2", 19, "EUA");
        Piloto piloto3 = new Piloto("Piloto3", 24, "França");
        Piloto piloto4 = new Piloto("Piloto4", 25, "Argentina");

        equipe.adicionarPiloto(piloto1);
        equipe.adicionarPiloto(piloto2);
        equipe.adicionarPiloto(piloto3);
        equipe.adicionarPiloto(piloto4);
        System.out.println(equipe);

        equipe.retirarPiloto(2);
        System.out.println(equipe);

        equipe.construiCarro(2, 250, true);
        piloto1.correr(equipe.getCarro());
        System.out.println(equipe);

        equipe.pitstop(5, 1);
        System.out.println(equipe);

        equipe.getCarro().correr();
    }
}
