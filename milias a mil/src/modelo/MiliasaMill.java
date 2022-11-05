package modelo;

public class MiliasaMill {

	
	private int id_site;
	private String area_de_cadastro;
	
	public MiliasaMill () {
		
	}
	
	public MiliasaMill(int id_site, String area_de_cadastro) {
		super();
		this.id_site = id_site;
		this.area_de_cadastro = area_de_cadastro;
	}

	public int getId_site() {
		return id_site;
	}

	public void setId_site(int id_site) {
		this.id_site = id_site;
	}

	public String getArea_de_cadastro() {
		return area_de_cadastro;
	}

	public void setArea_de_cadastro(String area_de_cadastro) {
		this.area_de_cadastro = area_de_cadastro;
	}
	
	

}
