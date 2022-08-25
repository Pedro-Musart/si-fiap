package br.com.universidade.modelo;

import java.sql.Date;

public class Professor extends Pessoa{

	private String formacao;
	private float valorHora; 
	private int id;
	private String materias;
	
	
	public String getFormacao() {
		return formacao;
	}
	public Professor() {
		super();
	}
	public Professor(String name, String email, Date nascimento, int telefone, String formacao, float valorHora, int id,
			String materias) {
		super(name, email, nascimento, telefone);
		this.formacao = formacao;
		this.valorHora = valorHora;
		this.id = id;
		this.materias = materias;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMaterias() {
		return materias;
	}
	public void setMaterias(String materias) {
		this.materias = materias;
	}
}
