package Exercicio04;

public class Autor {
    private String nome;
    private Saga[] sagas = new Saga[100];

    public void listarSagas() {
        for (Saga saga : sagas) {
            // Nao tem como acessar os parametros das sagas ;-;
            // System.out.println(saga.toString());
        }
    }

    public void adicionarSaga(Saga saga) {
        sagas[sagas.length] = saga;
    }
}
