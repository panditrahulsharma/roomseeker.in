import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class insert4 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        Connection con=null;
        Statement st=null;
         Statement st2=null;
         ResultSet rs = null;
         ResultSet rs1 = null;
         
          String ab=req.getParameter("verify");
      String ba=req.getParameter("hidden");
      
      if(ab.equals(ba))
      {
          
      
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
      String b=req.getParameter("email");
       String c=req.getParameter("password");
         String d=req.getParameter("cpassword");
       String e=req.getParameter("lname");
        String f=req.getParameter("phone");
        pw.println(a);
       try
       {
                   st=con.createStatement();
                   st2=con.createStatement();
                   rs = st.executeQuery("select email from profile");
                   rs1 = st2.executeQuery("select count(email) from profile");
                   rs1.next();
                   int kp = rs1.getInt(1);
                   int kp1 = 0;
                   while(rs.next())
                   {
                    if(b.equals(rs.getString(1)))
                    {
                      break;
                    }
                    kp1++;
                   }
                   if(kp1 != kp)
                   {
                    pw.println("<script>alert('Email alredy exists')</script>");
                     pw.println("<script>window.location.href='login'</script>");
                   }
                    else{         
           st.executeUpdate("insert into profile(name,lname,email,password,cpassword,mob,status) values('"+a+"','"+e+"','"+b+"','"+c+"','"+d+"','"+f+"','active')");
           pw.println("data inserted succesfully");
           HttpSession session=req.getSession();
           session.setAttribute("room",b);
           res.sendRedirect("profile");
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
      else
      {
          pw.println("<!DOCTYPE html>");
pw.println("<html>");
pw.println("<head>");
	pw.println("<title>");pw.println("</title>");
	pw.println("<script type='text/javascript'>");
		pw.println("alert('wrong otp');");
		pw.println("window.location.href='login';");
	pw.println("</script>");
pw.println("</head>");
pw.println("<body>");

pw.println("</body>");
pw.println("</html>");
      }
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }
}


