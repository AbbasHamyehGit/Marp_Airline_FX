

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class TableVieww extends Application  {
	
	private TableView<SignUp> table = new TableView<SignUp>();
	
	
	final ObservableList<SignUp> data = FXCollections.observableArrayList();
	
	 
	@Override
	public void start(Stage stage)  {
		  TableView table = new TableView<>();
		  
		final Label label = new Label("customer  Info:");
        label.setFont(new Font("Arial", 20));
        table.setEditable(true);
        
        TableColumn firstNameCol = new TableColumn("First Name");
        firstNameCol.setMinWidth(100);
        firstNameCol.setCellValueFactory(new PropertyValueFactory<SignUp, String>("name"));
        firstNameCol.setCellFactory(TextFieldTableCell.forTableColumn());
        firstNameCol.setEditable(true);
       
        firstNameCol.setOnEditCommit(
                    new EventHandler<CellEditEvent<SignUp, String>>() {
                    @Override
                        public void handle(CellEditEvent<SignUp, String> t) {
                            ((SignUp) t.getTableView().getItems().get(
                            t.getTablePosition().getRow())
                            ).setName( t.getNewValue());
                        }
                    }
        );
        
        TableColumn lastNameCol = new TableColumn("Last Name");
        lastNameCol.setMinWidth(100);
        lastNameCol.setCellValueFactory(new PropertyValueFactory<SignUp, String>("lastName"));
        lastNameCol.setCellFactory(TextFieldTableCell.forTableColumn());
        lastNameCol.setEditable(true);
        lastNameCol.setOnEditCommit(
                    new EventHandler<CellEditEvent<SignUp, String>>() {
                    @Override
                        public void handle(CellEditEvent<SignUp, String> t) {
                            ((SignUp) t.getTableView().getItems().get(
                            t.getTablePosition().getRow())
                            ).setLastName(t.getNewValue());
                        }
                    }
        );
        
        TableColumn emailCol = new TableColumn("Email");
        emailCol.setMinWidth(200);
        emailCol.setCellValueFactory(new PropertyValueFactory<SignUp, String>("email"));
        emailCol.setCellFactory(TextFieldTableCell.forTableColumn());
        emailCol.setEditable(true);
        emailCol.setOnEditCommit(
                    new EventHandler<CellEditEvent<SignUp, String>>() {
                    @Override
                        public void handle(CellEditEvent<SignUp, String> t) {
                            ((SignUp) t.getTableView().getItems().get(
                            t.getTablePosition().getRow())
                            ).setEmail(t.getNewValue());
                        }
                    }
        );
        
        TableColumn ageCol = new TableColumn("Age");
        emailCol.setMinWidth(200);
        emailCol.setCellValueFactory(new PropertyValueFactory<SignUp, String>("age"));
        emailCol.setCellFactory(TextFieldTableCell.forTableColumn());
        emailCol.setEditable(true);
        emailCol.setOnEditCommit(
                    new EventHandler<CellEditEvent<SignUp, String>>() {
                    @Override
                        public void handle(CellEditEvent<SignUp, String> t) {
                            ((SignUp) t.getTableView().getItems().get(
                            t.getTablePosition().getRow())
                            ).setAge(t.getNewValue());
                        }
                    }
        );
        
        TableColumn addressCol = new TableColumn("Address");
        emailCol.setMinWidth(200);
        emailCol.setCellValueFactory(new PropertyValueFactory<SignUp, String>("address"));
        emailCol.setCellFactory(TextFieldTableCell.forTableColumn());
        emailCol.setEditable(true);
        emailCol.setOnEditCommit(
                    new EventHandler<CellEditEvent<SignUp, String>>() {
                    @Override
                        public void handle(CellEditEvent<SignUp, String> t) {
                            ((SignUp) t.getTableView().getItems().get(
                            t.getTablePosition().getRow())
                            ).setAddress(t.getNewValue());
                        }
                    }
        );
        
        TableColumn  passwordCol = new TableColumn(" Password");
        emailCol.setMinWidth(200);
        emailCol.setCellValueFactory(new PropertyValueFactory<SignUp, String>(" password"));
        emailCol.setCellFactory(TextFieldTableCell.forTableColumn());
        emailCol.setEditable(true);
        emailCol.setOnEditCommit(
                    new EventHandler<CellEditEvent<SignUp, String>>() {
                    @Override
                        public void handle(CellEditEvent<SignUp, String> t) {
                            ((SignUp) t.getTableView().getItems().get(
                            t.getTablePosition().getRow())
                            ).setPassword(t.getNewValue());
                        }
                    }
        );
        
        
        TableColumn creditCol = new TableColumn("Credit");
        emailCol.setMinWidth(200);
        emailCol.setCellValueFactory(new PropertyValueFactory<SignUp, String>("credit"));
        emailCol.setCellFactory(TextFieldTableCell.forTableColumn());
        emailCol.setEditable(true);
        emailCol.setOnEditCommit(
                    new EventHandler<CellEditEvent<SignUp, String>>() {
                    @Override
                        public void handle(CellEditEvent<SignUp, String> t) {
                            ((SignUp) t.getTableView().getItems().get(
                            t.getTablePosition().getRow())
                            ).setCredit(t.getNewValue());
                        }
                    }
        );
        
        TableColumn passwordcrdCol = new TableColumn(" Credit Password");
        emailCol.setMinWidth(200);
        emailCol.setCellValueFactory(new PropertyValueFactory<SignUp, String>("passwordcrd"));
        emailCol.setCellFactory(TextFieldTableCell.forTableColumn());
        emailCol.setEditable(true);
        emailCol.setOnEditCommit(
                    new EventHandler<CellEditEvent<SignUp, String>>() {
                    @Override
                        public void handle(CellEditEvent<SignUp, String> t) {
                            ((SignUp) t.getTableView().getItems().get(
                            t.getTablePosition().getRow())
                            ).setPasswordcrd(t.getNewValue());
                        }
                    }
        );
        
       
        
        table.setItems(data);
        table.getColumns().addAll(firstNameCol, lastNameCol,ageCol, emailCol
        		,addressCol , passwordCol,creditCol,passwordcrdCol);
        
        
        
        
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 10, 10, 10));
        vbox.getChildren().addAll(label, table);
        
        Scene scene = new Scene(vbox);
        stage.setTitle("Table View Sample");
        stage.setWidth(850);
        stage.setHeight(500);
        
        stage.setScene(scene);
        stage.show();
        
		
	}
	 public static void main(String[] args) {
	        launch(args);
	    }
     
}
