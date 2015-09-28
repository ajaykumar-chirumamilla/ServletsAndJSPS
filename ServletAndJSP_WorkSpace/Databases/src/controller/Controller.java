package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import beans.User;
import database.Account;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DataSource ds;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		try {
			InitialContext init=new InitialContext();
			Context env=(Context)init.lookup("java:comp/env");
			ds=(DataSource) env.lookup("jdbc/webshop");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			throw new ServletException();
		}
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action=request.getParameter("action");
		if(action==null){
			request.getRequestDispatcher("/index.jsp").forward(request, response);;
		}
		else if(action.equals("login"))
		{

			request.setAttribute("email", "");
			request.setAttribute("password", "");
			request.setAttribute("validationmessage", "");

				request.getRequestDispatcher("/login.jsp").forward(request, response);			
		
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		String action=request.getParameter("action");
		if(action==null)
		{
			pw.println("First Unrecognized action");
			return;
		}
		Connection conn=null;
		
			try {
				conn=ds.getConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(action.equals("dologin"))
		{
			String email=request.getParameter("email");
			String password=request.getParameter("password");
			User user=new User(email,password);
			request.setAttribute("email", email);
			request.setAttribute("password", password);
			
			Account acc=new Account(conn);
			try {
				if(acc.login(email, password))
				{
					request.getRequestDispatcher("/loginsuccess.jsp").forward(request, response);
				}
				else
				{
					request.setAttribute("message", "Email Address or Password not recognised");
					request.getRequestDispatcher("/login.jsp").forward(request, response);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//request.setAttribute("message", "Email Address or Password not recognised");
			//request.getRequestDispatcher("/loginsuccess.jsp").forward(request, response);
		}
		else
		{
			pw.println("Second Unrecognized Action");
			return;
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}