

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class contact1 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        Connection con=null;
        Statement st=null;
         Statement st2=null;
           ResultSet rs2=null;
           String p11="";
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
     String a=req.getParameter("name");
     String b=req.getParameter("email");
     String c=req.getParameter("message");
      
          try
          {
            st2=con.createStatement();
            rs2=st2.executeQuery("select curdate()");
            while(rs2.next())
            {
                 p11=rs2.getString(1);

            }
          }
          catch(Exception ex)
          {
            pw.println(ex);
          }
       try
       {
              st=con.createStatement();
             st.executeUpdate("insert into contact(name,email,message,date) values('"+a+"','"+b+"','"+c+"','"+p11+"')");
           pw.println("data inserted succesfully");
          
          res.sendRedirect("index.html");
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