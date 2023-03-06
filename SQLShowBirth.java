import java.sql.Connection;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.collections.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class SQLShowBirth {
	public void show(int x) throws ClassNotFoundException,SQLException{
		String url="jdbc:mysql://localhost:3306/panchayat";
		String uname="root";
		String pass="abhishek";
		String query="Select * from Birth where userid="+x+";";
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
		DisBirth db=new DisBirth();
		db.start(myStage,x,rs.getString(2),rs.getString(3),rs.getString(4),
				rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),
				rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),sdate);
		st.close();
		con.close();
	}
}
