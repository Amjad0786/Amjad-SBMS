package in.amjadit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stud_tbls")
public class Student {

	@Id
	@Column(name = "student_id")
	private Integer id;

	@Column(name = "student_name")
	private String name;

	@Column(name = "student_rank")
	private Integer rank;

	@Column(name = "student_gender")
	private String gender;

	public Student() {

	}

	public Student(Integer id, String name, Integer rank, String gender) {
		super();
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
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + ", gender=" + gender + "]";
	}

}
