package Exercicio08;

import java.util.ArrayList;
import java.util.HashMap;

public class EstoqueHashMap {
    private HashMap<Integer, Item> itensArray = new HashMap<>();

    public void adicionarArray(Item item) {
        itensArray.put(itensArray.size(), item);
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
        itensArray.replace(posicao, item);
    }

    public HashMap<Integer, Item> getItensArray() {
        return itensArray;
    }

    @Override
    public String toString() {
        return "EstoqueHashMap{" +
                "itensArray=" + itensArray +
                '}';
    }
}
