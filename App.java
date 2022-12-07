import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.application.Application ;
import javafx.scene.Scene ;
import javafx.scene .control.Button ;
import javafx.scene.control.Label ;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout . StackPane;
import javafx.scene.layout.VBox ;
import javafx.scene.text.Text;
import javafx.stage.Stage ;

public class LoginForm extends Application {
Stage window;
@Override
public void start(Stage primaryStage) {
window=primaryStage;

window.setTitle("Login Form Window");

GridPane grid=new GridPane();

grid.setAlignment(Pos.CENTER);
grid.setVgap (10);
grid.setHgap(16);
grid.setPadding(new Insets(10)) ;

Text welcomeTxt = new Text ("Welcome") ;
wolcomeTxt.setFont(Font.font( "Tehoma",FontWeight.LIGHT,25));
grid.add(welcomeTxt, 0, 0);

Label lblUser = new Label("Usernane");
grid.add(lblUser, 0, 1);

TextField txtUser=new TextField();
txtUser.setPromptText ("username");
grid.add(txtUser, 1, 1);

Label lblPassword=new Label ("Password") ;
grid.add(lblPassword, 0, 2);

PasswordField pwBox=new PasswordField();
pwBox.setPromptText("password") ;
grid.add(pwBox, 1, 2);

Button LoginBtn=new Button("Login") ;
grid.add(LoginBtn, 1, 3);
LoginBtn.setOnAction(e ->{
    System.out.Println("Login button pressed");
});

Scene scene=new Scene( grid, 500,500) ;
window. setScene( scene) ;
window.show() ;
}
public static void main(String [] args) {
launch(args) ;
}

}