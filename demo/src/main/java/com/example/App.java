package application;
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
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Popup;
import javafx.stage.Stage;
 
import java.awt.Checkbox;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;


public class App extends Application {
	
	Stage window;
	Scanner input = new Scanner(System.in);
	double amount = 0;

	@Override
	public void start(Stage primaryStage) {
		
		
		
		
		Stage window = primaryStage;

		GridPane grid = new GridPane();

		grid.setAlignment(Pos.CENTER);
		grid.setVgap(5);
		grid.setHgap(-35);
		grid.setPadding(new Insets(5));

		Text welcomeTxt = new Text("Welcome");
		welcomeTxt.setFont(Font.font("Tehoma", FontWeight.LIGHT, 25));
		welcomeTxt.setFill(Color.ALICEBLUE);
		grid.add(welcomeTxt, 0, 0);

		Label lblUser = new Label("Usernane:");
		lblUser.setTextFill(Color.ALICEBLUE);
		grid.add(lblUser, 0, 1);

		TextField txtUser = new TextField();
		txtUser.setPromptText("username");
		// String user = String.valueOf(txtUser.getText());
		grid.add(txtUser, 1, 1);

		Label lblPassword = new Label("Password:");
		lblPassword.setTextFill(Color.ALICEBLUE);

		grid.add(lblPassword, 0, 2);

		PasswordField pwBox = new PasswordField();
		pwBox.setPromptText("password");

		grid.add(pwBox, 1, 2);

//sign up hyper link
		Hyperlink hSign = new Hyperlink("sign up");
		hSign.setTextFill(Color.BLUE);
		hSign.setFont(Font.font("Tehoma", FontWeight.LIGHT, 15));

		Label lAcc = new Label();
		lAcc.setText("Don't have an account?");
		lAcc.setFont(Font.font("Tehoma", FontWeight.LIGHT, 17));

		VBox VSignUp = new VBox();
		VSignUp.setStyle("-fx-background-color: SteelBlue");
		VSignUp.setAlignment(Pos.CENTER);
		VSignUp.getChildren().addAll(lAcc, hSign);

		ImageView v1 = new ImageView("MARP Airlines.png");
		v1.setFitHeight(300);
		v1.setFitWidth(350);

		GridPane p1 = new GridPane();

		p1.setAlignment(Pos.CENTER);
		p1.add(v1, 0, 0);

		VBox b1 = new VBox();
		b1.setPadding(new Insets(15, 15, 15, 15));
		b1.setStyle("-fx-background-color: SteelBlue");
		b1.getChildren().add(grid);

		BorderPane bo = new BorderPane();
		bo.setCenter(b1);
		bo.setTop(p1);
		bo.setBottom(VSignUp);

		Scene scenee = new Scene(bo, 350, 520);

		// this is for the sign up

		ImageView imageTrip = new ImageView("trip.gif");
		imageTrip.setFitHeight(300);
		imageTrip.setFitWidth(500);

		VBox vTrip = new VBox(50);// trip is for the image
		vTrip.setAlignment(Pos.CENTER);
		vTrip.setPadding(new Insets(15, 15, 15, 15));
		vTrip.setStyle("-fx-background-color: AliceBlue");
		vTrip.getChildren().add(imageTrip);

		Label Name = new Label("Name:");
		TextField TfName = new TextField();
		TfName.setPromptText("enter your Name");

		Label Lname = new Label("Last name:");
		TextField TfLname = new TextField();
		TfLname.setPromptText("enter your Last name");

		Label Age = new Label("Age:");
		TextField TfAge = new TextField();
		TfAge.setPromptText("enter your age");

		Label passSignUp = new Label("Password:");
		PasswordField TfPass = new PasswordField();
		TfPass.setPromptText("password");
		Label LshowPass = new Label("your Pass");
		LshowPass.setTextFill(Color.BLACK);

		Button ShowPass = new Button("(6)");
		ShowPass.setOnMousePressed(et -> {
			if (TfPass.getLength() != 0) {
				LshowPass.setText(TfPass.getText());
				LshowPass.setTextFill(Color.RED);
			}

		});
		ShowPass.setOnMouseReleased(ef -> {
			LshowPass.setText("your Pass");
			LshowPass.setTextFill(Color.BLACK);
		});
		Label address = new Label("address");
		TextField TfAddress = new TextField();
		TfAddress.setPromptText("enter your address");

		Label email = new Label("Email");
		TextField TfEmail = new TextField();
		TfEmail.setPromptText("enter your email");

		Label credit = new Label("Credit");
		TextField TfCredit = new TextField();
		TfCredit.setPromptText("enter your credit number");
		Label Cpass = new Label("Password");
		PasswordField TfCPass = new PasswordField();
		TfCPass.setPromptText("enter credit password");

		// creating buttons for the sign up scene
		Button Save = new Button("Save");
		Save.setOnAction(e -> {
			

		});

		Button Clear1 = new Button("Clear");
		Clear1.setOnAction(ep -> {

			TfName.clear();
			TfLname.clear();
			TfAge.clear();
			TfPass.clear();
			TfAddress.clear();
			TfEmail.clear();
			TfCredit.clear();
			TfCPass.clear();

		});

		Button Cancel = new Button("Cancel");

		GridPane Gpane = new GridPane();
		Gpane.setStyle("-fx-background-color: SteelBlue");

		Gpane.setAlignment(Pos.CENTER);
		Gpane.setVgap(10);
		Gpane.setHgap(10);
		Gpane.setPadding(new Insets(5));

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

		Gpane.add(passSignUp, 3, 3);
		Gpane.add(TfPass, 4, 3);

		Gpane.add(ShowPass, 5, 3);
		Gpane.add(Save, 1, 6);
		Gpane.add(Cancel, 3, 6);
		Gpane.add(Clear1, 4, 6);
		Gpane.add(LshowPass, 6, 3);

		Gpane.add(credit, 0, 4);
		Gpane.add(TfCredit, 1, 4);

		Gpane.add(Cpass, 3, 4);
		Gpane.add(TfCPass, 4, 4);

		BorderPane pane = new BorderPane();
		pane.setCenter(Gpane);
		pane.setTop(vTrip);

		Scene scene = new Scene(pane, 600, 600);

		hSign.setOnMouseClicked(el -> {
			window.setScene(scene);
			window.setResizable(true);
		});

		// this is for the menu (Scene3)

		Button BtReservation = new Button("Reservation");

		Button BtAircraft = new Button("Aircraft");

		Button BtPilot = new Button("Pilots");

		Button BtUpdateReservation = new Button("UPDATE RESERVATION");

		Button BtUpdatePersonalACC = new Button("UPDATE PERSONAL INFO");

		Button BtReturnToLogin = new Button("Return");// teb3a la scene 3 taba3 l menu

		BtReturnToLogin.setOnAction(ex -> {
			window.setScene(scenee);
			window.setResizable(false);
		});

		GridPane Gpane3 = new GridPane();// gpane3 is for the menu
		Gpane3.setAlignment(Pos.CENTER);
		Gpane3.setVgap(5);
		Gpane3.setHgap(5);
		Gpane3.setPadding(new Insets(5));

		Gpane3.add(BtAircraft, 0, 0);
		Gpane3.add(BtPilot, 0, 1);
		Gpane3.add(BtReservation, 0, 2);
		Gpane3.add(BtUpdateReservation, 0, 3);
		Gpane3.add(BtUpdatePersonalACC, 0, 4);
		Gpane3.add(BtReturnToLogin, 0, 5);

		ImageView imageMenu = new ImageView("WelcomeMenu.jpg");
		imageMenu.setFitHeight(250);
		imageMenu.setFitWidth(500);

		VBox topMenu = new VBox();
		topMenu.setAlignment(Pos.CENTER);
		topMenu.setPadding(new Insets(15, 15, 15, 15));
		topMenu.setStyle("-fx-background-color:AliceBlue");
		topMenu.getChildren().add(imageMenu);

		VBox bottomMenu = new VBox();
		bottomMenu.setAlignment(Pos.CENTER);
		bottomMenu.setPadding(new Insets(15, 15, 15, 15));
		bottomMenu.setStyle("-fx-background-color: DarkBlue");
		// bottomMenu.getChildren().add(imageMenuBottom);

		VBox vbMenu = new VBox();
		vbMenu.setAlignment(Pos.CENTER);
		vbMenu.setPadding(new Insets(15, 15, 15, 15));
		vbMenu.setStyle("-fx-background-color:SteelBlue");
		vbMenu.getChildren().add(Gpane3);

		BorderPane boMenu = new BorderPane();
		boMenu.setCenter(vbMenu);
		boMenu.setTop(topMenu);
		boMenu.setBottom(bottomMenu);

		Scene scene3 = new Scene(boMenu, 750, 700);

		// this is for the aircraft scenee

		String[] CraftTitle = { "FirstAircraft", "SecondAircraft", "ThirdAircraft" };

		// Declare an ImageView array for the national flags of 9 countries
		ImageView[] ImageViews = { new ImageView("A350_XWB.jpeg"), new ImageView("Boeing_747.jpeg"),
				new ImageView("N188TW.jpeg"), };

		TextArea txt = new TextArea("");

		ListView<String> lv = new ListView<>(FXCollections.observableArrayList(CraftTitle));
		
		lv.setPrefSize(140, 200);
		lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

		lv.setOnMouseClicked(event -> {
			// Get the index of the item that was clicked
			int index = lv.getSelectionModel().getSelectedIndex(); // Get the value of the item that was clicked

			// Print the index and value to the console
			if (index == 0) {
				txt.clear();

				txt.setText("airplane, also called aeroplane or plane,\n"
						+ " any of a class of fixed-wing aircraft that is heavier than air, \n"
						+ "propelled by a screw propeller or a high-velocity jet,\n"
						+ " and supported by the dynamic reaction of the air against its wings.");
			} else if (index == 1) {
				txt.clear();
				txt.setText("Economy class is another term for the airplane's main cabin\n"
						+ ", as opposed to premium cabins like business class and first class.\n"
						+ " Sometimes referred to as coach class, economy class typically makes up the bulk of the seating on a flight.\n"
						+ " It's the most simple class, with the fewest amenities.");
			} else if (index == 2) {
				txt.clear();
				txt.setText(
						"Enjoy the state-of-the-art amenities of a VIP aircraft\n which can include lounge areas, master bedrooms\n"
								+ ", fully equipped bathrooms and even showers.\n The wide cabins of these luxury\n "
								+ "aircraft guarantee total privacy with separated rooms whenever you want.");
			} else {
				txt.clear();
			}

		});

		// Create a pane to hold image views
		FlowPane imagePane = new FlowPane(30, 30);
		BorderPane Apane = new BorderPane();
		BorderPane BAir = new BorderPane();
		Button Cbutton = new Button("CHOOSE RESERVATION");

		Button ReturnB = new Button("Return");
		BAir.setCenter(Cbutton);
		BAir.setLeft(ReturnB);
		ReturnB.setOnAction(action -> {
			window.setScene(scene3);
		});
		Apane.setLeft(new ScrollPane(lv));
		Apane.setCenter(imagePane);
		Apane.setBottom(BAir);
		Apane.setRight(txt);

		lv.getSelectionModel().selectedItemProperty().addListener(ov -> {
			imagePane.getChildren().clear();
			for (Integer i : lv.getSelectionModel().getSelectedIndices()) {
				imagePane.getChildren().add(ImageViews[i]);
			}
		});
		Scene Ascene = new Scene(Apane, 700, 500);

		BtAircraft.setOnAction(en -> {
			window.setScene(Ascene);
		});

		Button LoginBtn = new Button("Login");
		grid.add(LoginBtn, 1, 3);

		LoginBtn.setOnAction(e -> {

			window.setScene(scene3);
			window.setResizable(false);
		});

		Button Clear = new Button("Clear");
		grid.add(Clear, 2, 3);
		Clear.setOnAction(es -> {
			txtUser.clear();
			pwBox.clear();

		});

		// cancel button on the sign up scene
		Cancel.setOnAction(ed -> {
			RadioButton Sure = new RadioButton("Sure");
			RadioButton No = new RadioButton("No");
			Gpane.add(Sure, 3, 7);
			Gpane.add(No, 3, 8);
			Sure.setOnAction(ev -> {
				window.setScene(scenee);
				window.setResizable(false);
			});
			No.setOnAction(eve -> {
				window.setScene(scene);
			});
		});

		window.setTitle("MARP Airlines");
		window.setScene(scenee);
		window.show();
		window.setResizable(false);

		// reservation scene(scene 4)
		VBox VRadio = new VBox(20);
		RadioButton RdVip = new RadioButton("      VIP");
		RadioButton RdFistClass = new RadioButton("FirtClass");
		RadioButton RdRegular = new RadioButton(" Regular");
		VRadio.setAlignment(Pos.CENTER);
		VRadio.getChildren().addAll(RdVip, RdFistClass, RdRegular);

		RdVip.setOnAction(e -> {
			RdFistClass.setSelected(false);
			RdRegular.setSelected(false);
			amount+=500;
		});

		RdFistClass.setOnAction(e -> {
			RdVip.setSelected(false);
			RdRegular.setSelected(false);
			amount+=300;
		});

		RdRegular.setOnAction(e -> {
			RdVip.setSelected(false);
			RdFistClass.setSelected(false);
			amount+=100;
		});

		VBox vbdesign = new VBox();

		vbdesign.setStyle("-fx-border-width: 2px; -fx-border-color: Blue");
		vbdesign.setStyle("-fx-background-color:SteelBlue");
		vbdesign.setOpacity(0.5);

		StackPane sdesignr = new StackPane();
		sdesignr.setPadding(new Insets(5));
		sdesignr.setAlignment(Pos.CENTER);
		sdesignr.getChildren().addAll(vbdesign, VRadio);

		VBox VCheck = new VBox(20);
		CheckBox OneWay = new CheckBox("One  Way ");
		CheckBox TwoWays = new CheckBox("Two Ways");
		OneWay.setOnAction(e -> {
			TwoWays.setSelected(false);
			amount+=100;
		});
		TwoWays.setOnAction(e -> {
			OneWay.setSelected(false);
			amount+=180;
		});
		VCheck.setAlignment(Pos.CENTER);

		VCheck.getChildren().addAll(OneWay, TwoWays);

		VBox vbdesigno = new VBox();
		vbdesigno.setStyle("-fx-border-width: 2px; -fx-border-color: Blue");
		vbdesigno.setStyle("-fx-background-color:SteelBlue");
		vbdesigno.setOpacity(0.5);

		StackPane sdesign = new StackPane();
		sdesign.setPadding(new Insets(5));
		sdesign.setAlignment(Pos.CENTER);
		sdesign.getChildren().addAll(vbdesigno, VCheck);

		HBox HbButtons = new HBox(10);

		Button BtSave = new Button("Save");

		Button BtCancel = new Button("Cancel");
		BtCancel.setOnAction(e -> {
			window.setScene(scene3);
		});

		HbButtons.setAlignment(Pos.CENTER);
		HbButtons.setSpacing(5);
		HbButtons.getChildren().addAll(BtSave, BtCancel);

		ComboBox<String> comboBox = new ComboBox<>();

		// Add items to the combo box
		comboBox.getItems().addAll("Canada", "China", "Denmark", "France", "USA", "Dubai", "Germany");

		// Set the default value
		

		comboBox.setOnAction(event -> {

			String selectedItem = comboBox.getValue();

			if (selectedItem=="Canada") {
				amount+= 200;

			} else if (selectedItem=="China") {
				amount+= 150;
			} else if (selectedItem=="Denmark") {
				amount+= 85;
			} else if (selectedItem=="France") {
				amount+= 100;
			} else if (selectedItem=="USA") {
				amount+= 250;

			} else if (selectedItem=="Dubai") {
				amount+= 60;

			} else {
				amount+= 100;
			}
		});

		StackPane root = new StackPane();
		root.getChildren().addAll(comboBox);

		// combo box for aircraft
		ComboBox<String> comboBoxC = new ComboBox<>();

		// Add items to the combo box
		comboBoxC.getItems().addAll("First AIRCRAFT", "SecondAIRCRAFT", "Third AIRCRAFT");

		// Set the default value
		
		Alert alert = new Alert(AlertType.CONFIRMATION);

		comboBoxC.setOnAction(event -> {

			String selectedItem = comboBoxC.getValue();

			if (selectedItem=="First AIRCRAFT") {
				amount+= 100;

			} else if (selectedItem == "SecondAIRCRAFT") {
				amount+= 300;
			} else {
				amount+= 500;
			}
		});

		StackPane roottt = new StackPane();
		roottt.getChildren().addAll(comboBoxC);
//combo box for date
		ComboBox<String> comboBoxx = new ComboBox<>();

		comboBoxx.getItems().addAll("Monday,December 4:00 PM, 2022 ", "Tuesday, December 1:00 AM , 2022 ",
				"Friday,December 8:30 PM,2022", "Wednesday,January 3:20 PM,2023", "Sunday,January 9:20 PM,2023",
				"Monday,February 5:40 PM,2023", "Saturday,February 6:20 AM,2023");

		// Set the default value
		comboBoxx.setValue("Monday,December 4:00 PM, 2022 ");

		StackPane roott = new StackPane();
		roott.getChildren().addAll(comboBoxx);

		Label labelC = new Label("Choose AIRCRAFT:");
		Label lCountry = new Label("Country:");
		Label lDate = new Label("Date:");

		GridPane vbCombo = new GridPane();
		vbCombo.setAlignment(Pos.CENTER);
		vbCombo.setVgap(10);
		vbCombo.setHgap(-5);
		vbCombo.setPadding(new Insets(5));
		vbCombo.add(lCountry, 0, 0);
		vbCombo.add(root, 1, 0);
		vbCombo.add(lDate, 0, 1);
		vbCombo.add(roott, 1, 1);
		vbCombo.add(labelC, 0, 2);
		vbCombo.add(roottt, 1, 2);

		Image image = new Image("Travell.jpg");

		BackgroundImage backgroundImage = new BackgroundImage(image, null, null, null, null);
		Background background = new Background(backgroundImage);
		// pane.setBackground(background);

		BorderPane BpReserv = new BorderPane();
		BpReserv.setLeft(sdesignr);
		BpReserv.setRight(sdesign);
		BpReserv.setCenter(vbCombo);
		BpReserv.setBackground(background);

		BpReserv.setBottom(HbButtons);

		Scene ResScene = new Scene(BpReserv, 600, 500);

		Cbutton.setOnAction(act -> {
			window.setScene(ResScene);

		});

		BtReservation.setOnAction(acte -> {
			window.setScene(ResScene);
		});
		
		
		
		
		BtSave.setOnAction(e -> {
			if((!RdVip.isSelected()&&!RdFistClass.isSelected()&&!RdRegular.isSelected())
					||(!OneWay.isSelected()&&!TwoWays.isSelected()
					||(comboBoxC.getValue()!=("First AIRCRAFT")&& comboBoxC.getValue()!=("SecondAIRCRAFT")&& comboBoxC.getValue()!=("Third AIRCRAFT"))
					||(comboBox.getValue()!=("Canada")&& comboBox.getValue()!=("China")&& comboBox.getValue()!=("Denmark") && comboBox.getValue()!=("France")
					&& comboBox.getValue()!=("USA" )&& comboBox.getValue()!=("Dubai")&&comboBox.getValue()!=("Germany")))) {
				System.out.println("ERROR!");
				
				comboBoxx.setValue("Monday,December 4:00 PM, 2022 ");
				comboBox.setValue("");
				comboBoxC.setValue("");
				OneWay.setSelected(false);
				TwoWays.setSelected(false);
				
				 RdVip.setSelected(false);
				 RdFistClass.setSelected(false);
				 RdRegular.setSelected(false); 
				 amount=0;
				
			}
			else {
				NumberFormat formatter = NumberFormat.getCurrencyInstance();
				String formattedAmount = formatter.format(amount);
				alert.setContentText("your Total amount is:" +  formattedAmount);
				alert.show();
				amount=0;
				comboBoxx.setValue("Monday,December 4:00 PM, 2022 ");
				comboBox.setValue("");
				comboBoxC.setValue("");
				OneWay.setSelected(false);
				TwoWays.setSelected(false);
				
				 RdVip.setSelected(false);
				 RdFistClass.setSelected(false);
				 RdRegular.setSelected(false);
				 amount=0;
				 
			}});
			
			 BtUpdateReservation.setOnAction(ea->{
				
				 TableViewResrv tvR = new     TableViewResrv ();
	                try {
	                	tvR.start(new Stage());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						
					}
			 });
			 
			 
			 BtUpdatePersonalACC.setOnAction(new EventHandler<ActionEvent>(){
				 @Override
		            public void handle(ActionEvent event) {
		                // Switch to the second class when the button is clicked
					 TableVieww tvw = new    TableVieww();
		                try {
		                	tvw.start(new Stage());
						} catch (Exception e) {
							// TODO Auto-generated catch block
							
						}
		            }
			 });
			 
			 
			 
			 
			 //pilot scene
			 
			 
			
			
			   HBox Images = new HBox();
			   ImageView pilot1 = new ImageView(new Image("First_Picture.jpg"));
			   pilot1.setFitHeight(250);
			   pilot1.setFitWidth(250);
			   Label  lb1 = new Label("Zain Suhail \nObtained his Certificate at 1977 \nfrom Harvard University ", pilot1);
			   lb1.setStyle("-fx-border-color: black; -fx-border-width: 2");
			   lb1.setContentDisplay(ContentDisplay.TOP);
			   lb1.setTextFill(Color.BLACK);
			   
			   ImageView pilot2 = new ImageView(new Image("Second_Picture.jpg"));
			   pilot2.setFitHeight(250);
			   pilot2.setFitWidth(250);
			   Label lb2 = new Label("Muhammad Ayub \nObtained his Certificate at 1982 \nfrom Ceton Hall University ", pilot2);
			   lb2.setStyle("-fx-border-color: black; -fx-border-width: 2");
			   lb2.setContentDisplay(ContentDisplay.TOP);
			   lb2.setTextFill(Color.BLACK);
			   
			   
			   ImageView pilot3 = new ImageView(new Image("Third_Picture.jpg"));
			   pilot3.setFitHeight(250);
			   pilot3.setFitWidth(250);
			   Label lb3 = new Label("Asif Mahmood \nObtained his Certificate at 1990 \nfrom Toronto university ", pilot3);
			   lb3.setStyle("-fx-border-color: black; -fx-border-width: 2");
			   lb3.setContentDisplay(ContentDisplay.TOP);
			   lb3.setTextFill(Color.BLACK);
			   Images.setAlignment(Pos.CENTER);
			   Images.setSpacing(25);
			   Images.getChildren().addAll(lb1,lb2,lb3);
			   
			 Images.setStyle("-fx-background-color:SteelBlue");
			   
			   HBox Buttons = new HBox();
			  
			   Button BtReturn = new Button ("Return");
			   Buttons.setSpacing(50);
			   Buttons.setPadding(new Insets(30,40,50,50));
			   Buttons.setAlignment(Pos.CENTER);
			   Buttons.getChildren().addAll(BtReturn);

			    Buttons.setStyle("-fx-background-color:DarkBlue");
			   BtReturn.setOnAction(e ->{
			   window.setScene(scene3);
			   });
			   VBox box = new VBox();
			   box.getChildren().addAll(Images ,Buttons);
			   box.setAlignment(Pos.CENTER);
			   box.setSpacing(15);
			   box.setStyle("-fx-background-color:SteelBlue");
			  
			  
			   Scene PilotScene = new Scene(box, 800, 700);
			   BtPilot.setOnAction(action ->{
			   window.setScene(PilotScene);
			   });
			  
			 }

	public static void main(String[] args) {
		launch(args);

	}

}