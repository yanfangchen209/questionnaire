package questionnaire;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class QuestionnaireServlet
 */
public class QuestionnaireServlet extends HttpServlet {
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//String firstName = request.getParameter("firstName" + "lastName");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String name = firstName + "  " + lastName;
		
	     // Set the attribute in the request
		request.setAttribute("customerName", name);
		
		String message = String.format("Dear %s, thanks for submission!", name);
		request.setAttribute("confirmMessage", message);
        // Forward the request to the JSP page
		RequestDispatcher rd = request.getRequestDispatcher("output.jsp");
		rd.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
