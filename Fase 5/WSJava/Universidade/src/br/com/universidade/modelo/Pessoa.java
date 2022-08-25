package br.com.universidade.modelo;

import java.sql.Date;

public class Pessoa {
	private String name;
	private String email;
	private Date nascimento;
	private int telefone;
	
	
	
	public Pessoa() {
		super();
	}

	public Pessoa(String name, String email, Date nascimento, int telefone) {
		super();
		this.name = name;
		this.email = email;
		this.nascimento = nascimento;
		this.telefone = telefone;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
}
