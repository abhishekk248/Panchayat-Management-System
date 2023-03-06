import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class SQLMarriage {
	int uid;
	String usname;
	String gname;
	String gbdate;
	String gage;
	String gfname;
	String gmname;
	String gmobile;
	String gAadhar;
	String gaddress;
	String gstate;
	String gdistrict;
	String gtaluk;
	
	String bname;
	String bbdate;
	String bage;
	String bfname;
	String bmname;
	String bmobile;
	String bAadhar;
	String baddress;
	String bstate;
	String bdistrict;
	String btaluk;
	public SQLMarriage(int uid, String usname, String gname, String gbdate, String gage, String gfname,
			String gmname, String gmobile, String gAadhar, String gaddress, String gstate, String gdistrict,
			String gtaluk, String bname, String bbdate, String bage, String bfname, String bmname, String bmobile,
			String bAadhar, String baddress, String bstate, String bdistrict, String btaluk) throws SQLException, ClassNotFoundException {
		//super();
		this.uid = uid;
		this.usname = usname;
		this.gname = gname;
		this.gbdate = gbdate;
		this.gage = gage;
		this.gfname = gfname;
		this.gmname = gmname;
		this.gmobile = gmobile;
		this.gAadhar = gAadhar;
		this.gaddress = gaddress;
		this.gstate = gstate;
		this.gdistrict = gdistrict;
		this.gtaluk = gtaluk;
		this.bname = bname;
		this.bbdate = bbdate;
		this.bage = bage;
		this.bfname = bfname;
		this.bmname = bmname;
		this.bmobile = bmobile;
		this.bAadhar = bAadhar;
		this.baddress = baddress;
		this.bstate = bstate;
		this.bdistrict = bdistrict;
		this.btaluk = btaluk;
		
		String url="jdbc:mysql://localhost:3306/panchayat";
		String uname="root";
		String pass="abhishek";
		String query="insert into Marriage values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		PreparedStatement st=con.prepareStatement(query);
		st.setInt(1, uid);
		st.setString(2,usname);
		st.setString(3,gname);
		st.setString(4,gbdate);
		st.setString(5,gage);
		st.setString(6,gfname);
		st.setString(7,gmname);
		st.setString(8,gmobile);
		st.setString(9,gAadhar);
		st.setString(10,gaddress);
		st.setString(11,gstate);
		st.setString(12,gdistrict);
		st.setString(13,gtaluk);
		st.setString(14,gname);
		st.setString(15,gbdate);
		st.setString(16,gage);
		st.setString(17,gfname);
		st.setString(18,gmname);
		st.setString(19,gmobile);
		st.setString(20,gAadhar);
		st.setString(21,gaddress);
		st.setString(22,gstate);
		st.setString(23,gdistrict);
		st.setString(24,gtaluk);
		int count=st.executeUpdate();
		System.out.println(count+" row/s affected");
		st.close();
		con.close();
	}
}

