package appguibd.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Augusto
 */

public class BDAlunosSQLite {
    
    static String SQL_CREATE_TABLE_ALUNO = "CREATE TABLE aluno ( matricula text NOT NULL UNIQUE, nome text NOT NULL, data_nascimento text);";

    static String SQL_CREATE_TABLE_USUARIO = "CREATE TABLE usuario ( login text NOT NULL UNIQUE, senha text NOT NULL);";
   
        static String SQL_CREATE_TABLE_TAREFA = "CREATE TABLE usuario ( login text NOT NULL UNIQUE, senha text NOT NULL);";
            static String SQL_CREATE_TABLE_ATIVIDADE = "CREATE TABLE usuario ( login text NOT NULL UNIQUE, senha text NOT NULL);";
                static String SQL_CREATE_TABLE_TIPO_ATIVIDADE = "CREATE TABLE usuario ( login text NOT NULL UNIQUE, senha text NOT NULL);";
                    static String SQL_CREATE_TABLE_TIPO_ = "CREATE TABLE usuario ( login text NOT NULL UNIQUE, senha text NOT NULL);";
    public static void main(String args[]){
        try {
            SQLiteConexao conexao = new SQLiteConexao();
            Connection con = conexao.getConexao("localhost", "db_appguidb.sqlite", "root", "");
            criarBDSQLite(con,SQL_CREATE_TABLE_USUARIO);
            
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BDAlunosSQLite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private static void criarBDSQLite(Connection con, String sql) throws SQLException{
        PreparedStatement pst = con.prepareStatement(sql);
        pst.execute();
        
    }
}
