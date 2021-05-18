package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Client;
import model.ClientDAO;

/**
 * Servlet implementation class clientController
 */
@WebServlet("/clientController")
public class clientController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public clientController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String NAME = request.getParameter("name");          
		String ADDRESS = request.getParameter("address");        
		String CITY = request.getParameter("city");            
		String STATE = request.getParameter("state");          
		String PROVINCE = request.getParameter("province");        
		String COUNTRY = request.getParameter("country");         
		String EMAIL = request.getParameter("email");           
		long MOBILE = Long.parseLong(request.getParameter("mobile"));          
		String LOAN_ACC_NUM = request.getParameter("credit");    
		String BANK_CODE = "none";       
		String CLIENT_LIMIT = request.getParameter("client_limit");  
		String VALID_FROM = request.getParameter("fdate");
		String VALID_TO = request.getParameter("tdate");    
		String RATE_OF_INTEREST = request.getParameter("rate_of_interest");
		String CREDIT_PERIOD = request.getParameter("credit_period");
		
		Client client = new Client(NAME,ADDRESS,CITY,STATE,PROVINCE,COUNTRY,EMAIL,MOBILE,LOAN_ACC_NUM,BANK_CODE,CLIENT_LIMIT,VALID_FROM,VALID_TO,RATE_OF_INTEREST,CREDIT_PERIOD);
		ClientDAO dao = new ClientDAO();
		String resuld = dao.insertDetails(client);
		if(resuld == null) {
			response.sendRedirect(request.getContextPath() + "client_Reg.jsp?error=error");
		}else {

            out.println("<html><body>");
            out.println("<h3 style='color: green;'>Successfully Registered</h3>");
            out.println("</body></html>");
		}
	}

}
