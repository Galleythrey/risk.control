package riskcontrol.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import riskcontrol.model.User;

public interface UserManageService {

	public User validateUser(String userid, String password);

	public void sentErrorMessage(String message, HttpServletRequest req) throws ServletException, IOException;

	public void sentMessage(String message, HttpServletRequest req) throws ServletException, IOException;

	public void forwardPage(String page, HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public String registerStudent(User user);

}
