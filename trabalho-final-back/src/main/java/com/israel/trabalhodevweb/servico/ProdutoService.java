package com.israel.trabalhodevweb.servico;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.israel.trabalhodevweb.exception.EntidadeDestacadaException;
import com.israel.trabalhodevweb.exception.EntidadeNaoEncontradaException;
import com.israel.trabalhodevweb.exception.EntidadeTransienteException;
import com.israel.trabalhodevweb.modelo.Produto;
import com.israel.trabalhodevweb.repository.ProdutoRepository;
import org.springframework.data.domain.Sort;


import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> recuperarProdutos() {
        return produtoRepository.findAll(Sort.by("id"));
    }

    public Produto cadastrarProduto(Produto produto) {
        if(produto.getId() == null) {
            return produtoRepository.save(produto);
        }
        else {
            throw new EntidadeDestacadaException("Tentando cadastrar um objeto destacado");
        }
    }

    public Produto alterarProduto(Produto produto) {
        if (produto.getId() != null) {
            produtoRepository.findById(produto.getId())
                .orElseThrow(
                    () -> new EntidadeNaoEncontradaException("Produto não encontrado."));
            return produtoRepository.save(produto);
        }
        else {
            throw new EntidadeTransienteException("Tentando alterar um objeto transiente.");
        }
    }
}
