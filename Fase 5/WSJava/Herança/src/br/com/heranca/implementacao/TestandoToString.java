package br.com.heranca.implementacao;

import br.com.heranca.beans.CD;
import br.com.heranca.beans.Produto;

public class TestandoToString {

	public static void main(String[] args) {
		Produto produto = new CD ();
		produto.setValorVenda(100);
		
		System.out.println(produto.calcularImposto());
		System.out.println(produto.toString());
	}

}
