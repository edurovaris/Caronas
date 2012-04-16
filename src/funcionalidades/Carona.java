package funcionalidades;

public class Carona {	
	private String origem;
	private String destino;
	private String data;
	private String hora;
	private String vagas;
	
	public Carona(String origem, String destino, String data, String hora, String vagas) throws Exception{ 
		this.setOrigem(origem);
		this.setDestino(destino);
		this.setData(data);
		this.setHora(hora);
		this.setVagas(vagas);
	}

	public String getData() {
		return data;
	}

	public void setData(String data) throws Exception{ 
		if(data == null || data.equals(""))
			throw new Exception("Data inv�lida");
		
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) throws Exception {
		if(hora == null || hora.equals(""))
			throw new Exception("Hora inv�lida");
		
		this.hora = hora;
	}

	public String getVagas() {
		return vagas;
	}

	public void setVagas(String vagas) throws Exception {
		if(!vagas.matches("^[0-9]*$") || Integer.parseInt(vagas) <= 0){
			throw new Exception("Vaga inv�lida");
		}
		
		this.vagas = vagas;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) throws Exception  {
		if(origem == null || origem.equals(""))
			throw new Exception("Origem inv�lida");
		
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) throws Exception  {
		if(destino == null || destino.equals(""))
			throw new Exception("Destino inv�lido");
		
		this.destino = destino;
	}
	
	public String getAtributoCarona(String ID, String atributo) throws Exception{
		if(ID == null || ID.equals("")){
			throw new Exception("Identificador do carona � inv�lido");
		}
		
		if(ID == atributo || atributo.equals("")){
			throw new Exception("Atributo inv�lido");
		}
		
		return ""; //TODO: falta implementar =D
	}

}