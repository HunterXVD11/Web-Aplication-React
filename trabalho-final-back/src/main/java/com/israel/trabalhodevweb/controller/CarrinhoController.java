package com.israel.trabalhodevweb.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.israel.trabalhodevweb.modelo.Carrinho;
import com.israel.trabalhodevweb.modelo.Ingresso;
import com.israel.trabalhodevweb.servico.CarrinhoService;

import java.util.List;

@CrossOrigin("http://localhost:5173")
@RestController
@RequestMapping("carrinho")   // http://localhost:8080/carrinho
public class CarrinhoController {

    @Autowired
    private CarrinhoService carrinhoService;
    //remover Carrinho
    @DeleteMapping("{idCarrinho}")
    public Carrinho removerCarrinho(@PathVariable("idCarrinho") Long idCarrinho) {
        Carrinho carrinho = carrinhoService.recuperarCarrinhoPorId(idCarrinho);
        carrinhoService.removerCarrinho(idCarrinho);
        return carrinho;
    }
}
