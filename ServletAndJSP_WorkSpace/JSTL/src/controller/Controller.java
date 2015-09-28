package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.org.apache.xalan.internal.xsltc.dom.ArrayNodeListIterator;

import beans.User;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		User user1 = new User("ajay1", 1);
		User user2 = new User("ajay2", 2);
		User user3 = new User("ajay3", 3);
		//request Scope
		request.setAttribute("user1", user1);
		//Session Scope
		HttpSession session = request.getSession();
		session.setAttribute("user2", user2);
		//Application Scope
		ServletContext context = request.getServletContext();
		context.setAttribute("user3", user3);
		
		Map<String, String> map=new HashMap<>();
		map.put("fruit", "apple");
		
		request.setAttribute("map1", map);
		
		
		request.setAttribute("link", "<a href='http://www.google.com'>Click Here</a>");
		
		List<User> userBeans=new ArrayList<>();
		userBeans.add(new User("fox", 1));
		userBeans.add(new User("bear", 2));
		userBeans.add(new User("cat", 3));
		
		session.setAttribute("list1",userBeans);
		
		request.getRequestDispatcher("/receiveObjects.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
