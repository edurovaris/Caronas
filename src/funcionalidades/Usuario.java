package funcionalidades;

import java.util.List;
import java.util.ArrayList;


public class Usuario {
	
	private String login, senha, nome, endereco, email;
	private String ID;
	
	private List<Carona> caronas;
	
	public Usuario(String login, String senha, String nome, String endereco, String email) throws Exception{
		this.setLogin(login);
		this.setSenha(senha);
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setEmail(email);
		
		caronas = new ArrayList<Carona>();
	}
	
	public String cadastrarCarona(String origem, String destino, String data, String hora, String vagas) throws Exception{
		caronas.add(new Carona(origem, destino, data, hora, vagas));
		return "123456";
	}

	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) throws Exception {
		if(login == null || login.equals("")){
			throw new Exception("Login inválido");
		}
		
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) throws Exception {
		if(senha == null || senha.equals("")){
			throw new Exception("Senha inválida");
		}
		
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) throws Exception {
		if(nome == null || nome.equals("")){
			throw new Exception("Nome inválido");
		}
		
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) throws Exception {
		if(endereco == null || endereco.equals("")){
			throw new Exception("Endereco inválido");
		}
		
		this.endereco = endereco;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) throws Exception {
		if(email == null || email.equals("")){
			throw new Exception("Email inválido");
		}
		
		this.email = email;
	}
	
	public String getID() {
		return ID;
	}
	
	public void setID(String iD) {
		this.ID = iD;
	}

}
