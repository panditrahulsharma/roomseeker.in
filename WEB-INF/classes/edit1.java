

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class edit1 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        Connection con=null;
        Statement st=null;
         Statement st3=null;
              ResultSet rs=null;
Statement st2=null;
              ResultSet rs2=null;
              Statement st4=null;
              ResultSet rs3=null;
               HttpSession session =req.getSession();
                String s1=(String)session.getAttribute("room");
    if(s1==null)
    {
        res.sendRedirect("index.html");
    }
       
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
      String s2="",s3="",s4="",s5="",s6="",s7="",s8="",s9="",s10="",s11="",s12="",s13="",s14="";
int count=0,p1,s=0,b1=0;
        String kk=req.getParameter("k");
        s=Integer.parseInt(kk);
        session.setAttribute("postid",kk);
      try
      {
      	st2=con.createStatement();
      	rs2=st2.executeQuery("select nearid,email from post where postid='"+s+"'");
      	while(rs2.next())
      	{
                   b1=rs2.getInt(1);
                   s14=rs2.getString(2);
      	}
      }
      catch(Exception oo)
      {
      	pw.println(oo);
      }
      try
      {
      	st3=con.createStatement();
      	rs3=st3.executeQuery("select nearname from near where nearid='"+b1+"'");
      	while(rs3.next())
      	{
                 s12=rs3.getString(1);
      	}
      }
      catch(Exception r)
      {
      	pw.println(r);
      }
    if(s1.equals(s14))
    {  
try
{
      st=con.createStatement();
      rs=st.executeQuery("select * from post where postid='"+s+"'");
      while(rs.next())
      {
 
                      s2=rs.getString(5);
                      s3=rs.getString(6);
                      s4=rs.getString(7);
                      s5=rs.getString(8);
                      s6=rs.getString(9);
                      s7=rs.getString(10);
                      s8=rs.getString(11);
                      s9=rs.getString(12);
                      s10=rs.getString(13);
                      s11=rs.getString(19);
pw.println("<!DOCTYPE html>");
pw.println("<html lang='en'>");
pw.println("<head>");
pw.println("<title>");pw.println("Update posts");pw.println("</title>");
pw.println("<link rel='stylesheet' type='text/css' href='vendor/rahul.css'>");
    
pw.println("<link rel='stylesheet' href='post/css/bootstrap.min.css'>");pw.println("<!-- bootstrap-CSS -->");
pw.println("<link rel='stylesheet' href='post/css/bootstrap-select.css'>");pw.println("<!-- bootstrap-select-CSS -->");
pw.println("<link href='post/css/style.css' rel='stylesheet' type='text/css' media='all' />");pw.println("<!-- style.css -->");
pw.println("<link rel='stylesheet' href='post/css/font-awesome.min.css' />");pw.println("<!-- fontawesome-CSS -->");
pw.println("<link rel='stylesheet' href='post/css/menu_sideslide.css' type='text/css' media='all'>");pw.println("<!-- Navigation-CSS -->");
pw.println("<!-- meta tags -->");
pw.println("<meta name='viewport' content='width=device-width, initial-scale=1'>");
pw.println("<meta http-equiv='Content-Type' content='text/html; charset=utf-8' />");
pw.println("<meta name='keywords' content='room for rent,post your add here,update your add here' />");
pw.println("<script type='application/x-javascript'>"); pw.println("addEventListener('load', function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); }"); pw.println("</script>");
pw.println("<!-- //meta tags -->");
pw.println("<!--fonts-->");
pw.println("<link href='//fonts.googleapis.com/css?family=Ubuntu+Condensed' rel='stylesheet' type='text/css'>");
pw.println("<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>");
pw.println("<!--//fonts-->"); 
pw.println("<!-- js -->");
pw.println("<script type='text/javascript' src='post/js/jquery.min.js'>");pw.println("</script>");
pw.println("<!-- js -->");
pw.println("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->");
pw.println("<script src='post/js/bootstrap.js'>");pw.println("</script>");
pw.println("<script src='post/js/bootstrap-select.js'>");pw.println("</script>");

pw.println("<!-- language-select -->");
pw.println("<script type='text/javascript' src='post/js/jquery.leanModal.min.js'>");pw.println("</script>");
pw.println("<link href='post/css/jquery.uls.css' rel='stylesheet'/>");
pw.println("<link href='post/css/jquery.uls.grid.css' rel='stylesheet'/>");
pw.println("<link href='post/css/jquery.uls.lcd.css' rel='stylesheet'/>");
pw.println("<!-- Source -->");
pw.println("<script type='text/javascript'>");
pw.println("function preview_image(event) ");
pw.println("{");
 pw.println("var reader = new FileReader();");
 pw.println("reader.onload = function()");
 pw.println("{");
  pw.println("var output = document.getElementById('z1');");
  pw.println("output.src = reader.result;");
 pw.println("}");
 pw.println("reader.readAsDataURL(event.target.files[0]);");
pw.println("}");
pw.println("function preview_image1(event)"); 
pw.println("{");
 pw.println("var reader = new FileReader();");
 pw.println("reader.onload = function()");
 pw.println("{");
  pw.println("var output = document.getElementById('z2');");
  pw.println("output.src = reader.result;");
 pw.println("}");
 pw.println("reader.readAsDataURL(event.target.files[0]);");
pw.println("}");
pw.println("function preview_image2(event) ");
pw.println("{");
 pw.println("var reader = new FileReader();");
 pw.println("reader.onload = function()");
 pw.println("{");
  pw.println("var output = document.getElementById('z3');");
  pw.println("output.src = reader.result;");
 pw.println("}");
 pw.println("reader.readAsDataURL(event.target.files[0]);");
pw.println("}");
pw.println("function preview_image3(event) ");
pw.println("{");
 pw.println("var reader = new FileReader();");
 pw.println("reader.onload = function()");
 pw.println("{");
  pw.println("var output = document.getElementById('z4');");
  pw.println("output.src = reader.result;");
 pw.println("}");
 pw.println("reader.readAsDataURL(event.target.files[0]);");
pw.println("}");
pw.println("</script>");
pw.println("<style type='text/css'>");
pw.println("#wrapper");
pw.println("{");
 pw.println("text-align:center;");
 pw.println("margin:0 auto;");
 pw.println("display: inline-block;");
 pw.println("width:140px; ");
pw.println("}");
pw.println("#wrapper1");
pw.println("{");
 pw.println("text-align:center;");
 pw.println("margin:0 auto;");
 pw.println("padding-left: 0px;");
 pw.println("display: inline-block;");
 pw.println("width:140px; ");
pw.println("}");
pw.println("#wrapper2");
pw.println("{");
 pw.println("text-align:center;");
 pw.println("margin:0 auto;");
  pw.println("display: inline-block;");
 pw.println("width:140px;");
pw.println("}");
pw.println("#wrapper3");
pw.println("{");
 pw.println("text-align:center;");
 pw.println("margin:0 auto;");
 pw.println("padding-bottom: : 20px;");
 pw.println("display: inline-block;");
 pw.println("width:140px;");
 
pw.println("}");


pw.println("</style>");

pw.println("<!-- //language-select -->");
pw.println("</head>");
pw.println("<body>");
  
    

  pw.println("<!-- //header -->");
  pw.println("<!-- breadcrumbs -->");
  pw.println("<div class='w3layouts-breadcrumbs text-center'>");
    pw.println("<div class='container'>");
      pw.println("<span class='agile-breadcrumbs'>");pw.println("<a href='index.html'>");pw.println("<i class='fa fa-home home_1'>");pw.println("</i>");pw.println("</a>"); pw.println("/"); pw.println("<span>");pw.println("Update posts");pw.println("</span>");pw.println("</span>");
    pw.println("</div>");
  pw.println("</div>");
  pw.println("<!-- //breadcrumbs -->");
  pw.println("<!-- Submit Ad -->");
  pw.println("<div class='submit-ad main-grid-border'>");
    pw.println("<div class='container'>");
      pw.println("<h2 class='w3-head'>");pw.println("Update your posts");pw.println("</h2>");
      pw.println("<div class='post-ad-form'>");
        pw.println("<form method='get' action='update1'>");
           pw.println("<label>");pw.println("Category"); pw.println("<span>");pw.println("*");pw.println("</span>");pw.println("</label>");
          pw.println("<input type='text' class='phone' name='sm1' value='"+s2+"'>");
         
          pw.println("<div class='clearfix'>");pw.println("</div>");
           pw.println("<label>");pw.println("Prefered Types"); pw.println("<span>");pw.println("*");pw.println("</span>");pw.println("</label>");
          pw.println("<input type='text' class='phone' name='sm2' value='"+s3+"'>");
          pw.println("<div class='clearfix'>");pw.println("</div>");
         
          pw.println("<label>");pw.println("Prefered Gender"); pw.println("<span>");pw.println("*");pw.println("</span>");pw.println("</label>");
          pw.println("<input type='text' class='phone' name='sm3' value='"+s4+"'>");
          pw.println("<div class='clearfix'>");pw.println("</div>");
         
          pw.println("<label>");pw.println("Properties"); pw.println("<span>");pw.println("*");pw.println("</span>");pw.println("</label>");
          pw.println("<input type='text' class='phone' name='sm4' value='"+s5+"'>");
         
          pw.println("<label>");pw.println("Bedrooms"); pw.println("<span>");pw.println("*");pw.println("</span>");pw.println("</label>");
          pw.println("<input type='text' class='phone'  name='sm5' value='"+s6+"'>");
          pw.println("<div class='clearfix'>");pw.println("</div>");
         pw.println("<label>");pw.println("Furnishing"); pw.println("<span>");pw.println("*");pw.println("</span>");pw.println("</label>");
          pw.println("<input type='text' class='phone' name='sm6' value='"+s7+"'>");
          pw.println("<div class='clearfix'>");pw.println("</div>");
         
          pw.println("<label>");pw.println("hostel-Names/title"); pw.println("<span>");pw.println("*");pw.println("</span>");pw.println("</label>");
          pw.println("<input type='text' class='phone' name='sm7' value='"+s8+"'>");
          pw.println("<div class='clearfix'>");pw.println("</div>");
          pw.println("<label>");pw.println("Address"); pw.println("<span>");pw.println("*");pw.println("</span>");pw.println("</label>");
          pw.println("<textarea class='mess'  name='sm8' >");pw.println(s11);pw.println("</textarea>");
          pw.println("<div class='clearfix'>");pw.println("</div>");
               
          
             pw.println("<label>");pw.println("Locality");pw.println("<span>");pw.println("*");pw.println("</span>");pw.println("</label>");
            pw.println("<input type='text' class='name'  name='sm9' value='"+s12+"'>");
          
            pw.println("<div class='clearfix'>");pw.println("</div>");
            pw.println("<label>");pw.println("Price");pw.println("<span>");pw.println("*");pw.println("</span>");pw.println("</label>");
            pw.println("<input type='text' class='name'  name='sm10' value='"+s10+"'>");
            pw.println("<div class='clearfix'>");pw.println("</div>");
           
           // pw.println("<div class='clearfix'>");pw.println("</div>");pw.println("<label>");pw.println("Upload your four PIC");
            
            //  pw.println("<span>");pw.println("*");pw.println("</span>");pw.println("</label>");

//pw.println("<div id='wrapper'>");
 // pw.println("<img id='z1'/ width='50' height='50'>");
 //pw.println("<input type='file' class='i1' id='a1' name='file1' onchange='preview_image(event)' required=''>");
//pw.println("<label for='a1'>");pw.println("+");pw.println("</label>");
//pw.println("</div>");
//pw.println("<div id='wrapper1'>");
//  pw.println("<img src='p.jpg' id='z2'/ width='50' height='50' >");
// pw.println("<input type='file' class='i1' id='a2'  onchange='preview_image1(event)' name='file1' required=''>");
// pw.println("<label for='a2'>");pw.println("+");pw.println("</label>");
//pw.println("</div>");
//pw.println("<div id='wrapper2'>");
 // pw.println("<img src='p.jpg' id='z3'/ width='50' height='50'>");
 //pw.println("<input type='file' class='i1' id='a3' onchange='preview_image2(event)'name='file1' required=''>");
 //pw.println("<label for='a3'>");pw.println("+");pw.println("</label>");
//pw.println("</div>");
//pw.println("<div id='wrapper3'>");
  //pw.println("<img id='z4'/ width='50' height='50'>");
 //pw.println("<input type='file' class='i1' id='a4' onchange='preview_image3(event)' name='file1' required=''>");
 //pw.println("<label for='a4'>");pw.println("+");pw.println("</label>");
//pw.println("</div>");
           // pw.println("<div class='clearfix'>");pw.println("</div>");
          pw.println("<div class='clearfix'>");pw.println("</div>");
          pw.println("<p class='post-terms'>");pw.println("By clicking"); pw.println("<strong>");pw.println("Submit");pw.println("</strong>"); pw.println(" button you accept our ");pw.println("<a href='#' >");pw.println("Terms of Use"); pw.println("</a>"); pw.println("and ");pw.println("<a href='#' >");pw.println("Privacy Policy");pw.println("</a>");pw.println("</p>");
          pw.println("<input type='submit' value='Submit'>");         
        pw.println("<div class='clearfix'>");pw.println("</div>");

          pw.println("</form>");
      pw.println("</div>");
    pw.println("</div>"); 
  pw.println("</div>");
   
    pw.println("<footer>");
      
      pw.println("<div class='agileits-footer-bottom text-center'>");
      pw.println("<div class='container'>");
        
        
        pw.println("<div class='copyrights'>");
          pw.println("<p>"); pw.println("2019 All Rights Reserved Design by RoomSeeker.in");pw.println("</p>");
        pw.println("</div>");
        pw.println("<div class='clearfix'>");pw.println("</div>");
      pw.println("</div>");
    pw.println("</div>");
    pw.println("</footer>");
        pw.println("<!--footer section end-->");
pw.println("</body>");
    pw.println("<!-- Navigation-JavaScript -->");
      pw.println("<script src='post/js/classie.js'>");pw.println("</script>");
      pw.println("<script src='post/js/main.js'>");pw.println("</script>");
    pw.println("<!-- //Navigation-JavaScript -->");
    pw.println("<!-- here stars scrolling icon -->");
      
      pw.println("<!-- start-smoth-scrolling -->");
      pw.println("<script type='text/javascript' src='post/js/move-top.js'>");pw.println("</script>");
      pw.println("<script type='text/javascript' src='post/js/easing.js'>");pw.println("</script>");
      pw.println("<script type='text/javascript'>");
        pw.println("jQuery(document).ready(function($) {");
          pw.println("$('.scroll').click(function(event){ ");  
            pw.println("event.preventDefault();");
           pw.println(" $('html,body').animate({scrollTop:$(this.hash).offset().top},1000);");
         pw.println(" });");
        pw.println("});");
    pw.println("</script>");
   pw.println("<div id='loader-wrapper'>");
        pw.println("<div id='preloader_1'>");
                  pw.println("<span>");pw.println("</span>");
                  pw.println("<span>");pw.println("</span>");
                  pw.println("<span>");pw.println("</span>");
                  pw.println("<span>");pw.println("</span>");
                  pw.println("<span>");pw.println("</span>");
              pw.println("</div>");
      pw.println("</div>");
  pw.println("<script type='text/javascript' src='vendor/jquery.2.2.3.min.js'>");pw.println("</script>");
  pw.println("<script type='text/javascript' src='vendor/theme.js'>");pw.println("</script>");
  
pw.println("</html>");
}
}
catch(Exception m2)
       {
           pw.println(m2);
       }
     }
     else{
      res.sendRedirect("profile");
     }               
          
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }
}