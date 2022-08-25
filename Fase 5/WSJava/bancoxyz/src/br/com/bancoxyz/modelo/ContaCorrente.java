package br.com.bancoxyz.modelo;

public class ContaCorrente extends Conta{
	private String tipo;
	
	private double chequeEspecial;
	

	public String getTipo () {
		return tipo;
	}

	public void setTipo (String tipo) {
		this.tipo = tipo;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	public String getSaldoDisponivel () {
		return getSaldo()+chequeEspecial;
	}
	
}
	