package in.amjadit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "school_dtls")
public class Students {

	@Id
	@Column(name = "s_id")

	private Integer id;

	@Column(name = "s_name")
	private String name;

	@Column(name = "s_rank")
	private Integer rank;

	@Column(name = "s_gender")
	private String gender;

	public Students() {

	}

	public Students(Integer id, String name, Integer rank, String gender) {
		this.id = id;
		this.name = name;
		this.rank = rank;
		this.gender = gender;
	}

	public Integer getid() {
		return id;
	}

	public void setid(Integer id) {
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
		return "Students [id=" + id + ", name=" + name + ", rank=" + rank + ", gender=" + gender + "]";
	}

}
