package java2026;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class Addition extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		 long num1 = Long.parseLong(request.getParameter("number1"));
		 long num2 = Long.parseLong(request.getParameter("number2"));
		 
		 PrintWriter out = response.getWriter();
		 
		 out.println("Addition of Two Numbers is " + (num1+num2));

	}

}
