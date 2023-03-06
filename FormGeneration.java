import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class FormGeneration{
	public int pendingcheck(int x,String s) throws ClassNotFoundException,SQLException{
		String url="jdbc:mysql://localhost:3306/panchayat";
		String uname="root";
		String pass="abhishek";
		String query="Select flag from adminview where userid="+x+" and category='"+s+"';";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		try {
			if (rs.getInt(1)==0) {
				st.close();
				con.close();
				return -1;
			} else if(rs.getInt(1)==1){
				st.close();
				con.close();
				return 0;
			}
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		return 1;
	}
}
