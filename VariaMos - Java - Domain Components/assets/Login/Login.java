package controllers;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String logout = request.getParameter("logout");
		HttpSession session = request.getSession();
		
		if(logout != null && logout.equals("1")){
			session.removeAttribute("admin");
			response.sendRedirect("Home");			
		}else{
			request.setAttribute("title", "Login");
			RequestDispatcher view = request.getRequestDispatcher("login_form.jsp");
			view.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String code = request.getParameter("code");
		
		if(code != null && code.equals("345")){
			session.setAttribute("admin", "1");
			response.sendRedirect("Home");	
		}else{
			response.sendRedirect("Login");	
		}
	}

}
