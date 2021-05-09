package projectGamer.entities;

import java.time.LocalDate;

import projectGamer.abstracts.Entity;



public class Gamer implements Entity {
	
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate birthDay;
	private String nationalityId;
	public Gamer(int id, String firstName, String lastName, LocalDate birthDay, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
		this.nationalityId = nationalityId;
	}
	
	public Gamer() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

}
