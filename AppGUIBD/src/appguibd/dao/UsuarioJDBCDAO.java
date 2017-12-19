/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appguibd.dao;

import appguibd.model.Usuario;
import appguibd.util.IConexao;
import appguibd.util.SQLiteConexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Augusto
 */
public class UsuarioJDBCDAO implements UsuarioDAO {

    Connection conexao = null;

    @Override
    public Usuario login(String usuario, String senha) {
        Usuario u = null;

        conexao = abreConexao();
        String sql = "SELECT * FROM usuario where login=? and senha=?";
        try {
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setString(1, usuario);
            pst.setString(2, Usuario.senhaMD5(senha));
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                u = new Usuario(rs.getString("login"), rs.getString("senha"));
            }
            conexao.close();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro na inserção de dados no banco:\n" + ex.getMessage());

        }
        return u;
    }

    @Override
    public void salvar(Usuario u) {
        conexao = abreConexao();
        String sql = "INSERT INTO usuario(login, senha) VALUES (?, ?)";
        try {
            PreparedStatement pst = conexao.prepareStatement(sql);
            pst.setString(1, u.getNomeUsuario());
            pst.setString(2, u.senhaMD5()); // A senha armazenada no BD é um hash MD5, para não armazenar senha plana.

            pst.execute();

            conexao.close();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro na inserção de dados no banco:\n" + ex.getMessage());

        }
    }

    private Connection abreConexao() {
        IConexao banco = new SQLiteConexao();
        Connection conexao = banco.getConexao(null, "db_appguidb.sqlite", null, null);
        return conexao;
    }

    @Override
    public List<Usuario> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario consultar(String login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
