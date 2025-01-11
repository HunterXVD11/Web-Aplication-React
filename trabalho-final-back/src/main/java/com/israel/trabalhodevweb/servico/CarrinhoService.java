package com.israel.trabalhodevweb.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.israel.trabalhodevweb.exception.EntidadeNaoEncontradaException;
import com.israel.trabalhodevweb.modelo.Carrinho;
import com.israel.trabalhodevweb.repository.CarrinhoRepository;

@Service
public class CarrinhoService {

    @Autowired
    private CarrinhoRepository carrinhoRepository;

    public Carrinho recuperarCarrinhoPorId(Long id) {
        return carrinhoRepository.findById(id)
                .orElseThrow(() -> new EntidadeNaoEncontradaException(
                        "Carrinho número " + id + " não encontrado."));
    }
    public void removerCarrinho(Long id) {
        carrinhoRepository.deleteById(id);
    }

}
