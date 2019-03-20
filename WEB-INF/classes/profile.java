

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class profile extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
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
    
           rs=st.executeQuery("select * from profile where email='"+s1+"'");
         
           if(rs.next())

              {

              	      p1=rs.getInt(1);	
                      s2=rs.getString(2);
                      s3=rs.getString(3);
                      s4=rs.getString(4);
                      s5=rs.getString(5);
                      s8=rs.getString(8);
                      s6=rs.getString(10);
          try
           {
                   st4=con.createStatement();
                   rs4=st4.executeQuery("select * from post where post.pid='"+p1+"'");
                   while(rs4.next())
                   {
                   	count++;
                   }
           }
       
       catch(SQLException mm2)
       {
           pw.println(mm2);
       }
    
     pw.println("<!DOCTYPE html>");
pw.println("<html lang='en'>");
pw.println("<head>");

  pw.println("<!-- SITE TITTLE -->");
  pw.println("<meta charset='utf-8'>");
  pw.println("<meta http-equiv='X-UA-Compatible' content='IE=edge'>");
  pw.println("<meta name='viewport' content='width=device-width, initial-scale=1'>");
  pw.println("<title>"); pw.println("My Profile");pw.println("</title>");
  
  pw.println("<!-- PLUGINS CSS STYLE -->");
  pw.println("<style type='text/css'>");
    pw.println(".round");
pw.println("{");
pw.println("border-radius: 50%;");
pw.println("}");

pw.println(".profile-thumb img");
  	pw.println("{");
  		pw.println("width: 180px !important;");
			pw.println("height: 180px !important;");
  pw.println("	}");
  pw.println("</style>");
  pw.println("<link href='profile/plugins/jquery-ui/jquery-ui.min.css' rel='stylesheet'>");
  pw.println("<!-- Bootstrap -->");
  pw.println("<link href='profile/plugins/bootstrap/dist/css/bootstrap.min.css' rel='stylesheet'>");
  pw.println("<!-- Font Awesome -->");
  pw.println("<link rel='stylesheet' type='text/css' href='vendor/rahul.css'>");
     pw.println("<link rel='shortcut icon' type='image/x-icon'  href='admin/img/house.png'>");
  pw.println("<link href='profile/plugins/font-awesome/css/font-awesome.min.css' rel='stylesheet'>");
  pw.println("<!-- Owl Carousel -->");
  pw.println("<link href='profile/plugins/slick-carousel/slick/slick.css' rel='stylesheet'>");
  pw.println("<link href='profile/plugins/slick-carousel/slick/slick-theme.css' rel='stylesheet'>");
  pw.println("<!-- Fancy Box -->");
  pw.println("<link href='profile/plugins/fancybox/jquery.fancybox.pack.css' rel='stylesheet'>");
  pw.println("<link href='profile/plugins/jquery-nice-select/css/nice-select.css' rel='stylesheet'>");
  pw.println("<link href='profile/plugins/seiyria-bootstrap-slider/dist/css/bootstrap-slider.min.css' rel='stylesheet'>");
  pw.println("<!-- CUSTOM CSS -->");
  pw.println("<link href='profile/css/style.css' rel='stylesheet'>");

  pw.println("<!-- FAVICON -->");
  pw.println("<link href='profile/img/favicon.png' rel='shortcut icon'>");

  pw.println("<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->");
  pw.println("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->");
  pw.println("<!--[if lt IE 9]>");
  pw.println("<script src='https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js'>");pw.println("</script>");
  pw.println("<script src='https://oss.maxcdn.com/respond/1.4.2/respond.min.js'>");pw.println("</script>");
  pw.println("<![endif]-->");
  

pw.println("</head>");

pw.println("<body class='body-wrapper'>");

pw.println("<section>");
  pw.println("<div class='container'>");
    pw.println("<div class='row'>");
      pw.println("<div class='col-sm-12 bgm'>");pw.println("<a class='add-button' href='index.html'>"); pw.println("Home");pw.println("</a>");
        pw.println("<a class='add-button' href='post'>");pw.println("<i class='fa fa-plus-circle'>");pw.println("</i>"); pw.println("Post Ads");pw.println("</a>");pw.println("</div>");
      pw.println("</div>");
    pw.println("</div>");
  pw.println("</div>");
pw.println("</section>");

pw.println("<section class='dashboard section'>");
  pw.println("<!-- Container Start -->");
  pw.println("<div class='container'>");
    pw.println("<!-- Row Start -->");
    pw.println("<div class='row'>");
      pw.println("<div class='col-md-4 offset-md-1 col-lg-4 offset-lg-0'>");
        pw.println("<div class='sidebar'>");
          pw.println("<!-- User Widget -->");
          pw.println("<div class='widget user-dashboard-profile'>");
            pw.println("<!-- User Image -->");
            pw.println("<div class='profile-thumb'>");
            if(s8==null)
              pw.println("<img src='profilepic/user-thumb.jpg' alt='' class='rounded-circle'>");
            else
              pw.println("<img src='profilepic/"+s1+".jpg' alt='' class='rounded-circle' class='round' width='80px' height='80px'>");
            pw.println("</div>");
           
            if(s3!=null)
            {
            pw.println("<h5 class='text-center'>"); pw.println(s2+" "+s3);pw.println("</h5>");
          }
          else
          {
              pw.println("<h5 class='text-center'>"); pw.println(s2);pw.println("</h5>");
          }
            pw.println("<p>"); pw.println(s4);pw.println("</p>");
            pw.println("<a href='edit' class='btn btn-main-sm'>"); pw.println("Edit Profile");pw.println("</a>");
          pw.println("</div>");
          pw.println("<!-- Dashboard Links -->");
          pw.println("<div class='widget user-dashboard-menu'>");
            pw.println("<ul>");
              
              pw.println("<li>");
                pw.println("<a href='profile'>");pw.println("<i class='fa fa-comment-o'>");pw.println("</i>"); pw.println("Messages"); pw.println("<span>"); pw.println("0");pw.println("</span>");pw.println("</a>");
              pw.println("</li>");
              pw.println("<li>");
                pw.println("<a href='#'>");pw.println("<i class='fa fa-bookmark-o'>");pw.println("</i>");  pw.println("Posted Ads ");pw.println("<span>"); pw.println(count);pw.println("</span>");pw.println("</a>");
              pw.println("</li>");
              pw.println("<li>");
                pw.println("<a href='logout'>");pw.println("<i class='fa fa-cog'>");pw.println("</i>");  pw.println("Logout");pw.println("</a>");
              pw.println("</li>");
              pw.println("<li>");
                pw.println("<a href='index.html'>");pw.println("<i class='fa fa-power-off'>");pw.println("</i>"); pw.println("Delete Account");pw.println("</a>");
              pw.println("</li>");
            pw.println("</ul>");
          pw.println("</div>");
        pw.println("</div>");
      pw.println("</div>");
      pw.println("<div class='col-md-8 offset-md-1 col-lg-8 offset-lg-0'>");
        pw.println("<!-- Recently Favorited -->");
        pw.println("<div class='widget dashboard-container my-adslist'>");
          pw.println("<h3 class='widget-header'>"); pw.println("My Ads");pw.println("</h3>");
          pw.println("<table class='table table-responsive product-dashboard-table'>");
            pw.println("<thead>");
              pw.println("<tr>");
                pw.println("<th>");pw.println("Image");pw.println("</th>");
                pw.println("<th>");pw.println("Product Title");pw.println("</th>");
                pw.println("<th class='text-center'>");pw.println("Category");pw.println("</th>");
                pw.println("<th class='text-center'>");pw.println("Action");pw.println("</th>");
              pw.println("</tr>");
            pw.println("</thead>");
            try
            {
            	st3=con.createStatement();
            	rs3=st3.executeQuery("select postid from post where pid='"+p1+"'");
            	while(rs3.next())
            	{
            		m4=rs3.getInt(1);
            	
            	
       try
       {                 
         st2=con.createStatement();  
         rs2=st2.executeQuery("select post.pathh,post.postid,post.title,post.nearid,post.catagary,post.img1,post.date,near.nearname from post  inner join near on near.nearid= post.nearid and postid='"+m4+"'");
           while(rs2.next())

              {
              						c5=rs2.getString(1);												
                          m1=rs2.getString(2);
                          k1=rs2.getString(3);
                          m2=rs2.getString(4);
                          k2=rs2.getString(5);
                          k3=rs2.getString(6);
                          k5=rs2.getString(7);
                          k4=rs2.getString(8);
                        
                         
            pw.println("<tbody>");
            pw.println("<tr>");
            

                pw.println("<td class='product-thumb'>");
                  pw.println("<img width='80px' height='80px' src='postpic/"+s1+"/"+c5+"/"+k3+"' alt='image description'>");pw.println("</td>");
                   pw.println("<td class='product-details'>");
                  pw.println("<h3 class='title'>");pw.println(k1);pw.println("</h3>");
                  pw.println("<span class='add-id'>");pw.println("<strong>");pw.println("Ad ID:");pw.println("</strong>");pw.println(m1);pw.println("</span>");
                  pw.println("<span>");pw.println("<strong>");pw.println("Posted on:"); pw.println("</strong>");pw.println("<time>");pw.println(k5);pw.println("</time>"); pw.println("</span>");
                  pw.println("<span class='status active'>");pw.println("<strong>");pw.println("Status");pw.println("</strong>"); pw.println("Active");pw.println("</span>");
                  pw.println("<span class='location'>");pw.println("<strong>");pw.println("Location");pw.println("</strong>");pw.println(k4);pw.println("</span>");
                pw.println("</td>");
                pw.println("<td class='product-category'>");pw.println("<span class='categories'>");pw.println(k2);pw.println("</span>");pw.println("</td>");
                pw.println("<td class='action' data-title='Action'>");
                  pw.println("<div class=''>");
                    pw.println("<ul class='list-inline justify-content-center'>");
                      pw.println("<li class='list-inline-item'>");
                        pw.println("<a data-toggle='tooltip' data-placement='top' title='Tooltip on top' class='view' href=''>");
                          pw.println("<i class='fa fa-eye'>");pw.println("</i>");
                        pw.println("</a>");   
                      pw.println("</li>");
                      pw.println("<li class='list-inline-item'>");
                        pw.println("<a class='edit' href='edit1?k="+m1+"'>");
                          pw.println("<i class='fa fa-pencil' >");pw.println("</i>");
                        pw.println("</a>");   
                      pw.println("</li>");
                      pw.println("<li class='list-inline-item'>");
                        pw.println("<a class='delete' href='delete?k="+m1+"' >");
                      //pw.println("<a class='delete' href='#'>");
                          pw.println("<i class='fa fa-trash'>");pw.println("</i>");
                        pw.println("</a>");
                      pw.println("</li>");
                    pw.println("</ul>");
                  pw.println("</div>");
                pw.println("</td>");
              pw.println("</tr>");
            pw.println("</tbody>");
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
            catch(SQLException o)
            {
            	pw.println(o);
            }
          pw.println("</table>");
          
        pw.println("</div>");
      pw.println("</div>");
    pw.println("</div>");
    pw.println("<!-- Row End -->");
  pw.println("</div>");
  pw.println("<!-- Container End -->");
pw.println("</section>");
pw.println("<!-- Footer Bottom -->");
pw.println("<footer class='footer-bottom'>");
    pw.println("<!-- Container Start -->");
    pw.println("<div class='container'>");
      pw.println("<div class='row'>");
        pw.println("<div class='col-sm-6 col-12'>");
          pw.println("<!-- Copyright -->");
          pw.println("<div class='copyright'>");
            pw.println("<p>");pw.println("Copyright © 2019. All Rights Reserved roomseeker.in");pw.println("</p>");
          pw.println("</div>");
        pw.println("</div>");
        pw.println("<div class='col-sm-6 col-12'>");
          pw.println("<!-- Social Icons -->");
          pw.println("<ul class='social-media-icons text-right'>");
              pw.println("<li>");pw.println("<a class='fa fa-facebook' href=''>");pw.println("</a>");pw.println("</li>");
              pw.println("<li>");pw.println("<a class='fa fa-twitter' href=''>");pw.println("</a>");pw.println("</li>");
              pw.println("<li>");pw.println("<a class='fa fa-pinterest-p' href=''>");pw.println("</a>");pw.println("</li>");
              pw.println("<li>");pw.println("<a class='fa fa-vimeo' href=''>");pw.println("</a>");pw.println("</li>");
            pw.println("</ul>");
        pw.println("</div>");
      pw.println("</div>");
    pw.println("</div>");
    pw.println("<!-- Container End -->");
    pw.println("<!-- To Top -->");
    
pw.println("</footer>");

  pw.println("<!-- JAVASCRIPTS -->");
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