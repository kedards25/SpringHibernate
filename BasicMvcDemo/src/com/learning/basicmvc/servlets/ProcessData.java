package com.learning.basicmvc.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learning.basicmvc.models.UserModel;

/**
 * Servlet implementation class ProcessData
 */
@WebServlet("/ProcessData")
public class ProcessData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("username");
		String userPass=request.getParameter("userpass");
		String userMail=request.getParameter("usermail");
		String userAddr=request.getParameter("useraddr");
		String userContact=request.getParameter("usercontact");
		
		UserModel user=new UserModel(userName, userPass, userMail, userAddr, userContact);
		
		RequestDispatcher dispatcher=
				request.getRequestDispatcher("ShowUser");
		request.setAttribute("usrObj", user);

		
		//dispatcher is having ref of ShowUser servlet
		//and forward method of dispatcher is accepting request as its param
		//request has attributes as all the received values
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
