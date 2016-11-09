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
	private UserManageService UserService;  

	private User user; 
	
	@SuppressWarnings("unchecked")
	public String execute() 
					throws ServletException,IOException
	{
		if (UserService==null )System.out.println("Student service null");
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
		
		UserService.registerStudent(user);
	/*	if((message=StudentService.registerStudent(Student))!= null){
			StudentService.sentErrorMessage(message, request);
			return INPUT;
		}
		else{*/
			session.put("student", user);
			return SUCCESS;
		//}
		
    }

/*	public void setStudentService(StudentManageService StudentService) {
		this.StudentService = StudentService;
		if (StudentService==null )System.out.println("Student service null");
		}
		public StudentManageService getStudentService() {
		return StudentService;
		}*/

	
	public void setStudent(User Student) {
		this.user = Student;
		System.out.println(Student.getUserName()+"Student");
	}

	public User getStudent() {
		if (user==null) System.out.println("Student null\n");
		return user;
	}

}
