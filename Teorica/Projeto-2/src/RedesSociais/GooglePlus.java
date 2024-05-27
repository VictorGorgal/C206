package RedesSociais;

import Excecoes.WrongParams;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {
    public GooglePlus(String senha, int numAmigos) throws WrongParams {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou no GooglePlus");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou foto no Google Plus");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou video no Google Plus");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou comentario no Google Plus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fez streaming no GooglePlus");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu publicação no Google Plus");
    }
}
