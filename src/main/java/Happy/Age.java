package Happy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Age")
public class Age extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException,NumberFormatException {

		String name=request.getParameter("name");
	    int pass=Integer.parseInt(request.getParameter("age"))  ;
		PrintWriter out=response.getWriter();
		if(name.equals("loga")&&pass>=18||pass<=50) {
			out.println("wlecome");
		}
		else {
			response.sendRedirect("age.jsp");
		}
	}


}
