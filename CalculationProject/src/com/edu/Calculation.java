package com.edu;


import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculation
 */
@WebServlet("/Calculation")
public class Calculation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @throws IOException 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		PrintWriter out=response.getWriter();
		
		double num1=Double.parseDouble(request.getParameter("n1"));
		double  num2=Double.parseDouble(request.getParameter("n2"));
	       
		String button=request.getParameter("choice");
		
		/*if(button.equals("Add"))
		{
		out.println("Additon of Two numbers : "+(num1+num2));
		}
		else if(button.equals("Sub"))
		{
		out.println("Subtraction of Two numbers : "+(num1-num2));
		}
		else if(button.equals("Mul"))
		{
		out.println("Multiplication of Two numbers : "+(num1*num2));
		}
		else if(button.equals("Div"))
		{
		out.println("Division of Two numbers : "+(num1/num2));
		}*/
		
		switch(button)
		{
		case "Add":out.println("Additon of Two numbers : "+(num1+num2));
		           break;
		case "Sub":out.println("Subtraction of Two numbers : "+(num1-num2));
                   break;
		case "Mul":out.println("Multiplication of Two numbers : "+(num1*num2));
                   break; 
		case "Div":
			try {
			out.println("Division of Two numbers : "+(num1/num2));
			}
			catch(Exception e){
				e.printStackTrace();
				}
			
                   break;           
		           
		}
		
		
		
	
	}

}
