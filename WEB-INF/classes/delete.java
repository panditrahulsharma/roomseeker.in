import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class delete extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        Connection con=null;
        Statement st=null;
         Statement st2=null;
          HttpSession session =req.getSession();
             String s1=(String)session.getAttribute("room");
             if(s1==null)
             {
             	res.sendRedirect("index.html");
             }
           int s=Integer.parseInt(req.getParameter("k"));

        try
        {
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
       

try
       {                 
           st=con.createStatement();   
           
           st.executeUpdate("delete from post where postid='"+s+"'");
           
          res.sendRedirect("profile");
         
           
    }
    catch(SQLException mm2)
       {
           pw.println(mm2);
       }

       }
   }