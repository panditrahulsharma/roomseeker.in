

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class insert5 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        Connection con=null;
        Statement st=null;
         ResultSet rs=null;
       
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user1","root","admin");
        }
        catch(ClassNotFoundException e1)
       {
           pw.println(e1);
       }
       catch(SQLException e2)
       {
           pw.println(e2);
       }
        
     String a=req.getParameter("email");
     String b=req.getParameter("password");
       try
       {
           st=con.createStatement();
            rs=st.executeQuery("select * from profile where email='"+a+"' and password='"+b+"'");
                if(rs.next())
                {
                  HttpSession session =req.getSession();
                  session.setAttribute("room",a);
                  res.sendRedirect("profile");
                }
                else
                  
                {
                  res.sendRedirect("login");
                       
                }
       }
       catch(SQLException e3)
       {
           pw.println(e3);
       }
       catch(Exception e4)
       {
           pw.println(e4);
       }
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }
}