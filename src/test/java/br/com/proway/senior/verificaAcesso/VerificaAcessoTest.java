package br.com.proway.senior.verificaAcesso;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class VerificaAcessoTest {
	ArrayList<ArrayList<String>> teste = new ArrayList<ArrayList<String>>();
	VerificaAcesso minhaClasse = new VerificaAcesso();

	@Test
	public void verificaSePermissaoExisteNoPacote() {
		VerificaAcesso minhaClasse = new VerificaAcesso();
		minhaClasse.listaPermissaoPacotes.add("Ponto");
		minhaClasse.listaPermissaoPacotes.add("Ver Salário");
		minhaClasse.listaPermissaoPacotes.add("Cadastrar Colaborador");
		minhaClasse.listaPermissaoPacotes.add("Fechar Mês");
		
		ArrayList<String> pacoteBasico = new ArrayList<String>();
		pacoteBasico.add(minhaClasse.listaPermissaoPacotes.get(0));
		pacoteBasico.add(minhaClasse.listaPermissaoPacotes.get(1));
		
		ArrayList<String> pacoteMedio = new ArrayList<String>();
		pacoteMedio.add(minhaClasse.listaPermissaoPacotes.get(2));
		pacoteMedio.add(minhaClasse.listaPermissaoPacotes.get(3));
		
		ArrayList<String> foraListaPacotes = new ArrayList<String>();
		teste.add(foraListaPacotes);
		
		minhaClasse.listaPacotes.add(pacoteBasico);
		minhaClasse.listaPacotes.add(pacoteMedio);
		
		boolean result = minhaClasse.checkPermissionOnPackage(pacoteBasico, "Ponto"); 
		assertEquals(result, true);
	}
	
	@Test
	public void verificaPermissaoPacote() {
		VerificaAcesso minhaClasse = new VerificaAcesso();
		minhaClasse.listaPermissaoPacotes.add("Ponto");
		minhaClasse.listaPermissaoPacotes.add("Salário");
		minhaClasse.listaPermissaoPacotes.add("Cadastrar Colaborador");
		minhaClasse.listaPermissaoPacotes.add("Fechar Mês");
		
		boolean result = minhaClasse.permissionExistsPack("Ponto"); 
		assertEquals(result, true);
	}
	
	@Test
	public void verificaPermissaoIndividual() {
		VerificaAcesso minhaClasse = new VerificaAcesso();
		minhaClasse.listaPermissaoIndividual.add("Sair mais cedo");
		
		boolean result = minhaClasse.permissionExistsIndividual("Sair mais cedo"); 
		assertEquals(result, true);
	}
	
	@Test
	public void verificaPacote() {
		VerificaAcesso minhaClasse = new VerificaAcesso();
		
		ArrayList<String> pacoteBasico = new ArrayList<String>();
		ArrayList<String> pacoteMedio = new ArrayList<String>();
		
		ArrayList<String> foraListaPacotes = new ArrayList<String>();
		teste.add(foraListaPacotes);
		
		minhaClasse.listaPacotes.add(pacoteBasico);
		minhaClasse.listaPacotes.add(pacoteMedio);
		
		boolean result = minhaClasse.packageExists(pacoteBasico); 
		assertEquals(result, true);
	}

}
