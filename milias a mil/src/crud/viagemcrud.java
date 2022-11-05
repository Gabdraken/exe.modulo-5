package crud;

import java.util.Scanner;
import dao.clienteDao;
import dao.viagem;
import dao.viagensDao;
import modelo.cliente;

public class viagemcrud {

	public static void main(String[] args) {
		viagensDao viagensDao = new viagensDao();
		clienteDao clienteDao = new clienteDao();

		Scanner s = new Scanner(System.in);
		int opcao = 0;
		int posicao = 0;

		int id = 0;
		String nome = "";
		String nome1 = "";
		double preco = 0;
		String publicacao = "";
		int id_autor = 0;
		int id_editora = 0;

		do {
			System.out.println("=== CRUD viagens ===");
			System.out.println("1 - Cadastrar viagens");
			System.out.println("2 - Consultar viagens");
			System.out.println("3 - Atualizar viagens");
			System.out.println("4 - Deletar viagens");
			System.out.println("5 - Buscar por id");
			System.out.println("0 - Sair");
			opcao = s.nextInt();
			s.nextLine();

			switch (opcao) {
			case 1:
				// CREATE
				System.out.println("Digite o nome da viagem: ");
				nome = s.nextLine();
				System.out.println("Digite o preco da viagem: ");
				preco = s.nextDouble();
				s.nextLine();
				System.out.println("Digite o embarque da viagem: ");
				String embarque = s.nextLine();
				s.nextLine();
				System.out.println("Digite o id do clienter: ");
				int id_cliente = s.nextInt();
				s.nextLine();
				
				cliente clienter = clienteDao.getclienteById(id_cliente);
				viagem l1 = new viagem(id, nome, preco, embarque);
				dao.clienteDao viagemDao;
				viagemDao.save(l1);
				System.out.println("Cadastrado \n");
				break;
				
			case 2:
				// READ
				for (viagem l : viagemDao.getviagem()) {
					System.out.println("Id: " + l.getId() + " Nome: " + l.getNome() 
					+ " Autor(a): "+ l.getcliente().getNome() + getNome() + "\n");
				}
				break;
				
			case 3:
				// UPDATE
				System.out.println("Digite o id da viagem: ");
				posicao = s.nextInt();
				s.nextLine();
				System.out.println("Digite o nome da viagem: ");
				nome1 = s.nextLine();
				System.out.println("Digite o preco da viagem: ");
				preco = s.nextDouble();
				s.nextLine();
				System.out.println("Digite o id cliente: ");
				id_cliente = s.nextInt();
				s.nextLine();
				
				cliente cliente1 = clienteDao.getclienteById(id_cliente);
				viagem l2 = new viagem( nome1, preco, cliente1);
				viagemDao.update(l2);
				System.out.println("Atualizado \n");
				break;
				
			case 4:
				// DELETE
				System.out.println("Digite o id da viagem: ");
				posicao = s.nextInt();
				viagemDao.deleteById(posicao);
				System.out.println("viagem excluída \n");
				break;
				
			case 5:
				// BUSCAR POR ID
				System.out.println("Digite o id da viagem: ");
				posicao = s.nextInt();
				viagem l3 = viagemDao.getviagemById(posicao);

				System.out.println("Id: " + l3.getId() + " Nome: " + l3.getNome() 
				+ " Autor(a): "+ l3.getcliente().getNome() + "\n");
				break;
				
			default:
				System.out.println(opcao != 0 ? "Opcao invalida, digite novamente" : "");
				break;
			}

		} while (opcao != 0);

		System.out.println("Sistema finalizado");
		s.close();
	}

	private static String getNome() {
		// TODO Auto-generated method stub
		return null;
	}
}