package study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/add")
public class AddTask extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	response.setContentType("text/html");
	PrintWriter pw = response.getWriter();
	
	String date = request.getParameter("date");
	String task = request.getParameter("task");
	
	DAO dao = new DAO();
	dao.addTaskPlan(date, task);
	
	pw.println("<center><h1>Task Added Successfully</h1></center>");
	
	RequestDispatcher rd = request.getRequestDispatcher("/taskScheduler.jsp");
	rd.include(request, response);
	}

}
