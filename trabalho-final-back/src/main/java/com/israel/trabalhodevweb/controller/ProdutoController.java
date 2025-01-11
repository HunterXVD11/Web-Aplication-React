package com.israel.trabalhodevweb.controller;

import com.israel.trabalhodevweb.modelo.Produto;
import com.israel.trabalhodevweb.servico.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")   // http://localhost:5173/produtos
@CrossOrigin(origins = "http://localhost:5173")

public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> recuperarProdutos() {
        return produtoService.recuperarProdutos();
    }

//    @PostMapping
//    public ResponseEntity<Produto> cadastrarProduto(@RequestBody Produto produto) {
//        Produto umProduto = produtoService.cadastrarProduto(produto);
//        return new ResponseEntity<>(umProduto, HttpStatus.OK);
//    }

    @PostMapping
    public Produto cadastrarProduto(@RequestBody Produto produto) {
        return produtoService.cadastrarProduto(produto);
    }

    @PutMapping
    public Produto alterarProduto(@RequestBody Produto produto) {
        return produtoService.alterarProduto(produto);
    }
}
