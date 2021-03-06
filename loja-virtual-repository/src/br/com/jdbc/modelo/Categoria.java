package br.com.jdbc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

	public Integer id;
	public String nome;
	public List<Produto> produtos = new ArrayList<Produto>();
	
	public Categoria(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Object getNome() {
		return nome;
	}

	public int getId() {
		return id;
	}

	public void adcionar(Produto produto) {
		produtos.add(produto);		
	}

	public List<Produto> getProduto() {
		return produtos;	
	}
	
}
