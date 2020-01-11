/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Thymeleaf.ServicoImpl;

import br.com.Thymeleaf.Model.Ficha;
import br.com.Thymeleaf.Servico.InterServico;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.Thymeleaf.Repository.Repositories;

/**
 *
 * @author ctrlaudos
 */
@Service
public class ServicoFichaImpl implements InterServico{

     private Repositories cdao;

     @Autowired
    public ServicoFichaImpl(Repositories cdao) {
        this.cdao = cdao;
    }  
   
    @Override
    public List<Ficha> listAll() {
         List<Ficha> cm = new ArrayList<>();
        cdao.findAll().forEach(cm::add); //fun with Java 8
        return cm;
    }

    @Override
    public Ficha getById(Long id) {
     return cdao.findById(id).orElse(null);
    }

    @Override
    public Ficha saveOrUpdate(Ficha cm) {
        cdao.save(cm);
        return cm;
    }
    
    
    @Override
    public void delete(Long id) {
        cdao.deleteById(id);
    }

    @Override
    public Ficha saveOrUpdateCadastro(Ficha cm) {
        cdao.save(cm);
        return cm;
    }
    
}
