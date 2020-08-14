package com.zesium.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class RegisterDto {

	@Size(min = 5, max = 25, message = "{name.size}")
	@NotBlank(message = "{name.mandatory}")
	private String name;

	@Size(min = 5, max = 30, message = "{email.size}")
	@Email(message = "{email.format}")
	@NotBlank(message = "{email.mandatory}")
	private String email;

	@Size(min = 5, max = 20, message = "{password.size}")
	@NotBlank(message = "{password.mandatory}")
	private String password;

	@NotBlank(message = "{phone.mandatory}")
	@Pattern(regexp = "[0-9]{3}-[0-9]{3}-[0-9]{4}", message = "{phone.format}")
	private String phone;

	@Size(min = 2, max = 30, message = "{company.size}")
	@NotBlank(message = "{company.mandatory}")
	private String company;

	@Size(min = 1, max = 25, message = "{number.size}")
	@NotBlank(message = "{number.mandatory}")
	@Pattern(regexp = "^(0|[1-9][0-9]*)$", message = "{number.only}")
	private String orgNumber;

	@Size(min = 2, max = 25, message = "{adress.size}")
	@NotBlank(message = "{adress.mandatory}")
	private String address;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getOrgNumber() {
		return orgNumber;
	}

	public void setOrgNumber(String orgNumber) {
		this.orgNumber = orgNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
