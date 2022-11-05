package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import modelo.cliente;

public class clienteDao {

	Connection conn = null;
	PreparedStatement pstm = null;

	public void save(cliente cliente) {
		String sql = "INSERT INTO client (nome_cliente) values(?);";

		try {
			
			conn = ConnectionMySQL.createConnectionMySQL();
			
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, cliente.getNome());

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

	
	public List<cliente> getAutores() {
		String sql = "select * from autores;";

		List<cliente> cliente = new ArrayList<cliente>();

		ResultSet rset = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			while (rset.next()) {
				cliente cliente = new cliente();

				cliente.setId(rset.getInt("id_cliente"));

				cliente.setNome(rset.getString("nome_cliente"));

				cliente.add(cliente);

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

		List<cliente> cliente1 = null;
		return cliente1;
	}
	

	public void update(viagem l2) {
		String sql = "UPDATE cliente set nome_cliente = ? where id_cliente = ?;";

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, l2.getNome());

			pstm.setInt(2, l2.getId());

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

	public void deleteById(int id) {
		String sql = "DELETE FROM cliente WHERE id_cliente = ?";

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

	public cliente getAutorById(int id) {
		String sql = "SELECT * FROM clientes WHERE id_cliente = ?;";

		cliente cliente = new cliente();

		ResultSet rset = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			rset = pstm.executeQuery();

			rset.next();

			cliente.setId(rset.getInt("id_cliente"));

			cliente.setNome(rset.getString("nome_cliente"));

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

		return cliente;
	}

	public cliente getclienteById1(int id_cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	public viagem getviagemById(int posicao) {
		// TODO Auto-generated method stub
		return null;
	}

	public cliente getclienteById(int id_cliente) {
		// TODO Auto-generated method stub
		return null;
	}

}
