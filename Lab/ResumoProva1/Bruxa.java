package Exemplo;

public class Bruxa extends Monstro {
    private Feitico[] feiticos = new Feitico[10];

    public Bruxa(int idade, int vida, int energia) {
        super(idade, vida, energia);
    }

    public boolean aprenderFeitico(String nome, int poder) {
        for (int i = 0; i < feiticos.length; i++) {
            if (feiticos[i] == null) {
                feiticos[i] = new Feitico(nome, poder);
                return true;
            }
        }

        return false;
    }

    public void listarFeiticos() {
        for (int i = 0; i < feiticos.length; i++) {
            Feitico feitico = feiticos[i];
            if (feitico == null) {
                continue;
            }

            System.out.println("Posicao: " + i + " Nome: " + feitico.getNome() + "Poder: " + feitico.getPoder());
        }
    }

    public void esquecerFeitico(int posicao) {
        feiticos[posicao] = null;
    }

    public void lancarFeitico(Monstro monstroAlvo, int posicao) {
        int dano = feiticos[posicao].getPoder();
        monstroAlvo.setVida(monstroAlvo.getVida() - dano);
    }
}
