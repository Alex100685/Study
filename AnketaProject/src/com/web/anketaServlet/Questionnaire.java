package com.web.anketaServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Questionnaire extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public Questionnaire() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<h1> Insert Your Data into Anketa</h1>");
		pw.println("<form action=\"/forms\" method=\"POST\">");
		pw.println("First name: <input type=\"text\" name=\"firstname\"><br>");
		pw.println("Last name: <input type=\"text\" name=\"lastname\"><br>");
		pw.println("<button>Save</button>");
		pw.println("</form>");
		
		
		
		
	}



}
