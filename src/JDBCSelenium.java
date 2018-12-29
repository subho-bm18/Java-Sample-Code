import java.sql.Connection;  
import java.sql.DriverManager; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class JDBCSelenium {
     public static void selectQuery() throws SQLException, ClassNotFoundException { 
 String dbURL = "jdbc:mysql://localhost:3306/employees";
 String username = "root";
 String password = "qaz1wsx2";
        //Load MySQL JDBC Driver
        Class.forName("com.mysql.jdbc.Driver");
        //Creating connection to the database
        Connection con = DriverManager.getConnection(dbURL,username,password);
        //Creating statement object
     Statement st = con.createStatement();
     String selectquery = "SELECT * FROM employyees.employee WHERE employee_id=5";
        //Executing the SQL Query and store the results in ResultSet
     ResultSet rs = st.executeQuery(selectquery);
     //While loop to iterate through all data and print results
     while (rs.next()) {
     System.out.println(rs.getString("transaction_datetime"));
     }
        //Closing DB Connection
     con.close();
 }
     
  public static void main(String args[])
  {
	  JDBCSelenium j = new JDBCSelenium();
	  try {
		j.selectQuery();
	} catch ( Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
}
