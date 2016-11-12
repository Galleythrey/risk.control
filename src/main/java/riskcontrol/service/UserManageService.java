package riskcontrol.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import riskcontrol.model.User;

public interface UserManageService {

	public boolean validateUser(String username, String password);

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public String registerStudent(User user);

}
