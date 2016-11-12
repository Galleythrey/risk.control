package riskcontrol.action;

import java.io.IOException;
import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import riskcontrol.model.User;
import riskcontrol.service.UserManageService;


@Controller
public class RegisterAction extends BaseAction 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private UserManageService userService;  

	private User user; 
	
	@SuppressWarnings("unchecked")
	public String execute() 
					throws ServletException,IOException
	{
		if (userService==null )System.out.println("Student service null");
	//	String test=StudentService.test();
		
		String message="";
		user = new User();
		if (request.getParameter("password").equals(request.getParameter("passwordTwo"))) {
			user.setUserName(request.getParameter("username"));
			user.setPassword(request.getParameter("password"));
		}else{
			message+="Password not match!<br>";
			request.setAttribute("mess",message);
			//StudentService.sentMessage(message,request);
			return INPUT;
		}
		System.out.println(user.getUserName()+" Student execute");		
		
		userService.registerStudent(user);
	/*	if((message=StudentService.registerStudent(Student))!= null){
			StudentService.sentErrorMessage(message, request);
			return INPUT;
		}
		else{*/
			session.put("user",request.getParameter("username"));
			return SUCCESS;
		//}
		
    }

	public String login() {
		if (userService == null)
			System.out.println("user service null");
		if (userService.validateUser(request.getParameter("username"), request.getParameter("password"))) {
			session.put("user", request.getParameter("username"));
			return SUCCESS;
		} else {
			return INPUT;
		}

	}

	public String logout() {
		session.clear();
		return SUCCESS;
	}

}
