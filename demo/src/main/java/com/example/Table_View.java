package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
public class Table_View extends Application{

	 TableView table = new TableView ();
  ObservableList<Person> data = FXCollections.observableArrayList(
        new Person("Jacob", "Smith", "jacob.smith@example.com",1223,19,"afa","fda","fag"),
        new Person("Jacob", "Smith", "jacob.smith@example.com",1223,19,"afa","fda","fag"),
        new Person("Jacob", "Smith", "jacob.smith@example.com",1223,19,"afa","fda","fag"),
        new Person("Jacob", "Smith", "jacob.smith@example.com",1223,19,"afa","fda","fag"),
        new Person("Jacob", "Smith", "jacob.smith@example.com",1223,19,"afa","fda","fag")
);

@Override
    public void start(Stage stage) {
        
        
        final Label label = new Label("Address Book");
        label.setFont(new Font("Arial", 20));
        table.setEditable(true);
        
        TableColumn<Person, String> firstNameCol = new TableColumn<Person, String>("First Name");
        firstNameCol.setMinWidth(100);
        firstNameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("firstName"));
        firstNameCol.setCellFactory(TextFieldTableCell.forTableColumn());
        firstNameCol.setEditable(true);
        
        firstNameCol.setOnEditCommit(
                    new EventHandler<CellEditEvent<Person, String>>() {
                    @Override
                        public void handle(CellEditEvent<Person, String> t) {
                            ((Person) t.getTableView().getItems().get(
                            t.getTablePosition().getRow())
                            ).setFirstName(t.getNewValue());
                        }
                    }
        );
        
        TableColumn<Person, String> lastNameCol = new TableColumn<Person, String>("Last Name");
        lastNameCol.setMinWidth(100);
        lastNameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("lastName"));
        lastNameCol.setCellFactory(TextFieldTableCell.forTableColumn());
        lastNameCol.setEditable(true);
        lastNameCol.setOnEditCommit(
                    new EventHandler<CellEditEvent<Person, String>>() {
                    @Override
                        public void handle(CellEditEvent<Person, String> t) {
                            ((Person) t.getTableView().getItems().get(
                            t.getTablePosition().getRow())
                            ).setLastName(t.getNewValue());
                        }
                    }
        );
        
        TableColumn<Person, String> emailCol = new TableColumn<Person, String>("Email");
        emailCol.setMinWidth(200);
        emailCol.setCellValueFactory(new PropertyValueFactory<Person, String>("email"));
        emailCol.setCellFactory(TextFieldTableCell.forTableColumn());
        emailCol.setEditable(true);
        emailCol.setOnEditCommit(
                    new EventHandler<CellEditEvent<Person, String>>() {
                    @Override
                        public void handle(CellEditEvent<Person, String> t) {
                            ((Person) t.getTableView().getItems().get(
                            t.getTablePosition().getRow())
                            ).setEmail(t.getNewValue());
                        }
                    }
        );
        
        
        table.setItems(data);
        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);
        
        //add the GUI to add new rows
        final TextField addFirstName = new TextField();
        addFirstName.setPromptText("First Name");
        addFirstName.setMaxWidth(firstNameCol.getPrefWidth());
        
        final TextField addLastName = new TextField();
        addLastName.setMaxWidth(lastNameCol.getPrefWidth());
        addLastName.setPromptText("Last Name");
        
        final TextField addEmail = new TextField();
        addEmail.setMaxWidth(emailCol.getPrefWidth());
        addEmail.setPromptText("Email");
        
        final Button addButton = new Button("Add");
        
        addButton.setOnAction(e->{
       //     Person P = new Person(
//                    addFirstName.getText(),
//                    addLastName.getText(),
//                    addEmail.getText();
//                    
//                );
            //check if empty and add it to the list
//            if(P.getFirstName().length()!=0 && P.getLastName().length()!=0 && P.getEmail().length()!=0)
//            {
//                data.add(P);
//                addFirstName.clear();
//                addLastName.clear();
//                addEmail.clear();
////            }
//            else
//                System.out.println("Data is empty!\nNothing to add!");
//                for(Person p: data)
//                    System.out.println(p.toString());
//            
//        });
        final HBox hb = new HBox();
        hb.getChildren().addAll(addFirstName, addLastName, addEmail, addButton);
        
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 10, 10, 10));
        vbox.getChildren().addAll(label, table, hb);
        
        Scene scene = new Scene(vbox);
        stage.setTitle("Table View Sample");
        stage.setWidth(450);
        stage.setHeight(500);
        
        stage.setScene(scene);
        stage.show();
    }
}