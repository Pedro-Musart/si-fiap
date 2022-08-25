package br.com.modelo;

//ATRIBUTOS PRIVADOS
public class Carro {
	private String placa;
	private String modelo;
	private String marca;
	private int id;
	
//CONSTRUTORES
	public Carro(String placa, String modelo, String marca, int id) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		this.id = id;
		
//MÉTODOS PÚBLICOS
		
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	} 
	public String getDadosbasicos() {
		return placa + "\n" + modelo + "\n" + marca; 

	}
}
