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
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ramon
 */
@Entity
@Table(name="tb_cidade")
public class Cidade implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_cidade;
    
    @Column(name = "nome_cidade")
    private String nome;

    public List<Bairro> getBairros() {
        return bairros;
    }

    public void setBairros(List<Bairro> bairros) {
        this.bairros = bairros;
    }
    
    @ManyToOne
    @JoinTable(name = "uf_cidade_fk")
    private UF uf;
    
    @OneToMany(mappedBy = "cidade", targetEntity = Bairro.class, fetch = FetchType.LAZY,
     cascade = CascadeType.ALL)
    private List<Bairro> bairros;

    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(List<Imovel> imoveis) {
        this.imoveis = imoveis;
    }
    
    @OneToMany(mappedBy = "cidade", targetEntity = Imovel.class, fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Imovel> imoveis;
    
    

    public long getId_cidade() {
        return id_cidade;
    }

    public void setId_cidade(long id_cidade) {
        this.id_cidade = id_cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UF getUf() {
        return uf;
    }

    public void setUf(UF uf) {
        this.uf = uf;
    }
    
    
}
