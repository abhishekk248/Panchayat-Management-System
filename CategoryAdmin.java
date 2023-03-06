import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class CategoryAdmin {
	int uid;
	String category;
	int flag;
	public CategoryAdmin(int uid1,String cat,int f) throws ClassNotFoundException,SQLException{
		uid=uid1;
		category=cat;
		flag=f;
		String url="jdbc:mysql://localhost:3306/panchayat";
		String uname="root";
		String pass="abhishek";
		String query="insert into adminview values(?,?,?);";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		PreparedStatement st=con.prepareStatement(query);
		st.setInt(1,uid);
		st.setString(2,category);
		st.setInt(3,flag);
		int count=st.executeUpdate();
		System.out.println(count+" row/s affected");
		st.close();
		con.close();
	}
}