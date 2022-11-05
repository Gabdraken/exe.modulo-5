package modelo;

import java.sql.Date;

public class cliente {

	private int id_cliente;
	
	private String nome_cliente;
	
	private String email_cliente;
	
	private int MiliasAcumuladas_cliente;
	
	private Date nascimento_cliente;
	
	private int sexo_cliente;

	public cliente (int id, String nome_cliente2) {
		
	}
	
	public cliente(int id_cliente, String nome_cliente, String email_cliente, int miliasAcumuladas_cliente,
			Date nascimento_cliente, int sexo_cliente) {
		super();
		this.id_cliente = id_cliente;
		this.nome_cliente = nome_cliente;
		this.email_cliente = email_cliente;
		MiliasAcumuladas_cliente = miliasAcumuladas_cliente;
		this.nascimento_cliente = nascimento_cliente;
		this.sexo_cliente = sexo_cliente;
	}

	public cliente() {
		// TODO Auto-generated constructor stub
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public String getEmail_cliente() {
		return email_cliente;
	}

	public void setEmail_cliente(String email_cliente) {
		this.email_cliente = email_cliente;
	}

	public int getMiliasAcumuladas_cliente() {
		return MiliasAcumuladas_cliente;
	}

	public void setMiliasAcumuladas_cliente(int miliasAcumuladas_cliente) {
		MiliasAcumuladas_cliente = miliasAcumuladas_cliente;
	}

	public Date getNascimento_cliente() {
		return nascimento_cliente;
	}

	public void setNascimento_cliente(Date nascimento_cliente) {
		this.nascimento_cliente = nascimento_cliente;
	}

	public int getSexo_cliente() {
		return sexo_cliente;
	}

	public void setSexo_cliente(int sexo_cliente) {
		this.sexo_cliente = sexo_cliente;
	}

	public void setId1(int int1) {
		// TODO Auto-generated method stub
		
	}

	public void setNome1(String string) {
		// TODO Auto-generated method stub
		
	}

	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setId(int int1) {
		// TODO Auto-generated method stub
		
	}

	public void setNome(String string) {
		// TODO Auto-generated method stub
		
	}

	public void add(cliente cliente) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
