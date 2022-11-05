package modelo;

public class TabelaDeViagens {

	
	private int id_viagem;
	private String nome_viagem;
	private int preco_viagem;
	private String embarque_viagem;
	private String desembarque;
	
	public TabelaDeViagens () {
		
	}
	
	public TabelaDeViagens(int id_viagem, String nome_viagem, int preco_viagem, String embarque_viagem,
			String desembarque) {
		super();
		this.id_viagem = id_viagem;
		this.nome_viagem = nome_viagem;
		this.preco_viagem = preco_viagem;
		this.embarque_viagem = embarque_viagem;
		this.desembarque = desembarque;
	}

	public int getId_viagem() {
		return id_viagem;
	}

	public void setId_viagem(int id_viagem) {
		this.id_viagem = id_viagem;
	}

	public String getNome_viagem() {
		return nome_viagem;
	}

	public void setNome_viagem(String nome_viagem) {
		this.nome_viagem = nome_viagem;
	}

	public int getPreco_viagem() {
		return preco_viagem;
	}

	public void setPreco_viagem(int preco_viagem) {
		this.preco_viagem = preco_viagem;
	}

	public String getEmbarque_viagem() {
		return embarque_viagem;
	}

	public void setEmbarque_viagem(String embarque_viagem) {
		this.embarque_viagem = embarque_viagem;
	}

	public String getDesembarque() {
		return desembarque;
	}

	public void setDesembarque(String desembarque) {
		this.desembarque = desembarque;
	}
	
	
}
