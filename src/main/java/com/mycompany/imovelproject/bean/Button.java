/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.imovelproject.bean;

import javax.faces.bean.ManagedBean;
import javax.enterprise.context.RequestScoped;

@ManagedBean(name = "botaoBean")
@RequestScoped
public class Button {
    
 public String cadastrar()
 {
     return "cadastro";
 }
 public String login()
 {
     return "login";
 }
 public String cadastrarImovel()
 {
     return "/cadastro_de_imovel";
 }
 public String perfil()
 {
     return "/perfil";
 }
}
