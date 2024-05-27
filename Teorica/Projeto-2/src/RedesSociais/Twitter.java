package RedesSociais;

import Excecoes.WrongParams;

public class Twitter extends RedeSocial implements Compartilhamento {
    public Twitter(String senha, int numAmigos) throws WrongParams {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou no Twitter");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou foto no Twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou video no Twitter");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou comentario no Twitter");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu publicação no Twitter");
    }
}
