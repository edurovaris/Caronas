package funcionalidades;

import java.util.ArrayList;
import java.util.List;


public class Sistema {
	
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	private int sessionID;
	
	public int abrirSessao(String login, String senha){
		return 1;
	}
	
	public void criarUsuario(String login, String senha, String nome, String endereco, String email) throws Exception{
    	usuarios.add(new Usuario(login, senha, nome, endereco, email));
	}
	
	public String getAtributoUsuario(String login, String atributo) {
		String campo = "";		
		
		for (Usuario u : usuarios) {
			if (u.getLogin().equals(login)) {
				if (atributo.equals("nome"))
					campo = u.getNome();
				else
					campo = u.getEndereco();
			}
		}

		return campo;			
	}
	
}
