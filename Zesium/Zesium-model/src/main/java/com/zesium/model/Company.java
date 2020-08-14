package com.zesium.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "company")
public class Company {

	@Id
	@Column(name = "company_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long company_id;

	@Size(min = 2, max = 30, message = "{company.size}")
	@NotBlank(message = "{company.mandatory}")
	@Column(name = "company_name")
	private String companyName;

	@Size(min = 1, max = 25, message = "{number.size}")
	@NotBlank(message = "{number.mandatory}")
	@Pattern(regexp = "^(0|[1-9][0-9]*)$", message = "{number.only}")
	@Column(name = "Number")
	private String number;

	@Size(min = 2, max = 35, message = "{adress.size}")
	@NotBlank(message = "{adress.mandatory}")
	@Column(name = "Adress")
	private String adress;

	public Company() {

	}

	public Company(
			@Size(min = 2, max = 30, message = "{company.size}") @NotBlank(message = "{company.mandatory}") String companyName,
			@Size(min = 1, max = 25, message = "{number.size}") @NotBlank(message = "{number.mandatory}") @Pattern(regexp = "^(0|[1-9][0-9]*)$", message = "{number.only}") String number,
			@Size(min = 2, max = 35, message = "{adress.size}") @NotBlank(message = "{adress.mandatory}") String adress) {
		super();
		this.companyName = companyName;
		this.number = number;
		this.adress = adress;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String CompanyName) {
		this.companyName = CompanyName;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public long getId() {
		return company_id;
	}

}
