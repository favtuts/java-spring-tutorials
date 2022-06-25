package com.favtuts.common;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class App extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();	//sessionCreated() is executed
		session.setAttribute("url", "favtuts.com");
		session.invalidate();	//sessionDestroyed() is executed
		
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Spring Dependency Injection into Servlet Listenner</h1>");
        out.println("</body>");
        out.println("</html>");			
		
	}
}
