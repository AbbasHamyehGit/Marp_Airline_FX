
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

Button LoginBtn=new Button("Login") ;
grid.add(LoginBtn, 1, 3);
LoginBtn.setOnAction(e ->{
    System.out.println("Login button pressed");
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


BorderPane bo=new BorderPane();
bo.setCenter(b1);
bo.setTop(p1);
bo.setBottom(VSignUp);



Scene scene=new Scene( bo, 350,520) ;

window. setScene( scene) ;
window.setResizable(false);
window.show() ;
}
public static void main(String [] args) {
launch(args) ;

}

}