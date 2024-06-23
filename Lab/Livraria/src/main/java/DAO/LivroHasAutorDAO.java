package DAO;

import Objetos.LivroHasAutor;

import java.sql.SQLException;

public class LivroHasAutorDAO extends DAO<LivroHasAutor> {
    @Override
    public boolean insert(LivroHasAutor object) {
        connectToDB();

        String sql = "insert into livro_has_autor(idLivro, idAutor) " +
                "values (?, ?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, object.getIdLivro());
            pst.setInt(2, object.getIdAutor());
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
    public boolean update(LivroHasAutor object) {
        return true;
    }

    @Override
    public boolean delete(LivroHasAutor object) {
        return true;
    }

    @Override
    public boolean get(LivroHasAutor object) {
        return true;
    }
}
