package com.example;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Hyperlink;
import javafx.application.Application ;
import javafx.scene.Scene ;
import javafx.scene .control.Button ;
import javafx.scene.control.Label ;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout . StackPane;
import javafx.scene.layout.VBox ;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Popup;
import javafx.stage.Stage ;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

  


public class App extends Application {
	Stage window;
	Scanner input = new Scanner(System.in);
	@Override
	public void start(Stage primaryStage) {
		Stage window=primaryStage;
		
		

		GridPane grid=new GridPane();

		grid.setAlignment(Pos.CENTER);
		grid.setVgap (5);
		grid.setHgap(-35);
		grid.setPadding(new Insets(5)) ;

		Text welcomeTxt = new Text ("Welcome") ;
		welcomeTxt.setFont(Font.font( "Tehoma",FontWeight.LIGHT,25));
		welcomeTxt.setFill(Color.ALICEBLUE);
		grid.add(welcomeTxt, 0, 0);

		Label lblUser = new Label("Usernane:");
		lblUser.setTextFill(Color.ALICEBLUE);
		grid.add(lblUser, 0, 1);

		TextField txtUser=new TextField();
		txtUser.setPromptText ("username");
		// String user = String.valueOf(txtUser.getText());
		grid.add(txtUser, 1, 1);

		Label lblPassword=new Label ("Password:") ;
		lblPassword.setTextFill(Color.ALICEBLUE);

		grid.add(lblPassword, 0, 2);

		PasswordField pwBox=new PasswordField();
		pwBox.setPromptText("password") ;
		
		grid.add(pwBox, 1, 2);
		
//sign up hyper link
		Hyperlink hSign=new Hyperlink("sign up");
		hSign.setTextFill(Color.BLUE);
		hSign.setFont(Font.font( "Tehoma",FontWeight.LIGHT,15));
		
		Label lAcc=new Label();
		lAcc.setText("Don't have an account?");
		lAcc.setFont(Font.font("Tehoma",FontWeight.LIGHT,17));

		VBox VSignUp=new VBox();
		VSignUp.setStyle("-fx-background-color: SteelBlue");
		VSignUp.setAlignment(Pos.CENTER);
		VSignUp.getChildren().addAll(lAcc,hSign);

		ImageView v1=new ImageView("MARP Airlines.png");
		v1.setFitHeight(300);
		v1.setFitWidth(350);

		GridPane p1=new GridPane();


		p1.setAlignment(Pos.CENTER);
		p1.add(v1, 0, 0);

		VBox b1=new VBox();
		b1.setPadding(new Insets(15, 15, 15, 15));
		b1.setStyle("-fx-background-color: SteelBlue");
		b1.getChildren().add(grid);
		
		BorderPane bo=new BorderPane();
		bo.setCenter(b1);
		bo.setTop(p1);
		bo.setBottom(VSignUp);
		

		Scene scenee=new Scene( bo, 350,520) ;
		
		
		//this is for the sign up
		
		ImageView imageTrip=new ImageView("trip.gif");
		imageTrip.setFitHeight(300);
		imageTrip.setFitWidth(500);

		VBox vTrip=new VBox(50);//trip is for the image
		vTrip.setAlignment(Pos.CENTER);
		vTrip.setPadding(new Insets(15, 15, 15, 15));
		vTrip.setStyle("-fx-background-color: AliceBlue");
		vTrip.getChildren().add(imageTrip);
		
		Label Name=new Label("Name:");
		TextField TfName=new TextField();
		TfName.setPromptText ("enter your Name");

		Label Lname=new Label("Last name:");
		TextField TfLname=new TextField();
		TfLname.setPromptText("enter your Last name");

		Label Age=new Label("Age:");
		TextField TfAge=new TextField();
		TfAge.setPromptText ("enter your age");

		Label passSignUp=new Label("Password:");
		PasswordField TfPass=new PasswordField();
		TfPass.setPromptText("password") ;
		Label LshowPass=new Label("your Pass");
		LshowPass.setTextFill(Color.BLACK);

		Button ShowPass=new Button("(6)");
		ShowPass.setOnMousePressed(et->{
			if(TfPass.getLength()!=0) {
				LshowPass.setText(TfPass.getText());
				LshowPass.setTextFill(Color.RED);
			}

		});
		ShowPass.setOnMouseReleased(ef->{
			LshowPass.setText("your Pass");
			LshowPass.setTextFill(Color.BLACK);
		});
		Label address=new Label("address");
		TextField TfAddress=new TextField();
		TfAddress.setPromptText ("enter your address");

		Label email=new Label("Email");
		TextField TfEmail=new TextField();
		TfEmail.setPromptText ("enter your email");
		
		Label credit = new Label("Credit");
		TextField TfCredit = new TextField();
		TfCredit.setPromptText("enter your credit number");
		Label Cpass = new Label("Password");
		PasswordField TfCPass = new PasswordField();
		TfCPass.setPromptText("enter credit password");
		
		//creating buttons for the sign up scene
		Button Save =new Button("Save");
		Save.setOnAction(e ->{ 
			File file1 = new File("SignUp1.txt");
	   
	    if (file1.exists()) {
	      System.out.println("Files already exist");
	      System.exit(0);
	    }

	    // Create a file
	    PrintWriter output1;
		try { 
			// Write formatted output to the file
			output1 = new PrintWriter(file1);
			output1.println("Name: "+TfName.getText()+"\tlast name: "+TfLname.getText());
			output1.println("Email: "+TfEmail.getText());
			output1.println("Age: "+TfAge.getText()+"\tAddress: "+TfAddress.getText());
			output1.println("Credit number: "+TfCredit.getText());
			System.out.println("file created successfully!!");

	    
	    // Close the file
	    output1.close();
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		}
	  
	   
	   
	   });

		Button Clear1 =new Button("Clear");
		Clear1.setOnAction(ep ->{
			TfName.clear();
			TfLname.clear();
			TfAge.clear();
			TfPass.clear();
			TfAddress.clear();
			TfEmail.clear();
			TfCredit.clear();
			TfCPass.clear();
			});
		
		Button Cancel = new Button ("Cancel");

		GridPane Gpane=new GridPane();
		Gpane.setStyle("-fx-background-color: SteelBlue");

		Gpane.setAlignment(Pos.CENTER);
		Gpane.setVgap (10);
		Gpane.setHgap(10);
		Gpane.setPadding(new Insets(5)) ;



		Gpane.add(Name, 0, 1);
		Gpane.add(TfName, 1, 1);

		Gpane.add(Lname, 0, 2);
		Gpane.add(TfLname, 1, 2);

		Gpane.add(Age, 3, 1);
		Gpane.add(TfAge, 4, 1);


		Gpane.add(address, 3, 2);
		Gpane.add(TfAddress, 4, 2);

		Gpane.add(email, 0, 3);
		Gpane.add(TfEmail, 1, 3);

		Gpane.add( passSignUp, 3, 3);
		Gpane.add(TfPass, 4, 3);

		Gpane.add(ShowPass, 5, 3);
		Gpane.add(Save, 1,6);
		Gpane.add(Cancel, 3,6);
		Gpane.add(Clear1, 4, 6);
		Gpane.add(LshowPass,6,3);
		
		Gpane.add(credit,0 ,4 );
		Gpane.add(TfCredit,1,4);
		
		Gpane.add(Cpass, 3, 4);
		Gpane.add(TfCPass, 4, 4);

		
		BorderPane pane =new BorderPane();
		pane.setCenter(Gpane);
		pane.setTop(vTrip);

		Scene scene=new Scene(pane,600,600);

		hSign.setOnMouseClicked(el ->{
		window.setScene(scene);
		window.setResizable(true);
		});
	
		
		
		//this is for the menu (Scene3)
		
		Button BtReservation=new Button("Reservation");
		
		
		Button BtAircraft=new Button("Aircraft");
		
		
		Button BtPilot=new Button("Pilots");
		
		

		Button BtUpdateReservation=new Button("UPDATE RESERVATION");
		
		
		Button BtUpdatePersonalACC=new Button("UPDATE INFO");
		
		Button BtReturnToLogin=new Button("Return");//teb3a la scene 3 taba3 l menu
		
		BtReturnToLogin.setOnAction(ex->{
			window.setScene(scenee);
			window.setResizable(false);
		});
		
		
		
		GridPane Gpane3=new GridPane();//gpane3 is for the menu
		Gpane3.setAlignment(Pos.CENTER);
		Gpane3.setVgap (5);
		Gpane3.setHgap(5);
		Gpane3.setPadding(new Insets(5)) ;
	
		
		Gpane3.add(BtReservation, 0, 0);
		Gpane3.add( BtAircraft, 0, 1);
		Gpane3.add( BtPilot, 0, 2);
		Gpane3.add(BtUpdateReservation, 0, 3);
		Gpane3.add(BtUpdatePersonalACC, 0, 4);
		Gpane3.add(BtReturnToLogin, 0, 5);
		
		ImageView imageMenu=new ImageView("WelcomeMenu.jpg");
		imageMenu.setFitHeight(250);
		imageMenu.setFitWidth(500);
		

		VBox topMenu=new VBox();
		topMenu.setAlignment(Pos.CENTER);
		topMenu.setPadding(new Insets(15, 15, 15, 15));
		topMenu.setStyle("-fx-background-color:AliceBlue");
		topMenu.getChildren().add(imageMenu);
		
		VBox bottomMenu=new VBox();
		bottomMenu.setAlignment(Pos.CENTER);
		bottomMenu.setPadding(new Insets(15, 15, 15, 15));
		bottomMenu.setStyle("-fx-background-color: DarkBlue");
      //  bottomMenu.getChildren().add(imageMenuBottom);
        
        
		VBox vbMenu=new VBox();
		vbMenu.setAlignment(Pos.CENTER);
		vbMenu.setPadding(new Insets(15, 15, 15, 15));
		vbMenu.setStyle("-fx-background-color:SteelBlue");
		vbMenu.getChildren().add(Gpane3);
		
		BorderPane boMenu=new BorderPane();
		boMenu.setCenter(vbMenu);
		boMenu.setTop(topMenu);
		boMenu.setBottom(bottomMenu);
		
		
		Scene scene3=new Scene(boMenu,750,700);

		

		//this is for the aircraft scenee
		
		 String[] CraftTitle = {"FirstAircraft", "SecondAircraft", "ThirdAircraft"};
	
				  // Declare an ImageView array for the national flags of 9 countries
				  ImageView[] ImageViews = {
				    new ImageView ("A350_XWB.jpeg"),
				    new ImageView("Boeing_747.jpeg"),
				    new ImageView("N188TW.jpeg"),
				  };

				  TextArea txt = new TextArea("dfe");
				    ListView<String> lv = new ListView<>(FXCollections.observableArrayList(CraftTitle));
				    lv.setPrefSize(140, 200);
				    lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
				   
				   
				    // Create a pane to hold image views
				    FlowPane imagePane = new FlowPane(30, 30);
				    BorderPane Apane = new BorderPane();
				    BorderPane BAir = new BorderPane();
				    Button Cbutton = new Button("choose");
				   
             	
				    Cbutton.setOnAction(act ->
			    {
			    	 VBox paneForRadioButtons = new VBox(20);
			    	    paneForRadioButtons.setPadding(new Insets(5, 5, 5, 5)); 
			    	    paneForRadioButtons.setStyle ("-fx-border-width: 2px; -fx-border-color: green");
			    	    
			    	    RadioButton RdFirst = new RadioButton("First_Aircraft");
			    	    RadioButton RdSecond = new RadioButton("Second_Aircraft");
			    	    RadioButton RdThird = new RadioButton("Third_Aircraft");
			    	    Alert alert = new Alert(AlertType. CONFIRMATION);
			    	    RdFirst.setOnAction(e ->{
			    	    	RdSecond.setSelected(false);
			    		   RdThird.setSelected(false);
			    		   
			    		   alert.setContentText("you choosed thi first aicraft 100$ will be taken from your account");
			    		   alert.show();
			    });
			    		  
			    	 
			    	    RdSecond.setOnAction(e ->{
				    		   RdFirst.setSelected(false);
				    		   RdThird.setSelected(false);
				    		   alert.setContentText("you choosed thi second aicraft 200$ will be taken from your account");
				    		   alert.show();
			    	    });
			    	    RdThird.setOnAction(e ->{
					    		   RdSecond.setSelected(false);
					    		   RdFirst.setSelected(false);
					    		   alert.setContentText("you choosed thi third aicraft 500$ will be taken from your account");
					    		   alert.show();
			    	    });
			    	   
			    	 
			    		
			    	    paneForRadioButtons.getChildren().addAll(RdFirst, RdSecond, RdThird);
			    	   
			    	   BAir.setCenter(paneForRadioButtons);
			    	    
			    });
				    Button ReturnB = new Button ("Return");
				    BAir.setCenter(Cbutton);
				    BAir.setLeft(ReturnB);
				    ReturnB.setOnAction(action ->{
				    window.setScene(scene3);
				    });
				    Apane.setLeft(new ScrollPane(lv));   
				    Apane.setCenter(imagePane);
				    Apane.setBottom(BAir);
				    Apane.setRight(txt);

				    lv.getSelectionModel().selectedItemProperty().addListener(
				      ov -> { 
				    	  imagePane.getChildren().clear();
				        for (Integer i: lv.getSelectionModel().getSelectedIndices()) {
				          imagePane.getChildren().add(ImageViews[i]);
				        }
				    });
				    Scene Ascene = new Scene(Apane,700,500);
				  
				    BtAircraft.setOnAction(en -> {
				    	window.setScene(Ascene); 
				    });
				    
	
		Button LoginBtn=new Button("Login") ;
		grid.add(LoginBtn, 1, 3);
		
		LoginBtn.setOnAction(e ->{
		    
	    	window.setScene(scene3);
	    	window.setResizable(false);
		});

		
		
		
		Button Clear=new Button("Clear") ;
		grid.add(Clear, 2, 3);
		Clear.setOnAction(es ->{
		    txtUser.clear();
		    pwBox.clear();
		    
		});

		
		

		//cancel button on the sign up scene
		Cancel.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent ed) {
				RadioButton Sure = new RadioButton("Sure");
				RadioButton No = new RadioButton("No");
				Gpane.add(Sure, 3, 7);
				Gpane.add(No, 3, 8);
				Sure.setOnAction(ev -> {
					window.setScene(scenee);
				});
				No.setOnAction(eve -> {
					window.setScene(scene);
				});
			}
		});

		

		
		 window.setTitle("MARP Airlines");
		 window.setScene(scenee) ;
		 window.show();
		 window.setResizable(false);

	
	}
	
public static void main(String [] args) {
	launch(args);

}


}