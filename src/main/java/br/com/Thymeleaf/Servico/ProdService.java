/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Thymeleaf.Servico;

import br.com.Thymeleaf.Model.Produto;
import java.util.List;

/**
 *
 * @author Convidado
 */
public interface ProdService {
    
    List<Produto> listAll();

    Produto getById(Long id);

    Produto saveOrUpdate(Produto cm);

    void delete(Long id);

    Produto saveOrUpdateCadastro(Produto cm);
}
