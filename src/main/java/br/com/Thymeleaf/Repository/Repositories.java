/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Thymeleaf.Repository;

import br.com.Thymeleaf.Model.Ficha;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ctrlaudos
 */
@Repository
@Transactional
public interface Repositories extends CrudRepository<Ficha, Long>{

       
}
