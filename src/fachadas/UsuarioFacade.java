package fachadas;

import funcionalidades.Carona;
import funcionalidades.Sistema;
import funcionalidades.Usuario;

public class UsuarioFacade {
	Sistema sistema;
	Usuario usuario;
	Carona carona;
	
	public void zerarSistema() throws Exception{
		sistema = new Sistema();
	}
	
	public void criarUsuario(String login, String senha, String nome, String endereco, String email) throws Exception{
		sistema.criarUsuario(login, senha, nome, endereco, email);
	}
	
	public String abrirSessao(String login, String senha) throws Exception{
		return sistema.abrirSessao(login, senha);
	}
	
	public String getAtributoUsuario(String login, String atributo) throws Exception {
		return sistema.getAtributoUsuario(login, atributo);
    }
	
	public String localizarCarona(String origem, String destino){
		return ""; //TODO: incompleto
	}
	
	public String cadastrarCarona(String origem, String destino, String data, String hora, String vagas) throws Exception{
		return usuario.cadastrarCarona(origem, destino, data, hora, vagas); //TODO: incompleto
	}
	
	public String getAtributoCarona(String ID, String atributo) throws Exception{
		return carona.getAtributoCarona(ID, atributo); //TODO: incompleto
	}
	
	public void encerrarSistema(){
		//TODO: implementar posteriormente
	}
	
}
