import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBTest {

	public static void main(String[] args) {
		try {
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:localhost:1521:xe", "scott", "tiger");
			PreparedStatement ps=con.prepareStatement("select * from emp");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+
			rs.getInt(4)+" "+rs.getDate(5)+" "+rs.getInt(6)+" "+rs.getInt(7)+" "+rs.getInt(8));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
