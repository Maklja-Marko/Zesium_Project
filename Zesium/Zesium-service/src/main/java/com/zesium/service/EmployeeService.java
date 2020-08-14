package com.zesium.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.zesium.dto.LoginDto;
import com.zesium.dto.RegisterDto;
import com.zesium.iservice.IEmployeeService;
import com.zesium.model.Company;
import com.zesium.model.Employee;
import com.zesium.model.Role;
import com.zesium.repository.CompanyRepo;
import com.zesium.repository.EmployeeRepo;
import com.zesium.repository.LoginQuery;
import com.zesium.repository.RoleRepo;

@Service
public class EmployeeService implements IEmployeeService {

	Logger logger = Logger.getLogger(EmployeeService.class.getName());

	@Autowired
	EmployeeRepo employeeRepo;

	@Autowired
	CompanyRepo companyRepo;

	@Autowired
	RoleRepo roleRepo;

	@Autowired
	LoginQuery loginQuery;

	@Autowired
	PasswordEncoder passwordEncoder;

	public Company findCompany(String companyName) {
		return companyRepo.findByCompanyName(companyName);
	}

	private String encodePassword(String pass) {
		return passwordEncoder.encode(pass);
	}

	public Role findRole() {
		return roleRepo.findByRole("Employee");
	}

	public Employee findEmail(String email) {
		return employeeRepo.findByEmail(email);
	}

	public boolean checkPhone(String phone) {
		return employeeRepo.existsByPhone(phone);
	}

	public boolean checkEmail(String email) {
		return employeeRepo.existsByEmail(email);
	}

	public Employee checkCompany(RegisterDto registerDto) {
		Company comp = findCompany(registerDto.getCompany());
		String pass = encodePassword(registerDto.getPassword());

		if (comp != null) {
			Employee emp = new Employee(registerDto.getName(), pass, registerDto.getEmail(), registerDto.getPhone(),
					comp, new ArrayList<Role>(Arrays.asList(findRole())), true);
			return emp;
		} else {
			Company company = companyRepo
					.save(new Company(registerDto.getCompany(), registerDto.getOrgNumber(), registerDto.getAddress()));
			Employee emp = new Employee(registerDto.getName(), pass, registerDto.getEmail(), registerDto.getPhone(),
					company, new ArrayList<Role>(Arrays.asList(findRole())), true);

			return emp;
		}
	}

	// REST

	public boolean checkEmployee(LoginDto loginDto) {
		Employee emp = findEmail(loginDto.getEmail());
		if (emp != null && passwordEncoder.matches(loginDto.getPassword(), emp.getPassword())) {
			return true;
		}
		return false;
	}

	@Override
	public ResponseEntity<?> loginResponse(LoginDto loginDto) {
		Boolean aba = checkEmployee(loginDto);
		if (aba) {
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Wrong credentials");
	}

	@Override
	public ResponseEntity<?> saveEmployeeRest(RegisterDto registerDto) {
		if (checkPhone(registerDto.getPhone())) {
			return new ResponseEntity<>("Phone number allready in use", HttpStatus.FORBIDDEN);
		} else if (checkEmail(registerDto.getEmail())) {
			return new ResponseEntity<>("Email allready exists", HttpStatus.FORBIDDEN);
		}
		employeeRepo.save(checkCompany(registerDto));
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	public String getUsernameQuery() {
		return loginQuery.getUsernamequery();
	}

	public String getRoleQuery() {
		return loginQuery.getRolequery();
	}

}
