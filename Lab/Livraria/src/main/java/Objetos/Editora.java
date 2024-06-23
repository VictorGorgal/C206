package Objetos;

public class Editora {
    private int id;
    private String nome;

    public Editora(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Editora{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
