package com.zesium.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zesium.dto.RegisterDto;
import com.zesium.iservice.IEmployeeService;

@RestController
public class SignupRest {

	@Autowired
	IEmployeeService employeeService;

	@RequestMapping(value = "/signUpCheck", method = RequestMethod.POST)
	public ResponseEntity<?> Signup(@RequestBody RegisterDto registerDto) {
		System.out.println("123456");
		return employeeService.saveEmployeeRest(registerDto);

	}

}
