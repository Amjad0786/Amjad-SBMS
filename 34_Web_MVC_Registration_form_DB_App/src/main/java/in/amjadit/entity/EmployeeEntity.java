package in.amjadit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="/EMPLOYEE_TBLS")
public class EmployeeEntity {

	@Id
	@GeneratedValue
	private Integer eid;
	private String name;
	private String email;
	private String gender;
	private String workingRole;
	private String timings;

	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCoures() {
		return workingRole;
	}
	public void setCoures(String coures) {
		this.workingRole = coures;
	}
	public String getTimings() {
		return timings;
	}
	public void setTimings(String timings) {
		this.timings = timings;
	}


	@Override
	public String toString() {
		return "EmployeeEntity [eid=" + eid + ", name=" + name + ", email=" + email + ", gender=" + gender + ", workingRole="
				+ workingRole + ", timings=" + timings + "]";
	}



}
