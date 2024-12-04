package in.amjadit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customerinfo")
public class Customer {

	@Id
	@Column(name = "customer_id")
	private Integer Id;
	
	@Column(name = "customer_name")
	private String Name;
	
	@Column(name = "customer_rank")
	private Long Rank;
	
	@Column(name = "customer_gender")
	private String Gender;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		this.Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public Long getRank() {
		return Rank;
	}

	public void setRank(long rank) {
		this.Rank = rank;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		this.Gender = gender;
	}

	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", Name=" + Name + ", Rank=" + Rank + ", Gender=" + Gender + "]";
	}

	

}
