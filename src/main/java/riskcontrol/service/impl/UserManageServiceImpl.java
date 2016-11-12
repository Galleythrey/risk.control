package riskcontrol.service.impl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import riskcontrol.dao.UserDao;
import riskcontrol.model.User;
import riskcontrol.service.UserManageService;

/**
 * Session Bean implementation class UserManageServiceBean
 */
@Service
public class UserManageServiceImpl implements UserManageService {

	/**
	 * Default constructor.
	 */
	@Autowired
	private UserDao userDao;

	public boolean validateUser(String username, String password) {
		if (userDao.find(username) == null)
			return false;
		String pass = userDao.find(username).getPassword();
		return pass.equals(password);
	}

	public String registerStudent(User user) {
		String message = null;
		/*
		 * if(validateUser(user.getUserid(), user.getPasswordOne())!=null ){
		 * message="username exist"; return message; } /* else
		 * if(validateUpdateUser(user, message)!=null){ message=
		 * "All the content must be filled!"; return message; }
		 */
		// else{
		System.out.println(" Ready to save user");
		if (userDao == null)
			System.out.println(" studentDao is null");
		userDao.save(user);

		return message;
	}

}
