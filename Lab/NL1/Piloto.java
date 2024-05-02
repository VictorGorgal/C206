package NL1;

public class Piloto {
    private static int idGeral = 0;

    private String nome;
    private int idade;
    private String nacionalidade;
    private int id;

    public Piloto(String nome, int idade, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;

        idGeral++;
        this.id = idGeral;
    }

    public int getId() {
        return id;
    }

    public void correr(Carro carro) {
        System.out.println("Piloto correndo");
        carro.correr();
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", id=" + id +
                '}';
    }
}
