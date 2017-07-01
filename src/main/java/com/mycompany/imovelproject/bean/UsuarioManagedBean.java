/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.imovelproject.bean;

import com.mycompany.imovelproject.Usuario;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


/**
 *
 * @author ramon
 */
@ManagedBean(name = "usuarioManagedBean")
@RequestScoped
public class UsuarioManagedBean {
    
    private Usuario usuario;
    
    @EJB
    private UsuarioService usuarioService;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    @PostConstruct
    public void iniciar() {
       usuario = usuarioService.criar(); 
    }
    
    public String salvar() {
        this.usuarioService.salvar(this.usuario);
        this.usuario = new Usuario();
        return "home";
    }
    
    public List<Usuario> listarTodos(){
        
        return this.usuarioService.listarTodos();
        
    }
}
