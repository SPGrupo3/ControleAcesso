package br.com.proway.senior.cadastroPerfilAcesso;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void testSenhaCorreta() {
        boolean resultado = Main.verificaSenha("123456");
        assertTrue (resultado);
   	}
	
	@Test
	public void testLoginCorreto() {
        boolean resultadoLogin = Main.verificaLogin("Nome");
        assertTrue (resultadoLogin);    
	}
}
