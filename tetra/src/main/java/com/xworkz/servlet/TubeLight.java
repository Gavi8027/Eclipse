package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/call")
public class TubeLight extends HttpServlet {

	public TubeLight() {
		System.out.println("creating..."+this.getClass().getSimpleName());

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Creating"+this.getClass().getSimpleName());
		super.doGet(req, resp);
	}
}
