import Excecoes.WrongParams;
import Excecoes.WrongPassword;
import RedesSociais.*;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<RedeSocial> redeSociais = new HashSet<>();
        try {
            redeSociais.add(new Facebook("senha123456", 1));
            redeSociais.add(new Twitter("senha!@#123", 7));
        } catch (WrongParams ignored) {
        }

        Usuario usuario = new Usuario("Robertinho123", "roberto@gmail.com", redeSociais);

        for (RedeSocial redeSocial : usuario.getRedeSociais()) {
            if (redeSocial.getClass() == Twitter.class) {
                redeSocial.logar("senha!@#123");
                redeSocial.curtirPublicacao();
                redeSocial.postarComentario();
                redeSocial.postarFoto();
            }

            if (redeSocial.getClass() == Facebook.class) {
                redeSocial.logar("senha123456");
                redeSocial.postarVideo();
                ((Facebook) redeSocial).fazStreaming();
                ((Facebook) redeSocial).compartilhar();
            }
            System.out.println("---");
        }


        System.out.println("Exceções:");
        try {
            usuario.addRedeSocial(new GooglePlus("senha", 0));
        } catch (WrongParams e) {
            System.out.println(e.getMessage());
        }

        try {
            usuario.addRedeSocial(new GooglePlus("senha123123", -2));
        } catch (WrongParams e) {
            System.out.println(e.getMessage());
        }

        try {
            usuario.addRedeSocial(new GooglePlus("senha123123123", 0));
            for (RedeSocial redeSocial : usuario.getRedeSociais()) {
                if (redeSocial.getClass() == GooglePlus.class) {
                    redeSocial.logar("Senha diferente");
                }
            }
        } catch (WrongParams ignored) {
        } catch (WrongPassword e) {
            System.out.println(e.getMessage());
        }
    }
}
