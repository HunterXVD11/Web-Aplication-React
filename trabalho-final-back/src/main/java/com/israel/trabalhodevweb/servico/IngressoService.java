package com.israel.trabalhodevweb.servico;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.israel.trabalhodevweb.exception.EntidadeDestacadaException;
import com.israel.trabalhodevweb.exception.EntidadeNaoEncontradaException;
import com.israel.trabalhodevweb.exception.EntidadeTransienteException;
import com.israel.trabalhodevweb.modelo.Ingresso;
import com.israel.trabalhodevweb.repository.IngressoRepository;

import java.util.List;

@Service
public class IngressoService
{
    @Autowired
    private IngressoRepository ingressoRepository;

    public List<Ingresso> recuperarIngressos() {
        return ingressoRepository.recuperIngressosComFilme();
    }

    public Ingresso cadastrarIngresso(Ingresso ingresso) {
        if(ingresso.getCodIngresso() == null) {
            return ingressoRepository.save(ingresso);
        }
        else {
            throw new EntidadeDestacadaException("Tentando cadastrar um objeto destacado");
        }
    }


    @Transactional
    public Ingresso alterarIngresso(Ingresso ingresso) {
        if (ingresso.getCodIngresso() != null) {
//          produtoRepository.recuperarProdutoPorIdComLock(produto.getId())
            ingressoRepository.findById(ingresso.getCodIngresso())
                    .orElseThrow(
                            () -> new EntidadeNaoEncontradaException("Ingresso não encontrado."));
            return ingressoRepository.save(ingresso);
        }
        else {
            throw new EntidadeTransienteException("Tentando alterar um objeto transiente.");
        }
    }


    public void removerIngresso(Long id) {
        ingressoRepository.deleteById(id);
    }

    @GetMapping
    public Ingresso recuperarIngressoPorId(Long id) {
        return ingressoRepository.findById(id)
                .orElseThrow(() -> new EntidadeNaoEncontradaException(
                        "Ingresso número " + id + " não encontrado"));
    }

    public List<Ingresso> recuperarIngressosPorTituloFilme(String tituloFilme) {
        System.out.println(tituloFilme);
        return ingressoRepository.findBySessaoTituloFilme(tituloFilme);
    }

    public Page<Ingresso> recuperarIngressosPorHorarioDaSessaoComPaginacao(String horaInicio, Pageable pageable) {
        if (!horaInicio.isEmpty())
            return ingressoRepository.recuperarIngressosPorHorarioDaSessaoComPaginacao(horaInicio, pageable);
        else
            return ingressoRepository.recuperarIngressosComPaginacao(pageable);
    }

    public Page<Ingresso> recuperarIngressosPaginados(String tituloFilme, Pageable pageable) {
        return ingressoRepository.recuperarIngressosPaginados(tituloFilme, pageable);
    }


}
