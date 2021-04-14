package br.com.proway.senior.cadastroPerfilAcesso;

import java.util.Scanner;

public class Main {

	static Scanner sc;
	static String senha;
	static String nome;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		System.out.println("Digite um nome de login de at� 6 caracteres: ");
		nome = sc.next();

		while (verificaLogin(nome) == false) {
			System.out.println("Digite um nome de login de at� 6 caracteres: ");
			nome = sc.next();
		}
		String login = nome.charAt(0) + "_" + nome;

		System.out.println("Nome de login cadastrado!");
		System.out.println("Seu login �: " + login);

		System.out.println("Insira uma senha de 6 d�gitos:");
		senha = sc.next();

		while (verificaSenha(senha) == false) {
			System.out.println("Insira uma senha de 6 d�gitos:");
			senha = sc.next();
		}

		System.out.println(senhaCriada());
	}

	static String senhaCriada() {
		return "Senha cadastrada com sucesso!";
	}

	/**
	 * Verifica um nome de login(perfil). Recebe um nome de login digitado pelo
	 * usu�rio de at� 6 (seis) caracteres e verifica se est� dentro dos padr�es
	 * definidos.
	 * 
	 * @param nome String � um nome de login que o usu�rio digita
	 * @return Retorna um boolean caso o nome de login esteja verdadeiro
	 */
	public static boolean verificaLogin(String nome) {
		if (nome.length() <= 6) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Verifica uma senha. Recebe uma senha digitada pelo usu�rio de 6 (seis)
	 * caracteres e verifica se est� dentro dos padr�es definidos.
	 * 
	 * @param senha String � uma senha que o usu�rio digita
	 * @return Retorna um boolean caso a senha seja verdadeira
	 */
	public static boolean verificaSenha(String senha) {
		if (senha.length() == 6) {
			return true;
		} else {
			return false;
		}
	}

}