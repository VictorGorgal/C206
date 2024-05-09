import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Receita> receitas = new ArrayList();
        receitas.add(new Receita("Macarrao", 1));
        receitas.add(new Receita("Carbonara", 4));
        receitas.add(new Receita("Picanha", 2));
        Cozinheiro cozinheiro = new Cozinheiro("Roberto", "Arroz e Feijao", 3);
        cozinheiro.mostrarReceitas();
        cozinheiro.setLivroDeReceitas(receitas);
        cozinheiro.mostrarReceitas();
        System.out.println(cozinheiro.prepararPrato(2));
        System.out.println(cozinheiro.prepararPrato(100));

        Capitao capitao = new Capitao("Capitao", "Picanha", 6, 0);
        capitao.conquistarNovoSeguidor(cozinheiro);
        System.out.println(capitao.getNumeroDeSeguidores());
        capitao.darOrdens();
        capitao.mudarRota();

        Espadachim espadachim = new Espadachim("Aquele la", "Macarrap", 5, "Excalibur");
        espadachim.darOrdens();
        espadachim.mudarRota();
        capitao.conquistarNovoSeguidor(espadachim);
        capitao.darOrdens();

        Capitao capitao2 = new Capitao("Capitao do mal", "Peixe", 9, 2);
        capitao.conquistarNovoSeguidor(capitao2);
        Capitao capitaoVencedor = (Capitao) capitao.lutar(capitao2);
        System.out.println("Capitao vencedor: " + capitaoVencedor.getNome());

        capitao.comer(cozinheiro, 2);
        capitao.comer(cozinheiro, 2);

        capitaoVencedor = (Capitao) capitao.lutar(capitao2);
        System.out.println("Capitao vencedor: " + capitaoVencedor.getNome());
    }
}
