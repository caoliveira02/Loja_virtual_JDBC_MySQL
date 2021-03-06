package br.com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory criaConexao = new ConnectionFactory();
		try(Connection connectionFactory = criaConexao.recuperarConexao()){
		
			PreparedStatement stm = connectionFactory.prepareStatement("SELECT id, nome, descricao FROM Produto");
			stm.execute();
			
			try(ResultSet rst = stm.getResultSet()){
			
				while(rst.next()) {
					System.out.print(rst.getInt("ID"));
					System.out.print(" | ");
					System.out.print(rst.getString("nome"));
					System.out.print(" | ");
					System.out.print(rst.getString("descricao"));
					System.out.println("");
				}
			
			}
		}

	}

}
