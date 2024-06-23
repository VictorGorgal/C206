package DAO;

import Objetos.Autor;

import java.sql.SQLException;

public class AutorDAO extends DAO<Autor> {
    @Override
    public boolean insert(Autor object) {
        connectToDB();

        String sql = "insert into autor(nome) " +
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
    public boolean update(Autor object) {
        connectToDB();
        String sql = "UPDATE autor SET nome=? where id=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, object.getNome());
            pst.setInt(2, object.getId());
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
    public boolean delete(Autor object) {
        connectToDB();
        String sql = "DELETE FROM autor where id=?";
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
    public boolean get(Autor object) {
        connectToDB();
        String sql = "Select * FROM autor where id=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, object.getId());
            rs = pst.executeQuery();

            rs.next();

            object.setNome(rs.getString("nome"));

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
