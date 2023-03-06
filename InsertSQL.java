import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class InsertSQL {
	int x;
	String name;
	String paswd;
	String email;
	String phoneno;
	public InsertSQL(int x1,String name1,String passwd,String email1,String phno) throws ClassNotFoundException,SQLException{
		x=x1;
		name=name1;
		paswd=passwd;
		email=email1;
		phoneno=phno;
		String url="jdbc:mysql://localhost:3306/panchayat";
		String uname="root";
		String pass="abhishek";
		String query="insert into useraccount values(?,?,?,?,?);";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		PreparedStatement st=con.prepareStatement(query);
		st.setInt(1,x);
		st.setString(2, name);
		st.setString(3,paswd);
		st.setString(4,email);
		st.setString(5,phoneno);
		int count=st.executeUpdate();
		System.out.println(count+" row/s affected");
		st.close();
		con.close();
	}
}