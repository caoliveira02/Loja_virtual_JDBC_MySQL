import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory criaConexao = new ConnectionFactory();
		try(Connection connectionFactory = criaConexao.recuperarConexao()){
		
			//String nome = "TV SMART";
			//String descricao = "TV SMART TOSHIBA";
			//PreparedStatement stm = connectionFactory.prepareStatement("INSERT INTO Produto (nome, descricao) VALUES ('" + nome + "','" + descricao + "')",
			//		Statement.RETURN_GENERATED_KEYS);
			
			PreparedStatement stm = connectionFactory.prepareStatement("INSERT INTO Produto (nome, descricao) VALUES ('TV SMART','TV SMART TOSHIBA')",
					Statement.RETURN_GENERATED_KEYS);
			stm.execute();
			
			try(ResultSet rst = stm.getGeneratedKeys()){
				
				while(rst.next()) {
					System.out.println("O ID criado é: " + rst.getInt(1));
				}
				
			}
		}
	}

}
