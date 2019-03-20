import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class maxpost extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
    {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
    Connection con=null;
        Statement st=null;
         Statement st2=null;
         Statement st3=null;
         Statement st5=null;
         ResultSet rs=null;
         ResultSet rs4=null;
         ResultSet rs5=null;
         Statement st4=null;
         ResultSet rs6=null;
         Statement st6=null;
ResultSet rs2=null;
ResultSet rs3=null;
        HttpSession session =req.getSession();
       String s1=(String)session.getAttribute("room");
       if(s1==null)
        res.sendRedirect("login");

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
      String s2="",s3="",s4="",s5="",s6="",s8="",m1="",m2="",c5="";
      String k1="",k2="",k3="",k4="",k5="",k6="",i1="";
int p1=0,p2=0,p3=0,p4=0,p5=0;
int count=0;
int m3,m4;
 try
       {                 
           st=con.createStatement();   
    
           rs=st.executeQuery("select name,lname from profile where email='"+s1+"'");
         
           if(rs.next())

              {

                     
                      s2=rs.getString(1);
                      s3=rs.getString(2);
                    
                
pw.println("<!DOCTYPE html>");
pw.println("<html lang='zxx'>");
pw.println("<head>");
    pw.println("<title>"); pw.println("Max post ");pw.println("</title>");
    pw.println("<meta name='viewport' content='width=device-width, initial-scale=1'>");
    pw.println("<meta charset='UTF-8' />");
    pw.println("<meta name='keywords' content='find room in kota and anywhere in you want' />");
    pw.println("<script>");
         pw.println("addEventListener('load', function() {");
             pw.println("setTimeout(hideURLbar, 0);");
        pw.println(" }, false);");

         pw.println("function hideURLbar() {");
            pw.println(" window.scrollTo(0, 1);");
         pw.println("}");
    pw.println("</script>");
    pw.println("<style type='text/css'>");
      pw.println(".round");
      pw.println("{");
        pw.println("border-radius: 50%;");
      pw.println("}");
      pw.println("img");
      pw.println("{");

        pw.println("height: 150px !important;");
        pw.println("width: 150px !important;");
      pw.println("}");
    pw.println("</style>");
     pw.println("<link rel='shortcut icon' type='image/x-icon'  href='admin/img/house.png'>");
     pw.println("<link rel='stylesheet' href='maxpost/css/bootstrap.css'>");
     pw.println("<link rel='stylesheet' href='maxpost/css/style.css' type='text/css' media='all' />");
      pw.println("<link href='maxpost/css/font-awesome.css' rel='stylesheet'>");
      pw.println("<link href='//fonts.googleapis.com/css?family=Source+Sans+Pro:200,200i,300,300i,400,400i,600,600i,700,700i,900' rel='stylesheet'>");
    pw.println("<link href='//fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800' rel='stylesheet'>");
  
pw.println("</head>");

pw.println("<body style='background-color: rgb(56,141,191);'>");
  pw.println("<div class='main-banner' id='home'>");
   pw.println("<div class='banner-info'>");
            pw.println("<div class='w3pvt-logo text-center'>");
                pw.println("<h3>"); pw.println("<a href='index.html'>");pw.println("roomseeker.in");pw.println("</a>");pw.println("</h3>");
            pw.println("</div>");
            pw.println("<div class='middile-inner-con'>");
                pw.println("<div class='tab-main mx-auto'>");

                    pw.println("<input id='tab1' type='radio' name='tabs' class='w3layouts-sm' checked>");
                    pw.println("<label for='tab1'>");pw.println("<span class='fa fa-home' aria-hidden='true'>");pw.println("</span>");pw.println("<a href='index.html'>");pw.println("Home");pw.println("</a>"); pw.println("</label>");

                      pw.println("<label for='tab1'>");pw.println("<span class='fa fa-users' aria-hidden='true'>");pw.println("</span>");pw.println("<a href='profile'>");pw.println("Profile");pw.println("</a>");pw.println("</label>");

                        pw.println("<label for='tab1'>");pw.println("<span class='fa fa-envelope' aria-hidden='true'>");pw.println("</span>"); pw.println("<a href='contact'>");pw.println("Contact");pw.println("</a>");pw.println("</label>");
                    pw.println("<section id='content1' class='inner-w3layouts-wrap'>");
                    if(s4==null)
                    {
 pw.println("<img src='profilepic/user-thumb.jpg' class='admin img-fluid round' alt='mobile-image'>");
                       
                    }
                    else
                    {
                        pw.println("<img src='profilepic/"+s1+".jpg' class='admin img-fluid round' alt='mobile-image'>");
                      }
                        pw.println("<h4>");pw.println("Hello mr-"+s2+s3);pw.println("</h4>");
                        pw.println("<h3>");pw.println("Sorry You can post Max 3 free Post ads only Thank's");pw.println("</h3>");
                       
                    pw.println("</section>");
                   

                pw.println("</div>");
        pw.println("</div>");
        pw.println("<div class='copy-w3layouts-right text-center pb-3'>");
            pw.println("<p>");pw.println("© 2019 All rights reserved | Design by Rahul sharma,vikarm Gurjar and Ankit Yadav");
            pw.println("</p>");

        pw.println("</div>");
    pw.println("</div>");
  
pw.println("</body>");

pw.println("</html>");
}
}
catch(Exception em)
{
    pw.println(em);
}
     }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }
}
