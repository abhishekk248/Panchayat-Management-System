import javafx.application.Application;
import java.sql.*;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.collections.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
public class AdminLogin extends Application{
	public void start(Stage myStage) {
		Label res=new Label("Enter details");
		res.setLayoutX(293.0);
		res.setLayoutY(350.0);
		Stage primaryStage=new Stage();
		BorderPane bp=new BorderPane();
		bp.setMaxHeight(-100000);
		bp.setMaxWidth(-100000);
		bp.setMinHeight(-100000);
		bp.setMinWidth(-100000);
		bp.setPrefHeight(400.0);
		bp.setPrefWidth(520.0);

		AnchorPane ap=new AnchorPane();
		ap.setPrefHeight(407.0);
		ap.setPrefWidth(200.0);
		ap.setStyle("-fx-background-color: skyBlue;");
		BorderPane.setAlignment(ap,Pos.CENTER);
		
		Ellipse ep=new Ellipse();
		ep.setFill(Paint.valueOf("DODGERBLUE"));
		ep.setLayoutX(100.0);
		ep.setLayoutY(173.0);
		ep.setRadiusX(95.0);
		ep.setRadiusY(39.0);
		ep.setStroke(Paint.valueOf("BLACK"));
		ep.setStrokeType(StrokeType.INSIDE);
		
		Font f=new Font("Rockwell",24.0);
		Label l1=new Label("Panchayat");
		l1.setLayoutX(44.0);
		l1.setLayoutY(144.0);
		l1.setTextAlignment(TextAlignment.JUSTIFY);
		l1.setTextFill(Paint.valueOf("#253906"));
		l1.setTextOverrun(OverrunStyle.CLIP);
		l1.setFont(f);
		
		Image img=new Image("gram.jpg");
		ImageView image=new ImageView(img);
		image.setFitHeight(147.0);
		image.setFitWidth(165.0);
		image.setLayoutX(24.0);
		image.setScaleX(1);
		image.setScaleY(1);
		image.setScaleZ(1);
		image.setLayoutY(229.0);
		image.setPickOnBounds(true);
		image.setPreserveRatio(true);
		
		Image img1=new Image("nitte.jpg");
		ImageView image1=new ImageView(img1);
		image1.setFitHeight(66.0);
		image1.setFitWidth(77.0);
		image1.setLayoutX(74.0);
		image1.setScaleX(1);
		image1.setScaleY(1);
		image1.setScaleZ(1);
		image1.setLayoutY(57.0);
		image1.setPickOnBounds(true);
		image1.setPreserveRatio(true);
		
		Font f1=new Font("Candara",24.0);
		Label l2=new Label("Login");
		l2.setLayoutX(64.0);
		l2.setLayoutY(180.0);
		l2.setTextAlignment(TextAlignment.JUSTIFY);
		l2.setTextFill(Paint.valueOf("#d0532c"));
		l2.setTextOverrun(OverrunStyle.CLIP);
		l2.setFont(f);
		
		Line li=new Line();
		li.setEndX(100.0);
		li.setLayoutX(71.0);
		li.setLayoutY(180.0);
		li.setStartX(-41.5);
		
		ap.getChildren().addAll(ep,l1,image,image1,l2,li);
		
		AnchorPane ap1=new AnchorPane();
		ap1.setPrefHeight(407.0);
		ap1.setPrefWidth(1200.0);
		ap1.setStyle("-fx-background-color: lightGreen;");
		BorderPane.setAlignment(ap1,Pos.CENTER);
		
		Font f2=new Font("Gill Sans MT",36.0);
		Label al=new Label("Secure Login");
		al.setLayoutX(257.0);
		al.setLayoutY(88.0);
		al.setOpacity(0.54);
		al.setTextAlignment(TextAlignment.JUSTIFY);
		al.setTextFill(Paint.valueOf("#b90d0d"));
		al.setTextOverrun(OverrunStyle.CLIP);
		al.setFont(f2);
		
		Font f3=new Font("Javanese Text",14.0);
		Label al1=new Label("UserId:");
		al1.setLayoutX(226.00);
		al1.setLayoutY(167.00);
		al1.setPrefHeight(40.0);
		al1.setPrefWidth(69.0);
		al1.setFont(f3);

		Label al2=new Label("Password:");
		al2.setLayoutX(227.0);
		al2.setLayoutY(207.0);
		al2.setPrefHeight(40.0);
		al2.setPrefWidth(69.0);
		al2.setFont(f3);
		
		TextField tf=new TextField();
		tf.setLayoutX(317.0);
		tf.setLayoutY(175.0);
		tf.setPromptText("UserID");
		
		PasswordField pf=new PasswordField();
		pf.setLayoutX(318.0);
		pf.setLayoutY(214.0);
		pf.setPromptText("Password");
		
		
		Button lgn=new Button("Login");
		lgn.setLayoutX(350.0);
		lgn.setLayoutY(275.0);
		lgn.setMnemonicParsing(false);
		lgn.setPrefHeight(30.0);
		lgn.setPrefWidth(98.0);
		lgn.setStyle("-fx-background-color: red;");
		lgn.setAlignment(Pos.CENTER);
		lgn.setTextFill(Paint.valueOf("#0d0d0d"));
		lgn.setOnAction(e->{
			try {
				AdminLoginCheck ad=new AdminLoginCheck();
				int x=ad.check(tf.getText(),pf.getText());
				if (x==1) {
					AdminView adm=new AdminView();
					adm.start(primaryStage,tf.getText());
					myStage.close();
				}else {
					res.setText("Error");
				}
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		Button back=new Button("Exit");
		back.setLayoutX(223.0);
		back.setLayoutY(275.0);
		back.setMnemonicParsing(false);
		back.setPrefHeight(30.0);
		back.setPrefWidth(98.0);
		back.setStyle("-fx-background-color: red;");
		back.setAlignment(Pos.CENTER);
		back.setTextFill(Paint.valueOf("#0d0d0d"));
		back.setOnAction(e->{
			myStage.close();
		});
		
		ap1.getChildren().addAll(al,al1,al2,tf,pf,lgn,res,back);
		bp.getChildren().addAll(ap,ap1);
	
		
		Scene myScene=new Scene(bp,500,400);
		myStage.setScene(myScene);
		myStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
