package br.com.proway.senior.verificaLogin;

import java.util.Scanner;

public class VerificaLoginMain {

	static Scanner esc;

	public static void main(String[] args) {

		esc = new Scanner(System.in);

		String login, senha;

		System.out.println("Insira login: ");

		login = esc.next();

		System.out.println("Insira senha: ");

		senha = esc.next();

		verificalogin(login, senha);

		if (verificalogin(login, senha) == true) {
			System.out.printf("Usu�rio %s logado com sucesso.", login);
		} else
			System.out.printf("Usu�rio n�o cadastrado");

	}

	/**
	 * Verifica as credenciais.
	 * 
	 * Compara as informa��es que o usuario inseriu com as que est�o no sistema.
	 * 
	 * @param login String login do usuario
	 * @param senha String senha do usuario
	 * @return True or False
	 */
	static boolean verificalogin(String login, String senha) {

		if (login.equals("Claudio") && senha.equals("2")) {
			return true;
		} else {
			return false;
		}
	}

}
