package com.portifolio.apiprodutos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portifolio.apiprodutos.entity.Produto;

public interface ProdutoRepository  extends JpaRepository<Produto, Long>{
}
