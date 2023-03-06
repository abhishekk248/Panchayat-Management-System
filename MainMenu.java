import javafx.application.Application;
import java.sql.*;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
public class MainMenu extends Application {
	Label res = new Label();
	Label ri=new Label();
	Stage myStage=new Stage();
	
	public void start(Stage primaryStage) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		
		primaryStage.setTitle("PANCHAYAT");
		
		GridPane root=new GridPane();
		root.setAlignment(Pos.CENTER);
		root.setHgap(60);
		root.setVgap(15);
		root.setPadding(new Insets(25,25,25,25));
		
		Scene myScene=new Scene(root,400,400);
		primaryStage.setScene(myScene);
		
		myScene.getStylesheets().add(getClass().getResource("CSS1.css").toExternalForm());
		root.getStyleClass().add("root_3");
		
		Text title_1 =new Text("Welcome to");
		title_1.getStyleClass().add("welcome-text");
		root.add(title_1, 0, 0, 2, 1);
		Text title =new Text("Panchayat");
		//title.setFont(Font.font("Times New Roman",FontWeight.NORMAL, 20));
		title.getStyleClass().add("welcome-text");
		root.add(title, 0, 1, 2, 1);
		
		Line line=new Line();
		line.setStartX(0);
		line.setStartY(10);
		line.setEndX(600);
		line.setEndY(10);
		
		Label l1=new Label("Login : ");
		Label l2=new Label("Sign UP : ");
		Label l3=new Label("Exit : ");
		
		Button ba=new Button("Login");
		ba.setPrefWidth(70);
		ba.getStyleClass().add("Button");
		Button bc=new Button("SignUp");
		bc.setPrefWidth(70);
		bc.getStyleClass().add("Button");
		Button bb=new Button("Exit");
		bb.setPrefWidth(70);
		bb.getStyleClass().add("Button");
		
		ba.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				LoginUser a1=new LoginUser();
				try {
					a1.start(myStage);
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				primaryStage.close();
			}	
		});
		
		bc.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae) {
				try{
					SignUp a2=new SignUp();
					a2.start(myStage);
					primaryStage.close();
				}catch(ClassNotFoundException|SQLException e1) {
					e1.printStackTrace();
				}
				
			}	
		});
		
		bb.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				ri.setText("THANK YOU");
				System.exit(0);
			}
		});
		root.add(l1, 0, 4);
		root.add(l2, 0, 5);
		root.add(l3, 0, 6);
		root.add(ba, 1, 4);
		root.add(bc, 1, 5);
		root.add(bb, 1, 6);
		
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
