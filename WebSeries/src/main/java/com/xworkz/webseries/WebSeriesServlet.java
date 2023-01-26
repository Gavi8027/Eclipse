package com.xworkz.webseries;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/get")
public class WebSeriesServlet extends HttpServlet {

	public WebSeriesServlet() {
		System.out.println("Creating...." + this.getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Running init in WebSeriesServlet");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet in WebSeriesServlet server");
		System.out.println(Thread.currentThread().getName());
		String webSeriesname = req.getParameter("webSeriesname");
		String language = req.getParameter("language");
		String episode = req.getParameter("episode");
		String ott = req.getParameter("ott");
		String budget = req.getParameter("budget");

		System.out.println(webSeriesname);
		System.out.println(language);
		System.out.println(episode);
		System.out.println(ott);
		System.out.println(budget);

		PrintWriter writer = resp.getWriter();
		writer.print("html");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<h2>");
		writer.print("span style='color:green;'>");
		writer.print("web series name" + webSeriesname + "is sent successfully");
		writer.print("web series language " + language + "is sent successfully");
		writer.print("web series episode " + episode + "is sent successfully");
		writer.print("web series ott " + ott + "is sent successfully");
		writer.print("web series budget" + budget + "is sent successfully");

	}

}
