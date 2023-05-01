

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Hibernate_Projects_2.Hibernate_web_1.Dao_logics;
import Hibernate_Projects_2.Hibernate_web_1.Data;

@Component
public class RegisterActionSer extends HttpServlet {
	
	@Autowired
	Data d;
	Dao_logics l;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a=request.getParameter("id");
		Integer id=Integer.parseInt(a);
		String firstname=request.getParameter("fn");
		String lastname=request.getParameter("ln");
		String email=request.getParameter("em");
		String password=request.getParameter("pa");
		String stdcode=request.getParameter("std");
		String phoneno=request.getParameter("ph");
		String gender=request.getParameter("gn");

		PrintWriter out=response.getWriter();
	
		//	data inserting into data class of setter methods
		
	//	Vector v=l.Appobj();
		
		
		d.setId(id);
		d.setFirstname(firstname);
		d.setLastname(lastname);
		d.setEmail(email);
		d.setPassword(password);
		d.setStdcode(stdcode);
		d.setPhoneno(phoneno);
		d.setGender(gender);
		
		
		Vector v=l.Register_logics(d);
		
		Iterator ii=v.iterator();
		
		for(;ii.hasNext();)
		{
		out.println(ii.next());
		}

		
		out.println("Registeratiion is sucessfull: ");
		
		
		out.println(d.getId());
		out.println(d.getFirstname());
		out.println(d.getLastname());
		out.println(d.getEmail());
		out.println(d.getPassword());
		out.println(d.getStdcode());
		out.println(d.getPhoneno());
		out.println(d.getGender());
		
		out.println(d.toString());
	}

}
