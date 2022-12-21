
import javafx.beans.property.SimpleStringProperty;

public class SignUp {
	  private  SimpleStringProperty name;
	    private  SimpleStringProperty age;
	    private  SimpleStringProperty lastName;
	    private  SimpleStringProperty address;
	    private  SimpleStringProperty email;
	    private  SimpleStringProperty password;
	    private  SimpleStringProperty credit;
	    private  SimpleStringProperty passwordcrd;

	    
	    SignUp(String Name, String lastname, String email,String credit
	    		,String age,String address,String password,String passwordc) {
	        this.name = new SimpleStringProperty(Name);
	        this.name = new SimpleStringProperty(lastname);
	        this.name = new SimpleStringProperty(email);
	        this.name = new SimpleStringProperty(credit);
	        this.name = new SimpleStringProperty(age);
	        this.name = new SimpleStringProperty(address);
	        this.name = new SimpleStringProperty(password);
	        this.age = new SimpleStringProperty(passwordc);
	        
	    }
	        
	        public String getName() {
	            return name.get();
	        }

	        public void setName(String Name) {
	            name.set(Name);
	        }

	        public String getAge() {
	            return age.get();
	        }

	        public void setAge(String Age) {
	            age.set(Age);
	        }

	        public String getLastName() {
	            return lastName.get();
	        }

	        public void setLastName(String LastName) {
	        	lastName.set(LastName);
	        }
	       
	        
	        public String getAddress() {
	            return  address.get();
	        }

	        public void setAddress(String Address) {
	        	address.set(Address);
	        }
	        
	        
	        public String getEmail() {
	            return email.get();
	        }

	        public void setEmail(String Email) {
	        	email.set(Email);
	        }
	        
	        public String getPassword() {
	            return password.get();
	        }

	        public void setPassword(String Password) {
	        	password.set(Password);
	        }
	        
	        public String getCredit() {
	            return credit.get();
	        }

	        public void setCredit(String Credit) {
	        	credit.set(Credit);
	        }
	        
	        public String getPasswordcrd() {
	            return passwordcrd.get();
	        }

	        public void setPasswordcrd(String Passwordcrd) {
	        	passwordcrd.set(Passwordcrd);
	        }


	    }

