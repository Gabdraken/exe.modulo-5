package conexao;

import java.sql.Connection;

import java.sql.DriverManager;

public class conexaoMySQL {
	
	private static String URL = "jdbc:mysql://localhost:3306/miliasamil";
	private static String USUARIO = "root";
	private static String SENHA = "995891246";
 
	public static Connection createConexaoMySQL() throws Exception {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection connection = DriverManager.getConnection (URL, USUARIO, SENHA);
	
	return connection;
	}

	
	public static void main (String[] args) throws Exception {
	
		Connection con = createConexaoMySQL();
		
		if (con != null) {
	System.out.println (con + "\n****Conexão bem sucedida****\n");
			con.close();
	}
}
}