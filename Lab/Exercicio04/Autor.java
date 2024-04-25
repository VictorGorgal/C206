package Exercicio04;

public class Autor {
    private String nome;
    private Saga[] sagas = new Saga[100];

    public void listarSagas() {
        for (Saga saga : sagas) {
            System.out.println("Nota: " + saga.getNote() + " Livros:");
            saga.listarLivros();
        }
    }

    public void adicionarSaga(Saga saga) {
        for (int i = 0; i < 100; i++) {
            if (sagas[i] == null) {
                sagas[i] = saga;
            }
        }
    }
}
