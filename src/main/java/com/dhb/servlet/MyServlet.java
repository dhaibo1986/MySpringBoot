package com.dhb.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "myServlet",urlPatterns = "/srv")
public class MyServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("servlet doGet method called...");
		resp.getWriter().println("doGet method called url is ["+req.getRequestURL()+"] time is ["+System.currentTimeMillis()+"]");
		resp.getWriter().flush();
		resp.getWriter().close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("servlet doPost method called...");
		resp.getWriter().println("doPost method called url is ["+req.getRequestURL()+"] time is ["+System.currentTimeMillis()+"]");
		resp.getWriter().flush();
		resp.getWriter().close();
	}
}
