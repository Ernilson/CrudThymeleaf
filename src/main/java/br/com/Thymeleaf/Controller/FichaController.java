/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Thymeleaf.Controller;

import br.com.Thymeleaf.Model.Ficha;
import br.com.Thymeleaf.Model.Produto;
import br.com.Thymeleaf.ServicoImpl.ServicoFichaImpl;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ctrlaudos
 */
@Controller
@RequestMapping("/testes")
public class FichaController {

    @Autowired
    private ServicoFichaImpl imp;

    @RequestMapping(value = "/fichas", method = RequestMethod.GET)
    public String form() {
        return "/eventos";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/cadastrarFicha")
    public String form(Ficha fc) {
        imp.saveOrUpdate(fc);
//        return "/redirect:/eventos";
        return "/Ficha";
    }

    @RequestMapping(method = RequestMethod.GET, value="/eventos")
    public ModelAndView listaCadastro() {
        ModelAndView mv = new ModelAndView("index");
        Iterable<Ficha> eventos = imp.listAll();
        mv.addObject("eventos", eventos);
        return mv;
    }
    
//         private static final List<Produto> DADOS = new ArrayList<>(Arrays.asList(
//            new Produto(1L, "Smartphone Samsung Galaxy On 7", new BigDecimal(849.99)),
//            new Produto(2L, "Geladeira Electrolux Frost Free", new BigDecimal(1947.50)),
//            new Produto(3L, "Purificador de Ã�gua Electrolux", new BigDecimal(533.30)),
//            new Produto(4L, "Smart Watch Relogio Bluetooth", new BigDecimal(64.99)),
//            new Produto(5L, "Smart TV LED 32\" Samsung", new BigDecimal(1249.00)),
//            new Produto(6L, "Kit Pneu Aro 14 Dunlop 175/65r14", new BigDecimal(759.60)))); 
    
    
    @GetMapping
    public ModelAndView lista(Ficha f) {
        ModelAndView model = new ModelAndView("/teste.html");
        
        List<Ficha> lista = imp.listAll().stream()
                .filter(p -> f.getId() == null || f.getId().equals(p.getId()))
                .filter(p -> StringUtils.isEmpty(f.getNome()) || p.getNome().startsWith(f.getNome()))
                .collect(Collectors.toList());
        
        model.addObject("testes", lista);
        
        return model;
    }
}
