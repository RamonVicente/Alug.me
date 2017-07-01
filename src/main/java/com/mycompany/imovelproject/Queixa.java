/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.imovelproject;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author isabella
 */
@Entity
@Table(name = "tb_queixa")
public class Queixa implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_queixa;
    
    @Column(name = "descricao_queixa")
    private String descricao;
    
    @ManyToOne
    @JoinColumn(name="imovel_queixa_fk")
    private Imovel imovel;
    

    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String queixa) {
        this.descricao = queixa;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }
    
    
}
