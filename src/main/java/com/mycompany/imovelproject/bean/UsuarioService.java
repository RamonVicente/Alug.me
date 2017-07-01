/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.imovelproject.bean;

import com.mycompany.imovelproject.TipoImovel;
import com.mycompany.imovelproject.TipoUsuario;
import com.mycompany.imovelproject.Usuario;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

/**
 *
 * @author ramon
 */
@Stateless
@LocalBean 
@TransactionManagement(TransactionManagementType.CONTAINER)
public class UsuarioService {
    @PersistenceContext(name = "imovelProject", type = PersistenceContextType.TRANSACTION)
    private EntityManager entityManager;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void salvar(Usuario usuario) {
        
        //usuario.setTipoUsuario(TipoUsuario.INTERNAUTA);
        usuario.setTipoUsuario("COMUM");
        entityManager.persist(usuario);
        
    }

    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
    public Usuario criar() {
        return new Usuario();
    }
    
    public List<Usuario> listarTodos(){
        
        Query query = entityManager.createNamedQuery("Usuario.listarTodos");
        return query.getResultList();
    }
    
}

//CRIA TIPOUSUARIO E ENTIDADE QUEIXA/FEEDBACK