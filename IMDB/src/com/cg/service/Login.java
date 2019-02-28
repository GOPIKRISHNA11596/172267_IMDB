package com.cg.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		PRINTWRITER W = RESPONSE.GETWRITER();
		response.setContentType("text/html");
		String username = request.getParameter("uname");
		String password = request.getParameter("pwd");
		
		 LoginDAO res = new  LoginDAO ();
		 
			try {
				if((res.validate(username, password)))
						response.sendRedirect("SAHOO.html");	
					else
						response.sendRedirect("Login.html");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Login successfull");
		
       
	}

}
