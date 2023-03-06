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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
public class NewMain{
	public void start(int x,Stage myStage,String s) {
		Label l=new Label("Hello");
		Stage primaryStage=new Stage();
		AnchorPane ancp=new AnchorPane();
		ancp.setMaxHeight(-100000);
		ancp.setMaxWidth(-100000);
		ancp.setMinHeight(-100000);
		ancp.setMinWidth(-100000);
		ancp.setPrefHeight(548.0);
		ancp.setPrefWidth(714.0);
		ancp.setStyle("-fx-background-color: #FFE4C4; -fx-border-width: 30;");
		
		
		VBox vb=new VBox();
		vb.setLayoutY(89.0);
		vb.setPrefHeight(458.0);
		vb.setPrefWidth(249.0);
		vb.setScaleX(1);
		vb.setScaleY(1);
		vb.setScaleZ(1);
		vb.setStyle("-fx-background-color: #6495ED;");
		
		Font f=new Font("System Bold",15.0);
		Font f1=new Font("System Bold",13.0);
		
		Pane pn=new Pane();
		pn.setPrefHeight(86.0);
		pn.setPrefWidth(249.0);
		pn.setStyle("-fx-background-color: #FFF8DC; -fx-border-width: 5; -fx-border-color: green;");
		
		Label l1=new Label("Planning");
		l1.setLayoutX(37.0);
		l1.setLayoutY(4.0);
		l1.setPrefHeight(17.0);
		l1.setPrefWidth(155.0);
		l1.setFont(f);
		
		Label l2=new Label("Development");
		l2.setLayoutX(56.0);
		l2.setLayoutY(32.0);
		l2.setPrefHeight(17.0);
		l2.setPrefWidth(155.0);
		l2.setFont(f);
		
		Label l3=new Label("Decentralization");
		l3.setLayoutX(87.0);
		l3.setLayoutY(54.0);
		l3.setPrefHeight(17.0);
		l3.setPrefWidth(155.0);
		l3.setFont(f);
		
		pn.getChildren().addAll(l1,l2,l3);
		
		Display d=new Display();
		
		Button b1=new Button("About");
		b1.setPrefHeight(48.0);
		b1.setPrefWidth(249.0);
		b1.setFont(f1);
		b1.setAlignment(Pos.CENTER);
		b1.setMnemonicParsing(false);
		b1.setOnAction(e->{
			
		});
		
		Button b2=new Button("Birth Certificate");
		b2.setLayoutX(10);
		b2.setLayoutY(10);
		b2.setPrefHeight(48.0);
		b2.setPrefWidth(249.0);
		b2.setFont(f1);
		b2.setAlignment(Pos.CENTER);
		b2.setMnemonicParsing(false);
		b2.setOnAction(e->{
			d.start(primaryStage,x,1);
		});

		
		Button b3=new Button("Death Certificate");
		b3.setLayoutX(10.0);
		b3.setLayoutY(58.0);
		b3.setPrefHeight(48.0);
		b3.setPrefWidth(249.0);
		b3.setFont(f1);
		b3.setAlignment(Pos.CENTER);
		b3.setMnemonicParsing(false);
		b3.setOnAction(e->{
			d.start(primaryStage,x,2);
		});
		
		Button b4=new Button("Marriage Certificate");
		b4.setLayoutX(10.0);
		b4.setLayoutY(106.0);
		b4.setPrefHeight(48.0);
		b4.setPrefWidth(249.0);
		b4.setFont(f1);
		b4.setAlignment(Pos.CENTER);
		b4.setMnemonicParsing(false);
		b4.setOnAction(e->{
			d.start(primaryStage,x,3);
		});
		
		Button b5=new Button("Caste Certificate");
		b5.setLayoutX(10.0);
		b5.setLayoutY(154.0);
		b5.setPrefHeight(48.0);
		b5.setPrefWidth(249.0);
		b5.setFont(f1);
		b5.setAlignment(Pos.CENTER);
		b5.setMnemonicParsing(false);
		b5.setOnAction(e->{
			d.start(primaryStage,x,4);
		});
		
		Button b6=new Button("Logout");
		b6.setLayoutX(10.0);
		b6.setLayoutY(202.0);
		b6.setPrefHeight(48.0);
		b6.setPrefWidth(249.0);
		b6.setFont(f1);
		b6.setAlignment(Pos.CENTER);
		b6.setMnemonicParsing(false);
		b6.setOnAction(e->{
			LoginUser lo=new LoginUser();
			try {
				lo.start(primaryStage);
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			myStage.close();
		});
		
		Pane pn1=new Pane();
		pn1.setLayoutX(10.0);
		pn1.setLayoutY(10.0);
		pn1.setPrefHeight(86.0);
		pn1.setPrefWidth(249.0);
		pn1.setStyle("-fx-background-color: #FFF8DC;");
		
		Label l4=new Label("                     @All rights reserved");
		l4.setLayoutX(-19.0);
		l4.setLayoutY(8.0);
		l4.setPrefHeight(68.0);
		l4.setWrapText(true);
		l4.prefWidth(249.0);
		
		pn1.getChildren().addAll(l4);
		vb.getChildren().addAll(pn,b1,b2,b3,b4,b5,b6,pn1);
		
		
		AnchorPane ancp1=new AnchorPane();
		ancp1.setLayoutX(0);
		ancp1.setLayoutY(-2);
		ancp1.setPrefHeight(92.0);
		ancp1.setPrefWidth(714.0);
		ancp1.setScaleX(1);
		ancp1.setScaleY(1);
		ancp1.setScaleZ(1);
		ancp1.setStyle("-fx-background-color: #000080;");
		
		Font f2=new Font("System Bold",36.0);
		
		Label al1=new Label("    Gram Panchayat");
		al1.setLayoutX(174.0);
		al1.setLayoutY(22.0);
		al1.setPrefHeight(48.0);
		al1.setPrefWidth(366.0);
		al1.setScaleX(1);
		al1.setScaleY(1);
		al1.setScaleZ(1);
		al1.setFont(f2);
		al1.setTextFill(Paint.valueOf("#ffac39"));
		
		Image image=new Image("isymb.jpg");
		ImageView img=new ImageView(image);
		img.setFitHeight(68.0);
		img.setFitWidth(123.0);
		img.setLayoutX(104.0);
		img.setScaleX(1);
		img.setScaleY(1);
		img.setScaleZ(1);
		img.setLayoutY(12.0);
		img.setPickOnBounds(true);
		img.setPreserveRatio(true);
		
		Image image1=new Image("ksymb.png");
		ImageView img1=new ImageView(image1);
		img1.setFitHeight(68.0);
		img1.setFitWidth(74.0);
		img1.setLayoutX(524.0);
		img1.setLayoutY(12.0);
		img1.setPickOnBounds(true);
		img1.setPreserveRatio(true);
		
		
		AnchorPane ancp2=new AnchorPane();
		ancp2.setLayoutX(278.0);
		ancp2.setLayoutY(473.0);
		ancp2.setPrefHeight(53.0);
		ancp2.setPrefWidth(409.0);
		ancp2.setStyle("-fx-background-color: #6495ED; -fx-border-color: red;");
		
		Font f3=new Font("System Bold",12.0);
		Font f4=new Font("System Italic",12.0);
		
		Label al2=new Label("Developed By~");
		al2.setLayoutX(50.0);
		al2.setLayoutY(14.0);
		al2.setPrefHeight(23.0);
		al2.setPrefWidth(315.0);
		al2.setFont(f3);
		
		Label al3=new Label("Abhishek,Ashok,Anant");
		al3.setLayoutX(142.0);
		al3.setLayoutY(29.0);
		al3.setFont(f4);
		al3.setTextFill(Paint.valueOf("#804729"));
		
		Image image2=new Image("flag.jpg");
		ImageView img2=new ImageView(image2);
		img2.setFitHeight(150.0);
		img2.setFitWidth(200.0);
		img2.setLayoutX(368.0);
		img2.setLayoutY(140.0);
		img2.setPickOnBounds(true);
		img2.setPreserveRatio(true);
		
		Font f5=new Font("Berlin Sans FB Demi Bold",18.0);
		Font f6=new Font("Cambria Bold",14.0);
		
		Label al4=new Label("  Celebrating India's 75th Independence Day");
		al4.setLayoutX(300.0);
		al4.setLayoutY(288.0);
		al4.setPrefHeight(61.0);
		al4.setPrefWidth(366.0);
		al4.setStyle("-fx-border-color: red; -fx-border-image-width: 20;");
		al4.setFont(f5);
		
		Label al5=new Label("visit your near gram panchayat for more info");
		al5.setLayoutX(331.0);
		al5.setLayoutY(367.0);
		al5.setFont(f6);
		
		Label al6=new Label("Username:");
		al6.setLayoutX(568.0);
		al6.setLayoutY(97.0);
		
		Text tx=new Text();
		tx.setLayoutX(633.0);
		tx.setLayoutY(111.0);
		tx.setStrokeType(StrokeType.OUTSIDE);
		tx.setStrokeWidth(0.0);
		tx.setText(s);
		tx.setWrappingWidth(67.0);
		
		ancp2.getChildren().addAll(al2,al3);
		ancp1.getChildren().addAll(img,al1,img1);
		ancp.getChildren().addAll(vb,ancp1,ancp2,img2,al4,al5,al6,tx);
		
		Scene scene=new Scene(ancp,714,548);
		myStage.setScene(scene);
		myStage.show();
	}
	/*public static void main(String[] args) {
		launch(args);
	}*/
}