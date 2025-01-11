package com.israel.trabalhodevweb.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.israel.trabalhodevweb.exception.EntidadeNaoEncontradaException;
import com.israel.trabalhodevweb.modelo.Sessao;
import com.israel.trabalhodevweb.repository.SessaoRepository;

import java.util.List;

@Service
public class SessaoService {

    @Autowired
    private SessaoRepository sessaoRepository;

    public List<Sessao> recuperarSessoes() {
        return sessaoRepository.findAll(Sort.by("id"));
    }

    public Sessao recuperarSessaoPorId(Long id) {
        return sessaoRepository.findById(id)
                .orElseThrow(() -> new EntidadeNaoEncontradaException(
                        "Sessão número " + id + " não encontrado."));
    }
}