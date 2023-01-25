package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Ref;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/board")
public class BoardServlet extends HttpServlet {

	public BoardServlet() {
		System.out.println("creating " + this.getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doget in boarding");
		// super.doGet(req, resp);

	}

	@Override
	public void init() throws ServletException {
		System.out.println("Running init in boarding");
		// super.init();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running dopost in boarding");
		String ref = "posting";
		PrintWriter writer = resp.getWriter();
		writer.print(ref);
		// super.doPost(req, resp);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doput in boarding");
		String ref1 = "putting";
		PrintWriter write2 = resp.getWriter();
		write2.print(ref1);
		resp.setContentType("text/plain");
		// super.doPut(req, resp);
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running dodelete in boarding");
		String ref2 = "deleting";
		PrintWriter write3 = resp.getWriter();
		write3.print(ref2);
		resp.setContentType("text/plain");
		// super.doDelete(req, resp);
	}

	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running dohead in boarding");
		String ref3 = "heading";
		PrintWriter write5 = resp.getWriter();
		write5.print(ref3);

		resp.setContentType("text/plain");
		super.doHead(req, resp);
	}

	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doOptions in boarding");
		String ref4 = "options";
		PrintWriter write6 = resp.getWriter();
		write6.print(ref4);
		resp.setContentType(ref4);
		// super.doOptions(req, resp);
	}

	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doTrace in Boarding");
		String ref5 = "tracing";
		PrintWriter write7 = resp.getWriter();
		write7.print(ref5);
		resp.setContentType("text/plain");

		// super.doTrace(req, resp);
	}

}
