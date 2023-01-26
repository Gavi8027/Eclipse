package com.xworkz.king;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/king")
public class KingServlet extends HttpServlet {

	public KingServlet() {
		System.out.println("Creating.." + this.getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Running init in KingServlet");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doget in KingServlet");
		System.out.println(Thread.currentThread().getName());
		String kingName = req.getParameter("kingName");
		String region = req.getParameter("region");
		String numberOfQueen = req.getParameter("numberOfQueen");
		String dob = req.getParameter("dob");
		String dod = req.getParameter("dod");

		System.out.println(kingName);
		System.out.println(region);
		System.out.println(numberOfQueen);
		System.out.println(dob);
		System.out.println(dod);

		PrintWriter writer = resp.getWriter();
		writer.print("html");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("span style='color:green;'>");
		writer.print("king name " + kingName + "is sent sucessfully");
		writer.print("king region " + region + "is sent sucessfully");
		writer.print("king numberOfQueen " + numberOfQueen + "is sent sucessfully");
		writer.print("king dob " + dob + "is sent sucessfully");
		writer.print("king dod " + dod + "is sent sucessfully");

	}

}
