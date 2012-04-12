package fachadas;

import funcionalidades.Sistema;

public class UsuarioFacade {
	Sistema sistema;
	
	public void zerarSistema(){
		sistema = new Sistema();
	}
	
	public void criarUsuario(String login, String senha, String nome, String endereco, String email) throws Exception{
		sistema.criarUsuario(login, senha, nome, endereco, email);
	}
	
	public int abrirSessao(String login, String senha){
		return 1;
	}
	
	public String getAtributoUsuario(String login, String atributo) {
		return sistema.getAtributoUsuario(login, atributo);
    }
	
}
