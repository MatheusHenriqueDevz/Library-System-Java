package repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Usuario;

public class UsuarioDAO {
    public void inserirUsuario(String nome, String email, String senha, String tipo){
        String sql = "INSERT INTO usuarios(nome, email, senha, tipo) VALUES(?, ?, ?, ?)";

        try(Connection conn = ConexaoSQLite.conectar();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {

                Usuario usuario;
                pstmt.setString(1, usuario.getNome());
                pstmt.setString(2, usuario.getEmail());
                pstmt.setString(3, usuario.getSenha());
                pstmt.setString(4, usuario.getTipo());
                pstmt.executeUpdate();
                System.out.println("Usuário inserido com sucesso!");
            } catch (Exception e){
                System.out.println("Erro ao inserir usuário: " + e.getMessage());
            }
    }

    public Usuario buscarPorEmail(String email){
        String sql = "SELECT * FROM usuarios WHERE email = ?";

        try(Connection conn = ConexaoSQLite.conectar();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {

                pstmt.setString(1, email);
                ResultSet rs = pstmt.executeQuery();

                if(rs.next()){
                    return new Usuario(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("email"),
                        rs.getString("senha"),
                        rs.getString("tipo")
                    );
                }
            } catch (Exception e){
                System.out.println("Erro ao buscar usuário: " + e.getMessage());
            }
            return null;
    }
}
