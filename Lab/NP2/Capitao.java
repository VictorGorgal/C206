public class Capitao extends Pirata implements Comandar {
    private int numeroDeSeguidores;

    public Capitao(String nome, String comidaFavorita, int poder, int numeroDeSeguidores) {
        super(nome, comidaFavorita, poder);
        this.numeroDeSeguidores = numeroDeSeguidores;
    }

    public int getNumeroDeSeguidores() {
        return numeroDeSeguidores;
    }

    public void conquistarNovoSeguidor(Pirata pirata) {
        if (pirata.getPoder() >= getPoder()) {
            return;
        }

        numeroDeSeguidores++;
    }

    @Override
    public void darOrdens() {
        System.out.println("O capitão está ordenando " + numeroDeSeguidores + " tripulantes");
    }

    @Override
    public void mudarRota() {
        System.out.println("O capitão está mudando a rota");
    }
}
