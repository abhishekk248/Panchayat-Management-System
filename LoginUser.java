import java.sql.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.shape.*;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
public class LoginUser extends Application {
	public void start(Stage myStage) throws ClassNotFoundException,SQLException{
		TextField tf,tf1;
		Label l1,l2,res;
		Stage primaryStage=new Stage();
		myStage.setTitle("LOGIN CREDENTIALS");
		
		GridPane root=new GridPane();
		root.setAlignment(Pos.CENTER);
		root.setHgap(10);
		root.setVgap(10);
		root.setPadding(new Insets(25,25,25,25));
		
		Text title =new Text("Login");
		//title.setFont(Font.font("Arial Black",FontWeight.NORMAL, 20));
		title.getStyleClass().add("welcome-text");
		root.add(title, 0, 0, 2, 1);
		Scene myScene=new Scene(root,400,400);
		myStage.setScene(myScene);
		
		l1 = new Label("User Name : ");
		l2 = new Label("Password : ");
		l1.getStyleClass().add("Label");
		l2.getStyleClass().add("Label");
		
		Button btngt=new Button("Login");
		Button btnback=new Button("Back");
		btngt.getStyleClass().add("Button");
		btnback.getStyleClass().addAll("Button");
		
		myScene.getStylesheets().add(getClass().getResource("CSS1.css").toExternalForm());
		root.getStyleClass().add("root_1");
		
		HBox hBtn = new HBox(10);
		hBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hBtn.getChildren().addAll(btnback,btngt);
		
		title.getStyleClass().add("welcome-text");
		l1.getStyleClass().add("label");
		l2.getStyleClass().add("label");
		
		tf=new TextField();
		tf.setPromptText("Enter username");
		tf.setPrefColumnCount(15);
		tf.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
			}
		});
		
		PasswordField pf=new PasswordField();
		pf.setPromptText("Enter password");
		pf.setPrefColumnCount(15);
		pf.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {		
			}
		});
		
		res = new Label();
		res.getStyleClass().add("actiontarget");
		btngt.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				try{
					SQLShow s=new SQLShow();
					int x=s.logincheck(tf.getText(),pf.getText());
					String name=tf.getText();
					if (x>0) {
						res.setText("Logged In");
						NewMain nm=new NewMain();
						nm.start(x,primaryStage,name);
						myStage.close();
					}else {
						res.setText("Incorrect Username/Password");
					}
				}catch(ClassNotFoundException|SQLException e1) {
					e1.printStackTrace();
				}
				
				
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
		root.add(tf, 1, 2);
		root.add(pf, 1, 3);
		root.add(hBtn, 1, 4);
		root.add(res, 1, 6);

		myStage.show();	
	}
	public static void main(String[] args) {
		launch(args);
	}
}