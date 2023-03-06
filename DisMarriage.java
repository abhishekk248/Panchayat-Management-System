import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.*;
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

public class DisMarriage /*extends Application*/{
	public void start(Stage myStage, int x, String s1, String s2, String s3, String s5, String s8, String s9, String s10,
	 String s11, String s12, String s13, String s14, String s16, String s19, String sdate) {
			AnchorPane ap=new AnchorPane();
			ap.setMaxHeight(-100000);
			ap.setMaxWidth(-100000);
			ap.setMinHeight(-100000);
			ap.setMinWidth(-100000);
			ap.setPrefHeight(792.0);
			ap.setPrefWidth(641.0);
			
			Font f1=new Font("Times New Roman",14.0);
			Label l1=new Label("FORM NO. 7");
			l1.setLayoutX(268.0);
			l1.setLayoutY(14.0);
			l1.setTextAlignment(TextAlignment.CENTER);
			l1.setFont(f1);
			
			Font f2=new Font("Times New Roman Bold",20.0);
			Label l2=new Label("MARRIAGE CERTIFICATE");
			l2.setLayoutX(209.0);
			l2.setLayoutY(68.0);
			l2.setFont(f2);
			
			Label l3=new Label("(Issued under Section 12/17 of the Registration of Marriage (Act, 1970 and Rule 9/13 of the");
			l3.setLayoutX(57.0);
			l3.setLayoutY(167.0);
			l3.setPrefHeight(18.0);
			l3.setPrefWidth(528.0);
			
			Label l4=new Label("Indian Registration of Marriage Rules, 2000)");
			l4.setLayoutX(182.0);
			l4.setLayoutY(186.0);
			
			Label l5=new Label("This is to certify that the following information has been taken from the original Marriage Record which is");
			l5.setLayoutX(47.0);
			l5.setLayoutY(236.0);
			
			Image image =new Image("logo_2.png");
			ImageView img=new ImageView(image);
			img.setFitHeight(90.0);
			img.setFitWidth(85.0);
			img.setLayoutX(80.0);
			img.setLayoutY(47.0);
			img.setPickOnBounds(true);
			img.setPreserveRatio(true);
			
			Image image1 = new Image("logo_1.png");
			ImageView img1=new ImageView(image1);
			img1.setFitHeight(70.0);
			img1.setFitWidth(78.0);
			img1.setLayoutX(476.0);
			img1.setLayoutY(57.0);
			img1.setPickOnBounds(true);
			img1.setPreserveRatio(true);
			
			//
			Label l6=new Label("register for");
			l6.setLayoutX(47.0);
			l6.setLayoutY(267.0);
			Label ul1=new Label("User");
			ul1.setLayoutX(116.0);
			ul1.setLayoutY(262.0);
			ul1.setPrefHeight(26.0);
			ul1.setPrefWidth(194.0);
			
			Label l7=new Label("of Taluk");
			l7.setLayoutX(313.0);
			l7.setLayoutY(267.0);
			Label ul2=new Label(s12);
			ul2.setLayoutX(372.0);
			ul2.setLayoutY(262.0);
			ul2.setPrefHeight(26.0);
			ul2.setPrefWidth(194.0);
			
			Label l8=new Label("of District");
			l8.setLayoutX(47.0);
			l8.setLayoutY(298.0);
			Label ul3=new Label(s11);
			ul3.setLayoutX(111.0);
			ul3.setLayoutY(293.0);
			ul3.setPrefHeight(26.0);
			ul3.setPrefWidth(194.0);

			Label l9=new Label("of State");
			l9.setLayoutX(313.0);
			l9.setLayoutY(298.0);
			Label ul4=new Label(s10);
			ul4.setLayoutX(362.0);
			ul4.setLayoutY(293.0);
			ul4.setPrefHeight(26.0);
			ul4.setPrefWidth(228.0);
			
			Label l10=new Label("Name");
			l10.setLayoutX(43.0);
			l10.setLayoutY(383.0);
			Label b10=new Label("Name");
			b10.setLayoutX(331.0);
			b10.setLayoutY(383.0);
			Label ul5=new Label(s2);
			ul5.setLayoutX(100.0);
			ul5.setLayoutY(377.0);
			ul5.setPrefHeight(26.0);
			ul5.setPrefWidth(175.0);
			Label bl5=new Label(s13);
			bl5.setLayoutX(386.0);
			bl5.setLayoutY(377.0);
			bl5.setPrefHeight(26.0);
			bl5.setPrefWidth(175.0);
			
			
			Label l12=new Label("Date Of Birth");
			l12.setLayoutX(43.0);
			l12.setLayoutY(471.0);
			l12.setPrefHeight(18.0);
			l12.setPrefWidth(80.0);
			Label b12=new Label("Date Of Birth");
			b12.setLayoutX(331.0);
			b12.setLayoutY(471.0);
			b12.setPrefHeight(18.0);
			b12.setPrefWidth(80.0);
			Label ul7=new Label(s3);
			ul7.setLayoutX(125.0);
			ul7.setLayoutY(467.0);
			ul7.setPrefHeight(26.0);
			ul7.setPrefWidth(175.0);
			Label bl7=new Label(s14);
			bl7.setLayoutX(420.0);
			bl7.setLayoutY(467.0);
			bl7.setPrefHeight(26.0);
			bl7.setPrefWidth(175.0);
			
			
			Label l15=new Label("Father Name:");
			l15.setLayoutX(43.0);
			l15.setLayoutY(426.0);
			Label b15=new Label("Father Name:");
			b15.setLayoutX(331.0);
			b15.setLayoutY(426.0);
			Label ul10=new Label(s5);
			ul10.setLayoutX(125.0);
			ul10.setLayoutY(421.0);
			ul10.setPrefHeight(26.0);
			ul10.setPrefWidth(175.0);
			Label bl10=new Label(s16);
			bl10.setLayoutX(417.0);
			bl10.setLayoutY(421.0);
			bl10.setPrefHeight(26.0);
			bl10.setPrefWidth(175.0);

			Label l16=new Label("Aadhar No:");
			l16.setLayoutX(331.0);
			l16.setLayoutY(517.0);
			Label b16=new Label("Aadhar No:");
			b16.setLayoutX(43.0);
			b16.setLayoutY(517.0);
			Label ul11=new Label(s8);
			ul11.setLayoutX(111.0);
			ul11.setLayoutY(512.0);
			ul11.setPrefHeight(26.0);
			ul11.setPrefWidth(175.0);
			Label bl11=new Label(s19);
			bl11.setLayoutX(413.0);
			bl11.setLayoutY(512.0);
			bl11.setPrefHeight(26.0);
			bl11.setPrefWidth(175.0);


			Label l18=new Label("Address:");
			l18.setLayoutX(43.0);
			l18.setLayoutY(575.0);
			Label ul13=new Label(s9);
			ul13.setLayoutX(102.0);
			ul13.setLayoutY(550.0);
			ul13.setPrefHeight(60.0);
			ul13.setPrefWidth(457.0);
			ul13.setWrapText(true);
			
			Label l19=new Label("Registration No:");
			l19.setLayoutX(43.0);
			l19.setLayoutY(658.0);
			String instr=String.valueOf(x);
			Label ul14=new Label(instr);
			ul14.setLayoutX(151.0);
			ul14.setLayoutY(653.0);
			ul14.setPrefHeight(26.0);
			ul14.setPrefWidth(175.0);
			
			Label l20=new Label("Registration Date:");
			l20.setLayoutX(331.0);
			l20.setLayoutY(658.0);
			Label ul15=new Label(sdate);
			ul15.setLayoutX(432.0);
			ul15.setLayoutY(653.0);
			ul15.setPrefHeight(26.0);
			ul15.setPrefWidth(175.0);
			
			Font f3=new Font("Times New Roman",13.0);
			Label l21=new Label("Signature of the issuing authority");
			l21.setLayoutX(364.0);
			l21.setLayoutY(714.0);
			l21.setFont(f3);
			Label ul16=new Label("Panchayat Officer");
			ul16.setLayoutX(385.0);
			ul16.setLayoutY(741.0);
			ul16.setPrefHeight(26.0);
			ul16.setPrefWidth(175.0);
			
			ap.getChildren().addAll(l1,l2,l3,l4,l5,img,img1,l6,ul1,l7,ul2,l8,ul3,l9,ul4);
			ap.getChildren().addAll(l10,b10,ul5,bl5,l12,b12,ul7,bl7,l15,b15,ul10,bl10,l16,b16);
			ap.getChildren().addAll(ul11,bl11,l18,ul13,l19,ul14,l20,ul15,l21,ul16);
			
			Scene myScene=new Scene(ap,650,800);
			myStage.setScene(myScene);
			myStage.show();		
		}
		/*public static void main(String[] args) {
			launch(args);
		}*/
	}
