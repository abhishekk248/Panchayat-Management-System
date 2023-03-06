import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

public class AdminView /*extends Application*/
{
	String[] userName=new String[10];
	String[] category= new String[10];
	Integer[] userID= new Integer[10];
	int i=0,j=0;
	public void start(Stage myStage,String ss1) throws ClassNotFoundException,SQLException 
	{
		
		String url="jdbc:mysql://localhost:3306/panchayat";
		String uname="root";
		String pass="abhishek";
		String admnname=ss1;
		String query="select username,adminview.userid,category from adminview, useraccount where adminview.userid=useraccount.userid and flag=0;";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) 
		 {
			userName[i]=rs.getString(1);
			category[i]=rs.getString(3);
			userID[i]=rs.getInt(2);
			
			i++;
		}
		
		myStage.setTitle("Admin View");
		
		GridPane root=new GridPane();
		root.setAlignment(Pos.CENTER);
		root.setHgap(15);
		root.setVgap(15);
		root.setPadding(new Insets(25,25,25,25));
		
		Scene myScene=new Scene(root,500,500);
		myStage.setScene(myScene);
		
		Label res=new Label("No Content to show");
		Label[] uName = new Label[10];
		Label[] uID = new Label[10];
		Label[] cat = new Label[10];
		Button[] approve = new Button[10];
		Button[] reject = new Button[10];
		Label[] stat=new Label[10];
		
		Label l1=new Label("User ID");
		Label l2=new Label("User Name");
		Label l3=new Label("Category");
		Label l4=new Label("Status");
				
		int k;
		for(j=0;j<10;j++) {
			approve[j]= new Button("Approve");			
			reject[j] = new Button("Reject");	
		}
		for(j=0;j<i;j++)
		{
			
			uName[j] = new Label(userName[j]);
			
			cat[j]=new Label(category[j]);
			String s=Integer.toString(userID[j]);
			uID[j] = new Label(s);
			stat[j]=new Label("Pending");
			
			approve[j]= new Button("Approve");			
			reject[j] = new Button("Reject");	
		}
		Button closed=new Button("Close");
		closed.setOnAction(e->{
			myStage.close();
		});
		if(i>0) {
		root.add(l1, 0, 1);
		root.add(l2, 1, 1);
		root.add(l3, 2, 1);
		root.add(l4, 3, 1);
		}else {
			root.add(res, 1, 1);
		}
		for(j=0;j<i;j++) 
		{
			approve[j].setOnAction(new EventHandler<ActionEvent>(){
				int k = j;
				public void handle(ActionEvent ae) {
					try {
						change(userID[k],1);
					} catch (ClassNotFoundException | SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					stat[k].setText("Approved");
				}
			});
			reject[j].setOnAction(new EventHandler<ActionEvent>(){
				int k = j;
				public void handle(ActionEvent ae) {
					try {
						change(userID[k],2);
					} catch (ClassNotFoundException | SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					stat[k].setText("Rejected");
				}
			});	
		}
			/*approve[0].setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent ae) {
					stat[0].setText("Approved");
				}
			});
			reject[0].setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent ae) {
					stat[0].setText("Rejected");
				}
			});	
			
			approve[1].setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent ae) {
					stat[1].setText("Approved");
				}
			});
			reject[1].setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent ae) {
					stat[1].setText("Rejected");
				}
			});
			
			approve[2].setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent ae) {
					stat[2].setText("Approved");
				}
			});
			reject[2].setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent ae) {
					stat[2].setText("Rejected");
				}
			});	
			
			approve[3].setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent ae) {
					stat[3].setText("Approved");
				}
			});
			reject[3].setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent ae) {
					stat[3].setText("Rejected");
				}
			});				
			
			approve[4].setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent ae) {
					stat[4].setText("Approved");
				}
			});
			reject[4].setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent ae) {
					stat[4].setText("Rejected");
				}
			});				

			approve[5].setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent ae) {
					stat[5].setText("Approved");
				}
			});
			reject[5].setOnAction(new EventHandler<ActionEvent>(){
				public void handle(ActionEvent ae) {
					stat[5].setText("Rejected");
				}
			});				




		}*/
		
		for(int j=0;j<i;j++)
		{
			root.add(uID[j], 0, j+2);
			root.add(uName[j], 1, j+2);
			root.add(cat[j], 2, j+2);
			root.add(stat[j], 3, j+2);
			root.add(approve[j], 4, j+2);
			root.add(reject[j], 5, j+2);
		}
		root.add(closed, 4, i+2);
		myStage.show(); 
	}
	public static void change(int x,int y) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/panchayat";
		String uname="root";
		String pass="abhishek";
		String query="update adminview set flag="+y+" where userid="+x+";";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		//ResultSet rs=st.executeQuery(query);
		int count=st.executeUpdate(query);
		System.out.println(count);
	}
	/*public static void main(String[] args) {
		launch(args);
}*/
}
