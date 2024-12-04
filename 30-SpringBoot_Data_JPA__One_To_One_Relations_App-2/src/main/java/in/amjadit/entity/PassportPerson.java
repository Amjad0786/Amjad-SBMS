package in.amjadit.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class PassportPerson {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer passId;
	private String passNum;
	private LocalDate issueDate;
	private LocalDate expiryDate;
	
	
	@OneToOne()
	@JoinColumn(name="person_id")
	private Person person;


	public Integer getPassId() {
		return passId;
	}


	public void setPassId(Integer passId) {
		this.passId = passId;
	}


	public String getPassNum() {
		return passNum;
	}


	public void setPassNum(String passNum) {
		this.passNum = passNum;
	}


	public LocalDate getIssueDate() {
		return issueDate;
	}


	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}


	public LocalDate getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}


	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	

}
