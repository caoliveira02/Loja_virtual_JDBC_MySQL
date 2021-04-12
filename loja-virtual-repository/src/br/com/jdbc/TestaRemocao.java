package br.com.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection connectionFactory = criaConexao.recuperarConexao();
		
		PreparedStatement stm = connectionFactory.prepareStatement("DELETE FROM PRODUTO WHERE ID > ?");
		stm.setInt(1, 4);
		stm.execute();
		
		Integer linhasModificadas = stm.getUpdateCount();
		System.out.println("Quantidade de linhas que foram modificadas: " + linhasModificadas);
		
		stm.close();
		connectionFactory.close();

	}

}
