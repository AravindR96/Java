package com.Cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import Com.Cookies.Cookie;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/servlet1")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try{  
			  
			    response.setContentType("text/html");  
			    PrintWriter out = response.getWriter();  
			          
			    String n=request.getParameter("userName");  
			    out.print("Welcome "+n);  
			  
			    Cookie ck=new Cookie("uname",n);//creating cookie object  
			    response.addCookie(ck);//adding cookie in the response  
			  
			    //creating submit button  
			    out.print("<form action='servlet2'>");  
			    out.print("<input type='submit' value='go'>");  
			    out.print("</form>");  
			          
			    out.close();  
			  
			        }catch(Exception e){System.out.println(e);}  
			  }  
			}  


