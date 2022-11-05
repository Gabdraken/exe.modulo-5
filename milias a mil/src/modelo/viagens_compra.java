package modelo;

public class viagens_compra<viagem> {
	
	private int id;
	private int viagem;
	private double valor;
	
	private compras compras;
	private viagem viagem1;
	private int qtd_viagem;

	
	public viagens_compra() {
	}

	public viagens_compra(int i, int j, modelo.compras c1, dao.viagem l2) {
		
	}

	public viagens_compra(int id, int qtd_viagem, compras, compras, viagem, viagem) {
		this.id = id;
		this.qtd_itens = qtd_itens;
		valorItens(modelo.TabelaDeViagens.getPreco());
		this.compras = compras;
		modelo.viagem TabelaDeViagem;
		this.viagem = TabelaDeViagem;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQtd_itens() {
		int qtd_viagem;
		return qtd_viagem;
	}

	public void setQtd_itens(int qtd_itens) {
		this.qtd_viagem = qtd_itens;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public compras getCompras() {
		return compras;
	}

	public void setCompras(compras compras) {
		this.compras = compras;
	}
	
	public <viagem> int getviagem() {
		return viagem;
	}

	public void setLivros(int viagem) {
		this.viagem = viagem;
	}

	
	@Override
	public String toString() {
		return "Itens_compra [id=" + id + ", qtd_itens=" + qtd_viagem + ", valor=" + valor + ", compras=" + compras
				+ "]";
	}
	
	private void valorItens(double preco) {
		this.valor = this.qtd_viagem * preco;
	}

	public dao.viagem getViagem() {
		return null;
	}
	
}
