package com.example.onload.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.onload.model.Produto;
import com.example.onload.service.ProdutoService;

@RestController
public class Controller {
	
	@Autowired
	private ProdutoService service;
	
	@GetMapping("/produtos")
	public List<Produto> list() {
	    return service.listAll();
	}
	
	@GetMapping("/produtos/{id}")
	public ResponseEntity<Produto> get(@PathVariable Integer id) {
	    try {
	        Produto pd = service.get(id);
	        return new ResponseEntity<Produto>(pd, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Produto>(HttpStatus.NOT_FOUND);
	    }      
	}
	
	@PostMapping("/produtos")
	public void add(@RequestBody Produto pd) {
	    service.save(pd);
	}
	
	@PutMapping("/produtos")
	public ResponseEntity<Produto> update(@RequestBody Produto pd) {
	    try {
	
	        service.save(pd);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    } 
		
	}
	
	@DeleteMapping("/produtos/{id}")
	public void delete(@PathVariable Integer id) {
	    service.delete(id);
	}
	
	

}
