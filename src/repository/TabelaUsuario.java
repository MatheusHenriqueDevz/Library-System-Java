package repository;

import java.sql.Connection;
import java.sql.Statement;;

public class TabelaUsuario {
    public static void criarTabela(){
        String sql = "CREATE TABLE IF NOT EXISTS usuarios ("
                   + " id INTEGER PRIMARY KEY AUTOINCRMENT,"
                   + " nome TEXT NOT NULL,"
                   + " email TEXT UNIQUE,"
                   + " senha TEXT NOT NULL,"
                   + " tipo TEXT NOT NULL" // Pode ser aluno, professor ou gerente
                   + ");";
        
                   try(Connection conn = ConexaoSQLite.conectar();
                       Statement stmt = conn.createStatement()) {
                        stmt.execute(sql);
                        System.out.println("Tabela de usuários criada!");
                       } catch(Exception e) {
                        System.out.println("Erro ao criar tabela " + e.getMessage());
                       }
    }
}
