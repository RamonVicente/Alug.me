/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.imovelproject.bean;

import com.mycompany.imovelproject.Imovel;
import com.mycompany.imovelproject.TipoImovel;
import com.mycompany.imovelproject.UF;
import com.mycompany.imovelproject.Usuario;
import java.util.List;
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
    private UF[] ufs;

    private TipoImovel[] tipos;
    @EJB
    private ImovelService imovelService;
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public String salvar() {
        this.imovelService.salvar(this.imovel);
        this.imovel = new Imovel();
        return "home";
    }
    
    @PostConstruct
    public void iniciar() {
       imovel = imovelService.criar(); 
    }
    
    public List<Imovel> listarTodos(){
        
        return this.imovelService.listarTodos();
        
    }
    
    public UF[] getUfs(){
        
        return UF.values();
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
    
    public TipoImovel[] getTipos() {
        return TipoImovel.values();
    }

    public void setTipos(TipoImovel[] tipos) {
        this.tipos = tipos;
    }
    
    
}
