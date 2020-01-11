/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Thymeleaf.ServicoImpl;

import br.com.Thymeleaf.Model.Ficha;
import br.com.Thymeleaf.Model.Produto;
import br.com.Thymeleaf.Repository.ProdRepository;
import br.com.Thymeleaf.Servico.ProdService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Convidado
 */
@Service
public class ProdServiceImpl implements ProdService{

    @Autowired
    private ProdRepository pr;
    
    @Override
    public List<Produto> listAll() {
       List<Produto> cm = new ArrayList<>();
        pr.findAll().forEach(cm::add); //fun with Java 8
        return cm;
    }

    @Override
    public Produto getById(Long id) {
       return pr.findById(id).orElse(null);
    }

    @Override
    public Produto saveOrUpdate(Produto cm) {
        pr.save(cm);
        return cm;
    }

    @Override
    public void delete(Long id) {
        pr.deleteById(id);
    }

    @Override
    public Produto saveOrUpdateCadastro(Produto cm) {
        pr.save(cm);
        return cm;
    }
    
}
