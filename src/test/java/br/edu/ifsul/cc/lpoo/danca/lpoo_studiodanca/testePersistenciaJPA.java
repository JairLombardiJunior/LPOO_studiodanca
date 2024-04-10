/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.danca.lpoo_studiodanca;

import br.edu.ifsul.cc.lpoo.danca.lpoo_studiodanca.dao.PersistenciaJPA;
import org.junit.Test;

/**
 *
 * @author 20181pf.cc0256
 */
public class testePersistenciaJPA {
    
    @Test
    public void testeCompras(){
        PersistenciaJPA jpa = new PersistenciaJPA();
        if(jpa.conexaoAberta()){
            System.out.println("Conexão realizada com sucesso");
        
        }else{
            System.out.println("Fla ao se conectar ao banco");
        }
    }
    
}
