package DAO;

import Objetos.Livraria;

import java.sql.SQLException;

public class LivrariaDAO extends DAO<Livraria> {
    @Override
    public boolean insert(Livraria object) {
        connectToDB();

        String sql = "insert into livraria(nome) " +
                "values (?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, object.getNome());
            pst.execute();
            sucesso = true;
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }

        return sucesso;
    }

    @Override
    public boolean update(Livraria object) {
        return true;
    }

    @Override
    public boolean delete(Livraria object) {
        return true;
    }

    @Override
    public boolean get(Livraria object) {
        connectToDB();
        String sql = "select " +
                "livraria.id as idLivraria, " +
                "livraria.nome as livraria, " +
                "livro.id as idLivro, " +
                "livro.nome as livro, " +
                "livro.avaliacao as avaliacao, " +
                "editora.id as idEditora, " +
                "editora.nome as editora, " +
                "autor.id as idAutor, " +
                "autor.nome as autor " +
                "from " +
                "livraria " +
                "inner join livro on livro.idLivraria = livraria.id " +
                "inner join editora on livro.ideditora = editora.id " +
                "inner join livro_has_autor on livro_has_autor.idLivro = livro.id " +
                "inner join autor on livro_has_autor.idAutor = autor.id";

        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            while(rs.next()) {
                System.out.println(STR."(\{rs.getString("idLivraria")}, \{rs.getString("livraria")}) " +
                        STR."(\{rs.getString("idLivro")}, \{rs.getString("livro")}, \{rs.getString("avaliacao")}) " +
                        STR."(\{rs.getString("idEditora")}, \{rs.getString("editora")}) " +
                        STR."(\{rs.getString("idAutor")}, \{rs.getString("autor")}) ");
            }

            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        return sucesso;
    }
}
