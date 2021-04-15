package br.com.jdbc.modelo;

public class Categoria {

	public Integer id;
	public String nome;
	
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
	
}
