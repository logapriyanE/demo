package Happy;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetUser")
public class GetUser extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//String Id=request.getParameter("EmpId");
		Emp ob=new Emp();
		PrintWriter out=response.getWriter();
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","loga1234");
		Statement pr=con.createStatement();
		ResultSet rs=pr.executeQuery("select * from emptable");
		ArrayList<Integer> li=new ArrayList<Integer>();
		ArrayList<String> na=new ArrayList<String>();
		ArrayList<Integer> sl=new ArrayList<Integer>();
		//out.println(rs.getString(2));
		while(rs.next()) {
			ob.setEmpId(rs.getInt(1));
			li.add(ob.getEmpId());
			ob.setName(rs.getString(2));
			na.add(ob.getName());
			ob.setSalary(rs.getInt(3));
			sl.add(ob.getSalary());
			out.println(rs.getRow());
			
			
		}
		
		
		out.println("EmpId= "+li);
		out.println("EmpName= "+na);
		out.println("EmpSalary= "+sl);
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		catch(SQLException e) {System.out.println(e);}
	}

}

class Emp{

	private Integer EmpId;
	private String name;
	private Integer salary;
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
