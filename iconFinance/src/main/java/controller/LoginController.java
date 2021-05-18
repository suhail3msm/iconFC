package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.LoginDAO;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String username = request.getParameter("username");
	        String password = request.getParameter("password");

	        LoginDAO logDAO  = new LoginDAO();
	        
	        String authenticated = logDAO.log(username, password);

	        if (authenticated.equals("true")){
	            PrintWriter out = response.getWriter();

	            out.println("<html><body>");
	            out.println("<h3 style='color: green;'>Logged in successfully</h3>");
	            out.println("</body></html>");
	        }else if(authenticated.equals("false")) {
	            response.sendRedirect(request.getContextPath() + "/login.jsp?error=error");
	        }
	}

}
