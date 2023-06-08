package Happy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Mark")
public class Mark extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException,NumberFormatException {
		Student ob=new Student();
		PrintWriter out=response.getWriter();
		ob.setTamil(Integer.parseInt( request.getParameter("T")));
		ob.setEnglish(Integer.parseInt( request.getParameter("E")));
		ob.setMaths(Integer.parseInt( request.getParameter("M")));
		ob.setScience(Integer.parseInt( request.getParameter("S")));
		ob.setSocial(Integer.parseInt( request.getParameter("SS")));
		if(ob.getTamil()>=35&&ob.getEnglish()>=35&&ob.getMaths()>=35&&ob.getScience()>=35&&ob.getSocial()>=35) {
			int total=ob.getTamil()+ob.getEnglish()+ob.getMaths()+ob.getScience()+ob.getSocial();
			if(total>=450) {
				out.println("Tamil   : "+ob.getTamil());
				out.println("English : "+ob.getEnglish());
				out.println("Maths   : "+ob.getMaths());
				out.println("Science : "+ob.getScience());
				out.println("Social  : "+ob.getSocial());
				out.println("Total   : "+total+"    Your gread is O");
			}
			else if(total>=400) {
				out.println("Tamil   : "+ob.getTamil());
				out.println("English : "+ob.getEnglish());
				out.println("Maths   : "+ob.getMaths());
				out.println("Science : "+ob.getScience());
				out.println("Social  : "+ob.getSocial());
				out.println("Total   : "+total+"    Your gread is A");
			}
			else if(total>=350) {
				out.println("Tamil   : "+ob.getTamil());
				out.println("English : "+ob.getEnglish());
				out.println("Maths   : "+ob.getMaths());
				out.println("Science : "+ob.getScience());
				out.println("Social  : "+ob.getSocial());
				out.println("Total   : "+total+"    Your gread is B+");
			}
			else if(total>=300) {
				out.println("Tamil   : "+ob.getTamil());
				out.println("English : "+ob.getEnglish());
				out.println("Maths   : "+ob.getMaths());
				out.println("Science : "+ob.getScience());
				out.println("Social  : "+ob.getSocial());
				out.println("Total   : "+total+"    Your gread is B");
			}
			else if(total>=250) {
				out.println("Tamil   : "+ob.getTamil());
				out.println("English : "+ob.getEnglish());
				out.println("Maths   : "+ob.getMaths());
				out.println("Science : "+ob.getScience());
				out.println("Social  : "+ob.getSocial());
				out.println("Total   : "+total+"    Your gread is C");
			}
			else if(total>=200) {
				out.println("Tamil   : "+ob.getTamil());
				out.println("English : "+ob.getEnglish());
				out.println("Maths   : "+ob.getMaths());
				out.println("Science : "+ob.getScience());
				out.println("Social  : "+ob.getSocial());
				out.println("Total   : "+total+"    Your gread is D");
			}
		}
		else {
			out.println("Tamil   : "+ob.getTamil());
			out.println("English : "+ob.getEnglish());
			out.println("Maths   : "+ob.getMaths());
			out.println("Science : "+ob.getScience());
			out.println("Social  : "+ob.getSocial());
			out.println("your fail");
		}
		
	
		
	
	
		}
}

class Student{
	private int tamil;
	private int english;
	private int maths;
	private int science;
	private int social;
	public int getTamil() {
		return tamil;
	}
	public void setTamil(int tamil) {
		this.tamil = tamil;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getSocial() {
		return social;
	}
	public void setSocial(int social) {
		this.social = social;
	}
	
}
