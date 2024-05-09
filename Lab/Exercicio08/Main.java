package Exercicio08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Array List:");
        EstoqueArrayList estoque1 = new EstoqueArrayList();
        estoque1.adicionarArray(new Item("Cafe", 17));
        estoque1.adicionarArray(new Item("Leite", 5));
        estoque1.adicionarArray(new Item("Arroz", 21));
        estoque1.adicionarArray(new Item("Ovos", 30));
        System.out.println(estoque1);
        System.out.println();

        estoque1.buscar(2);
        System.out.println();

        estoque1.deletar(2);
        estoque1.deletar(estoque1.getItensArray().get(2));
        System.out.println(estoque1);
        System.out.println();

        estoque1.adicionarArray(new Item("Arroz", 21));
        estoque1.adicionarArray(new Item("Ovos", 30));
        System.out.println(estoque1);
        estoque1.modificar(new Item("Arroz", 29), 2);
        System.out.println(estoque1);
        System.out.println();

        Comparator<Item> sortStyle = getSortingStyle(true);
        System.out.println(Collections.max(estoque1.getItensArray(), sortStyle));
        System.out.println(Collections.min(estoque1.getItensArray(), sortStyle));
        try {
            Collections.sort(estoque1.getItensArray(), sortStyle);
        } catch (Exception e) {
            System.out.println("Error sorting");
        }
        System.out.println(estoque1);
        System.out.println();

        ArrayList<Item> lista = new ArrayList<>();
        lista.add(new Item("Macarrao", 4));
        lista.add(new Item("Feijao", 15));
        System.out.println(estoque1);
        estoque1.getItensArray().addAll(lista);
        System.out.println(estoque1);
        System.out.println(estoque1.getItensArray().indexOf(lista.getFirst()));
        System.out.println(estoque1.getItensArray().contains(new Item("Macarrao", 4)));  // Mesmos valores, instancias diferentes
        estoque1.getItensArray().removeAll(lista);
        System.out.println(estoque1);
        estoque1.getItensArray().forEach(item -> item.setValor(item.getValor() + 2));
        System.out.println(estoque1.getItensArray().isEmpty());
        System.out.println(estoque1.getItensArray().lastIndexOf(lista.getFirst()));
        System.out.println(estoque1.getItensArray().size());
        System.out.println();

        try {
            Collections.sort(estoque1.getItensArray(), getSortingStyle(true));
            System.out.println(estoque1);
            Collections.sort(estoque1.getItensArray(), getSortingStyle(false));
            System.out.println(estoque1);
        } catch (Exception e) {
            System.out.println("Error sorting");
        }
        System.out.println();




        System.out.println("Hash Map:");
        EstoqueHashMap estoque2 = new EstoqueHashMap();
        estoque2.adicionarArray(new Item("Cafe", 17));
        estoque2.adicionarArray(new Item("Leite", 5));
        estoque2.adicionarArray(new Item("Arroz", 21));
        estoque2.adicionarArray(new Item("Ovos", 30));
        System.out.println(estoque2);
        System.out.println();

        estoque2.buscar(2);
        System.out.println();

        estoque2.deletar(2);
        estoque2.deletar(estoque2.getItensArray().get(2));
        System.out.println(estoque2);
        System.out.println();

        estoque2.adicionarArray(new Item("Arroz", 21));
        estoque2.adicionarArray(new Item("Ovos", 30));
        System.out.println(estoque2);
        estoque2.modificar(new Item("Arroz", 29), 2);
        System.out.println(estoque2);
        System.out.println();

        sortStyle = getSortingStyle(true);
        ArrayList<Item> list = new ArrayList<>(estoque2.getItensArray().values());
        System.out.println(Collections.max(list, sortStyle));
        System.out.println(Collections.min(list, sortStyle));
        try {
            Collections.sort(list, sortStyle);
        } catch (Exception e) {
            System.out.println("Error sorting");
        }
        System.out.println(list);
        System.out.println();

        HashMap<Integer, Item> lista2 = new HashMap<>();
        lista2.put(4, new Item("Macarrao", 4));
        lista2.put(5, new Item("Feijao", 15));
        System.out.println(estoque2);
        estoque2.getItensArray().putAll(lista2);
        System.out.println(estoque2);
        System.out.println(estoque2.getItensArray().containsValue(new Item("Macarrao", 4)));  // Mesmos valores, instancias diferentes
        System.out.println(estoque2);
        estoque2.getItensArray().forEach((key, item) -> item.setValor(item.getValor() + 2));
        System.out.println(estoque2.getItensArray().isEmpty());
        System.out.println(estoque2.getItensArray().size());
        System.out.println();

        list = new ArrayList<>(estoque2.getItensArray().values());
        try {
            Collections.sort(list, getSortingStyle(true));
            System.out.println(list);
            Collections.sort(list, getSortingStyle(false));
            System.out.println(list);
        } catch (Exception e) {
            System.out.println("Error sorting");
        }
        System.out.println();
    }

    private static Comparator<Item> getSortingStyle(boolean isAscending) {
        Comparator<Item> comparator;
        if (isAscending) {
            comparator = Comparator.comparing(Item::getNome);
        } else {
            comparator = (o1, o2) -> o2.getNome().compareTo(o1.getNome());
        }

        return comparator;
    }
}
