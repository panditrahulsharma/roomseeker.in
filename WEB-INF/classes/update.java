

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class update extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        Connection con=null;
        Statement st=null;
         Statement st2=null;
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
     String a=req.getParameter("fname");
     String b=req.getParameter("lname");
       String c=req.getParameter("mob");
       String d=req.getParameter("password");
     
   HttpSession session=req.getSession();
   String s1=(String)session.getAttribute("room");
   if(s1==null)
   {
    pw.println("wrong email");
    res.sendRedirect("index.html");
   }
   else
   {
       try
       {
           st=con.createStatement();
            rs=st.executeQuery("select * from profile where email='"+s1+"'");
                if(rs.next())
                {
                     st.executeUpdate("update profile set name='"+a+"',lname='"+b+"',mob='"+c+"',password='"+d+"' where email='"+s1+"'");
                pw.println("update successfullly ");
                res.sendRedirect("edit");
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
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }
}