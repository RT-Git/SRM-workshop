package com.workshop.tradr.controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Controller  extends HttpServlet{
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
		 response.setContentType("text/html;charset=UTF-8");
		PrintWriter out= response.getWriter();
		 String name=request.getParameter("name");
         String email=request.getParameter("email");
         String pass=request.getParameter("pass");
         
         StorageOfData sd=new StorageOfData();
         sd.setEmail(email);
         sd.setName(name);
         sd.setPassword(pass);
         
		DataBase_Register dbr=new DataBase_Register();
		try{
		boolean b=dbr.insertData(sd);
		if(b){
			out.write("user signed up");
			out.write("<a href=\"login.jsp\">Go to login</a>");
		}
		else{
			out.write("internal error occured" );
			out.write("<a href=\"register.jsp\">Register</a>" );
		}
		}catch(Exception e){
			
		}
    }

}
