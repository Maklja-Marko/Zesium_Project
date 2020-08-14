package com.zesium.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.zesium.iservice.IEmployeeService;
import com.zesium.model.Employee;

@Service
public class UserService implements UserDetailsService {

	IEmployeeService employeeService;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Employee employee = employeeService.findEmail(email);
		System.out.println("7777777");
		if (employee == null) {
			throw new UsernameNotFoundException(email);
		}
		return new User(employee.getEmail(), employee.getPassword(), new ArrayList<>());
	}

}
