package funcionalidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Sistema {
	
	private List<Usuario> usuarios;
	
	public Sistema(){
		usuarios = new ArrayList<Usuario>();
	}
	
	public String abrirSessao(String login, String senha) throws Exception{
		checaLoginValido(login, senha);
		
    	String idSession = "";
    	
    	for(Usuario usuario : usuarios){
    		if(usuario.getLogin().equals(login)){
    			if(usuario.getSenha().equals(senha)){
    				idSession = String.valueOf(Math.abs(new Random().nextInt()));
        			usuario.setID(idSession);
        			return idSession;
    			}
    			else{
    				throw new Exception("Login inválido");
    			}
    		}
    	}
    	
    	throw new Exception("Usuário inexistente");
	}
	
	public boolean checaLoginValido(String login, String senha) throws Exception{
		if(login == null || login.equals("")){
			throw new Exception("Login inválido");
		}
		
		if(senha == null || senha.equals("")){
			throw new Exception("Senha inválido");
		}
		
		boolean resposta = false;
		
		for(Usuario usuario : usuarios){
			if(usuario.getLogin().equals(login)){
				if(usuario.getSenha().equals(senha)){
					resposta = true;
				}
			}
		}
		
		return resposta;
		
	}

	
	public void criarUsuario(String login, String senha, String nome, String endereco, String email) throws Exception{
		for(Usuario u : usuarios){
			if(u.getLogin().equals(login)){
				throw new Exception("Já existe um usuário com este login");
			}
			else if(u.getEmail().equals(email)){
				throw new Exception("Já existe um usuário com este email");
			}
    	}
		
    	usuarios.add(new Usuario(login, senha, nome, endereco, email));
	}
	
	public String getAtributoUsuario(String login, String atributo) throws Exception {
		if(login == null || login.equals("")){
			throw new Exception("Login inválido");
		}
		
		if(atributo == null || atributo.equals("")){
			throw new Exception("Atributo inválido");
		}
		
		for (Usuario usuario : usuarios) {
			if (usuario.getLogin().equals(login)) {
				if (atributo.equals("nome")){
					return usuario.getNome();
				}
				else if(atributo.equals("endereco")){
					return usuario.getEndereco();
				}
				else{
					throw new Exception("Atributo inexistente");
				}
			}
		}

		throw new Exception("Usuário inexistente");
	}
	
}
