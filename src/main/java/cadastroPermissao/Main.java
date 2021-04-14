package cadastroPermissao;
import java.util.ArrayList;

public class Main {
	/**
	 * Realiza cadastro de permiss�o.
	 * 
	 * Recebe uma string e um ArrayList. Adiciona a string (nome da permissao) ao ArrayList (lista de permiss�es).
	 * 
	 * @param nomePermissao Recebe string;
	 * @param listaPermissoes Recebe ArrayList.
	 */
	public static void CadastrarPermissao(String nomePermissao, ArrayList<String> listaPermissoes) {
			listaPermissoes.add(nomePermissao);
	}

	/**
	 * Realiza cadastro de pacotes de permiss�es;
	 * 
	 * Recebe string do nome do pacote, o ArrayList com a lista de permiss�es e um ArrayList de pacotes de permiss�es;
	 * Se o nome do pacote n�o estiver cadastrado, seleciona as permiss�es e adiciona o pacote ao ArrayList.
	 * 
	 * @param nomePacote Recebe String;
	 * @param listaPermissoes Recebe ArrayList;
	 * @param listaPacotes Recebe ArrayList
	 */
	public static void CadastrarPacotePermissoes(String nomePacote, ArrayList<String> listaPermissoes, ArrayList<Integer> listaPermissoesSelecionadas, ArrayList<ArrayList<String>> listaPacotes) {
    
		ArrayList<String> pacote = new ArrayList<String>();
		
		for(int lista : listaPermissoesSelecionadas) {
			String item;
			item = listaPermissoes.get(lista);
			
			pacote.add(item);
			}
		listaPacotes.add(pacote);
	}
}
