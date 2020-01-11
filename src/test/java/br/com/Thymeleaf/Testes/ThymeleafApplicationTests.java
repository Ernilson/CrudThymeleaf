package br.com.Thymeleaf.Testes;

import br.com.Thymeleaf.ServicoImpl.ServicoFichaImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ThymeleafApplicationTests {

     private ServicoFichaImpl cs;

     @Autowired
    public ThymeleafApplicationTests(ServicoFichaImpl cs) {
        this.cs = cs;
    }
          
    
	@Test
	void contextLoads() {
//            Ficha fc = new Ficha();
            
//            fc.setNome("teste2");
//            fc.setEnder("Quadra");
//            fc.setFone("3654654");
//            fc.setEmail("@teste");
//            
//            cs.saveOrUpdate(fc);
	}

}
