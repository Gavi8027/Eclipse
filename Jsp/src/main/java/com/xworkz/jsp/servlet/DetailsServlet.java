package com.xworkz.jsp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/teach")
public class DetailsServlet extends HttpServlet {

	public DetailsServlet() {
		System.out.println("Running DetailsServlet in no arg constractor");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running dopost in Servlet");
		
		String ref1=req.getParameter("fname");
		String ref2=req.getParameter("lname");
		String ref3=req.getParameter("gender");
		String ref4=req.getParameter("address");
		String ref5=req.getParameter("reason");

        System.out.println(ref1);
        System.out.println(ref2);
        System.out.println(ref3);
        System.out.println(ref4);
        System.out.println(ref5);
        
        RequestDispatcher request= req.getRequestDispatcher("Display.jsp");
        req.setAttribute("fname",ref1);
        req.setAttribute("lname",ref2);
        req.setAttribute("gender",ref3);
        req.setAttribute("address",ref4);
        req.setAttribute("reason",ref5);

        
        request.forward(req, resp);


	}
	
	

}
