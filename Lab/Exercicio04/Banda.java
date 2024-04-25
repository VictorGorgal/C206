package Exercicio04;

import java.util.Objects;

public class Banda {
    private Musica[] musicas = new Musica[100];
    private String nome;
    private int numeroDeIntegrantes;

    public void tocarMusica(int posicao) {
        System.out.println("Tocando musica: ");  // + musicas[posicao].toString()
    }

    public void tocarShow() {
        for (Musica musica : musicas) {
            System.out.println("Tocando musica: " + musica.getNome());
        }
    }

    public boolean adicionarMusica(Musica musica) {
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] == null) {
                musicas[i] = musica;
                return true;
            }
        }

        return false;
    }

    public boolean deletarMusica(String nome) {
        for (int i = 0; i < musicas.length; i++) {
            if (Objects.equals(musicas[i].getNome(), nome)) {
                musicas[i] = null;
                return true;
            }
        }

        return false;
    }

    public Banda(String nome, int numeroDeIntegrantes) {
        this.nome = nome;
        this.numeroDeIntegrantes = numeroDeIntegrantes;
    }
}
