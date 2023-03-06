import java.sql.SQLException;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
public class Display /*extends Application*/{
	Label res;
	int y;
	public void start(Stage primaryStage,int x,int x1) {
		primaryStage.setTitle("JavaFX BUTTONS AND EVENTS");
		Stage myStage=new Stage();
		FormGeneration f1=new FormGeneration();
		String name="user";
		GridPane root=new GridPane();
		root.setAlignment(Pos.CENTER);
		Scene myScene=new Scene(root,200,200);
		primaryStage.setScene(myScene);
		res=new Label("Push a button");
		Button ba=new Button("Create Form");
		ba.setPrefHeight(40.0);
		ba.setPrefWidth(150.0);
		
		Button bb=new Button("Generate Form");
		bb.setPrefHeight(40.0);
		bb.setPrefWidth(150.0);
		
		Button back=new Button("Back");
		back.setPrefHeight(40.0);
		back.setPrefWidth(150.0);
		
		ba.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae){
				switch(x1) {
				case 1:BirthCertificate b1=new BirthCertificate();
					try {
						b1.start(name,myStage,x);
					}catch(ClassNotFoundException | SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 2:DeathCertificate d1=new DeathCertificate();
					try {
						d1.start(name,myStage,x);
					}catch(ClassNotFoundException | SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 3:MarriageCertificate m1=new MarriageCertificate();
					try {
						m1.start(name,myStage,x);
					}catch(ClassNotFoundException | SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 4:Caste c1=new Caste();
					try {
						c1.start(name,myStage,x);
					}catch(ClassNotFoundException | SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				}
			}
		});
		bb.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				switch(x1) {
				case 1:try {
						y=f1.pendingcheck(x,"Birth Certificate");
						if(y==-1) {
							res.setText("Its Still Pending");
						}else if(y==0){
							SQLShowBirth sqbc=new SQLShowBirth();
							res.setText("Processing");
							delay(2000,()->{
								try {
									sqbc.show(x);
								} catch (ClassNotFoundException | SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							});
						}else {
							res.setText("Your Form Is Rejected!!Plz Try Again");
						}
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					break;
				case 2:try {
						y=f1.pendingcheck(x,"Death Certificate");
						if(y==-1) {
							res.setText("Its Still Pending");
						}else if (y==0){
							SQLShowDeath sqdc=new SQLShowDeath();
							res.setText("Processing");
							delay(2000,()->{
								try {
									sqdc.show(x);
								} catch (ClassNotFoundException | SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							});
						}else {
							res.setText("Your Form Is Rejected!!Plz Try Again");
						}
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					break;
				case 3:try {
						y=f1.pendingcheck(x,"Marriage Certificate");
						if(y==-1) {
							res.setText("Its Still Pending");
						}else if(y==0){
							SQLShowMarriage sqmc=new SQLShowMarriage();
							res.setText("Processing");
							delay(2000,()->{
								try {
									sqmc.show(x);
								} catch (ClassNotFoundException | SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							});
						}else {
							res.setText("Your Form Is Rejected!!Plz Try Again");
						}
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					break;
				case 4:try {
						y=f1.pendingcheck(x,"Caste Certificate");
						if(y==-1) {
							res.setText("Its Still Pending");
						}else if(y==0){
							SQLShowCaste sqcc=new SQLShowCaste();
							res.setText("Processing");
							delay(2000,()->{
								try {
									sqcc.show(x);
								} catch (ClassNotFoundException | SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							});
						}else {
							res.setText("Your Form Is Rejected!!Plz Try Again");
						}
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					break;
				}
			}
		});
		back.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				primaryStage.close();
			}
		});
		root.add(ba,0,1);
		root.add(bb,0,2);
		root.add(back,0,3);
		root.add(res,0,4);
		primaryStage.show();
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