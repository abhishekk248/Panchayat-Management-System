
import javafx.application.Application;
import java.sql.*;
import java.util.Random;
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
public class SignUp extends Application{
	public void start(Stage myStage) throws ClassNotFoundException,SQLException{
		TextField tf,tf1,tf2;
		Label res=new Label();
		
		Stage primaryStage=new Stage();
		myStage.setTitle("SIGNUP CREDENTIALS");
		
		GridPane root=new GridPane();
		root.setAlignment(Pos.CENTER);
		root.setHgap(10);
		root.setVgap(10);
		root.setPadding(new Insets(25,25,25,25));
		
		Scene myScene=new Scene(root,400,400);
		myStage.setScene(myScene);
		
		myScene.getStylesheets().add(getClass().getResource("CSS1.css").toExternalForm());
		root.getStyleClass().add("root");

		Text title =new Text("SIGN UP");
		//title.setFont(Font.font("Times New Roman",FontWeight.NORMAL, 20));
		title.getStyleClass().add("welcome-text");
		root.add(title, 0, 0, 2, 1);
		
		Label l1 = new Label("User Name : ");
		l1.getStyleClass().add("actiontarget");
		Label l2 = new Label("Create Password : ");
		l2.getStyleClass().add("actiontarget");
		Label l3 = new Label("Phone Number : ");
		l3.getStyleClass().add("actiontarget");
		Label l4 = new Label("Email Id : ");
		l4.getStyleClass().add("actiontarget");
		res.getStyleClass().add("actiontarget");
		
		Button btngt=new Button("Sign Up");
		Button btnback=new Button("Back");
		btngt.getStyleClass().add("Button");
		btnback.getStyleClass().addAll("Button");
		
		HBox hBtn = new HBox(10);
		hBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hBtn.getChildren().addAll(btnback,btngt);
		
		tf=new TextField();
		tf.setPromptText("Type Username");
		tf.setPrefColumnCount(15);
		tf.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				res.setText(tf.getText());
			}
		});
		
		PasswordField pf=new PasswordField();
		pf.setPromptText("Create password");
		pf.setPrefColumnCount(15);
		pf.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
			}
		});
		
		tf1=new TextField();
		tf1.setPromptText("Enter email address");
		tf1.setPrefColumnCount(15);
		tf1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
			}
		});
		
		tf2=new TextField();
		tf2.setPromptText("Phone No");
		tf2.setPrefColumnCount(15);
		tf2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
			}
		});
		
		btngt.setOnAction(e->{
				try {	
					Random rand=new Random();
					int x=rand.nextInt(100);
					InsertSQL h1=new InsertSQL(x,tf.getText(),pf.getText(),tf1.getText(),tf2.getText());
					res.setText("Account created");
				}catch(ClassNotFoundException|SQLException e1) {
					res.setText("Could Not create");
					e1.printStackTrace();
				}
		});
		
		btnback.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				try{
					MainMenu m=new MainMenu();
					m.start(primaryStage);
					myStage.close();
				}catch(ClassNotFoundException|SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		Separator separator=new Separator();
		separator.setPrefWidth(680);
		
		root.add(l1, 0, 2);
		root.add(l2, 0, 3);
		root.add(l3, 0, 4);
		root.add(l4, 0, 5);
		root.add(tf, 1, 2);
		root.add(pf, 1, 3);
		root.add(tf2, 1, 4);
		root.add(tf1, 1, 5);
		root.add(hBtn, 1, 7);
		root.add(res, 1, 8);
		
		myStage.show();	
	}
	public static void main(String[] args) {
		launch(args);
	}
}
