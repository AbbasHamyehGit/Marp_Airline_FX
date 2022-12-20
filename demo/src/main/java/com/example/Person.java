package application;

import javafx.beans.property.SimpleStringProperty;

public class Person {
	private String firstName;
	
	private String lastName;
	private  String email;
	private  int credit;
	private  int age;
	private  String address;
	private  String Password;
	private  String CPassword;

//	public Person(SimpleStringProperty firstName, SimpleStringProperty lastName, SimpleStringProperty email, int credit,
//			int age, SimpleStringProperty address, SimpleStringProperty password, SimpleStringProperty cPassword) {
//		super();
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.email = email;
//		this.credit = credit;
//		this.age = age;
//		this.address = address;
//		Password = password;
//		CPassword = cPassword;
//	}
	public Person(String firstName, String lastName, String email, int credit,
			int age, String address, String password, String cPassword) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.credit = credit;
		this.age = age;
		this.address = address;
		Password = password;
		CPassword = cPassword;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public int getCredit() {
		return credit;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public String getPassword() {
		return Password;
	}

	public String getCPassword() {
		return CPassword;
	}

	public void setFirstName(String FirstName) {
		this.firstName = FirstName;
		
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
		
	}

	public void setEmail(String email) {
		this.email=email;
		
	}


	
}