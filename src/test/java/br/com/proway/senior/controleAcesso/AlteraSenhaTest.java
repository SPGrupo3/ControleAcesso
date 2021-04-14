package br.com.proway.senior.controleAcesso;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlteraSenhaTest {

	@Test
	public void testValidarCodigoIgual() {
		boolean result = AlteraSenha.validarCodigo(12345, 12345);
		assertEquals(result, true);
	}
	
	@Test
	public void testValidarCodigoDiferente() {
		boolean result = AlteraSenha.validarCodigo(54321, 12345);
		assertEquals(result, false);
	}
	
	@Test
	public void testGerarCodigo5Digitos() {
		int codigo = AlteraSenha.gerarCodigo();
		int res = ("" + codigo).length();
		assertEquals(5, res);	
	}
	@Test
	public void testSolicitaCodigo() {
		assertEquals(AlteraSenha.solicitarCodigo(), 12345);
	}
	@Test
	public void testVerificarUsuarioExistente() {
		String email = "teste@gmail.com";
		assertEquals(AlteraSenha.verificarUsuario(email), true);
	}
}
