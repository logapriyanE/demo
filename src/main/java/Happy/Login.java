package Happy;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String pass=request.getParameter("password");
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/log","root","loga1234");
		PreparedStatement pr=con.prepareStatement("select * from logtable where name='"+name+"' and password='"+pass+"'");
		ResultSet rs=pr.executeQuery();
		if(rs.next()) {
			response.sendRedirect("Home.jsp");
		}
		else {
			response.sendRedirect("Login.jsp");
		}
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		catch(SQLException e) {System.out.println(e);}
	}


}
