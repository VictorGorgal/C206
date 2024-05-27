package RedesSociais;

import Excecoes.WrongParams;

public class Instagram extends RedeSocial {
    protected Instagram(String senha, int numAmigos) throws WrongParams {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou foto no Instagram");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou video no Instagram");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou comentario no Instagram");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu publicação no Instagram");
    }
}
