import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class AdminLoginCheck {
	public int check(String n1,String p1) throws ClassNotFoundException,SQLException{
		String url="jdbc:mysql://localhost:3306/panchayat";
		String uname="root";
		String pass="abhishek";
		String query="Select username,password from admins where username='"+n1+"' and password='"+p1+"';";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		int x=0;
		while(rs.next()) {
			x++;
		}
		System.out.println(x);
		if (x==1) {
			return 1;
		}
		st.close();
		con.close();
		return 0;
	}
}
