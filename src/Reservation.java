

import javafx.beans.property.SimpleStringProperty;

public class Reservation {
	 private  SimpleStringProperty country;
	 private  SimpleStringProperty date;
	 private  SimpleStringProperty aircraft;
	 private  SimpleStringProperty flight;
	 private  SimpleStringProperty type;
	 
	 
	 public Reservation(String country, String date, String aircraft,String flight
	    		,String  type) {
		 this.country = new SimpleStringProperty(country);
	        this.date = new SimpleStringProperty(date);
	        this.aircraft = new SimpleStringProperty( aircraft);
	        this.flight = new SimpleStringProperty(flight);
	        this.type = new SimpleStringProperty(type);
		 
	 }
	 
	 public String getCountry() {
         return country.get();
     }

     public void setCountry(String Country) {
    	 country.set(Country);
     }
     
     public String getDate() {
         return date.get();
     }

     public void setDate(String Date) {
    	 date.set(Date);
     }
     
     public String getAircraft() {
         return aircraft.get();
     }

     public void setAircraft(String Aircraft) {
    	 aircraft.set(Aircraft);
     }
     
     public String getFlight() {
         return flight.get();
     }

     public void setFlight(String Flight) {
    	 flight.set(Flight);
     }
     
     public String getType() {
         return  type.get();
     }

     public void setType(String Type) {
    	 type.set(Type);
     }
}
