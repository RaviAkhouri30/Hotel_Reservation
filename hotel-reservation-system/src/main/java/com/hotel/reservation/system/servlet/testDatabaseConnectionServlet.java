package com.hotel.reservation.system.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class testDatabaseConnectionServlet
 */
@WebServlet("/testDB")
public class testDatabaseConnectionServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String driverClass = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/hotel_reservation_system?useSSL=false";
		String username = "wipro-bed-1";
		String password = "wipro-bed-1";
		try {
			PrintWriter out = response.getWriter();
			out.println("Connecting to database: " + url);
			Class.forName(driverClass);
			Connection connection = DriverManager.getConnection(url, username, password);
			out.println("SUCCESS!");
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
	}

}
