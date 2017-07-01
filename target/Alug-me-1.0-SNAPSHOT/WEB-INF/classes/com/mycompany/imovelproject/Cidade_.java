package com.mycompany.imovelproject;

import com.mycompany.imovelproject.Bairro;
import com.mycompany.imovelproject.Imovel;
import com.mycompany.imovelproject.UF;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-30T22:49:58")
@StaticMetamodel(Cidade.class)
public class Cidade_ { 

    public static volatile SingularAttribute<Cidade, UF> uf;
    public static volatile SingularAttribute<Cidade, Long> id_cidade;
    public static volatile ListAttribute<Cidade, Imovel> imoveis;
    public static volatile SingularAttribute<Cidade, String> nome;
    public static volatile ListAttribute<Cidade, Bairro> bairros;

}