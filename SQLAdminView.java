import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
public class SQLAdminView {
	public int getcount() throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/panchayat";
		String uname="root";
		String pass="abhishek";
		String query="Select count(*) from adminview;";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		int y=rs.getInt(1);
		System.out.println(y);
		st.close();
		con.close();
		return y;
	}
	public void show() throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/panchayat";
		String uname="root";
		String pass="abhishek";
		String query="Select * from adminview;";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		TableView<Person> table = new TableView<Person>();
		ObservableList<Person> userpending = FXCollections.observableArrayList();
		while(rs.next()) {
			int x=rs.getInt(1);
			String s=String.valueOf(x);
			int y=rs.getInt(1);
			String s1="";
			if (y==0) {
				s1="Pending";
			}
			userpending.add(new Person(s,rs.getString(2),s1));
		}
	}
	public static class Person {
		 
        private SimpleStringProperty uNameC;
        private SimpleStringProperty CNameC;
        private SimpleStringProperty StatC;
 
        private Person(String unc, String cnc, String stc) {
            this.uNameC = new SimpleStringProperty(unc);
            this.CNameC = new SimpleStringProperty(cnc);
            this.StatC = new SimpleStringProperty(stc);
        }
 
        public String getuser() {
            return uNameC.get();
        }
 
        public void setuser(String user) {
            this.uNameC.set(user);
        }
 
        public String getcat() {
            return CNameC.get();
        }
 
        public void setcat(String cat) {
            this.CNameC.set(cat);
        }
 
        public String getfl() {
            return StatC.get();
        }
 
        public void setfl(String f) {
            this.StatC.set(f);
        }
    }

	
}

