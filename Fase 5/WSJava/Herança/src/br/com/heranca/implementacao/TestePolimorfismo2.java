package br.com.heranca.implementacao;

import javax.swing.JOptionPane;

import br.com.heranca.beans.CD;
import br.com.heranca.beans.Livro;
import br.com.heranca.beans.Produto;

public class TestePolimorfismo2 {

	public static void main(String[] args) {
		Produto produto= new Produto ();
		int opcao=Integer.parseInt(JOptionPane.showInputDialog("Digite <1> para Livro ou <2> para CD"));
		
		if (opcao==1) {
			produto = new Livro(
				JOptionPane.showInputDialog("Título"),							Double.parseDouble(JOptionPane.showInputDialog("Valor Compra")),
				Double.parseDouble(JOptionPane.showInputDialog("Valor Venda")),
				Double.parseDouble(JOptionPane.showInputDialog("Valor Promocional")),
				Integer.parseInt(JOptionPane.showInputDialog("Qtde")),
		        Boolean.parseBoolean(JOptionPane.showInputDialog ("Lançamento?")),
				JOptionPane.showInputDialog("Estilo"),
				JOptionPane.showInputDialog("Editora"),
				JOptionPane.showInputDialog("ISBN"),
				JOptionPane.showInputDialog("Autor"),
				Integer.parseInt(JOptionPane.showInputDialog("Volume")),
				Boolean.parseBoolean(JOptionPane.showInputDialog("Capa Dura?"))
				);}
					
				else if (opcao==2) {
			produto = new CD(
				JOptionPane.showInputDialog("Título"),
				Double.parseDouble(JOptionPane.showInputDialog("Valor Compra")),
				Double.parseDouble(JOptionPane.showInputDialog("Valor Venda")),
				Double.parseDouble(JOptionPane.showInputDialog("Valor Promocional")),
				Integer.parseInt(JOptionPane.showInputDialog("Qtde")),
				Boolean.parseBoolean(JOptionPane.showInputDialog ("Lançamento?")),
				JOptionPane.showInputDialog("Estilo"),
				JOptionPane.showInputDialog("Gravadora"),
				JOptionPane.showInputDialog("Artista"),
				Integer.parseInt(JOptionPane.showInputDialog("Total Faixas"))
			);
		}else {
			System.out.println("Opção inválida");
		}
		System.out.println("Valor do Imposto; " + produto.calcularImposto());
		System.out.println("Eixibindo os dados do produto:");
		System.out.println(produto.toString());
		
	}

}
