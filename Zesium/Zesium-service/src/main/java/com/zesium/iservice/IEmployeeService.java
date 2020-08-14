package com.zesium.iservice;

import org.springframework.http.ResponseEntity;

import com.zesium.dto.LoginDto;
import com.zesium.dto.RegisterDto;
import com.zesium.model.Employee;

public interface IEmployeeService {

	public ResponseEntity<?> saveEmployeeRest(RegisterDto registerDto);

	public ResponseEntity<?> loginResponse(LoginDto loginDto);

	public Employee findEmail(String email);

}
