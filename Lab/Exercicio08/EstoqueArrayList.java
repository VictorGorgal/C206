package Exercicio08;

import java.util.ArrayList;

public class EstoqueArrayList {
    private ArrayList<Item> itensArray = new ArrayList<>();

    public void adicionarArray(Item item) {
        itensArray.add(item);
    }

    public void buscar(int posicao) {
        System.out.println(itensArray.get(posicao));
    }

    public void deletar(Item item) {
        itensArray.remove(item);
    }

    public void deletar(int posicao) {
        itensArray.remove(posicao);
    }

    public void modificar(Item item, int posicao) {
        itensArray.set(posicao, item);
    }

    public ArrayList<Item> getItensArray() {
        return itensArray;
    }

    @Override
    public String toString() {
        return "EstoqueArrayList{" +
                "itensArray=" + itensArray +
                '}';
    }
}
