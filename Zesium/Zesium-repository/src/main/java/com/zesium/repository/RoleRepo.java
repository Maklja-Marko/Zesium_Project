package com.zesium.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zesium.model.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {

	public Role findByRole(String role);

}
