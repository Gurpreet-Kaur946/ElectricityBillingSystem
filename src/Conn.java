import java.sql.*;
import javax.swing.JOptionPane;
public class Conn{
	
	public Statement stmt = null;
	
	public Conn(){
		
		try {
			Connection con = null;
			String url = "jdbc:sqlserver://LAPTOP-ICCNP7F2\\SQLEXPRESS_GUR;databaseName=ElectricityBillingSystem";
			String user = "sa";
			String pass = "gurpreet@123";
			String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
			Class.forName(driver);
			con = DriverManager.getConnection(url,user,pass);
			stmt = con.createStatement();
			System.out.println("Connection Successful!");
			
		}
					catch(Exception e) {
						System.out.println("Not Connected!"+e);}
		
	}
	public static void main(String[] args) {
		Conn c = new Conn();
	}
	
}