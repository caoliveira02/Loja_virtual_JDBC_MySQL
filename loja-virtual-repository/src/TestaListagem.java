import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC","root", "123456");
		
		Statement stm = connection.createStatement();
		stm.execute("SELECT id, nome, descricao FROM Produto");
		ResultSet rst = stm.getResultSet();
		
		while(rst.next()) {
			System.out.print(rst.getInt("ID"));
			System.out.print(" | ");
			System.out.print(rst.getString("nome"));
			System.out.print(" | ");
			System.out.print(rst.getString("descricao"));
			System.out.println("");
		}
		
		connection.close();

	}

}
