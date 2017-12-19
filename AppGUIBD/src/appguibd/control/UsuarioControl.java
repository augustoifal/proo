/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appguibd.control;

import appguibd.dao.UsuarioDAO;
import appguibd.model.Usuario;
import java.util.List;

/**
 *
 * @author Augusto
 */
public class UsuarioControl {
  private UsuarioDAO dao = null;

    public UsuarioControl(UsuarioDAO udao) {
        this.dao = udao;
    }
  
    public Usuario login(String nome, String senha){
        return this.dao.login(nome, senha);
    }
  
    public void salvar(Usuario u){
        this.dao.salvar(u);
    }
    
    public List<Usuario> listarTodos(){
        return this.dao.listarTodos();
    }
}
