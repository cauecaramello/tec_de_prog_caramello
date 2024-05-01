package br.com.minhaloja.main;

import br.com.minhaloja.model.Endereco;
import br.com.minhaloja.model.Pessoa;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var ruaPauloDick = new Endereco("123", "minha rua", 12);
		var pessoa = new Pessoa("Paulo Pinto", "40028922", ruaPauloDick);
		System.out.println(pessoa);
	}
		
}
