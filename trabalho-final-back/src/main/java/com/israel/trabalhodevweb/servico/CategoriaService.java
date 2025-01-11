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
import com.israel.trabalhodevweb.modelo.Categoria;
import com.israel.trabalhodevweb.repository.CategoriaRepository;

import java.util.List;

@Service
public class CategoriaService {
    
}
