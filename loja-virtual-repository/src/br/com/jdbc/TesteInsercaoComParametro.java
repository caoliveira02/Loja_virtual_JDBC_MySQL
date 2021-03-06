package br.com.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteInsercaoComParametro {

	public static void main(String[] args) throws SQLException {
		
		String nome	= "CELULAR";
		String descricao = "IPHONE 11";
		
		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection connectionFactory = criaConexao.recuperarConexao();
			
		PreparedStatement stm = connectionFactory.prepareStatement("INSERT INTO Produto (nome, descricao) VALUES (?, ?)",
				Statement.RETURN_GENERATED_KEYS);
		stm.setString(1, nome);
		stm.setString(2, descricao);
		stm.execute();
			
		ResultSet rst = stm.getGeneratedKeys();
		while(rst.next()) {
			System.out.println("O ID criado ?: " + rst.getInt(1));
		}
		
		rst.close();
		stm.close();
		connectionFactory.close();
		
	}

}
