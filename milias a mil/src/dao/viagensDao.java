package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionMySQL;
import modelo.cliente;
import modelo.TabelaDeViagens;

public class viagensDao {
	Connection conn = null;
	PreparedStatement pstm = null;

	// METODO SAVE
	public void save(viagem viagem) {
		String sql = "INSERT INTO viagem " + "(nome_viagem, preco_viagem, id_viagem, id_cliente) "
				+ "values(?, ?, ?, ?, ?);";

		try {
			// CRIANDO A CONEXAO COM O BD
			conn = ConnectionMySQL.createConnectionMySQL();

			// CRIANDO O PreparedStatement, CLASSE USADA PARA EXECUTAR a query
			pstm = conn.prepareStatement(sql);

			// ADICIONANDO OS PARAMETROS
			pstm.setString(1, viagem.getNome());
			pstm.setDouble(2, viagem.getPreco());

			SimpleDateFormat formatter = new SimpleDateFormat("DD/MM/YYYY");

			pstm.setDate(3, new Date(formatter.parse(viagem.getembarque()).getTime()));
			pstm.setInt(5, viagem.getcliente().getId());

			// EXECUTANDO PARA INSERÇÃO DE DADOS
			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// METODO READ
	public List<viagem> getviagens() {
		String sql =  "SELECT *\n"
				+ "FROM viagem AS l\n"
				+ "JOIN clientes AS a ON l.id_cliente = a.id_cliente";
		
		List<viagem> livros = new ArrayList<viagem>();

		// CLASSE QUE VAI RECUPERAR O BD
		ResultSet rset = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();

			while (rset.next()) {
				viagem livro = new viagem();
				cliente autor = new cliente();

				livro.setId(rset.getInt("id_viagem"));
				livro.setNome(rset.getString("nome_viagem"));
				livro.setPreco(rset.getDouble("preco_viagem"));

				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				livro.setembarque(dateFormat.format(rset.getDate("embarque_viagem")));

				autor.setId(rset.getInt("id_cliente"));
				autor.setNome(rset.getString("nome_cliente"));
				Object cliente = null;
				livro.setcliente(cliente);
				viagem viagem = null;
				livros.add(viagem);
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		List<viagem> viagem = null;
		return viagem;
	}
	
	// METODO UPDATE
	public void update(viagem viagem1) {
		String sql = "UPDATE viagem SET nome_viagem = ?, preco_viagem = ?, id_viagem = ?, WHERE id_viagem = ?;";

		try {
			conn = ConnectionMySQL.createConnectionMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, viagem1.getNome());
			pstm.setDouble(2, viagem1.getPreco());

			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

			pstm.setDate(3, new Date(formatter.parse(viagem1.getPublicacao()).getTime()));
			pstm.setInt(4, viagem1.getcliente().getId());
			pstm.setInt(5, viagem1.getId());
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// METODO DELETE
	public void deleteById(int id) {
		String sql = "DELETE FROM viagem WHERE id_viagem = ?";

		try {
			conn = ConnectionMySQL.createConnectionMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public viagem getLivroById(int id) {
		String sql = "SELECT *\n"
				+ "FROM viagem AS l\n"
				+ "JOIN cliente AS a ON l.id_cliente = a.id_cliente \n"
				+ "WHERE id_viagem = ?;";

		viagem viagem = new viagem();
		cliente cliente = new cliente();

		ResultSet rset = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			rset = pstm.executeQuery();
			rset.next();

			viagem.setId(rset.getInt("id_viagem"));
			viagem.setNome(rset.getString("nome_viagem"));
			viagem.setPreco(rset.getDouble("preco_viagem"));

			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			viagem.setembarque(dateFormat.format(rset.getDate("embarque_viagem")));
			cliente.setId(rset.getInt("id_cliente"));
			cliente.setNome(rset.getString("nome_cliente"));
			viagem.setcliente(cliente);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return viagem;
	}
}