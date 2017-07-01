package com.mycompany.imovelproject;

import com.mycompany.imovelproject.Imovel;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-30T22:49:58")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> senha;
    public static volatile SingularAttribute<Usuario, Long> id_usuario;
    public static volatile ListAttribute<Usuario, Imovel> imoveis;
    public static volatile SingularAttribute<Usuario, String> cpf;
    public static volatile SingularAttribute<Usuario, String> nome;
    public static volatile SingularAttribute<Usuario, String> tipoUsuario;
    public static volatile SingularAttribute<Usuario, String> sobrenome;
    public static volatile SingularAttribute<Usuario, Date> dataNascimento;
    public static volatile SingularAttribute<Usuario, String> email;

}