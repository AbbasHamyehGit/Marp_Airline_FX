

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.application.Application ;
import javafx.scene.Scene ;
import javafx.scene .control.Button ;
import javafx.scene.control.Label ;
import javafx.scene.control.PasswordField;
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
Stage window;
@Override
public void start(Stage primaryStage) {
window=primaryStage;

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

GridPane Gpane3=new GridPane();
Scene scene3=new Scene(Gpane3);

Button LoginBtn=new Button("Login") ;
grid.add(LoginBtn, 1, 3);
LoginBtn.setOnAction(e ->{
    if(txtUser.getText()==txtUser.getText() || pwBox.getText()==pwBox.getText()) {
    	window.setScene(scene3);
    	window.setResizable(true);
    }
    else
    	txtUser.setText("userName or password are incorrect!");
        
});
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



Label l2=new Label("Name:");
TextField tfSignup=new TextField();
tfSignup.setPromptText ("enter your Name");

Label l4=new Label("Last name:");
TextField tf4Signup=new TextField();
tf4Signup.setPromptText("enter your Last name");

Label l5=new Label("Age:");
TextField tf5Signup=new TextField();
tf5Signup.setPromptText ("enter your age");

Label passSignUp=new Label("Password:");
PasswordField pwSign=new PasswordField();


pwSign.setPromptText("password") ;


Label LshowPass=new Label("your Pass");
LshowPass.setTextFill(Color.BLACK);

Button ShowPass=new Button("(6)");
ShowPass.setOnMousePressed(e->{
	if(pwSign.getLength()!=0) {
		LshowPass.setText(pwSign.getText());
		LshowPass.setTextFill(Color.RED);
	}

});
ShowPass.setOnMouseReleased(e->{
	LshowPass.setText("your Pass");
	LshowPass.setTextFill(Color.BLACK);
});

Label l7=new Label("address");
TextField tf7Signup=new TextField();
tf7Signup.setPromptText ("enter your address");

Label l3=new Label("Email");
TextField tf3Signup=new TextField();
tf3Signup.setPromptText ("enter your email");

GridPane Gpane=new GridPane();
Gpane.setStyle("-fx-background-color: SteelBlue");

Gpane.setAlignment(Pos.CENTER);
Gpane.setVgap (10);
Gpane.setHgap(10);
Gpane.setPadding(new Insets(5)) ;

Gpane.add(l2, 0, 1);
Gpane.add(tfSignup, 1, 1);

Gpane.add(l4, 0, 2);
Gpane.add(tf4Signup, 1, 2);

Gpane.add(l5, 3, 1);
Gpane.add(tf5Signup, 4, 1);


Gpane.add(l7, 3, 2);
Gpane.add(tf7Signup, 4, 2);

Gpane.add(l3, 0, 3);
Gpane.add(tf3Signup, 1, 3);

Gpane.add( passSignUp, 3, 3);
Gpane.add(pwSign, 4, 3);

Gpane.add( ShowPass, 5, 3);

Gpane.add(LshowPass, 6, 3);

Hyperlink hSign=new Hyperlink("sign up");
hSign.setTextFill(Color.BLUE);
hSign.setFont(Font.font( "Tehoma",FontWeight.LIGHT,15));


//sign up Scene //fiya kelshi

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
;


hSign.setOnMouseClicked(e ->{
	window.setScene(scene);
	window.setResizable(true);
}
		
	
);


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
window.setTitle("MARP Airlines");
window.setScene( scenee) ;
window.setResizable(false);
window.show() ;
}
public static void main(String [] args) {
launch(args) ;

}

}