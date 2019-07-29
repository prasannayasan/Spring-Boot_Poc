package com.rgl.demoPoc.domain;

//import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
//	private static final long serialVersionUID = -298498818378061538L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name="emp_id")
	public Long emp_id;
	@Column(name="first_name")
	public String first_name;
	@Column(name="last_name")
	public String last_name;
	@Column(name="date_of_birth")
	public String date_of_birth;
	@Column(name="position")
	public String position;
	@Column(name="department")
	public String department;
	@Column(name="experience")
	public int experience;
	@Column(name="location")
	public String location; 	
	@Column(name="joining_date")
	public String joining_date;
	@GeneratedValue
	@Column(name="last_updated")
	public String last_updated;
	
	
	public Long getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Long emp_id) {
		this.emp_id = emp_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getJoining_date() {
		return joining_date;
	}
	public void setJoining_date(String joining_date) {
		this.joining_date = joining_date;
	}
	public String getLast_updated() {
		return last_updated;
	}
	public void setLast_updated(String last_updated) {
		this.last_updated = last_updated;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date_of_birth == null) ? 0 : date_of_birth.hashCode());
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((emp_id == null) ? 0 : emp_id.hashCode());
		result = prime * result + experience;
		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + ((joining_date == null) ? 0 : joining_date.hashCode());
		result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
		result = prime * result + ((last_updated == null) ? 0 : last_updated.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (date_of_birth == null) {
			if (other.date_of_birth != null)
				return false;
		} else if (!date_of_birth.equals(other.date_of_birth))
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (emp_id == null) {
			if (other.emp_id != null)
				return false;
		} else if (!emp_id.equals(other.emp_id))
			return false;
		if (experience != other.experience)
			return false;
		if (first_name == null) {
			if (other.first_name != null)
				return false;
		} else if (!first_name.equals(other.first_name))
			return false;
		if (joining_date == null) {
			if (other.joining_date != null)
				return false;
		} else if (!joining_date.equals(other.joining_date))
			return false;
		if (last_name == null) {
			if (other.last_name != null)
				return false;
		} else if (!last_name.equals(other.last_name))
			return false;
		if (last_updated == null) {
			if (other.last_updated != null)
				return false;
		} else if (!last_updated.equals(other.last_updated))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		return true;
	}
}
