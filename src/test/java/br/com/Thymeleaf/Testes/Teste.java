/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Thymeleaf.Testes;

import br.com.Thymeleaf.Model.Produto;
import br.com.Thymeleaf.ServicoImpl.ProdServiceImpl;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author Convidado
 */
@SpringBootTest
public class Teste {
    
    @Autowired
    private ProdServiceImpl pr;
    
    @Test
     public void contextLoads() {
         Produto p = new Produto();
            p.setNome("Geladeira Electrolux Frost Free");
            p.setPreco(new BigDecimal("254.99"));
            
            pr.saveOrUpdate(p);
         
	}

}
