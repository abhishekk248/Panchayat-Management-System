import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class SQLCaste {
	int uid;
	String usname;
	String name;
	String bdate;
    String age;
	String hfname;
	String caste;
	String address;
	String state;
	String district;
	String taluk;
	String income;
	public SQLCaste(int uid1,String uname1,String name1,String bdate1,String a,String hufname,String caste1,String addr,
			String state1,String dis,String tal,String uincome) throws ClassNotFoundException,SQLException{
		uid=uid1;
		usname=uname1;
		name=name1;
		bdate=bdate1;
		age=a;
		hfname=hufname;
		caste = caste1;
		address=addr;
		state=state1;
		district=dis;
		taluk=tal;
		income=uincome;
		String url="jdbc:mysql://localhost:3306/panchayat";
		String uname="root";
		String pass="abhishek";
		String query="insert into Caste values(?,?,?,?,?,?,?,?,?,?,?,?);";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		PreparedStatement st=con.prepareStatement(query);
		st.setInt(1, uid);
		st.setString(2,usname);
		st.setString(3,name);
		st.setString(4,bdate);
		st.setString(5,age);
		st.setString(6,hfname);
		st.setString(7,caste);
		st.setString(8,address);
		st.setString(9,state);
		st.setString(10,district);
		st.setString(11,taluk);
		st.setString(12,income);
		int count=st.executeUpdate();
		System.out.println(count+" row/s affected");
		st.close();
		con.close();
	}
}