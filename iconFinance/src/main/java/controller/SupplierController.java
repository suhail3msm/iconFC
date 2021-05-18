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
import model.Supplier;
import model.SupplierDAO;

/**
 * Servlet implementation class SupplierController
 */
@WebServlet("/SupplierController")
public class SupplierController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupplierController() {
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

	
		
		
		PrintWriter out = response.getWriter();
		String Client_Code = request.getParameter("Client_Code"); 
		String NAME = request.getParameter("name");          
		       
		String CITY = request.getParameter("city");            
		String STATE = request.getParameter("state");          
		String PROVINCE = request.getParameter("province");        
		String COUNTRY = request.getParameter("country");         
		String EMAIL = request.getParameter("email");           
		long MOBILE = Long.parseLong(request.getParameter("mobile")); 
		String ADDRESS = request.getParameter("address"); 
		String LOAN_ACC_NUM = request.getParameter("credit");    
    
		String supplier_lmt = request.getParameter("supplier_lmt");  
		String invoice_payment = request.getParameter("invoice_payment");
	
		
		Supplier supplier = new Supplier(Client_Code,NAME,ADDRESS,CITY,STATE,PROVINCE,COUNTRY,EMAIL,MOBILE,LOAN_ACC_NUM,supplier_lmt,invoice_payment);
		SupplierDAO dao = new SupplierDAO();
		String result = dao.insertDetails(supplier);
		if(result == null) {
			response.sendRedirect(request.getContextPath() + "/supplier_Reg.jsp?error=error");
		}else {

			response.sendRedirect(request.getContextPath() + "/supplier_Reg.jsp?succ=succ");
		}
	}

}
