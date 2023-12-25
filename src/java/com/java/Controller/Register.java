package com.java.Controller;

import com.java.service.UserService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class Register extends HttpServlet
{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String name2=request.getParameter("name1");
        String email2=request.getParameter("email1");
        String password2=request.getParameter("password1");
        String gender2=request.getParameter("gender1");
        String city2=request.getParameter("city1");
        String[] data={name2,email2,password2,gender2,city2};
        UserService userService=new UserService();
        boolean status=userService.insertUserDetails(data);
        if(status){
            out.println("<h3 style='color:green'> your registration success</h3>");
            RequestDispatcher rd=request.getRequestDispatcher("/register.jsp");
            rd.include(request, response);
        }else{
            out.println("<h3 style='color:red'> opps! your registration is failure due to some error</h3>");
            RequestDispatcher rd=request.getRequestDispatcher("/register.jsp");
            rd.include(request, response);
        }
    }
      
}
