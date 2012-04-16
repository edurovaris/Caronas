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
    				throw new Exception("Login inv�lido");
    			}
    		}
    	}
    	
    	throw new Exception("Usu�rio inexistente");
	}
	
	public boolean checaLoginValido(String login, String senha) throws Exception{
		if(login == null || login.equals("")){
			throw new Exception("Login inv�lido");
		}
		
		if(senha == null || senha.equals("")){
			throw new Exception("Senha inv�lido");
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
				throw new Exception("J� existe um usu�rio com este login");
			}
			else if(u.getEmail().equals(email)){
				throw new Exception("J� existe um usu�rio com este email");
			}
    	}
		
    	usuarios.add(new Usuario(login, senha, nome, endereco, email));
	}
	
	public String getAtributoUsuario(String login, String atributo) throws Exception {
		if(login == null || login.equals("")){
			throw new Exception("Login inv�lido");
		}
		
		if(atributo == null || atributo.equals("")){
			throw new Exception("Atributo inv�lido");
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

		throw new Exception("Usu�rio inexistente");
	}
	
}
