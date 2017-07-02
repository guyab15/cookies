package max.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyServlet() {
		super();
	}

	/*
	 * public void doGet(HttpServletRequest request, HttpServletResponse
	 * response) throws IOException {
	 * 
	 * response.setContentType("text/html"); PrintWriter pw =
	 * response.getWriter();
	 * 
	 * String firstName = request.getParameter("first_name"); String lastName =
	 * request.getParameter("last_name");
	 * 
	 * Cookie cookieFirstName = new Cookie("firstName", firstName); Cookie
	 * cookieLastName = new Cookie("lastName", lastName);
	 * 
	 * cookieFirstName.setMaxAge(60 * 60); cookieLastName.setMaxAge(60 * 60);
	 * 
	 * response.addCookie(cookieFirstName); response.addCookie(cookieLastName);
	 * 
	 * pw.println("Cookies created with name: " + firstName); pw.println(
	 * "Cookies created with name: " + lastName); }
	 */

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String firstName = request.getParameter("first_name");
		String lastName = request.getParameter("last_name");
		
		Cookie cookie = new Cookie(firstName, lastName);
		
		response.addCookie(cookie);
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.include(request, response);
	}

}
