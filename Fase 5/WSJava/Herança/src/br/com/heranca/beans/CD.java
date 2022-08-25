package br.com.heranca.beans;

public class CD extends Produto{
	private String gravadora;
	private String artista;
	private int totalFaixas;
	
	public CD() {
		super();
	}

	public CD(String titulo, double valorCompra, double valorVenda, double valorPromocional, int qtde,
			boolean lancamento, String estilo, String gravadora, String artista, int totalFaixas) {
		super(titulo, valorCompra, valorVenda, valorPromocional, qtde, lancamento, estilo);
		this.gravadora = gravadora;
		this.artista = artista;
		this.totalFaixas = totalFaixas;
	}
	
	
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public int getTotalFaixas() {
		return totalFaixas;
	}
	public void setTotalFaixas(int totalFaixas) {
		this.totalFaixas = totalFaixas;
	}
	
	public double calcularImposto() {
		  return getValorCompra() *  0.07;
		}
}

