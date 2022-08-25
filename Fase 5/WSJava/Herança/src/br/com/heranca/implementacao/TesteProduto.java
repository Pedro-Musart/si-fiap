package br.com.heranca.implementacao;

import javax.swing.JOptionPane;

import br.com.heranca.beans.Livro;

public class TesteProduto {

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID")));
		livro.setEstilo(JOptionPane.showInputDialog("Digite o estilo"));
		livro.setTitulo(JOptionPane.showInputDialog("Digite o titulo"));
		livro.setAutor(JOptionPane.showInputDialog("Digite o autor"));
		livro.setLancamento(Boolean.parseBoolean(JOptionPane.showInputDialog("Lançamento?")));
		livro.setCapaDura(Boolean.parseBoolean(JOptionPane.showInputDialog("Capa Dura")));
		System.out.println("ID:" + livro.getId());
		System.out.println("Estilo:" + livro.getEstilo());
		
	if(livro.isCapaDura() == true) {
			System.out.println("Capa dura? Sim");
		}else {
			System.out.println("Capa dura? Não");
		}

	} 
	
	
}
