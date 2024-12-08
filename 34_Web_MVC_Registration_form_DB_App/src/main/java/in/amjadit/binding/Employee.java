package in.amjadit.binding;

import java.util.Arrays;

import jakarta.persistence.Id;

public class Employee {

	@Id
	private Integer eid;
	private String name;
	private String email;
	private String gender;
	private String workingRole;
	private String [] timings;
	private Long phone;
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
	public String getWorkingRole() {
		return workingRole;
	}
	public void setWorkingRole(String workingRole) {
		this.workingRole = workingRole;
	}
	public String[] getTimings() {
		return timings;
	}
	public void setTimings(String[] timings) {
		this.timings = timings;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", email=" + email + ", gender=" + gender + ", workingRole="
				+ workingRole + ", timings=" + Arrays.toString(timings) + ", phone=" + phone + "]";
	}


}
