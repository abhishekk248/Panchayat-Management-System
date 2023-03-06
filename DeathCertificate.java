import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;

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

public class DeathCertificate {

		public void start(String s1,Stage myStage,int y) throws ClassNotFoundException,SQLException{
			
			TextField t1,t2,t3,t4,t5,t7,t8,t10;
			TextArea t9;
			String uname=s1;
			int x=y;
			ComboBox<String> t6;
			Label res=new Label("Enter the values");
			Font f5=new Font("Berlin Sans FB Demi Bold",18.0);
			res.setFont(f5);
			
			Label l1=new Label("Name");
			Label l2=new Label("Date Of Death");
			Label l3=new Label("Age");
			Label l4=new Label("Husband / Father Name");
			Label l5=new Label("Place Of Death");
			Label l6=new Label("Address");
			Label l7=new Label("State");
			Label l8= new Label("District");
			Label l9=new Label("Taluk");
			Label l10=new Label("Cause Of Death");
			
			RadioButton m=new RadioButton("Male");
			RadioButton f=new RadioButton("Female");
			RadioButton o=new RadioButton("Others");
			
			ToggleGroup tg=new ToggleGroup();
			m.setToggleGroup(tg);
			f.setToggleGroup(tg);
			o.setToggleGroup(tg);
			m.setSelected(true);
			
			Stage primaryStage=new Stage();
			myStage.setTitle("DEATH CERIFICATE");
			
			GridPane root=new GridPane();
			root.setAlignment(Pos.CENTER);
			root.setHgap(10);
			root.setVgap(10);
			root.setPadding(new Insets(25,25,25,25));
			
			Scene myScene=new Scene(root,600,600);
			myStage.setScene(myScene);
			
			Text title =new Text("Death Certificate");
			title.setFont(Font.font("Tahoma",FontWeight.NORMAL, 20));
			root.add(title, 0, 0, 2, 1);
			
			Button btSubmit=new Button("Submit");
			Button btBack=new Button("Back");
			btSubmit.setAlignment(Pos.BASELINE_RIGHT);
			t1=new TextField();
			t1.setPromptText("Enter name");
			t1.setPrefColumnCount(15);
			
		    t2=new TextField();
			t2.setPromptText("Enter Date of death");
			t2.setPrefColumnCount(15);
			
			t3=new TextField();
			t3.setPromptText("Enter age");
			t3.setPrefColumnCount(15);

			t4=new TextField();
			t4.setPromptText("Enter husband/ father name");
			t4.setPrefColumnCount(15);
	
			t5=new TextField();
			t5.setPromptText("Enter place of death");
			t5.setPrefColumnCount(15);
			
			t9=new TextArea();
			t9.setPromptText("Enter address");
			t9.setPrefColumnCount(15);
			
			ObservableList<String> states =FXCollections.observableArrayList("Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jammu and Kashmmir","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Manipur","Meghalaya","Mizoram","Nagaland","Odissa","Punjab","Rajastan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal");
			t6 = new ComboBox<String>(states);
			t6.setValue("Select");
			t6.setOnAction(e->{
				t6.setValue(t6.getValue());
			});
			/*t6=new TextField();
			t6.setPromptText("Enter State");
			t6.setPrefColumnCount(15);*/
			
			t7=new TextField();
			t7.setPromptText("Enter district");
			t7.setPrefColumnCount(15);
			
			t8=new TextField();
			t8.setPromptText("Enter taluk");
			t8.setPrefColumnCount(15);
			
			t10=new TextField();
			t10.setPromptText("Enter cause of death");
			t10.setPrefColumnCount(15);
			
			
			btSubmit.setOnAction(e->{
					try {	
						String s=t3.getText();
						int i=Integer.parseInt(s);
						SQLDeathCertificate h1= new SQLDeathCertificate(x,uname,t1.getText(),t2.getText(),i,t4.getText(),t5.getText(),t9.getText(),t6.getValue(),t7.getText(),t8.getText(),t10.getText());
						CategoryAdmin sqd1=new CategoryAdmin(x,"Death Certificate",0);
					}catch(ClassNotFoundException|SQLException e1) {
						e1.printStackTrace();
					}
					res.setText("Application Submitted Successfully!");
					delay(2000,()->myStage.close());
			});
			
			btBack.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent ae) {
						myStage.close();
				}
			});
			
			//Separator separator=new Separator();
			//separator.setPrefWidth(680);
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
			root.add(t1, 1, 1);
			root.add(t2, 1, 2);
			root.add(t3, 1, 3);
			root.add(t4, 1, 4);
			root.add(t5, 1, 5);
			root.add(t9, 1, 6);
			root.add(t6, 1, 7);
			root.add(t7, 1, 8);
			root.add(t8, 1, 9);
			root.add(t10, 1, 10);
			root.add(btSubmit, 1, 12);
			root.add(btBack, 0, 12);
			root.add(res, 0, 13);
	
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
	}
