import javafx.application.Application;
import java.sql.*;
import javafx.stage.Stage;
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
import javafx.concurrent.Task;
public class BirthCertificate /*extends Application*/{
	
	public void start(String s1,Stage myStage,int y) throws ClassNotFoundException,SQLException{
		TextField tf,tf1,tf3,tf4,tf5,tf6,tf7;
		Label res=new Label("Enter the values");
		Font f5=new Font("Berlin Sans FB Demi Bold",18.0);
		res.setFont(f5);	
		String uname=s1;
		int x=y;
		ComboBox<String> cbstates,catlist;
		
		Label l1=new Label("First Name : ");
		Label l2=new Label("Last Name: ");
		Label l3=new Label("Date Of Birth : ");
		Label l4=new Label("Sex : ");
		Label l5=new Label("Father Name : ");
		Label l6=new Label("Mother Name : ");
		Label l7=new Label("Place Of Birth : ");
		Label l8=new Label("Address : ");
		Label l9=new Label("State");
		Label l10= new Label("District");
		Label l11=new Label("Taluk");
		Label l12=new Label("Category");
		
		Stage primaryStage=new Stage();
		myStage.setTitle("BIRTH CERIFICATE");
		
		GridPane root=new GridPane();
		root.setAlignment(Pos.CENTER);
		root.setHgap(10);
		root.setVgap(15);
		root.setPadding(new Insets(25,25,25,25));
		
		Scene myScene=new Scene(root,600,600);
		myStage.setScene(myScene);
		
		Text title =new Text("Birth Certificate ");
		title.setFont(Font.font("Times New Roman",FontWeight.NORMAL, 20));
		root.add(title, 0, 0, 2, 1);
		
		Button btngt=new Button("Submit");
		Button btnback=new Button("Back");
		
		//First Name
		tf=new TextField();
		tf.setPromptText("Enter first name");
		tf.setPrefColumnCount(15);
	
		//Last Name
		tf1=new TextField();
		tf1.setPromptText("Enter last name");
		tf1.setPrefColumnCount(15);
		
		//Date of birth
		TextField tf2=new TextField();
		tf2.setPromptText("Date of birth");
		tf2.setPrefColumnCount(15);
		
		//Gender
		RadioButton m=new RadioButton("Male");
		RadioButton f=new RadioButton("Female");
		RadioButton o=new RadioButton("Others");
		ToggleGroup tg=new ToggleGroup();
		
		m.setToggleGroup(tg);
		f.setToggleGroup(tg);
		o.setToggleGroup(tg);
		m.setSelected(true);
		
		HBox hBtn = new HBox(10);
		hBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hBtn.getChildren().addAll(btnback,btngt);

		HBox vBtn = new HBox(10);
		vBtn.setAlignment(Pos.BASELINE_LEFT);
		vBtn.getChildren().addAll(m,f,o);
		
		//Birth Place
		tf3=new TextField();
		tf3.setPromptText("Place of Birth");
		tf3.setPrefColumnCount(15);
		
		//Fathername
		tf4=new TextField();
		tf4.setPromptText("Enter father name");
		tf4.setPrefColumnCount(15);
			
		//mothername
		tf5=new TextField();
		tf5.setPromptText("Eter mother name");
		tf5.setPrefColumnCount(15);
		
		//Address
		TextArea ta=new TextArea();
		ta.setPromptText("Address");
		ta.setPrefColumnCount(15);
		ta.setPrefRowCount(3);
		ta.setMaxSize(600,50);
		
		//State
		ObservableList<String> transportTypes =FXCollections.observableArrayList("Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jammu and Kashmmir","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Manipur","Meghalaya","Mizoram","Nagaland","Odissa","Punjab","Rajastan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal");
		cbstates = new ComboBox<String>(transportTypes);
		//cbstates.setValue("Arunachal Pradesh");
		cbstates.setPrefWidth(200);
		cbstates.setValue("Select State");

		//district
		tf6=new TextField();
		tf6.setPromptText("Enet district");
		tf6.setPrefColumnCount(15);

		
		//taluk
		tf7=new TextField();
		tf7.setPromptText("Enter taluk");
		tf7.setPrefColumnCount(15);
		
		//category
		ObservableList<String> category =FXCollections.observableArrayList("1","2A","2B","3A","3B","GM","SC","ST");
		catlist = new ComboBox<String>(category);
		catlist.setPrefWidth(200);
		catlist.setValue("Select category");
		
		
		//button submit
		btngt.setOnAction(e->{
			try {	
				RadioButton rb=(RadioButton)tg.getSelectedToggle();
				//x=1;                            for testing we take uid as 1
				SQLBirthCerificate sqd=new SQLBirthCerificate(x,uname,tf.getText(),tf1.getText(),tf2.getText(),rb.getText(),tf3.getText(),tf4.getText(),tf5.getText(),ta.getText(),cbstates.getValue(),tf6.getText(),tf7.getText(),catlist.getValue());
				CategoryAdmin sqd1=new CategoryAdmin(x,"Birth Certificate",0);
			}catch(ClassNotFoundException|SQLException e1) {
					e1.printStackTrace();
			}		
			res.setText("Application Submitted Successfully!");
			delay(2000,()->myStage.close());
		});
		//buttonback
		btnback.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
					myStage.close();
				//}catch(ClassNotFoundException|SQLException e1) {
				//	e1.printStackTrace();
				//}
			}
		});
		
		//adding nodes
		root.add(l1, 0, 1);
		root.add(l2, 0, 2);
		root.add(l3, 0, 3);
		root.add(l4, 0, 4);
		root.add(l5, 0, 5);
		root.add(l6, 0, 6);
		root.add(l7, 0, 7);
		root.add(l8, 0, 8);
		root.add(l9, 0, 9);
		root.add(l10, 0, 10);
		root.add(l11, 0, 11);
		root.add(l12, 0, 12);
		root.add(tf, 1, 1);
		root.add(tf1, 1, 2);
		root.add(tf2, 1, 3);
		root.add(vBtn, 1, 4);
		root.add(tf4, 1, 5);
		root.add(tf5, 1, 6);
		root.add(tf3, 1, 7);
		root.add(ta, 1, 8);
		root.add(cbstates, 1, 9);
		root.add(tf6, 1, 10);
		root.add(tf7, 1, 11);
		root.add(catlist, 1, 12);
		root.add(hBtn, 1, 13);
		root.add(res, 1, 14);
		myStage.show();	
	}
	public static void delay(long millis,Runnable continuation) {
		Task<Void> sl=new Task<Void>() {
			@Override
			protected Void call() throws Exception {
				// TODO Auto-generated method stub
				try { Thread.sleep(millis);}
				catch(InterruptedException e){}
				return null;
			}
		};
		sl.setOnSucceeded(e->continuation.run());
		new Thread(sl).start();
	}
	/*public static void main(String[] args) {
		launch(args);
	}*/
}

