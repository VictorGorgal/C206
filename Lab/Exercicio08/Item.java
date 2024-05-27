package Exercicio08;

public class Item {
    private int valor;
    private String nome;

    public Item(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Item{" +
                "valor=" + valor +
                ", nome='" + nome + '\'' +
                '}';
    }
}
