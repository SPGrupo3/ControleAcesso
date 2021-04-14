package br.com.proway.senior.verificaAcesso;

import java.util.ArrayList;

public class VerificaAcesso {
	ArrayList<String> listaPermissao = new ArrayList<String>();
	ArrayList<ArrayList<String>> listaPacotes = new ArrayList<ArrayList<String>>();
	
	/**
	 * Verifica se o pacote existe na lista de pacotes.
	 * 
	 * Realiza verificação se o pacote informado existe na lista de pacotes,
	 * retorna booelan true caso existir e false se o contrário.
	 * 
	 * @param pack ArrayList<String> referente ao pacote informado.
	 * @return boolean true se o pacote existe e false se o contrário.
	 */
	public boolean packageExists(ArrayList<String> pack){
		if(listaPacotes.indexOf(pack) > listaPacotes.size() || listaPacotes.indexOf(pack) < 0 ){
			return false;
		}
		return true;
	}
	
	/**
	 * Verifica se a permissão informada existe na lista de pacotes
	 * informada. 
	 * 
	 * Realiza a verificação de existencia de um parametro String permission dentro de um parametro
	 * ArrayLsit pack e retorna um boolean.
	 *  
	 * @param pack ArrayList<> primeiro parametro, referente a lista de pacotes
	 * @param permission String segundo parametro, referente a permissão
	 * @return boolean true se existit false caso contrário
	 */
	public boolean checkPermissionOnPackage(ArrayList<String> pack, String permission){
		for(int i = 0; i < pack.size(); i++) {
			if(pack.get(i).equals(permission)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Verifica se a permissão existe na lista de permissões.
	 * 
	 * Realiza verificação se a permissão informada existe na lista de permissões,
	 * retorna booelan true caso existir e false se o contrário.
	 * 
	 * @param permission String referente a permissão informada.
	 * @return boolean true se a permissão existe e false se o contrário.
	 */
	public boolean permissionExists(String permission){
		if(listaPermissao.indexOf(permission) > listaPermissao.size() || listaPermissao.indexOf(permission) < 0){
			return false;
		} 
		return true;
	}
}
