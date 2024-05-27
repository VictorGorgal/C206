package RedesSociais;

import java.util.HashSet;

public class Usuario {
    private String nome;
    private String email;
    private HashSet<RedeSocial> redeSociais;

    public Usuario(String nome, String email, HashSet<RedeSocial> redeSociais) {
        this.nome = nome;
        this.email = email;
        this.redeSociais = redeSociais;
    }

    public HashSet<RedeSocial> getRedeSociais() {
        return redeSociais;
    }

    public void addRedeSocial(RedeSocial redeSocial) {
        redeSociais.add(redeSocial);
    }
}
