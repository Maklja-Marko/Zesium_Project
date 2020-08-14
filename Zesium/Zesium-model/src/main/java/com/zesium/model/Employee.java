package com.zesium.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@Column(name = "employee_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Size(min = 5, max = 25, message = "{name.size}")
	@NotBlank(message = "{name.mandatory}")
	@Column(name = "employeeName")
	private String employeeName;

	@Size(min = 5, max = 100, message = "{password.size}")
	@NotBlank(message = "{password.mandatory}")
	@Column(name = "Password")
	private String password;

	@Size(min = 5, max = 30, message = "{email.size}")
	@Email(message = "{email.format}")
	@NotBlank(message = "{email.mandatory}")
	@Column(name = "Email", unique = true)
	private String email;

	// [0-9]{3}-[0-9]{3}-[0-9]{4}
	//
	@NotBlank(message = "{phone.mandatory}")
	@Pattern(regexp = "[0-9]{3}-[0-9]{3}-[0-9]{4}", message = "{phone.format}")
	@Column(name = "Phone")
	private String phone;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "company_fk", nullable = false, updatable = true, insertable = true)
	private Company company_fk;

	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "user_role", joinColumns = {
			@JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "employee_id") }, inverseJoinColumns = {
					@JoinColumn(name = "ROLE_ID", referencedColumnName = "role_id") })
	private List<Role> roles;

	@Column(name = "active")
	private Boolean active;

	public Employee() {

	}

	public Employee(String email, String password) {
		this.password = password;
		this.email = email;
	}

	public Employee(
			@Size(min = 5, max = 25, message = "{name.size}") @NotBlank(message = "{name.mandatory}") String employeeName,
			@Size(min = 5, max = 100, message = "{password.size}") @NotBlank(message = "{password.mandatory}") String password,
			@Size(min = 5, max = 30, message = "{email.size}") @Email(message = "{email.format}") @NotBlank(message = "{email.mandatory}") String email,
			@NotBlank(message = "{phone.mandatory}") @Pattern(regexp = "[0-9]{3}-[0-9]{3}-[0-9]{4}", message = "{phone.format}") String phone,
			Company company_fk, List<Role> roles, Boolean active) {
		super();
		this.employeeName = employeeName;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.company_fk = company_fk;
		this.roles = roles;
		this.active = active;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public long getId() {
		return id;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}
