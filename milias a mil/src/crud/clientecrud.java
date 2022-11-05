package crud;

import java.util.Scanner;

import dao.clienteDao;
import modelo.cliente;

public class clientecrud {

	public static void main(String[] args) {

		clientecrud autorDAO = new clientecrud();

		Scanner s = new Scanner(System.in);
		int opcao = 0;
		int posicao = 0;
		int id = 0;
		String nome_cliente = "";

		do {
			System.out.println("=== CRUD cliente ===");
			System.out.println("1 - Cadastrar clientes");
			System.out.println("2 - Consultar clientes");
			System.out.println("3 - Atualizar clientes");
			System.out.println("4 - Deletar clientes");
			System.out.println("5 - Buscar por id");
			System.out.println("0 - Sair");
			opcao = s.nextInt();
			s.nextLine();

			switch (opcao) {
			
			case 1:
				// CREATE
				System.out.println("Digite o nome do cliente: ");
				nome_cliente = s.nextLine();
				cliente a1 = new cliente(id, nome_cliente);
				autorDAO.save(a1);
				System.out.println("Cadastrado \n");
				break;
				
			case 2:
				// READ
				for (cliente a : autorDAO.getcliente()) {
					System.out.println("Id: " + a.getId() + " Nome: " + a.getNome() + "\n");
				}
				break;
				
			case 3:
				// UPDATE
				System.out.println("Digite o id do cliente: ");
				posicao = s.nextInt();
				s.nextLine();
				System.out.println("Digite o nome do cliente: ");
				nome_cliente = s.nextLine();

				cliente a2 = new cliente(posicao, nome_cliente);
				autorDAO.update(a2);
				System.out.println("Atualizado \n");
				break;
				
			case 4:
				// DELETE
				System.out.println("Digite o id do cliente: ");
				posicao = s.nextInt();
				autorDAO.deleteById(posicao);
				break;
				
			case 5:
				// BUSCA POR ID
				System.out.println("Digite o id do cliente: ");
				posicao = s.nextInt();
				cliente a3 = autorDAO.getclienteById(posicao);
				System.out.println("Id: " + a3.getId() + " Nome: " + a3.getNome());
				break;
				
			default:
				System.out.println(opcao != 0 ? "Opcao invalida, digite novamente." : "");
				break;
			}

		} while (opcao != 0);

		System.out.println("Sistema finalizado");
		s.close();
	}

	private void update(cliente a2) {
		// TODO Auto-generated method stub
		
	}

	private cliente getclienteById(int posicao) {
		// TODO Auto-generated method stub
		return null;
	}

	private void deleteById(int posicao) {
		// TODO Auto-generated method stub
		
	}

	private cliente[] getcliente() {
		// TODO Auto-generated method stub
		return null;
	}

	private void save(cliente a1) {
		// TODO Auto-generated method stub
		
	}

}