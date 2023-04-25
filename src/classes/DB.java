package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    public static String servidor = "127.0.0.1:3306";
    public static String usuario = "root";
    public static String senha = "";
    public static String nome_banco = "crud";
    public static String BD_URL = "jdbc:mysql://localhost:3306/crud?useTimezone=true&serverTimezone=UTC&useSSL=false";

    public static Connection conexao() {
    Connection conexao = null;

    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conexao = DriverManager.getConnection(BD_URL,usuario,senha);
    } catch (SQLException e) {
        System.out.println("Erro de Conexão"+e.toString());
    } catch (ClassNotFoundException e) {
        System.out.println("Classe nao encontrada "+e.toString());
    }
    return conexao; 
    }
}