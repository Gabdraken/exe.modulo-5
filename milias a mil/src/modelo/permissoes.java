package modelo;

public class permissoes {
	
	private int id;
	private String tipo;
	
	
	public permissoes() {
		
	}
	
	public permissoes(int id, String tipo) {
		this.id = id;
		this.tipo = tipo;
	}
	
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	
	public String mostrar() {
		return "Id: " + this.id + " tipo: " + this.tipo ;
	}
}
