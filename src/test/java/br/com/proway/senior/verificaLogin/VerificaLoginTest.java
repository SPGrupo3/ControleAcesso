package br.com.proway.senior.verificaLogin;

import static org.junit.Assert.*;

import org.junit.Test;

public class VerificaLoginTest {

	@Test
	public void testeLoginCorreto() {
		boolean resultado = VerificaLoginMain.verificalogin("Claudio", "2");
		assertTrue(resultado);
	}
	
	public void testeLoginIncorreto() {
		boolean resultado = VerificaLoginMain.verificalogin("Claudio", "3");
		assertFalse(resultado);
	}

}
