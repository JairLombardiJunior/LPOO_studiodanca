/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.danca.lpoo_studiodanca;

import br.edu.ifsul.cc.lpoo.danca.lpoo_studiodanca.dao.PersistenciaJPA;
import br.edu.ifsul.cc.lpoo.danca.lpoo_studiodanca.model.Modalidade;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author 20181pf.cc0256
 */
public class TestePersistenciaModalidade {
 
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    public TestePersistenciaModalidade(){
        
    }
    
    @Before // o que fazer antes da persistencia
    public void setUp() {
        jpa.conexaoAberta();
        
    }
    
    @After
    public void tearDown() {
        jpa.fecharConexao();
    }
    
    @Test
    public void testePersistenciaModalidade() throws Exception {
            
        Modalidade m = new Modalidade();
        m.setDescricao("Valsa");
        
    
        // persistir o objeto
        jpa.persist(m);

        // buscar objeto persistido
        Modalidade persistidoProduto = (Modalidade)jpa.find(Modalidade.class, m.getId());
    
        // verificar se o objeto persistido é igual ao criado
        Assert.assertEquals(m.getDescricao(), 
                persistidoProduto.getDescricao());
        
    }
}
