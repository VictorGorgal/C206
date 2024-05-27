import java.util.ArrayList;
public class Cozinheiro extends Pirata {
    ArrayList<Receita> livroDeReceitas = new ArrayList();

    public Cozinheiro(String nome, String comidaFavorita, int poder) {
        super(nome, comidaFavorita, poder);
    }

    public ArrayList<Receita> getLivroDeReceitas() {
        return livroDeReceitas;
    }

    public void setLivroDeReceitas(ArrayList<Receita> livroDeReceitas) {
        this.livroDeReceitas = livroDeReceitas;
    }

    public String prepararPrato(int index) {
        if (index >= livroDeReceitas.size()) {
            return "-";
        }

        return livroDeReceitas.get(index).getNome();
    }

    public void mostrarReceitas() {
        if (livroDeReceitas.isEmpty()) {
            System.out.println("Nenhuma receita salva");
            return;
        }

        for (Receita receita : livroDeReceitas) {
            System.out.println("Nome: " + receita.getNome());
            System.out.println("Dificuldade: " + receita.getDificuldade());
        }
        System.out.println();
    }
}
