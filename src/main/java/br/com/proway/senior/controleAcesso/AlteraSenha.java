package br.com.proway.senior.controleAcesso;

import java.util.ArrayList;
import java.util.Random;

public class AlteraSenha {
	
	public static ArrayList<String> alterarSenha(String email) {
		/**
		 * Controla o processo de altera��o de senha
		 * 
		 * Verifica se o usu�rio existe, envia um email para o usu�rio,
		 * Solicita a nova senha e a salva.
		 * 
		 * @param email E-mail do usu�rio.
		 * @return Lista de erros se houver
		 */
		ArrayList<String> erro = new ArrayList<String>();
		if(verificarUsuario(email)) {
			if(gerenciarCodigo(email)) {
				solicitarNovaSenha(email);
			}
			else {
				erro.add("C�digo inv�lido");
			}
		}
		else {
			erro.add("Usu�rio inexistente");
		}
		return erro;
	}

 	public static boolean gerenciarCodigo(String email) {
 		/**
 		 * Gerencia a verifica��o com o c�digo
 		 * 
 		 * Gera, envia e confere o c�digo de verifica��o de usu�rio
 		 * 
 		 * @param email Email do usu�rio
 		 * @return true se o c�digo informado pelo usuario for igual ao gerado
 		 */
		int codigoGerado = gerarCodigo();
		enviarEmail(email, codigoGerado);
		int codigoUsuario = solicitarCodigo();
		return validarCodigo(codigoUsuario, codigoGerado);
		 
	} 	

 	public static void enviarEmail(String email, int codigoGerado) {
 		/**
 		 * Envia um e-mail
 		 * 
 		 * Envia o e-mail para o usu�rio com o c�digo aleat�rio gerado
 		 * para a confirma��o.
 		 * 
 		 * @param email Email do usu�rio
 		 * @param codigoGerado C�digo aleat�rio gerado pelo sistema
 		 */
 		System.out.println("E-mail enviado");
 	}
 	
 	public static int solicitarCodigo() {
 		/**
 		 * Solicita o c�digo para o usu�rio
 		 * 
 		 * Carrega o front-end com o campo para o usu�rio digitar o c�digo
 		 * 
 		 * @return C�digo digitado pelo usu�rio
 		 */
 		System.out.print("C�digo verificador de 5 digitos: ");
		int codigo = 12345;
		return codigo;
 	}

	public static boolean verificarUsuario(String email) {
		/**
		 * Verifica se o usu�rio existe no sistema
		 * 
		 * @return boolean
		 */
		return true;
	};

	public static int gerarCodigo() {
		/**
		 * Gera um c�digo aleat�rio
		 * 
		 * Gera o c�gigo random para a verifica��o de usu�rio
		 * 
		 * @return codigo de 5 digitos
		 */
		Random random = new Random();
		int codigo;
		codigo = random.nextInt(99999) + 10000;
		System.out.println(codigo);
		return codigo;
	}

	public static boolean validarCodigo(int codigoUsuario, int codigoGerado) {
		/**
		 * Verifica o c�digo de recupera��o de senha
		 * 
		 * Compara o c�digo gerado pelo sistema com o c�digo passado pelo usu�rio
		 * 
		 * @param codigoUsuario int C�digo informado pelo usu�rio
		 * @param codigoGerado int C�digo gerado pelo sistema
		 * @return Boolean
		 */
		
		return codigoUsuario == codigoGerado ? true : false;
	}
	
	public static void solicitarNovaSenha(String email) {
		/**
		 * SOlicita a nova senha para o usu�rio
		 * 
		 * @param email Email do usu�rio
		 */
		String senhaNova = "novaSenha";
		salvarSenha(senhaNova);
	}
	
	public static void salvarSenha(String senha) {
		/**
		 * Salva a senha no banco
		 * 
		 * Criptografa e salva a nova senha no perfil do usu�rio
		 * 
		 * @param senha Nova senha do perfil
		 */
		System.out.println("Senha cadastrada com sucesso!!!!!!");
	}
}