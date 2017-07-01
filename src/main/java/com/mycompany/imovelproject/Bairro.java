/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.imovelproject;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ramon
 */
@Entity
@Table(name="tb_bairro")
public class Bairro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_bairro;
    
    @JoinColumn(name = "nome_bairro")
    private String nome; 
    
    @ManyToOne
    @JoinColumn(name = "cidade_bairro_fk")
    private Cidade cidade; 
    
    @OneToMany(mappedBy = "bairro", targetEntity = Imovel.class, fetch = FetchType.LAZY,
     cascade = CascadeType.ALL)
    private List<Imovel> imoveis;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(List<Imovel> imoveis) {
        this.imoveis = imoveis;
    }
    
            
    public Long getId_bairro() {
        return id_bairro;
    }

    public void setId_bairro(Long id_bairro) {
        this.id_bairro = id_bairro;
    }
    
}
