package org.amitbrain.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServletTest
 */
@WebServlet(description = "Deploy Simple Servlet", urlPatterns = { "/SimpleServlet" })
public class SimpleServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Servlet tutorial");
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Hello in HTML </h1>");
	}

}
