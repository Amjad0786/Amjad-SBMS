    package in.amjadit.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMP_Tbls")
public class Employee {

	@Id
	@Column(name = "Integer_Id")
	private Integer id;

	@Column(name = "String_name")
	private String name;

	@Column(name = "Integer_rank")
	private Integer rank;

	@Column(name = "String_gender")
	private String gender;

	@CreationTimestamp
	@Column(name = "CREATED_DATE", updatable = false)
	private LocalDate createDate;

	@UpdateTimestamp
	@Column(name = "UPDATE_DATE", insertable = false)
	private LocalTime updateDate;
	
	@Column(name ="str_activeSw")
	private String activeSW;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String name, Integer rank, String gender, String activeSW) {
		super();
		this.id = id;
		this.name = name;
		this.rank = rank;
		this.gender = gender;
		this.activeSW = activeSW;
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

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public LocalTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalTime updateDate) {
		this.updateDate = updateDate;
	}

	public String getActiveSW() {
		return activeSW;
	}

	public void setActiveSW(String activeSW) {
		this.activeSW = activeSW;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", rank=" + rank + ", gender=" + gender + ", createDate="
				+ createDate + ", updateDate=" + updateDate + ", activeSW=" + activeSW + "]";
	}

	
	

}
