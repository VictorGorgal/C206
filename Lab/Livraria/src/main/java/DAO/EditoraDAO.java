package DAO;

import Objetos.Editora;

import java.sql.SQLException;

public class EditoraDAO extends DAO<Editora> {
    @Override
    public boolean insert(Editora object) {
        connectToDB();

        String sql = "insert into editora(nome) " +
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
    public boolean update(Editora object) {
        return true;
    }

    @Override
    public boolean delete(Editora object) {
        return true;
    }

    @Override
    public boolean get(Editora object) {
        connectToDB();
        String sql = "Select * FROM editora where id=?";

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
