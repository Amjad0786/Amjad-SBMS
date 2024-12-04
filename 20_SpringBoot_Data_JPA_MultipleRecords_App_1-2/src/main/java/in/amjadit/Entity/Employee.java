package in.amjadit.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employeeinfo")
public class Employee {

	@Id
	@Column(name = "E_id")
	private Integer id;

	@Column(name = "E_name")
	private String name;

	@Column(name = "E_rank")
	private Long rank;

	@Column(name = "E_gender")
	private String gender;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(Integer id, String name, Long rank, String gender) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.gender = gender;
    }

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", rank=" + rank + ", gender=" + gender + "]";
	}

	// Getters and Setters
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

	public Long getRank() {
		return rank;
	}

	public void setRank(Long rank) {
		this.rank = rank;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
