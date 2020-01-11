/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Thymeleaf.Servico;

import br.com.Thymeleaf.Model.Ficha;
import java.util.List;

/**
 *
 * @author ctrlaudos
 */
public interface InterServico {
    
    List<Ficha> listAll();

    Ficha getById(Long id);

    Ficha saveOrUpdate(Ficha cm);

    void delete(Long id);

    Ficha saveOrUpdateCadastro(Ficha cm);
}
