

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class edit extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        Connection con=null;
        Statement st=null;
         Statement st2=null;
              ResultSet rs=null;
               ResultSet rs4=null;
              Statement st4=null;

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
      String s2="",s3="",s4="",s5="",s6="",s7="",s8="",s9="",s10="",s11="";
int count=0,p1;
       try
       {                 
           st=con.createStatement();   
    
           rs=st.executeQuery("select * from profile where email='"+s1+"'");
         
           if(rs.next())

              {
                             p1=rs.getInt(1);
                      s2=rs.getString(2);
                      s3=rs.getString(3);
                      s4=rs.getString(4);
                      s5=rs.getString(5);
                      s6=rs.getString(6);
                      s7=rs.getString(7);
                      s8=rs.getString(8);
                      s9=rs.getString(9);
                      s10=rs.getString(10);
                  try
           {
                   st4=con.createStatement();
                   rs4=st4.executeQuery("select * from post where post.pid='"+p1+"'");
                   while(rs4.next())
                   {
                    count++;
                   }
           }
       
       catch(SQLException m2)
       {
           pw.println(m2);
       }
   pw.println("<!DOCTYPE html>");
pw.println("<html lang='en'>");
pw.println("<head>");


  pw.println("<style type='text/css'>");
pw.println(".profile-thumb img");
    pw.println("{");
      pw.println("width: 150px !important;");
      pw.println("height: 150px !important;");
  pw.println("  }");
 
  pw.println("</style>");
  pw.println("<meta charset='utf-8'>");
  pw.println("<meta http-equiv='X-UA-Compatible' content='IE=edge'>");
  pw.println("<meta name='viewport' content='width=device-width, initial-scale=1'>");
  pw.println("<title>");pw.println("edit your profile");pw.println("</title>");
  

  pw.println("<link href='profile/plugins/jquery-ui/jquery-ui.min.css' rel='stylesheet'>");
 pw.println("<link rel='shortcut icon' type='image/x-icon'  href='admin/img/house.png'>");
  pw.println("<link href='profile/plugins/bootstrap/dist/css/bootstrap.min.css' rel='stylesheet'>");

  pw.println("<link href='profile/plugins/font-awesome/css/font-awesome.min.css' rel='stylesheet'>");
  
  pw.println("<link href='profile/plugins/slick-carousel/slick/slick.css' rel='stylesheet'>");
  pw.println("<link href='profile/plugins/slick-carousel/slick/slick-theme.css' rel='stylesheet'>");
  pw.println("<link href='profile/plugins/fancybox/jquery.fancybox.pack.css' rel='stylesheet'>");
  pw.println("<link href='profile/plugins/jquery-nice-select/css/nice-select.css' rel='stylesheet'>");
  pw.println("<link href='profile/plugins/seiyria-bootstrap-slider/dist/css/bootstrap-slider.min.css' rel='stylesheet'>");
  pw.println("<link href='profile/css/style.css' rel='stylesheet'>");


  pw.println("<link href='profile/img/favicon.png' rel='shortcut icon'>");



pw.println("</head>");

pw.println("<body class='body-wrapper'>");


pw.println("<section>");
  pw.println("<div class='container'>");
    pw.println("<div class='row'>");
      pw.println("<div class='col-sm-12 bgm'>");pw.println("<a class='add-button' href='index.html'>");pw.println("Home");pw.println("</a>");
        pw.println("<a class='add-button' href='post'>");pw.println("<i class='fa fa-plus-circle'>");pw.println("</i>");pw.println("Post Ads");pw.println("</a>");pw.println("</div>");
      pw.println("</div>");
    pw.println("</div>");
  pw.println("</div>");
pw.println("</section>");

pw.println("<section class='user-profile section'>");
  pw.println("<div class='container'>");
    pw.println("<div class='row'>");
      pw.println("<div class='col-md-10 offset-md-1 col-lg-4 offset-lg-0'>");
        pw.println("<div class='sidebar'>");
        
          pw.println("<div class='widget user-dashboard-profile'>");
       
            pw.println("<div class='profile-thumb'>");
            if(s8==null)
              pw.println("<img src='profilepic/user-thumb.jpg' alt='' class='rounded-circle'>");
            else
              pw.println("<img src='profilepic/"+s1+".jpg' alt='' class='rounded-circle'>");
            
                         pw.println("</div>");
           
            pw.println("<h5 class='text-center'>");pw.println(s2+" "+s3);pw.println("</h5>");
            pw.println("<p>");pw.println(s4);pw.println("</p>");
          pw.println("</div>");
         
          pw.println("<div class='widget user-dashboard-menu'>");
            pw.println("<ul>");
              pw.println("<li>");
                pw.println("<a href='profile'>");pw.println("<i class='fa fa-comment-o'>");pw.println("</i>");pw.println("Messages"); pw.println("<span>");pw.println("0");pw.println("</span>");pw.println("</a>");
              pw.println("</li>");
              pw.println("<li>");
                pw.println("<a href='#'>");pw.println("<i class='fa fa-bookmark-o'>");pw.println("</i>"); pw.println("Posted Ads ");pw.println("<span>");pw.println(count);pw.println("</span>");pw.println("</a>");
              pw.println("</li>");
              pw.println("<li>");
                pw.println("<a href='logout'>");pw.println("<i class='fa fa-cog'>");pw.println("</i>"); pw.println("Logout");pw.println("</a>");
              pw.println("</li>");
              pw.println("<li>");
                pw.println("<a href='index.html'>");pw.println("<i class='fa fa-power-off'>");pw.println("</i>");pw.println("Delete Account");pw.println("</a>");
              pw.println("</li>");
            pw.println("</ul>");
          pw.println("</div>");
        pw.println("</div>");
      pw.println("</div>");
      pw.println("<div class='col-md-10 offset-md-1 col-lg-8 offset-lg-0'>");
 
        pw.println("<div class='widget personal-info'>");
          pw.println("<h3 class='widget-header user'>");pw.println("Edit Personal Information");pw.println("</h3>");
          pw.println("<form action='update' method='get'>");
         
            pw.println("<div class='form-group'>");
                pw.println("<label for='first-name'>");pw.println("First Name");pw.println("</label>");
                pw.println("<input type='text' class='form-control' id='first-name' name='fname' value='"+s2+"'>");
            pw.println("</div>");
          
            pw.println("<div class='form-group'>");
                pw.println("<label for='last-name'>");pw.println("Last Name");pw.println("</label>");
                pw.println("<input type='text' class='form-control' id='last-name' name='lname' value='"+s3+"'>");
            pw.println("</div>");
         
           
            pw.println("<div class='form-group'>");
                pw.println("<label for='comunity-name'>");pw.println("mobile");pw.println("</label>");
                pw.println("<input type='text' class='form-control' id='comunity-name' name='mob' value='"+s7+"'>");
            pw.println("</div>");
            
            
       
            
            pw.println("<div class='form-group'>");
                pw.println("<label for='current-password'>");pw.println("Current Password");pw.println("</label>");
                pw.println("<input type='password' class='form-control' id='current-password' name='password' value='"+s5+"'>");
            pw.println("</div>");
       
            pw.println("<div class='form-group'>");
                pw.println("<label for='new-password'>");pw.println("New Password");pw.println("</label>");
                pw.println("<input type='password' class='form-control' id='new-password' name='password' value='"+s5+"'>");
            pw.println("</div>");
         
            
           
            pw.println("<button class='btn btn-transparent'>");pw.println("Save My Changes");pw.println("</button>");
          pw.println("</form>");
          pw.println("<form enctype='multipart/form-data' action='Upload.jsp' method='post'>");
          
            pw.println("<div class='form-group choose-file'>");
              pw.println("<i class='fa fa-user text-center'>");pw.println("</i>");
                pw.println("<input type='file' class='form-control-file d-inline' id='input-file' name='F1'>");
             pw.println("</div>");
           
            
            pw.println("<div class='form-check'>");
              pw.println("<label class='form-check-label' for='hide-profile'>");
                pw.println("<input class='form-check-input' type='checkbox' value='' id='hide-profile'>");
                pw.println("Hide Profile from Public/Comunity");
              pw.println("</label>");
            pw.println("</div>");
       
            
            
           
            pw.println("<button class='btn btn-transparent' >");pw.println("Save My Changes");pw.println("</button>");
          pw.println("</form>");
 
        pw.println("</div>");
      
        
      pw.println("</div>");
    pw.println("</div>");
  pw.println("</div>");
pw.println("</section>");


pw.println("<footer class='footer-bottom'>");
  
    pw.println("<div class='container'>");
      pw.println("<div class='row'>");
        pw.println("<div class='col-sm-6 col-12'>");
        
          pw.println("<div class='copyright'>");
            pw.println("<p>");pw.println("Copyright © 2019. All Rights Reserved roomseeker.in");pw.println("</p>");
          pw.println("</div>");
        pw.println("</div>");
        pw.println("<div class='col-sm-6 col-12'>");
       
          pw.println("<ul class='social-media-icons text-right'>");
              pw.println("<li>");pw.println("<a class='fa fa-facebook' href=''>");pw.println("</a>");pw.println("</li>");
              pw.println("<li>");pw.println("<a class='fa fa-twitter' href=''>");pw.println("</a>");pw.println("</li>");
              pw.println("<li>");pw.println("<a class='fa fa-pinterest-p' href=''>");pw.println("</a>");pw.println("</li>");
              pw.println("<li>");pw.println("<a class='fa fa-vimeo' href=''>");pw.println("</a>");pw.println("</li>");
            pw.println("</ul>");
        pw.println("</div>");
      pw.println("</div>");
    pw.println("</div>");
  
 
pw.println("</footer>");


  pw.println("<script src='profile/plugins/jquery/jquery.min.js'>");pw.println("</script>");
  pw.println("<script src='profile/plugins/jquery-ui/jquery-ui.min.js'>");pw.println("</script>");
  pw.println("<script src='profile/plugins/tether/js/tether.min.js'>");pw.println("</script>");
  pw.println("<script src='profile/plugins/raty/jquery.raty-fa.js'>");pw.println("</script>");
  pw.println("<script src='profile/plugins/bootstrap/dist/js/popper.min.js'>");pw.println("</script>");
  pw.println("<script src='profile/plugins/bootstrap/dist/js/bootstrap.min.js'>");pw.println("</script>");
  pw.println("<script src='profile/plugins/seiyria-bootstrap-slider/dist/bootstrap-slider.min.js'>");pw.println("</script>");
  pw.println("<script src='profile/plugins/slick-carousel/slick/slick.min.js'>");pw.println("</script>");
  pw.println("<script src='profile/plugins/jquery-nice-select/js/jquery.nice-select.min.js'>");pw.println("</script>");
  pw.println("<script src='profile/plugins/fancybox/jquery.fancybox.pack.js'>");pw.println("</script>");
  pw.println("<script src='profile/plugins/smoothscroll/SmoothScroll.min.js'>");pw.println("</script>");
  pw.println("<script src='https://maps.googleapis.com/maps/api/js?key=AIzaSyCC72vZw-6tGqFyRhhg5CkF2fqfILn2Tsw'>");pw.println("</script>");
  pw.println("<script src='profile/js/scripts.js'>");pw.println("</script>");

pw.println("</body>");

pw.println("</html>");                 
              } 
              else
                 {
              pw.println("wrong username"); 
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