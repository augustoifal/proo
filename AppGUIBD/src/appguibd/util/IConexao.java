package appguibd.util;


import java.sql.Connection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Augusto
 */
public interface IConexao {
    Connection getConexao(String endereco, String banco, String usuario, String senha);
}
