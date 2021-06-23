package com.example.onload.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onload.model.Produto;
import com.example.onload.repository.ProdutoRepository;

@Service
@Transactional
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repo;
	
    public List<Produto> listAll() {
        return repo.findAll();
    }
     
    public void save(Produto pd) {
        repo.save(pd);
    }
     
    public Produto get(Integer id) {
        return repo.findById(id).get();
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }
	
	
	
	
	

}
