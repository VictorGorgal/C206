package DAO;

import java.sql.*;

public abstract class DAO<TypeDAO> {
    private final String database = "rede_livraria";
    private final String user = "root";
    private final String password = "root";
    private final String url = "jdbc:mysql://localhost:3306/" + database + "?useTimezone=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";

    public boolean sucesso = false;
    public Connection con; //conexão
    public PreparedStatement pst; // declaração(query) preparada - código em sql
    public Statement st; //declaração(query) - código em sql
    public ResultSet rs; //resposta do banco

    public abstract boolean insert(TypeDAO object);
    public abstract boolean update(TypeDAO object);
    public abstract boolean delete(TypeDAO object);
    public abstract boolean get(TypeDAO object);

    public void connectToDB() {
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch(SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        }
    }
}
