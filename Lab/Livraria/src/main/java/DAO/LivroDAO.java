package DAO;

import Objetos.Livro;

import java.sql.SQLException;

public class LivroDAO extends DAO<Livro> {
    @Override
    public boolean insert(Livro object) {
        connectToDB();

        String sql = "insert into livro(nome, avaliacao, idLivraria, idEditora) " +
                "values (?, ?, ?, ?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, object.getNome());
            pst.setInt(2, object.getAvaliacao());
            pst.setInt(3, object.getIdLivraria());
            pst.setInt(4, object.getIdEditora());
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
    public boolean update(Livro object) {
        connectToDB();
        String sql = "UPDATE livro SET nome=?, avaliacao=?, idLivraria=?, idEditora=? where id=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, object.getNome());
            pst.setInt(2, object.getAvaliacao());
            pst.setInt(3, object.getIdLivraria());
            pst.setInt(4, object.getIdEditora());
            pst.setInt(5, object.getId());
            pst.execute();
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
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
    public boolean delete(Livro object) {
        connectToDB();
        String sql = "DELETE FROM livro where id=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, object.getId());
            pst.execute();
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
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
    public boolean get(Livro object) {
        connectToDB();
        String sql = "Select * FROM livro where id=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, object.getId());
            rs = pst.executeQuery();

            rs.next();

            object.setNome(rs.getString("nome"));
            object.setAvaliacao(rs.getInt("avaliacao"));
            object.setIdLivraria(rs.getInt("idLivraria"));
            object.setIdEditora(rs.getInt("idEditora"));

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
