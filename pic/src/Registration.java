

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class Registration extends HttpServlet {
	

	private String loginName;
	  private String firstName;
	  private String lastName;
	  private String password;
   
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		loginName=req.getParameter("uname");
		firstName=req.getParameter("fname");
		lastName=req.getParameter("lname");
		password=req.getParameter("pass");
		
			System.out.println(loginName+firstName+lastName+password);
	
		//	UserRegistration u=new UserRegistration();
	
			//String result=u.register(loginName, firstName, lastName, password);
	//if(result.equalsIgnoreCase("success")){
		res.getWriter().print("Successfully registered");
		
	//}
	
	}

}
