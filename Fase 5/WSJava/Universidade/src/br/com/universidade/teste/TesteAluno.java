package br.com.universidade.teste;

import br.com.universidade.modelo.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno Sthe = new Aluno (
				"Sthefany",
				0621,
				"sthefany@fiap.com.br");
		System.out.println("Nome:" + Sthe.getNome()); 
		System.out.println("Número de Matrícula:" + Sthe.getRm()); 
		System.out.println("Email:" + Sthe.getEmail()); 
	}

}
