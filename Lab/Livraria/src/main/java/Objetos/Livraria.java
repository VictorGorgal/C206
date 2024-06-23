package Objetos;

public class Livraria {
    private int id;
    private String nome;

    public Livraria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Livraria{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
