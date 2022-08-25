package br.com.master3.beans.implementação;

import br.com.master3.beans.Usuario;

public class TesteUsuario {

	public static void main(String[] args) {
		Usuario objeto = new Usuario();
		objeto.setEmail("gulliver@masters3.com");
		objeto.setFoto("/img/gulliver.jpg");
		objeto.setGenero("MASCULINO");
		objeto.setId(1);
		objeto.setNivel("ADMIN");
		objeto.setSenha("xpto");
		objeto.setNome("Viajante da Silva");
		System.out.println(objeto.getEmail());
		System.out.println(objeto.getNome());
		System.out.println(objeto.getId());

}}
