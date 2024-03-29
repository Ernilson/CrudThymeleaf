/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Thymeleaf.Controller;

import br.com.Thymeleaf.Model.Produto;
import br.com.Thymeleaf.ServicoImpl.ProdServiceImpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Convidado
 */
@Controller
@RequestMapping("/produtos")
public class Prodcontrol {
    
    @Autowired
    private ProdServiceImpl pservice;
    
//     private static final List<Produto> DADOS = new ArrayList<>(Arrays.asList(
//            new Produto(1L, "Smartphone Samsung Galaxy On 7", new BigDecimal(849.99)),
//            new Produto(2L, "Geladeira Electrolux Frost Free", new BigDecimal(1947.50)),
//            new Produto(3L, "Purificador de Ã�gua Electrolux", new BigDecimal(533.30)),
//            new Produto(4L, "Smart Watch Relogio Bluetooth", new BigDecimal(64.99)),
//            new Produto(5L, "Smart TV LED 32\" Samsung", new BigDecimal(1249.00)),
//            new Produto(6L, "Kit Pneu Aro 14 Dunlop 175/65r14", new BigDecimal(759.60)))); 
//    
    @GetMapping
    public ModelAndView lista(Produto produto) {
        ModelAndView model = new ModelAndView("/produto-lista.html");
        
        List<Produto> lista = pservice.listAll().stream()
                .filter(p -> produto.getId() == null || produto.getId().equals(p.getId()))
                .filter(p -> StringUtils.isEmpty(produto.getNome()) || p.getNome().startsWith(produto.getNome()))
                .collect(Collectors.toList());
        
        model.addObject("produtos", lista);
        
        return model;
    }
}
