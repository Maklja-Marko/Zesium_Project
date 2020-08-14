package com.zesium.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.zesium.model.Employee;

@Component
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	public Employee findByEmail(String email);

	public boolean existsByEmail(String email);

	public boolean existsByPhone(String phone);

}
