package com.israel.trabalhodevweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.israel.trabalhodevweb.modelo.Sessao;
import com.israel.trabalhodevweb.servico.SessaoService;

import java.util.List;

@CrossOrigin("http://localhost:5173")
@RestController
@RequestMapping("sessoes")
public class SessaoController {

    @Autowired
    private SessaoService sessaoService;

    @GetMapping
    public List<Sessao> recuperarSessoes() {
        return sessaoService.recuperarSessoes();
    }
}