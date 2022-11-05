package modelo;

import crud.Permissoes;

public class Usuario {
	private int id;
	private String nome;
	private String email;
	private String senha;
	
	private permissoes permissoes;
	
	public Usuario() {
		
	}
	
	public Usuario(int id, String nome, String email, String senha, permissoes permissoes) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.permissoes = permissoes;
	}
	
	
	public Usuario(int i, String string, String string2, String string3, Permissoes p2) {
		// TODO Auto-generated constructor stub
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getSenha() {
		return this.senha;
	}
	
	public void setPermissoes(modelo.permissoes permissoes) {
		this.permissoes = permissoes;
	}
	
	public modelo.permissoes getPermissoes() {
		return permissoes;
	}
	
	
	public String mostrar() {
		return "Id: "+ this.id +" Nome: " +this.nome 
				+ " Email: " + this.email 
				+ " Senha: " + this.senha
				+ " Tipo permiss�o: " + this.permissoes.getTipo(); 
	}
}
