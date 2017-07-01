package com.mycompany.imovelproject;

import com.mycompany.imovelproject.Cidade;
import com.mycompany.imovelproject.Imovel;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-30T22:49:58")
@StaticMetamodel(Bairro.class)
public class Bairro_ { 

    public static volatile SingularAttribute<Bairro, Cidade> cidade;
    public static volatile SingularAttribute<Bairro, Long> id_bairro;
    public static volatile ListAttribute<Bairro, Imovel> imoveis;
    public static volatile SingularAttribute<Bairro, String> nome;

}