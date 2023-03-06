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

public class MarriageCertificate {

		public void start(String ustname,Stage myStage,int y) throws ClassNotFoundException,SQLException{
			
			TextField t1,t2,t3,t4,t5,t6,t7,t9,t10;
			TextArea t8;
			TextField s1,s2,s3,s4,s5,s6,s7,s9,s10;
			TextArea s8;
			int x=y;
			String unname=ustname;
			ComboBox<String> t11,s11;
			Label res=new Label("Enter the values");
			Font f5=new Font("Berlin Sans FB Demi Bold",18.0);
			res.setFont(f5);
			
			Label h1=new Label("Groom");
			Label h2=new Label("Bride");
			
			Label l1=new Label("Name");
			Label l2=new Label("Father Name");
			Label l3=new Label("Mother Name");
			Label l4=new Label("Age");
			Label l5=new Label("Date of Birth");
			Label l6=new Label("Mobile No");
			Label l7=new Label("Aadhar No");
			Label l8=new Label("Address");
			Label l9= new Label("Taluk");
			Label l10=new Label("District");
			Label l11=new Label("State");
			
			RadioButton m=new RadioButton("Male");
			RadioButton f=new RadioButton("Female");
			RadioButton o=new RadioButton("Others");
			
			ToggleGroup tg=new ToggleGroup();
			m.setToggleGroup(tg);
			f.setToggleGroup(tg);
			o.setToggleGroup(tg);
			m.setSelected(true);
			
			Stage primaryStage=new Stage();
			myStage.setTitle("MARRIAGE CERIFICATE");
			
			GridPane root=new GridPane();
			root.setAlignment(Pos.CENTER);
			root.setHgap(10);
			root.setVgap(10);
			root.setPadding(new Insets(25,25,25,25));
			
			Scene myScene=new Scene(root,600,600);
			myStage.setScene(myScene);
			
			Text title =new Text("Marriage Certificate");
			title.setFont(Font.font("Tahoma",FontWeight.NORMAL, 20));
			root.add(title, 0, 0, 2, 1);
			
			Button btSubmit=new Button("Submit");
			Button btBack=new Button("Back");
			btSubmit.setAlignment(Pos.BASELINE_RIGHT);
			
			
			h1.setAlignment(Pos.CENTER);
			h1.setFont(Font.font("Tahoma",FontWeight.NORMAL, 16));
			
			h2.setAlignment(Pos.CENTER);
			h2.setFont(Font.font("Tahoma",FontWeight.NORMAL, 16));
			
			t1=new TextField();
			t1.setPromptText("Enter name");
			t1.setPrefColumnCount(15);
			
		    t2=new TextField();
			t2.setPromptText("Father name");
			t2.setPrefColumnCount(15);
			
			t3=new TextField();
			t3.setPromptText("Mother name");
			t3.setPrefColumnCount(15);

			t4=new TextField();
			t4.setPromptText("Age");
			t4.setPrefColumnCount(15);
	
			t5=new TextField();
			t5.setPromptText("Date of Birth");
			t5.setPrefColumnCount(15);
			
			t6=new TextField();
			t6.setPromptText("Mobile No");
			t6.setPrefColumnCount(15);
			
			t7=new TextField();
			t7.setPromptText("Aadhar No");
			t7.setPrefColumnCount(15);
			
			t8=new TextArea();
			t8.setPromptText("Enter adress");
			t8.setPrefColumnCount(15);
			
			t9=new TextField();
			t9.setPromptText("Enter taluk");
			t9.setPrefColumnCount(15);
			
			t10=new TextField();
			t10.setPromptText("Enter district");
			t10.setPrefColumnCount(15);
			
			ObservableList<String> states =FXCollections.observableArrayList("Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jammu and Kashmmir","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Manipur","Meghalaya","Mizoram","Nagaland","Odissa","Punjab","Rajastan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal");
			t11 = new ComboBox<String>(states);
			t11.setValue("Select");
			t11.setOnAction(e->{
				t11.setValue(t11.getValue());
			});
			
			
			
//bride
			s1=new TextField();
			s1.setPromptText("Enter name");
			s1.setPrefColumnCount(15);
			
		    s2=new TextField();
			s2.setPromptText("Father name");
			s2.setPrefColumnCount(15);
			
			s3=new TextField();
			s3.setPromptText("Mother name");
			s3.setPrefColumnCount(15);

			s4=new TextField();
			s4.setPromptText("Age");
			s4.setPrefColumnCount(15);
	
			s5=new TextField();
			s5.setPromptText("Date of Birth");
			s5.setPrefColumnCount(15);
	
			s6=new TextField();
			s6.setPromptText("Mobile No");
			s6.setPrefColumnCount(15);
			
			s7=new TextField();
			s7.setPromptText("Aadhar No");
			s7.setPrefColumnCount(15);
			
			s8=new TextArea();
			s8.setPromptText("Enter adress");
			s8.setPrefColumnCount(15);
			
			s9=new TextField();
			s9.setPromptText("Enter taluk");
			s9.setPrefColumnCount(15);
			
			s10=new TextField();
			s10.setPromptText("Enter district");
			s10.setPrefColumnCount(15);
			
			s11 = new ComboBox<String>(states);
			s11.setValue("Select");
			s11.setOnAction(e->{
				s11.setValue(s11.getValue());
			});
			
			btSubmit.setOnAction(e->{
					try {	
						SQLMarriage sq1= new SQLMarriage(x,unname,t1.getText(),t5.getText(),t4.getText(),t2.getText(),t3.getText(),
								t6.getText(),t7.getText(),t8.getText(),t9.getText(),t10.getText(),t11.getValue(),s1.getText(),s5.getText(),s4.getText(),
								s2.getText(),s3.getText(),s6.getText(),s7.getText(),s8.getText(),s9.getText(),s10.getText(),s11.getValue());
						CategoryAdmin sqd1=new CategoryAdmin(x,"Marriage Certificate",0);
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
			root.add(h1, 1, 1);
			root.add(h2, 2, 1);
			
			root.add(l1, 0, 2);
			root.add(l2, 0, 3);
			root.add(l3, 0, 4);
			root.add(l4, 0, 5);
			root.add(l5, 0, 6);
			root.add(l6, 0, 7);
			root.add(l7, 0, 8);
			root.add(l8, 0, 9);
			root.add(l9, 0, 10);
			root.add(l10,0, 11);
			root.add(l11,0, 12);
			
			root.add(t1, 1, 2);
			root.add(t2, 1, 3);
			root.add(t3, 1, 4);
			root.add(t4, 1, 5);
			root.add(t5, 1, 6);
			root.add(t6, 1, 7);
			root.add(t7, 1, 8);
			root.add(t8, 1, 9);
			root.add(t9, 1, 10);
			root.add(t10, 1, 11);
			root.add(t11, 1, 12);
			
			root.add(s1, 2, 2);
			root.add(s2, 2, 3);
			root.add(s3, 2, 4);
			root.add(s4, 2, 5);
			root.add(s5, 2, 6);
			root.add(s6, 2, 7);
			root.add(s7, 2, 8);
			root.add(s8, 2, 9);
			root.add(s9, 2, 10);
			root.add(s10,2, 11);
			root.add(s11,2, 12);

			
			root.add(btSubmit, 2, 13);
			root.add(btBack, 1, 13);
	
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

