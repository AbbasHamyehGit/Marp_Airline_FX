

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
public class TableViewResrv extends Application {
	
	public TableView<Reservation> table = new TableView<Reservation>();
	
	
	final ObservableList<Reservation> data = FXCollections.observableArrayList();
	
	 
	@Override
	public void start(Stage stage1) throws Exception {
		final Label label = new Label("customer Reservation  Info:");
        label.setFont(new Font("Arial", 20));
        table.setEditable(true);
        
        TableColumn countryCol = new TableColumn("Country");
        countryCol.setMinWidth(100);
        countryCol.setCellValueFactory(new PropertyValueFactory<Reservation, String>("country"));
        countryCol.setCellFactory(TextFieldTableCell.forTableColumn());
        countryCol.setEditable(true);
       
        countryCol.setOnEditCommit(
                    new EventHandler<CellEditEvent<Reservation, String>>() {
                    @Override
                        public void handle(CellEditEvent<Reservation, String> t) {
                            ((Reservation) t.getTableView().getItems().get(
                            t.getTablePosition().getRow())
                            ).setCountry( t.getNewValue());
                        }
                    }
        );
        
        TableColumn dateCol = new TableColumn("Date");
        dateCol.setMinWidth(100);
        dateCol.setCellValueFactory(new PropertyValueFactory<Reservation, String>("date"));
        dateCol.setCellFactory(TextFieldTableCell.forTableColumn());
        dateCol.setEditable(true);
        dateCol.setOnEditCommit(
                    new EventHandler<CellEditEvent<Reservation, String>>() {
                    @Override
                        public void handle(CellEditEvent<Reservation, String> t) {
                            ((Reservation) t.getTableView().getItems().get(
                            t.getTablePosition().getRow())
                            ).setDate(t.getNewValue());
                        }
                    }
        );
        
        TableColumn aircraftCol = new TableColumn("Aircraft");
        aircraftCol.setMinWidth(200);
        aircraftCol.setCellValueFactory(new PropertyValueFactory<Reservation, String>("aircraft"));
        aircraftCol.setCellFactory(TextFieldTableCell.forTableColumn());
        aircraftCol.setEditable(true);
        aircraftCol.setOnEditCommit(
                    new EventHandler<CellEditEvent<Reservation, String>>() {
                    @Override
                        public void handle(CellEditEvent<Reservation, String> t) {
                            ((Reservation) t.getTableView().getItems().get(
                            t.getTablePosition().getRow())
                            ).setAircraft(t.getNewValue());
                        }
                    }
        );
        
        TableColumn flightCol = new TableColumn("Flight");
        flightCol.setMinWidth(200);
        flightCol.setCellValueFactory(new PropertyValueFactory<Reservation, String>("flight"));
        flightCol.setCellFactory(TextFieldTableCell.forTableColumn());
        flightCol.setEditable(true);
        flightCol.setOnEditCommit(
                    new EventHandler<CellEditEvent<Reservation, String>>() {
                    @Override
                        public void handle(CellEditEvent<Reservation, String> t) {
                            ((Reservation) t.getTableView().getItems().get(
                            t.getTablePosition().getRow())
                            ).setFlight(t.getNewValue());
                        }
                    }
        );
        
        TableColumn typeCol = new TableColumn("Type");
        typeCol.setMinWidth(200);
        typeCol.setCellValueFactory(new PropertyValueFactory<Reservation, String>("type"));
        typeCol.setCellFactory(TextFieldTableCell.forTableColumn());
        typeCol.setEditable(true);
        typeCol.setOnEditCommit(
                    new EventHandler<CellEditEvent<Reservation, String>>() {
                    @Override
                        public void handle(CellEditEvent<Reservation, String> t) {
                            ((Reservation) t.getTableView().getItems().get(
                            t.getTablePosition().getRow())
                            ).setType(t.getNewValue());
                        }
                    }
        );
        
       
        table.setItems(data);
        table.getColumns().addAll(countryCol, dateCol,aircraftCol, flightCol
        		,typeCol );
        
        
        
        
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 10, 10, 10));
        vbox.getChildren().addAll(label, table);
        
        Scene scene = new Scene(vbox);
        stage1.setTitle("Table View Sample");
        stage1.setWidth(850);
        stage1.setHeight(500);
        
        stage1.setScene(scene);
        stage1.show();
        
		
	}
	 public static void main(String[] args) {
	        launch(args);
	    }
     
}
