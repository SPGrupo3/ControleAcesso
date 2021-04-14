package cadastroPermissao;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class MainTest {
	
	@Test
	public void testeCadastroPermissao() {
		
		String nomePermissaoTeste = "Registro ponto";
		ArrayList<String> listaPermissoesTeste = new ArrayList<String>();
		Main.CadastrarPermissao(nomePermissaoTeste, listaPermissoesTeste);
		
		assertTrue(listaPermissoesTeste.indexOf(nomePermissaoTeste) >= 0);
	}
	
	@Test
	public void testeCadastroPacotePermissoes() {
		
		String nomePacoteTeste = "Recursos Humanos";
		ArrayList<String> listaPermissoesTeste = new ArrayList<String>();
		ArrayList<Integer> listaPermissoesSelecionadasTeste = new ArrayList<Integer>();
		ArrayList<ArrayList<String>> listaPacotesTeste = new ArrayList<ArrayList<String>>();
		
		ArrayList<ArrayList<String>> testePacoteDePacotesContem = new ArrayList<ArrayList<String>>();
		ArrayList<String> testePacotesContem = new ArrayList<String>();
		
		listaPermissoesTeste.add("Registro de ponto");
		listaPermissoesTeste.add("Cadastro de funcionário");
		listaPermissoesTeste.add("Login");
		listaPermissoesTeste.add("Cadastro de setor");
		listaPermissoesTeste.add("Controle de salários");
		
		listaPermissoesSelecionadasTeste.add(0);
		listaPermissoesSelecionadasTeste.add(1);
		listaPermissoesSelecionadasTeste.add(3);
		
		testePacotesContem.add("Registro de ponto");
		testePacotesContem.add("Cadastro de funcionário");
		testePacotesContem.add("Cadastro de setor");
		
		testePacoteDePacotesContem.add(testePacotesContem);
		
		Main.CadastrarPacotePermissoes(nomePacoteTeste, listaPermissoesTeste, listaPermissoesSelecionadasTeste, listaPacotesTeste);
		
		assertEquals(testePacoteDePacotesContem, listaPacotesTeste);
	}
}
