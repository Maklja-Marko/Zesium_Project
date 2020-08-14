package com.zesium.repository;

import org.springframework.stereotype.Component;

@Component
public class LoginQuery {

	public final String UsernameQuery = "select email as username, password, active from employee where email=?";

	public final String RoleQuery = "select e.email, r.role from employee e"
			+ " inner join user_role ur on(e.employee_id=ur.employee_id)"
			+ " inner join roles r on(ur.role_id=r.role_id) where e.email=?";

	public String getUsernamequery() {
		return UsernameQuery;
	}

	public String getRolequery() {
		return RoleQuery;
	}

}
