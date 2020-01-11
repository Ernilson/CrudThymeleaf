/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Thymeleaf.Repository;

import br.com.Thymeleaf.Model.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Convidado
 */
@Repository
public interface ProdRepository extends CrudRepository<Produto, Long>{
    
}
