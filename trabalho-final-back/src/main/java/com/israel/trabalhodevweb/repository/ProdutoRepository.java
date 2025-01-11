package com.israel.trabalhodevweb.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.israel.trabalhodevweb.modelo.Produto;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    Produto findByNome(String nome);
}
