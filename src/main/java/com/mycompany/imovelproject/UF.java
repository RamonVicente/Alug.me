/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.imovelproject;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ramon
 */
@Entity
@Table(name = "tb_uf")
public class UF implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_uf;
    
    @Column(name = "nome_uf")
    private String uf;
    
    @OneToMany(mappedBy = "uf", targetEntity = Cidade.class, fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Cidade> cidades;
    
    @OneToMany(mappedBy = "uf", targetEntity = Imovel.class, fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Imovel> imoveis;

    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(List<Imovel> imoveis) {
        this.imoveis = imoveis;
    }
    
    public Long getId_uf() {
        return id_uf;
    }

    public void setId_uf(Long id_uf) {
        this.id_uf = id_uf;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }
    
    
    
}
