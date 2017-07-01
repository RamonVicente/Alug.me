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
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author ramon
 */
@Entity
@Table(name="tb_imagem")
public class Imagem implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_imagem;
    
    @Column(name="imagem")
    private String imagem;
    
    @ManyToOne
    @JoinTable(name = "imovel_imagem_fk")
    private Imovel imovel;

    public long getId_imagem() {
        return id_imagem;
    }

    public void setId_imagem(long id_imagem) {
        this.id_imagem = id_imagem;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }
    
    
}
