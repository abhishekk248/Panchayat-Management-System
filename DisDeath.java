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
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class DisDeath /*extends Application*/{
	public void start(Stage myStage,int x,String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9,
			String s10,String s11,String s12) {
		AnchorPane ap=new AnchorPane();
		ap.setMaxHeight(-100000);
		ap.setMaxWidth(-100000);
		ap.setMinHeight(-100000);
		ap.setMinWidth(-100000);
		ap.setPrefHeight(792.0);
		ap.setPrefWidth(641.0);
		
		Font f1=new Font("Times New Roman",14.0);
		Label l1=new Label("FORM NO. 4");
		l1.setLayoutX(268.0);
		l1.setLayoutY(14.0);
		l1.setTextAlignment(TextAlignment.CENTER);
		l1.setFont(f1);
		
		Font f2=new Font("Times New Roman Bold",20.0);
		Label l2=new Label("DEATH CERTIFICATE");
		l2.setLayoutX(209.0);
		l2.setLayoutY(68.0);
		l2.setFont(f2);
		
		Label l3=new Label("(Issued under Section 12/17 of the Registration of Births and Deaths (Act, 1969 and Rule 8/13 of the");
		l3.setLayoutX(57.0);
		l3.setLayoutY(167.0);
		l3.setPrefHeight(18.0);
		l3.setPrefWidth(528.0);
		
		Label l4=new Label("Indian Registration of Births and Deaths Rules, 2000)");
		l4.setLayoutX(182.0);
		l4.setLayoutY(186.0);
		
		Label l5=new Label("This is to certify that the following information has been taken from the original record of birth which is");
		l5.setLayoutX(47.0);
		l5.setLayoutY(236.0);
		
		Image image=new Image("logo_2.png");
		ImageView img=new ImageView(image);
		img.setFitHeight(90.0);
		img.setFitWidth(85.0);
		img.setLayoutX(80.0);
		img.setLayoutY(47.0);
		img.setPickOnBounds(true);
		img.setPreserveRatio(true);
		
		Image image1=new Image("logo_1.png");
		ImageView img1=new ImageView(image1);
		img1.setFitHeight(70.0);
		img1.setFitWidth(78.0);
		img1.setLayoutX(476.0);
		img1.setLayoutY(57.0);
		img1.setPickOnBounds(true);
		img1.setPreserveRatio(true);
		
		
		Label l6=new Label("Register for");
		l6.setLayoutX(47.0);
		l6.setLayoutY(267.0);
		Label ul1=new Label("User");
		ul1.setLayoutX(114.0);
		ul1.setLayoutY(263.0);
		ul1.setPrefHeight(26.0);
		ul1.setPrefWidth(194.0);
		
		Label l7=new Label("of Taluk");
		l7.setLayoutX(210.0);
		l7.setLayoutY(267.0);
		Label ul2=new Label(s10);
		ul2.setLayoutX(275.0);
		ul2.setLayoutY(263.0);
		ul2.setPrefHeight(26.0);
		ul2.setPrefWidth(194.0);
		
		Label l8=new Label("of District");
		l8.setLayoutX(365.0);
		l8.setLayoutY(267.0);
		Label ul3=new Label(s9);
		ul3.setLayoutX(435.0);
		ul3.setLayoutY(263.0);
		ul3.setPrefHeight(26.0);
		ul3.setPrefWidth(194.0);

		Label l9=new Label("of State");
		l9.setLayoutX(47.0);
		l9.setLayoutY(298.0);
		Label ul4=new Label(s8);
		ul4.setLayoutX(105.0);
		ul4.setLayoutY(293.0);
		ul4.setPrefHeight(26.0);
		ul4.setPrefWidth(228.0);
		
		Label l10=new Label("Name : ");
		l10.setLayoutX(43.0);
		l10.setLayoutY(382.0);
		Label ul5=new Label(s2);
		ul5.setLayoutX(132.0);
		ul5.setLayoutY(378.0);
		ul5.setPrefHeight(26.0);
		ul5.setPrefWidth(175.0);
		
		Label l11=new Label("Age : ");
		l11.setLayoutX(321.0);
		l11.setLayoutY(382.0);
		Label ul6=new Label(s4);
		ul6.setLayoutX(414.0);
		ul6.setLayoutY(378.0);
		ul6.setPrefHeight(26.0);
		ul6.setPrefWidth(175.0);
		
		Label l12=new Label("Date Of Death : ");
		l12.setLayoutX(43.0);
		l12.setLayoutY(425.0);
		Label ul7=new Label(s3);
		ul7.setLayoutX(132.0);
		ul7.setLayoutY(421.0);
		ul7.setPrefHeight(26.0);
		ul7.setPrefWidth(175.0);
		
		Label l13=new Label("Place Of Death : ");
		l13.setLayoutX(43.0);
		l13.setLayoutY(470.0);
		Label ul8=new Label(s6);
		ul8.setLayoutX(132.0);
		ul8.setLayoutY(466.0);
		ul8.setPrefHeight(26.0);
		ul8.setPrefWidth(175.0);
		
		Label l14=new Label("Husband/Father Name :");
		l14.setLayoutX(318.0);
		l14.setLayoutY(425.0);
		Label ul9=new Label(s5);
		ul9.setLayoutX(450.0);
		ul9.setLayoutY(421.0);
		ul9.setPrefHeight(26.0);
		ul9.setPrefWidth(175.0);
		
		Label l15=new Label("Cause Of Death : ");
		l15.setLayoutX(321.0);
		l15.setLayoutY(470.0);
		Label ul10=new Label(s11);
		ul10.setLayoutX(414.0);
		ul10.setLayoutY(466.0);
		ul10.setPrefHeight(26.0);
		ul10.setPrefWidth(175.0);

		Label l16=new Label("Address : ");
		l16.setLayoutX(43.0);
		l16.setLayoutY(517.0);
		Label ul11=new Label(s7);
		ul11.setLayoutX(132.0);
		ul11.setLayoutY(496.0);
		ul11.setPrefHeight(60.0);
		ul11.setPrefWidth(457.0);
		
		Label l19=new Label("Registration No:");
		l19.setLayoutX(47.0);
		l19.setLayoutY(620.0);
		Label ul14=new Label(String.valueOf(x));
		ul14.setLayoutX(145.0);
		ul14.setLayoutY(616.0);
		ul14.setPrefHeight(26.0);
		ul14.setPrefWidth(175.0);
		
		Label l20=new Label("Registration Date:");
		l20.setLayoutX(319.0);
		l20.setLayoutY(620.0);
		Label ul15=new Label(s12);
		ul15.setLayoutX(427.0);
		ul15.setLayoutY(616.0);
		ul15.setPrefHeight(26.0);
		ul15.setPrefWidth(175.0);
		
		Font f3=new Font("Times New Roman",13.0);
		Label l21=new Label("Signature of the issuing authority");
		l21.setLayoutX(364.0);
		l21.setLayoutY(714.0);
		l21.setFont(f3);
		Label ul16=new Label("Panchayat Secretary");
		ul16.setLayoutX(385.0);
		ul16.setLayoutY(741.0);
		ul16.setPrefHeight(26.0);
		ul16.setPrefWidth(175.0);
		
		ap.getChildren().addAll(l1,l2,l3,l4,l5,img,img1,l6,ul1,l7,ul2,l8,ul3,l9,ul4,l10,ul5);
		ap.getChildren().addAll(l11,ul6,l12,ul7,l13,ul8,l14,ul9,l15,ul10,l16);
		ap.getChildren().addAll(ul11,l19,ul14,l20,ul15,l21,ul16);
		
		Scene myScene=new Scene(ap,650,800);
		myStage.setScene(myScene);
		myStage.show();		
	}
	/*public static void main(String[] args) {
		launch(args);
	}*/
}

