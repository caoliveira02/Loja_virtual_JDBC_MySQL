import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection connectionFactory = criaConexao.recuperarConexao();
		
		Statement stm = connectionFactory.createStatement();
		stm.execute("DELETE FROM PRODUTO WHERE ID > 4");
		
		Integer linhasModificadas = stm.getUpdateCount();
		System.out.println("Quantidade de linhas que foram modificadas: " + linhasModificadas);
		
		connectionFactory.close();

	}

}
