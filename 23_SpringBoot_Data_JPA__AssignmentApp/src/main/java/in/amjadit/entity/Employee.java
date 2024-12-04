package in.amjadit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_dtls")
public class Employee {

	@Id
	@Column(name ="Integer_id")
	private Integer id;
	
	@Column(name ="String_name")
	private String name;
	
	@Column(name ="Integer_rank")
	private Integer rank;
	
	@Column(name ="String_gender")
	private String gender;
	
	public Employee() {
		
	}

	public Employee(Integer id, String name, Integer rank, String gender) {
		this.id = id;
		this.name = name;
		this.rank = rank;
		this.gender = gender;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", rank=" + rank + ", gender=" + gender + "]";
	}

}
