/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.imovelproject.bean;

import com.mycompany.imovelproject.Imovel;
import com.mycompany.imovelproject.TipoImovel;
import com.mycompany.imovelproject.Usuario;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

/**
 *
 * @author ramon
 */
@Stateless
@LocalBean 
@TransactionManagement(TransactionManagementType.CONTAINER)
public class ImovelService {
    
    @PersistenceContext(name = "imovelProject", type = PersistenceContextType.TRANSACTION)
    private EntityManager entityManager;
    
    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
    public Imovel criar() {
        return new Imovel();
    }
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void salvar(Imovel imovel) {
        
        imovel.setStatus(true);
        imovel.getTipoImovel(TipoImovel.CASA);
        entityManager.persist(imovel);
    }
    
}
