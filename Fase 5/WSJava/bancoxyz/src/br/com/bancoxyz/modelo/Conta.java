package br.com.bancoxyz.modelo;

public class Conta {
	private String saldo;
	private int numero;
	private int digito;
	private String titular;
	
	public Conta() {
		super();
	}
	public Conta(String saldo, int numero, int digito, String titular) {
		super();
		this.saldo = saldo;
		this.numero = numero;
		this.digito = digito;
		this.titular = titular;
	}

	public String getSaldo() {
		return saldo;
	}
	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getDigito() {
		return digito;
	}
	public void setDigito(int digito) {
		this.digito = digito;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", numero=" + numero + ", digito=" + digito + ", titular=" + titular + "]";
	}
	
	
}