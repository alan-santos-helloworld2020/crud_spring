package com.example.onload.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	
	private Integer id;
	private String data_compra; 
	private String nome;
	private float preco;

	
	public String getData_compra() {
		return data_compra;
	}

	public void setData_compra(String data_compra) {
		this.data_compra = data_compra;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public Produto() {
	}

	public Produto(Integer id,String data_compra, String name, float price) {
		this.id = id;
		this.data_compra = data_compra;
		this.nome = name;
		this.preco = price;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

}
