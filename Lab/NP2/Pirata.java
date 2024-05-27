public class Pirata {
    private String nome;
    private String comidaFavorita;
    private int poder;

    public Pirata(String nome, String comidaFavorita, int poder) {
        this.nome = nome;
        this.comidaFavorita = comidaFavorita;
        this.poder = poder;
    }

    public java.lang.String getNome() {
        return nome;
    }

    public int getPoder() {
        return poder;
    }

    public void comer(Cozinheiro cozinheiro, int index) {
        String prato = cozinheiro.prepararPrato(index);
        if (prato.equals(comidaFavorita)) {
            this.poder += 2;
        } else {
            this.poder += 1;
        }
    }

    public Pirata lutar(Pirata pirata) {
        if (pirata.getPoder() > this.poder) {
            return pirata;
        }

        return this;
    }
}
