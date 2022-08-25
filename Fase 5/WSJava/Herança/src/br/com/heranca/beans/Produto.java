package br.com.heranca.beans;

public class Produto {
	private int id;
	private String titulo;
	private double valorCompra;
	private double valorVenda;
	private double valorPromocional;
	private int qtde;
	private boolean lancamento;
	private String estilo;
	
	
	public Produto(String titulo, double valorCompra, double valorVenda, double valorPromocional, int qtde,
			boolean lancamento, String estilo) {
		super();
		this.titulo = titulo;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
		this.valorPromocional = valorPromocional;
		this.qtde = qtde;
		this.lancamento = lancamento;
		this.estilo = estilo;
	}

	public Produto() {
		super();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public double getValorPromocional() {
		return valorPromocional;
	}

	public void setValorPromocional(double valorPromocional) {
		this.valorPromocional = valorPromocional;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public boolean isLancamento() {
		return lancamento;
	}

	public void setLancamento(boolean lancamento) {
		this.lancamento = lancamento;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public double calcularImposto() {
		return 0;
	}
	
	
	
	
}
