package appguibd.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Augusto
 */
public class SQLiteConexao implements IConexao {

    static Connection conexao = null;

    @Override
    public Connection getConexao(String endereco, String banco, String usuario, String senha) {
        String url = "jdbc:sqlite:" + banco;

        try {
            conexao = DriverManager.getConnection(url);

            System.out.println("Conexão com SQLite estabelecida.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conexao;
    }

}
