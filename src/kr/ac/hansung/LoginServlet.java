package kr.ac.hansung;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// read form data 폼데이터 읽어오기
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		// Process : access to database, perform business logic
		
		// Build HTML code
		PrintWriter out = response.getWriter();
		
		String htmlResponse="<html>";
		htmlResponse += "<h2> Yousr username is " + username + "<br/>";
		htmlResponse += "<h2> Your password is " + password + "<br/>";
		 
		
		out.println(htmlResponse);
		
	}

}
