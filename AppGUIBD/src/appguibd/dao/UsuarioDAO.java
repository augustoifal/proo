/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appguibd.dao;

import appguibd.model.Usuario;
import java.util.List;

/**
 *
 * @author Augusto
 */
public interface UsuarioDAO {
    Usuario login(String login, String senha);
    void salvar(Usuario u);
    List<Usuario> listarTodos();
    Usuario consultar(String login);
}
