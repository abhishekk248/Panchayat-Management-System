import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class SQLShow {
	public int logincheck(String n1,String p1) throws ClassNotFoundException,SQLException{
		String url="jdbc:mysql://localhost:3306/panchayat";
		String uname="root";
		String pass="abhishek";
		String query="Select userid,username,password from useraccount;";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		int x;
		String uD="";
		String uD1="";
		while(rs.next()) {
			x=rs.getInt(1);
			uD=rs.getString(2);
			uD1=rs.getString(3);
			if (uD.equals(n1) && uD1.equals(p1)) {
				return x;
			}
		}
		st.close();
		con.close();
		return 0;
	}
}

