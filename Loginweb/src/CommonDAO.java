import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class CommonDAO {

          private CommonDAO(){
			
		 }
		public static CommonDAO commonDAO;
	    public static CommonDAO getobject(){
			if(commonDAO == null){
				commonDAO = new CommonDAO();
				return commonDAO; 
			}
			return commonDAO;
			}
		
		public static Connection getconnection() throws ClassNotFoundException, SQLException{
			ResourceBundle rb = ResourceBundle.getBundle("db");
			Class.forName(rb.getString("drivername"));
			Connection con= DriverManager.
					getConnection(rb.getString("dburl")
							,rb.getString("userid")
							,rb.getString("password"));
			if(con == null){
				System.out.println("no connection");
			}
			return con;
}
}
