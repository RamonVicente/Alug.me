package com.mycompany.imovelproject;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tb_usuario")
@NamedQuery(name = "Usuario.listarTodos",
              query= "SELECT e FROM Usuario e")
public class Usuario implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_usuario;

    @Column(name = "nome_usuario", length = 255, nullable = false, unique = true)
    private String nome;

    @Column(name = "sobrenome_usuario", length = 255, nullable = false, unique = true)
    private String sobrenome;

    @Column(name = "cpf_usuario", length = 20, nullable = false, unique = true)
    private String cpf;

    @Column(name = "email_usuario", length = 100, nullable = false)
    private String email;

    @Column(name = "senha_usuario", length = 20, nullable = false)
    private String senha;

    @Temporal(TemporalType.DATE)
    @Column(name = "nascimento_usuario", nullable = true)
    private Date dataNascimento;
    
    @NotNull
    //@Enumerated(EnumType.STRING)
    @JoinTable(name = "tipo_usuario")
    private String tipoUsuario;
    //private TipoUsuario tipoUsuario;
    
    @OneToMany(mappedBy = "usuario", targetEntity = Imovel.class, fetch = FetchType.LAZY,
     cascade = CascadeType.ALL, orphanRemoval = true)
     private List<Imovel> imoveis;

     public String getNome() {
             return nome;
     }
     public void setNome(String nome) {
             this.nome = nome;
     }

    public String getSobrenome() {
        return sobrenome;
    }

    public long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(List<Imovel> imoveis) {
        this.imoveis = imoveis;
    }

     public void setSobrenome(String sobrenome) {
             this.sobrenome = sobrenome;
     }

     public String getCpf() {
             return cpf;
     }
     public void setCpf(String cpf) {
             this.cpf = cpf;
     }

     public String getEmail() {
             return email;
     }
     public void setEmail(String email) {
             this.email = email;
     }

     public String getSenha() {
             return senha;
     }
     public void setSenha(String senha) {
             this.senha = senha;
     }

     public Date getDataNascimento() {
             return dataNascimento;
     }
     public void setDataNascimento(Date dataNascimento) {
                 this.dataNascimento = dataNascimento;
     }
     
	
}