package com.zesium.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.zesium.model.Company;

@Component
@Repository
public interface CompanyRepo extends JpaRepository<Company, Long> {

	public Company findByCompanyName(String companyName);

}
