package modelo;

import java.util.ArrayList;
import java.util.List;

import dao.viagem;

public class compras {
	
	private int id;
	private String data;
	private double valor;
	
	private Usuario usuario;
	
	private List<viagens_compra> itens = new ArrayList<viagens_compra>();
	private List<viagens_compra> viagem;
	
	
	public compras() {
		
	}
	
	public compras(int id, String data, Usuario usuario) {
		this.id = id;
		this.data = data;
		this.usuario = usuario;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getValor() {
		return valorCompra();
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<viagens_compra> getItens() {
		List<viagens_compra> viagem = null;
		return viagem;
	}

	public void setItens(List<viagens_compra> viagem) {
		this.viagem = viagem;
	}

	
	@Override
	public String toString() {
		return "Compras [id=" + id + ", data=" + data + ", valor=" + valor + "]";
	}
	
	public double valorCompra() {
		for (int i = 0; i < viagem.size(); i++) {
			this.valor += viagem.get(i).getValor();
		}
		return this.valor;
	}
}