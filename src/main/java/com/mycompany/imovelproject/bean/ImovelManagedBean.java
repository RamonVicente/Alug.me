/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.imovelproject.bean;

import com.mycompany.imovelproject.Imovel;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.annotation.PostConstruct;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

/**
 *
 * @author ramon
 */
@ManagedBean(name = "imovelManagedBean")
@RequestScoped
public class ImovelManagedBean {
    
    private Imovel imovel;
    @EJB
    private ImovelService imovelService;
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public String salvar() {
        this.imovelService.salvar(this.imovel);
        this.imovel = new Imovel();
        return "index";
    }
    
    @PostConstruct
    public void iniciar() {
       imovel = imovelService.criar(); 
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public ImovelService getImovelService() {
        return imovelService;
    }

    public void setImovelService(ImovelService imovelService) {
        this.imovelService = imovelService;
    }
    
    
    
}
