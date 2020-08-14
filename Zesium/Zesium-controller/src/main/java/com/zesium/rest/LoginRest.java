package com.zesium.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zesium.dto.LoginDto;
import com.zesium.iservice.IEmployeeService;

@RestController
public class LoginRest {

	@Autowired
	IEmployeeService employeeService;

	@RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
	public ResponseEntity<?> Login(@RequestBody LoginDto loginDto) {
		return employeeService.loginResponse(loginDto);

	}

}
