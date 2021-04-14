package br.com.proway.senior.verificaAcesso;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class VerificaAcessoTest {
	ArrayList<ArrayList<String>> teste = new ArrayList<ArrayList<String>>();
	VerificaAcesso minhaClasse = new VerificaAcesso();

	@Test
	public void verificaSePacoteExiste() {
		VerificaAcesso minhaClasse = new VerificaAcesso();
		minhaClasse.listaPermissao.add("Ponto");
		minhaClasse.listaPermissao.add("Salário");
		minhaClasse.listaPermissao.add("Cadastrar Colaborador");
		minhaClasse.listaPermissao.add("Fechar Mês");
		
		ArrayList<String> pacote1 = new ArrayList<String>();
		pacote1.add(minhaClasse.listaPermissao.get(0));
		pacote1.add(minhaClasse.listaPermissao.get(1));
		
		ArrayList<String> pacote2 = new ArrayList<String>();
		pacote2.add(minhaClasse.listaPermissao.get(2));
		pacote2.add(minhaClasse.listaPermissao.get(3));
		
		ArrayList<String> testeste = new ArrayList<String>();
		teste.add(testeste);
		
		minhaClasse.listaPacotes.add(pacote1);
		minhaClasse.listaPacotes.add(pacote2);
		
		boolean result = minhaClasse.permissionExists(null); 
		assertEquals(result, false);
	}

}
