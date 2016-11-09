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

	public User validateUser(String studentID, String password) {
		User student = userDao.find("StudentID", studentID);
		if (student == null) {
			return null;
		} else if (!student.getPassword().equals(password)) {
			return null;
		}

		return student;
	}

	public void sentErrorMessage(String message, HttpServletRequest req) throws ServletException, IOException {
		req.setAttribute("message", message);
		// RequestDispatcher
		// dispater=req.getRequestDispatcher(resp.encodeURL("/error/error.jsp"));
		// dispater.forward(req,resp);
	}

	public void sentMessage(String message, HttpServletRequest req) throws ServletException, IOException {
		req.setAttribute("message", message);
		// RequestDispatcher
		// dispater=req.getRequestDispatcher(resp.encodeURL("/message/message.jsp"));
		// dispater.forward(req,resp);
	}

	public void forwardPage(String page, HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		RequestDispatcher dispater = req.getRequestDispatcher(resp.encodeURL(page));
		dispater.forward(req, resp);
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

	public String test() {
		System.out.println(" test");
		return "test";

	}

}
