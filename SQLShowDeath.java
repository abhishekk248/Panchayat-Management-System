import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.stage.Stage;
public class SQLShowDeath {
	public void show(int x) throws ClassNotFoundException,SQLException{
		String url="jdbc:mysql://localhost:3306/panchayat";
		String uname="root";
		String pass="abhishek";
		String query="Select * from Death where userid="+x+";";
		String query1="select curdate();";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Stage myStage=new Stage();
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs1=st.executeQuery(query1);
		rs1.next();
		String sdate=rs1.getString(1);
		ResultSet rs=st.executeQuery(query);
		rs.next();
		DisDeath db1=new DisDeath();
		db1.start(myStage,x,rs.getString(2),rs.getString(3),rs.getString(4),
				rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),
				rs.getString(11),rs.getString(12),sdate);
		st.close();
		con.close();

	}
}