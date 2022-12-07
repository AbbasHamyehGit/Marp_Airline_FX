

import java.util.List;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.application.Application ;
import javafx.scene.Scene ;
import javafx.scene .control.Button ;
import javafx.scene.control.Label ;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout . StackPane;
import javafx.scene.layout.VBox ;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage ;

public class App extends Application {
Scanner input = new Scanner(System.in);
@Override
public void start(Stage primaryStage) {
 Stage window=primaryStage;

window.setTitle("Login Form Window");

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
grid.add(txtUser, 1, 1);

Label lblPassword=new Label ("Password:") ;
lblPassword.setTextFill(Color.ALICEBLUE);
grid.add(lblPassword, 0, 2);

PasswordField pwBox=new PasswordField();
pwBox.setPromptText("password") ;
grid.add(pwBox, 1, 2);
 
GridPane Gpane3 =new GridPane();
Scene scene3=new Scene(Gpane3);

Button LoginBtn=new Button("Login") ;
grid.add(LoginBtn, 1, 3);
//check for the database part
//LoginBtn.setOnAction(e ->{
//    if(txtUser.getText()==txtUser.getText() || pwBox.getText()==pwBox.getText()) {
//    	window.setScene(scene3);
//    	window.setResizable(true);
//    } else
//    	txtUser.setText("userName or password are incorrect!");
//    
//});
Button Clear=new Button("Clear") ;
grid.add(Clear, 2, 3);
Clear.setOnAction(e ->{
    txtUser.clear();
    pwBox.clear();
    
});

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
//sign up Scene //fiya kelshi


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
ShowPass.setOnMousePressed(e->{
	if(TfPass.getLength()!=0) {
		LshowPass.setText(TfPass.getText());
		LshowPass.setTextFill(Color.RED);
	}

});
ShowPass.setOnMouseReleased(e->{
	LshowPass.setText("your Pass");
	LshowPass.setTextFill(Color.BLACK);
});
Label address=new Label("address");
TextField TfAddress=new TextField();
TfAddress.setPromptText ("enter your address");

Label email=new Label("Email");
TextField TfEmail=new TextField();
TfEmail.setPromptText ("enter your email");

//creating buttons for the sign up scene
Button Save =new Button("Save");
Button Clear1 =new Button("Clear");
Clear1.setOnAction(e ->{
	TfName.clear();
	TfLname.clear();
	TfAge.clear();
	TfPass.clear();
	TfAddress.clear();
	TfEmail.clear();
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

Gpane.add( ShowPass, 5, 3);
Gpane.add(Save, 1,4);
Gpane.add(Cancel, 3,4);
Gpane.add(Clear1, 4, 4);
Gpane.add(LshowPass,6,3);

Hyperlink hSign=new Hyperlink("sign up");
hSign.setTextFill(Color.BLUE);
hSign.setFont(Font.font( "Tehoma",FontWeight.LIGHT,15));

ImageView imageTrip=new ImageView("trip.gif");
imageTrip.setFitHeight(300);
imageTrip.setFitWidth(500);

VBox vTrip=new VBox(50);
vTrip.setAlignment(Pos.CENTER);
vTrip.setPadding(new Insets(15, 15, 15, 15));
vTrip.setStyle("-fx-background-color: AliceBlue");
vTrip.getChildren().add(imageTrip);
BorderPane pane =new BorderPane();
pane.setCenter(Gpane);
pane.setTop(vTrip);

Scene scene=new Scene(pane,600,600);

hSign.setOnMouseClicked(e ->{
window.setScene(scene);
window.setResizable(true);
});
Label lAcc=new Label();
lAcc.setText("Don't have an account?");
lAcc.setFont(Font.font("Tehoma",FontWeight.LIGHT,17));

VBox VSignUp=new VBox();
VSignUp.setStyle("-fx-background-color: SteelBlue");
VSignUp.setAlignment(Pos.CENTER);
VSignUp.getChildren().addAll(lAcc,hSign);


BorderPane bo=new BorderPane();
bo.setCenter(b1);
bo.setTop(p1);
bo.setBottom(VSignUp);



Scene scenee=new Scene( bo, 350,520) ;
Cancel.setOnAction(e ->{
	  RadioButton Sure = new RadioButton("Sure");
	    RadioButton No = new RadioButton("No");
	    Gpane.add(Sure,4 , 5);
	Gpane.add(No, 4, 6);
	Sure.setOnAction(ev ->{
		window.setScene(scenee);
	});
	No.setOnAction(eve->{
		window.setScene(scene);
	});
	
	
});
window.setTitle("MARP Airlines");
window.setScene(scenee) ;
window.show() ;
}
public static void main(String [] args) {
launch(args) ;

}

}