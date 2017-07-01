package com.mycompany.imovelproject;

import com.mycompany.imovelproject.Cidade;
import com.mycompany.imovelproject.Imovel;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-30T22:49:58")
@StaticMetamodel(UF.class)
public class UF_ { 

    public static volatile SingularAttribute<UF, String> uf;
    public static volatile SingularAttribute<UF, Long> id_uf;
    public static volatile ListAttribute<UF, Imovel> imoveis;
    public static volatile ListAttribute<UF, Cidade> cidades;

}