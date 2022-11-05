package crud;

import java.util.Arrays;

import dao.viagem;
import modelo.cliente;
import modelo.compras;
import modelo.viagens_compra;
import modelo.TabelaDeViagens;
import modelo.permissoes;
import modelo.Usuario;

public class principal {

	public static void main(String[] args) {
		
		Permissoes p1 = new Permissoes(1, "comum");
		Permissoes p2 = new Permissoes(2, "administrador");
		
		Usuario u1 = new Usuario(1, "Breno", "Breno@email", "4002", p2);
		Usuario u2 = new Usuario(2, "Clara", "Clara@email", "8922", p1);
		Usuario u3 = new Usuario(3, "Osvaldo", "Osvaldo@email", "7278", p1);
		
		System.out.println(u1.mostrar());
		System.out.println(u2.mostrar());
		System.out.println(u3.mostrar());
		
		cliente a1 = new cliente(1, "Bernado");
		cliente a2 = new cliente(2, "Mario");
		
		viagem l1 = new viagem(1, "Roraima", "14/06/2022", a2);
		viagem l2 = new viagem(2, "Paraná", "30/03/2022", a1);
		
		compras c1 = new compras(1, "01/08/2022", u3);
		
		viagens_compra i1 = new viagens_compra(1, 3, c1, l1);
		viagens_compra i2 = new viagens_compra(2, 1, c1, l2);
		
		c1.getItens().addAll(Arrays.asList(i1));
		c1.getItens().addAll(Arrays.asList(i2));
		
		
		System.out.println("\n\nUsuario: " + c1.getUsuario().getNome());
		
		for (viagens_compra i : c1.getItens()) {
			System.out.println("Livro: "+ i.getViagem().getNome() 
					+" quantidade: "+ i.getQtd_itens() 
					+" valor: " + i.getValor());
		}
		
		System.out.println(" \nValor compra: " + c1.getValor());
	}

}