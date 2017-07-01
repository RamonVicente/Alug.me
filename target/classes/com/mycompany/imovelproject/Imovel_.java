package com.mycompany.imovelproject;

import com.mycompany.imovelproject.Bairro;
import com.mycompany.imovelproject.Cidade;
import com.mycompany.imovelproject.Imagem;
import com.mycompany.imovelproject.Queixa;
import com.mycompany.imovelproject.TipoImovel;
import com.mycompany.imovelproject.UF;
import com.mycompany.imovelproject.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-30T22:49:58")
@StaticMetamodel(Imovel.class)
public class Imovel_ { 

    public static volatile SingularAttribute<Imovel, String> capa;
    public static volatile SingularAttribute<Imovel, Cidade> cidade;
    public static volatile SingularAttribute<Imovel, String> caracteristicas;
    public static volatile SingularAttribute<Imovel, String> numero;
    public static volatile ListAttribute<Imovel, Queixa> queixas;
    public static volatile SingularAttribute<Imovel, Bairro> bairro;
    public static volatile SingularAttribute<Imovel, String> cep;
    public static volatile SingularAttribute<Imovel, String> descricao;
    public static volatile SingularAttribute<Imovel, TipoImovel> tipoImovel;
    public static volatile SingularAttribute<Imovel, UF> uf;
    public static volatile SingularAttribute<Imovel, String> complemento;
    public static volatile ListAttribute<Imovel, Imagem> imagens;
    public static volatile SingularAttribute<Imovel, String> logradouro;
    public static volatile SingularAttribute<Imovel, Usuario> usuario;
    public static volatile SingularAttribute<Imovel, Long> id;
    public static volatile SingularAttribute<Imovel, Boolean> status;

}