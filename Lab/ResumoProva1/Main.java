package Exemplo;

public class Main {
    public static void main(String[] args) {
        Bruxa bruxa = new Bruxa(200, 20, 20);
        Vampiro vampiro = new Vampiro(500, 30, 30);
        Zumbi zumbi = new Zumbi(40, 50, 40);

        bruxa.aprenderFeitico("Bola de fogo", 3);
        bruxa.aprenderFeitico("Missil magico", 4);
        bruxa.listarFeiticos();
        bruxa.esquecerFeitico(1);
        bruxa.listarFeiticos();
        bruxa.lancarFeitico(vampiro, 0);
        bruxa.assustar(vampiro);

        vampiro.transformar();
        vampiro.atacarComMordida(bruxa);
        vampiro.recuperarVida();
        vampiro.assustar(bruxa);

        zumbi.atacarComMordida(vampiro);
        zumbi.assustar(vampiro);
    }
}
