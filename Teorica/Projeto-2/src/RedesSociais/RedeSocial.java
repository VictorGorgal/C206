package RedesSociais;

import Excecoes.WrongParams;
import Excecoes.WrongPassword;

import java.util.Objects;

public abstract class RedeSocial {

    protected String senha;
    protected int numAmigos;

    public RedeSocial(String senha, int numAmigos) throws WrongParams {
        if (senha.length() < 8) {
            throw new WrongParams("Senha muito pequena");
        }
        if (numAmigos < 0) {
            throw new WrongParams("Numero de amigos inválido");
        }

        this.senha = senha;
        this.numAmigos = numAmigos;
    }

    public abstract void postarFoto();

    public abstract void postarVideo();

    public abstract void postarComentario();

    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação!");
    }

    public void logar(String senha) {
        if (!Objects.equals(this.senha, senha)) {
            throw new WrongPassword("Senha incorreta!");
        }
    }
}
