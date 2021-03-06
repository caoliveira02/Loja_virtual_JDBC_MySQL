package br.com.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteInsercaoComParametroDeVariosProdutos {

	public static void main(String[] args) throws SQLException {
			
		ConnectionFactory criaConexao = new ConnectionFactory();
		
		try(Connection connection = criaConexao.recuperarConexao()){
			connection.setAutoCommit(false);
		
			try ( PreparedStatement stm = connection.prepareStatement("INSERT INTO Produto (nome, descricao) VALUES (?, ?)", 
					Statement.RETURN_GENERATED_KEYS))
				{
			
				adcionarVariavel("SmartTV", "45 polegadas", stm );
				adcionarVariavel("Radio", "Radio de bateria", stm );
				
				connection.commit();
			} catch (Exception e) { 
				e.printStackTrace();
				System.out.println("ROOLBACK FOI EXECUTADO");
				connection.rollback();
			}
		
		}
	}

	private static void adcionarVariavel(String nome, String descricao, PreparedStatement stm)
			throws SQLException {
		
		stm.setString(1, nome);
		stm.setString(2, descricao);
		
		/*if (nome.equals("Radio")) {
			throw new RuntimeException("N?o foi possivel adcionar o produto");
		}*/
		
		stm.execute();
					
		try (ResultSet rst = stm.getGeneratedKeys()){
			while(rst.next()) {
				System.out.println("O ID criado ?: " + rst.getInt(1));
			}
		}
	}

}
