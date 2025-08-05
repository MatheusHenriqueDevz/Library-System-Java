package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;;

public class ConexaoSQLite {
    public static Connection conectar(){
        Connection conexao = null;

        try{
            String url = "jdbc:sqlite:biblioteca.db";
            conexao = DriverManager.getConnection(url);
            System.out.println("Conexão com SQLite estabelecida!!");
        } catch(SQLException e){
            System.out.println("Erro ao conectar: " + e.getMessage());
        }

        return conexao;
    }
}
