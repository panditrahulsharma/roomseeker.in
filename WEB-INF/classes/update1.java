

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class update1 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        Connection con=null;
        Statement st=null;
         Statement st2=null;
          ResultSet rs=null;
        HttpSession session=req.getSession();
   String s1=(String)session.getAttribute("room");

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
       String k2=(String)session.getAttribute("postid");
       int s=Integer.parseInt(k2);
     
       //String s=req.getParameter("editt");
       String a=req.getParameter("sm1");
       String b=req.getParameter("sm2");
       String c=req.getParameter("sm3");
       String d=req.getParameter("sm4");
     String e=req.getParameter("sm5");
     String f=req.getParameter("sm6");
     String g=req.getParameter("sm7");
     String h=req.getParameter("sm8");
     String i=req.getParameter("sm9");
     String j=req.getParameter("sm10");
   
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
           st.executeUpdate("update post set catagary='"+a+"',ptype='"+b+"',gender='"+c+"',properties='"+d+"',bedrooms='"+e+"',furnish='"+f+"',title='"+g+"',address='"+h+"',price='"+j+"' where postid='"+s+"'");
          res.sendRedirect("profile"); 

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