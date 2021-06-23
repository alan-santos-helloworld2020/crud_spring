package com.example.onload.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onload.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Integer> {

}
