

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class des extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        Connection con=null;
        Statement st=null;
         Statement st2=null;
              ResultSet rs=null;
ResultSet rs2=null;
               HttpSession session =req.getSession();
     
      int s1=Integer.parseInt(req.getParameter("post1"));
      
       
       if(s1==0)
       	res.sendRedirect("searchroom");

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
      String s2="",s3="",s4="",s5="",s6="",s7="",s8="",k1="",k2="",k3="",c5="",m1="",m2="",s9="";
      String b1="",b2="",b3="";

int m3,m8;
       try
       {                 
           st=con.createStatement();   
    
           rs=st.executeQuery("select post.pathh,post.img1,post.img2,post.img3,post.img4,post.price,post.catagary,post.properties,post.bedrooms,near.nearname,post.title,post.email,post.address,post.furnish,post.ptype,post.gender,near.location from post inner join near on near.nearid=post.nearid and postid='"+s1+"'");
         
           if(rs.next())

              {      // m8=rs.getInt(1);
                c5=rs.getString(1);
                      s2=rs.getString(2);
                      k1=rs.getString(3);
                      k2=rs.getString(4);
                      k3=rs.getString(5);
                        m1=rs.getString(6);
                          s3=rs.getString(7);
                          s4=rs.getString(8);
                          m2=rs.getString(9);
                          s5=rs.getString(10);
                          s6=rs.getString(11);
                          s8=rs.getString(12);
                          s7=rs.getString(13);
                            b1=rs.getString(14);
                              b2=rs.getString(15);
                                b3=rs.getString(16);
                          s9=rs.getString(17);
   // c5=Integer.toString(m8);
pw.println("<!DOCTYPE html>");
pw.println("<html>");
pw.println("<head>");
pw.println("<title>");pw.println("find your idel room for Rent");pw.println("</title>");
pw.println("<script src='js/jquery.min.js'>");pw.println("</script>");
pw.println("<script src='js/scripts.js'>");pw.println("</script>");
pw.println("<link href='css/styles.css' rel='stylesheet'>");
pw.println("<link href='css/style1.css' rel='stylesheet' type='text/css' media='all' />");  
 pw.println("<link rel='shortcut icon' type='image/x-icon'  href='admin/img/house.png'>");
pw.println("<meta name='viewport' content='width=device-width, initial-scale=1'>");
pw.println("<meta http-equiv='Content-Type' content='text/html; charset=utf-8' />");
pw.println("<meta name='keywords' content='room search,room description,RoomSeeker,find room on rent' />");
pw.println("<script type='application/x-javascript'>"); pw.println("addEventListener('load', function() { setTimeout(hideURLbar, 0); }, false);");
pw.println("function hideURLbar(){ window.scrollTo(0,1); }"); pw.println("</script>");
pw.println("<link rel='stylesheet' type='text/css' href='vendor/rahul.css'>");
    
pw.println("<link href='css/font-awesome.css' rel='stylesheet'>"); 
pw.println("<link href='css/bootstrap.css' rel='stylesheet' type='text/css' media='all' />");
pw.println("<link rel='stylesheet' type='text/css' href='css/zoomslider.css' />");
pw.println("<link rel='stylesheet' type='text/css' href='css/style.css' />");
pw.println("<link rel='stylesheet' type='text/css' href='css/component.css' />");
pw.println("<script type='text/javascript' src='js/modernizr-2.6.2.min.js'>");pw.println("</script>");
pw.println("<!--/web-fonts-->");
pw.println("<link rel='stylesheet' type='text/css' media='all' href='css2/style2.css'>");
  pw.println("<script type='text/javascript' src='js2/jquery-1.9.1.min2.js'>");pw.println("</script>");
  pw.println("<script type='text/javascript' src='js2/jquery.autocomplete.min2.js'>");pw.println("</script>");
  pw.println("<script type='text/javascript' src='js2/currency-autocomplete2.js'>");pw.println("</script>");

  pw.println("<link href='css/font-awesome.min.css' rel='stylesheet' type='text/css' media='all' />");
  pw.println("<link href='//fonts.googleapis.com/css?family=Open+Sans:400,600,600italic,300,300italic,700,400italic' rel='stylesheet' type='text/css'>");
  pw.println("<link href='//fonts.googleapis.com/css?family=Wallpoet' rel='stylesheet' type='text/css'>");
  pw.println("<link href='//fonts.googleapis.com/css?family=Ubuntu:400,500,700,300' rel='stylesheet' type='text/css'>");
pw.println("<!--//web-fonts-->");
pw.println("</head>");

pw.println("<body style='background-color: white;'>");
pw.println("<!--/banner-section-->");
    pw.println("<div id='demo-1' class='banner-inner'>");
   pw.println("<div class='banner-inner-dott'>");
       pw.println("<div class='header-top'>");
        pw.println("<!-- /header-left -->");
                  pw.println("<div class='header-left'>");
          pw.println("<!-- /sidebar -->");
                pw.println("<div id='sidebar'>"); 
               pw.println("<h4 class='menu'>");pw.println("menu");pw.println("</h4>");
               
                      pw.println("<ul>");
                        // pw.println("<li>");pw.println("<a href='index.html'>"); pw.println("Home");pw.println("</a>");pw.println("</li>");
                         pw.println("<li>");pw.println("<a href='index.html'>"); pw.println("Home");pw.println("</a>");pw.println("</li>");
                         pw.println("<li>");pw.println("<a href='login'>");pw.println("Register");pw.println("</a>");pw.println("</li>");
                          pw.println("<li>");pw.println("<a href='profile'>");pw.println("My account");pw.println("</a>");pw.println("</li>");
                            pw.println("<li>");pw.println("<a href='profile'>");pw.println("Post Add");pw.println("</a>");pw.println("</li>");
                 pw.println("<li>");pw.println("<a href='team'>");pw.println("Team");pw.println("</a>");pw.println("</li>");
                 pw.println("<li>");pw.println("<a href='contact'>");pw.println("Contact-Us");pw.println("</a>");pw.println("</li>");
              
               pw.println("</ul>");
                pw.println("<div id='sidebar-btn'>");
                 pw.println("<div>");
                 pw.println("<span>");pw.println("</span>");
                 pw.println("<span>");pw.println("</span>");
                 pw.println("<span>");pw.println("</span>");
              pw.println("</div>");
             
               pw.println("</div>");
             pw.println("</div>");

               pw.println("<script>");
                  pw.println("var sidebarbtn = document.getElementById('sidebar-btn');");
                  pw.println("var sidebar = document.getElementById('sidebar');");
                  pw.println(" sidebarbtn.addEventListener('click', function () {");
                 pw.println(" if(sidebar.classList.contains('visible')){");
                   pw.println(" sidebar.classList.remove('visible');"); 
                   pw.println("}else {");
                    pw.println("sidebar.className = 'visible';");
                  pw.println("}");
                  pw.println("});");
                pw.println("</script>");
              pw.println("<!-- //sidebar -->");
           
           
          pw.println("</div>");pw.println("<br>");
          pw.println("<!-- //header-left -->");
           
            
          pw.println("</div>");
          pw.println("<div class='clearfix'>");pw.println("</div>");

      pw.println("<div class='banner-info'>");
        pw.println("<h2>"); pw.println("<a href='index.html'>"); pw.println("<span class='logo-sub'>");pw.println("To-Let for students "); pw.println("</span>");  pw.println("</a>"); pw.println("</h2>");
      pw.println("<div id='w'>");
   
        
      pw.println("<div id='searchfield'>");
        pw.println("<form action='searchroom'>");
          pw.println("<input type='text' name='k1' class='biginput' id='autocomplete' placeholder='search for location'>");
          
          pw.println("<select id='country' onchange='change_country(this.value)' name='k2' class='biginput'>");
            pw.println("<option value='null'>");pw.println("<img src='images/rupee.png' alt=' ' class='img-responsive' />");pw.println("select room type");pw.println("</option>");
          pw.println("<option value='rooms'>");pw.println("ROOMS");pw.println("</option>");
           pw.println("<option value='hostel'>");pw.println("HOSTELS");pw.println("</option>");
            pw.println("<option value='flat'>");pw.println("FLATS");pw.println("</option>");
            pw.println("<option value='house'>");pw.println("HOUSES");pw.println("</option>");
            pw.println("<option value='shop'>");pw.println("SHOPS");pw.println("</option>");

          pw.println("</select>");
        
          pw.println("<input type='submit' class='biginputbtn' value='submit' name=''>");
        pw.println("</form>");
      pw.println("</div>");
    
   
  pw.println("</div>");

        pw.println("</div>");
    pw.println("</div>");
      /////////////////////////

      pw.println("</div>");
    pw.println("<!--//banner-info-->"); 
    pw.println("</div>");
   pw.println("</div>");
pw.println("<!-- discounts-->");
    
      pw.println("<!-- //discounts-->");
        pw.println("<!-- //sign-up-->");
        pw.println("<div class='modal ab fade' id='myModal2' tabindex='-1' role='dialog' aria-labelledby='myModalLabel'>");
        pw.println("<div class='modal-dialog sign' role='document'>");
          pw.println("<div class='modal-content about'>");
            pw.println("<div class='modal-header one'>");
              pw.println("<button type='button' class='close sg' data-dismiss='modal' aria-label='Close'>");pw.println("<span aria-hidden='true'>");pw.println("&times;");pw.println("</span>");pw.println("</button>"); 
                pw.println("<div class='discount one'>");
                  pw.println("<h3>");pw.println("Sign Up");pw.println("</h3>");
                  
                pw.println("</div>");             
            pw.println("</div>");
             pw.println("<div class='modal-body about'>");
                pw.println("<div class='login-top sign-top one'>");
               pw.println("<form action='#' method='post'>");
                  pw.println("<input type='text' name='name' class='name active' placeholder='Your Name' required=''>");
                  pw.println("<input type='text' name='email' class='email' placeholder='Email' required=''>");
                  pw.println("<input type='password' name='password' class='password' placeholder='Password' required=''>");    
                  pw.println("<input type='checkbox' id='brand1' value=''>");
                  pw.println("<label for='brand1'>");pw.println("<span>");pw.println("</span>"); pw.println("Remember me");pw.println("</label>");
                  pw.println("<div class='login-bottom one'>");
                  pw.println("<ul>");
                    pw.println("<li>");
                      pw.println("<a href='#'>");pw.println("Forgot password?");pw.println("</a>");
                    pw.println("</li>");
                    pw.println("<li>");
                    
                      pw.println("<input type='submit' value='SIGN UP'>");
                    
                    pw.println("</li>");
                  pw.println("<div class='clearfix'>");pw.println("</div>");
                pw.println("</ul>");
                pw.println("</div>"); 
                pw.println("</form>");
              pw.println("</div>");
              
              
             pw.println("</div>");
             pw.println("<div class='social-icons'>");
                  pw.println("<ul>"); 
                    pw.println("<li>");pw.println("<a href='#'>");pw.println("<span class='icons'>");pw.println("</span>");pw.println("<span class='text'>");pw.println("Facebook");pw.println("</span>");pw.println("</a>");pw.println("</li>");
                    pw.println("<li class='twt'>");pw.println("<a href='#'>");pw.println("<span class='icons'>");pw.println("</span>");pw.println("<span class='text'>");pw.println("Twitter");pw.println("</span>");pw.println("</a>");pw.println("</li>");
                    pw.println("<li class='ggp'>");pw.println("<a href='#'>");pw.println("<span class='icons'>");pw.println("</span>");pw.println("<span class='text'>");pw.println("Google+");pw.println("</span>");pw.println("</a>");pw.println("</li>");
                  pw.println("</ul>"); 
                  pw.println("</div>");
                
          pw.println("</div>");
        pw.println("</div>");
      pw.println("</div>");
      pw.println("<!-- //sign-up-->");
        pw.println("<!-- /location-->");
        pw.println("<div class='modal ab fade' id='myModal4' tabindex='-1' role='dialog' aria-labelledby='myModalLabel'>");
        pw.println("<div class='modal-dialog sign' role='document'>");
          pw.println("<div class='modal-content about'>");
            pw.println("<div class='modal-header one'>");
              pw.println("<button type='button' class='close sg' data-dismiss='modal' aria-label='Close'>");pw.println("<span aria-hidden='true'>");pw.println("&times;");pw.println("</span>");pw.println("</button>"); 
                pw.println("<div class='discount one'>");
                  pw.println("<h3>");pw.println("Please Tell Us Your City");pw.println("</h3>");
                  
                pw.println("</div>");             
            pw.println("</div>");
             pw.println("<div class='modal-body about'>");
                pw.println("<div class='login-top sign-top location'>");
                 pw.println("<form action='#' method='post'>");
                              pw.println("<select id='country12' onchange='change_country(this.value)' class='frm-field required'>");
                            pw.println("<option value='null'>"); pw.println("Select City");pw.println("</option>");
                            pw.println("<option value='city'>");pw.println("Amsterdam");pw.println("</option>");
                          
                    pw.println("</select>");
                pw.println("</form>");
                   pw.println("</div>");
              
              
             pw.println("</div>");

                
          pw.println("</div>");
        pw.println("</div>");
      pw.println("</div>");
      pw.println("<!-- //location-->");
      pw.println("<!-- /get-->");
        pw.println("<div class='modal ab fade' id='myModal3' tabindex='-1' role='dialog' aria-labelledby='myModalLabel'>");
        pw.println("<div class='modal-dialog sign' role='document'>");
          pw.println("<div class='modal-content about'>");
            pw.println("<div class='modal-header one'>");
              pw.println("<button type='button' class='close sg' data-dismiss='modal' aria-label='Close'>");pw.println("<span aria-hidden='true'>");pw.println("&times;");pw.println("</span>");pw.println("</button>"); 
                pw.println("<div class='discount one'>");
                  pw.println("<h3>");pw.println("Make car insurance buying easier");pw.println("</h3>");
                  
                pw.println("</div>");             
            pw.println("</div>");
             pw.println("<div class='modal-body about'>");
                pw.println("<div class='login-top sign-top get'>");
                  pw.println("<ul class='car-insurance'>");
                       pw.println("<li>");pw.println("<i class='fa fa-signal' aria-hidden='true'>");pw.println("</i>");pw.println("<h6>"); pw.println("Zero"); pw.println("<br>"); pw.println("Depreciation");pw.println("</h6>");pw.println("</li>");
                     pw.println("<li>");pw.println("<i class='fa fa-truck' aria-hidden='true'>");pw.println("</i>");pw.println("<h6>"); pw.println("Road-side"); pw.println("<br>"); pw.println("assistance");pw.println("</h6>");pw.println("</li>");
                     pw.println("<li>");pw.println("<i class='fa fa-gavel' aria-hidden='true'>");pw.println("</i>");pw.println("<h6>"); pw.println("Hydro-static"); pw.println("<br>"); pw.println("cover-lock");pw.println("</h6>");pw.println("</li>");
                     pw.println("</ul>");
                   pw.println("<form action='#' method='post'>");
                   
                  pw.println("<input type='text' name='email' class='email' placeholder='Email' required=''>");
                  pw.println("<input type='password' name='password' class='password' placeholder='Password' required=''>");    
                  pw.println("<input type='submit' value='Submit'>");
                pw.println("</div>"); 
                pw.println("</form>");
                
              pw.println("</div>");
            
              
             pw.println("</div>");
                
          pw.println("</div>");
        pw.println("</div>");
      pw.println("</div>");
      pw.println("<!-- //get-->");
    pw.println("<!--//banner-section-->");
    pw.println("<!--/breadcrumb-->");
        pw.println("<div class='service-breadcrumb w3-agile'>");
        pw.println("<div class='container'>");
          pw.println("<div class='wthree_service_breadcrumb_left'>");
            pw.println("<ul>");
              pw.println("<li>");pw.println("<a href='index.html'>");pw.println("Home");pw.println("</a>"); pw.println("<i>");pw.println("|");pw.println("</i>");pw.println("</li>");
              pw.println("<li>");pw.println("Room Description");pw.println("</li>");
            pw.println("</ul>");
          pw.println("</div>");
          
          pw.println("<div class='clearfix'>"); pw.println("</div>");
        pw.println("</div>");
      pw.println("</div>");
    pw.println("<!--//breadcrumb-->");
pw.println("<div class='container'>");
  
  pw.println("<div class='buy-single-single'>");
  
      pw.println("<div class='col-md-9 single-box'>");
        
       pw.println("<div class=' buying-top'>"); 
      pw.println("<div class='flexslider'>");
  pw.println("<ul class='slides slides1'>");
  
    pw.println("<li data-thumb='postpic/"+s8+"/"+c5+"/"+s2+"'>");
      pw.println("<img src='postpic/"+s8+"/"+c5+"/"+s2+"' />");
    pw.println("</li>");
    pw.println("<li data-thumb='postpic/"+s8+"/"+c5+"/"+k1+"'>");
      pw.println("<img src='postpic/"+s8+"/"+c5+"/"+k1+"' />");
    pw.println("</li>");
    pw.println("<li data-thumb='postpic/"+s8+"/"+c5+"/"+k2+"'>");
      pw.println("<img src='postpic/"+s8+"/"+c5+"/"+k2+"' />");
    pw.println("</li>");
    pw.println("<li data-thumb='postpic/"+s8+"/"+c5+"/"+k3+"'>");
      pw.println("<img src='postpic/"+s8+"/"+c5+"/"+k3+"' />");
    pw.println("</li>");
  pw.println("</ul>");
pw.println("</div>");
pw.println("<!-- FlexSlider -->");
  pw.println("<script defer src='js/jquery.flexslider.js'>");pw.println("</script>");
pw.println("<link rel='stylesheet' href='css/flexslider.css' type='text/css' media='screen' />");

pw.println("<script>");
pw.println("$(window).load(function() {");
 pw.println(" $('.flexslider').flexslider({");
    pw.println("animation: 'slide',");
   pw.println(" controlNav: 'thumbnails'");
  pw.println("});");
pw.println("});");
pw.println("</script>");
pw.println("</div>");
pw.println("<div class='buy-sin-single'>");
      pw.println("<div class='col-sm-5 middle-side immediate'>");
               pw.println("<h4>");pw.println("Possession: Immediate");pw.println("</h4>");
               pw.println("<p>");pw.println("<span class='bath1'>");pw.println("title"); pw.println("</span>");pw.println(":"); pw.println("<span class='two'>");pw.println(s6);pw.println("</span>");pw.println("</p>");
               pw.println("<p>");pw.println("<span class='bath2'>");pw.println("Properties");pw.println("</span>");pw.println(":");pw.println("<span class='two'>"); pw.println(s4);pw.println("</span>");pw.println("</p>");
             pw.println("<p>");pw.println("<span class='bath2'>");pw.println("Catagery");pw.println("</span>"); pw.println(":"); pw.println("<span class='two'>");pw.println(s3);pw.println("</span>");pw.println("</p>");
            
               pw.println("<p>");pw.println("<span class='bath2'>");pw.println("BedRooms"); pw.println("</span>");pw.println(":"); pw.println("<span class='two'>");pw.println(m2);pw.println("</span>");pw.println("</p>");
               pw.println("<p>");pw.println("<span class='bath2'>");pw.println("Furnishing");pw.println("</span>");pw.println(":"); pw.println("<span class='two'>");pw.println(b1);pw.println("</span>");pw.println("</p>");
                pw.println("<p>");pw.println("<span class='bath2'>");pw.println("Preferred Types");pw.println("</span>");pw.println(":");pw.println("<span class='two'>"); pw.println(b2);pw.println("</span>");pw.println("</p>");
              pw.println("<p>");pw.println("<span class='bath2'>");pw.println("Preferred Gender");pw.println("</span>");pw.println(":");pw.println("<span class='two'>"); pw.println(b3);pw.println("</span>");pw.println("</p>");
              pw.println("<p>");pw.println("<span class='bath2'>");pw.println("Monthly Rent"); pw.println("</span>");pw.println(":");pw.println("<span class='two'>"); pw.println("Rs. "+m1);pw.println("</span>");pw.println("</p>");         
             pw.println("<p>");pw.println("<span class='bath2'>");pw.println("Locality"); pw.println("</span>");pw.println(":");pw.println("<span class='two'>"); pw.println(s5);pw.println("</span>");pw.println("</p>");         
          pw.println("</div>");
           pw.println("<div class='col-sm-7 buy-sin'>");
            pw.println("<h4>");pw.println("Assress And Description");pw.println("</h4>");
pw.println("<pre>");pw.println(s7);pw.println("</pre>");
           pw.println("</div>");
           pw.println("<div class='clearfix'>"); pw.println("</div>");
          pw.println("</div>");
           pw.println("<div class='map-buy-single'>");
            pw.println("<h4>");pw.println("Neighborhood Info");pw.println("</h4>");
              pw.println("<div class='map-buy-single1'>");
                pw.println("<iframe src='"+s9+"'>");pw.println("</iframe>");
              
            pw.println("</div>");
          pw.println("</div>");
          
    pw.println("</div>");
  

      
    
    pw.println("<div class='clearfix'>"); pw.println("</div>");
    pw.println("</div>");
  pw.println("</div>");

pw.println("<!---->");


        
        
        
        pw.println("</div>");
        pw.println("<div class='clearfix'>"); pw.println("</div>");
      pw.println("</div>");
    pw.println("</div>");
  pw.println("</div>");
  
pw.println("</div>");
  pw.println("<div class='footer'>");
    pw.println("<div class='container'>");
      pw.println("<div class='footer-grids'>");
        pw.println("<div class='col-md-3 footer-grid animated wow slideInLeft' data-wow-delay='.5s'>");
          pw.println("<h3>");pw.println("About Us");pw.println("</h3>");
          pw.println("<p>");pw.println("We're RoomSeeker, the RoomSeeker site you can trust. Finding the right people to live with can feel like an impossible task - we're here to make it simpler, quicker and safer to help you find the perfect room,flats,hostels and Houses on Rent.");pw.println("</span>");pw.println("</p>");
        pw.println("</div>");
        pw.println("<div class='col-md-3 footer-grid animated wow slideInLeft' data-wow-delay='.6s'>");
          pw.println("<h3>");pw.println("Find us on");pw.println("</h3>");
          pw.println("<ul>");
            pw.println("<li>");pw.println("<i class='fa fa-facebook' aria-hidden='true'>");pw.println("</i>");
             pw.println("</i>");pw.println("facebook");pw.println("</li>");
            pw.println("<li>");pw.println("<i class='fa fa-instagram' aria-hidden='true'>");pw.println("</i>");pw.println("<a href='mailto:info@example.com'>");pw.println("instragram");pw.println("</a>");pw.println("</li>");
            pw.println("<li>");pw.println("<i class='fa fa-twitter' aria-hidden='true'>");pw.println("</i>");pw.println("</i>");pw.println("twitter");pw.println("</li>");
          pw.println("</ul>");
        pw.println("</div>");
        pw.println("<div class='col-md-3 footer-grid animated wow slideInLeft' data-wow-delay='.7s'>");
          pw.println("<h3>");pw.println("Flickr View");pw.println("</h3>");
          pw.println("<div class='footer-grid-left'>");
            pw.println("<a href='single.html'>");pw.println("<img src='images/13.jpeg' alt=' ' class='img-responsive' />");pw.println("</a>");
          pw.println("</div>");
          pw.println("<div class='footer-grid-left'>");
            pw.println("<a href='single.html'>");pw.println("<img src='images/14.jpeg' alt=' ' class='img-responsive' />");pw.println("</a>");
          pw.println("</div>");
          pw.println("<div class='footer-grid-left'>");
            pw.println("<a href='single.html'>");pw.println("<img src='images/15.jpeg' alt=' ' class='img-responsive' />");pw.println("</a>");
          pw.println("</div>");
          pw.println("<div class='footer-grid-left'>");
            pw.println("<a href='single.html'>");pw.println("<img src='images/16.jpeg' alt=' ' class='img-responsive' />");pw.println("</a>");
          pw.println("</div>");
          pw.println("<div class='footer-grid-left'>");
            pw.println("<a href='single.html'>");pw.println("<img src='images/17.jpeg' alt=' ' class='img-responsive' />");pw.println("</a>");
          pw.println("</div>");
          pw.println("<div class='footer-grid-left'>");
            pw.println("<a href='single.html'>");pw.println("<img src='images/18.jpeg' alt=' ' class='img-responsive' />");pw.println("</a>");
          pw.println("</div>");
          pw.println("<div class='footer-grid-left'>");
            pw.println("<a href='single.html'>");pw.println("<img src='images/19.jpeg' alt=' ' class='img-responsive' />");pw.println("</a>");
          pw.println("</div>");
          pw.println("<div class='footer-grid-left'>");
            pw.println("<a href='single.html'>");pw.println("<img src='images/20.jpeg' alt=' ' class='img-responsive' />");pw.println("</a>");
          pw.println("</div>");
          pw.println("<div class='footer-grid-left'>");
            pw.println("<a href='single.html'>");pw.println("<img src='images/21.jpeg' alt=' ' class='img-responsive' />");pw.println("</a>");
          pw.println("</div>");
          pw.println("<div class='clearfix'>"); pw.println("</div>");
        pw.println("</div>");
        pw.println("<div class='col-md-3 footer-grid animated wow slideInLeft' data-wow-delay='.8s'>");
          pw.println("<h3>");pw.println("Blog Posts");pw.println("</h3>");
          pw.println("<div class='footer-grid-sub-grids'>");
            pw.println("<div class='footer-grid-sub-grid-left'>");
              pw.println("<a href='single.html'>");pw.println("<img src='images/22.jpeg' alt=' ' class='img-responsive' />");pw.println("</a>");
            pw.println("</div>");
            pw.println("<div class='footer-grid-sub-grid-right'>");
              pw.println("<h4>");pw.println("<a href='single.html'>");pw.println("best site for Rooms"); pw.println("</a>");pw.println("</h4>");
              pw.println("<p>");pw.println("Posted On 25/3/2016");pw.println("</p>");
            pw.println("</div>");
            pw.println("<div class='clearfix'>"); pw.println("</div>");
          pw.println("</div>");
          pw.println("<div class='footer-grid-sub-grids'>");
            pw.println("<div class='footer-grid-sub-grid-left'>");
              pw.println("<a href='single.html'>");pw.println("<img src='images/23.jpeg' alt=' ' class='img-responsive' />");pw.println("</a>");
            pw.println("</div>");
            pw.println("<div class='footer-grid-sub-grid-right'>");
              pw.println("<h4>");pw.println("<a href='single.html'>");pw.println("Best rental platform");pw.println("</a>");pw.println("</h4>");
              pw.println("<p>");pw.println("Posted On 25/4/2016");pw.println("</p>");
            pw.println("</div>");
            pw.println("<div class='clearfix'>"); pw.println("</div>");
          pw.println("</div>");
          pw.println("<div class='footer-grid-sub-grids'>");
            pw.println("<div class='footer-grid-sub-grid-left'>");
              pw.println("<a href='single.html'>");pw.println("<img src='images/24.jpeg' alt=' ' class='img-responsive' />");pw.println("</a>");
            pw.println("</div>");
            pw.println("<div class='footer-grid-sub-grid-right'>");
              pw.println("<h4>");pw.println("<a href='single.html'>");pw.println("easy to find"); pw.println("</a>");pw.println("</h4>");
              pw.println("<p>");pw.println("Posted On 25/5/2016");pw.println("</p>");
            pw.println("</div>");
            pw.println("<div class='clearfix'>"); pw.println("</div>");
          pw.println("</div>");
        pw.println("</div>");
        pw.println("<div class='clearfix'>"); pw.println("</div>");
      pw.println("</div>");
    
      pw.println("<div class='copy-right animated wow slideInUp' data-wow-delay='.5s'>");
        pw.println("<p>");pw.println("&copy roomseeker.in");pw.println("</p>");
      pw.println("</div>");
    pw.println("</div>");
  pw.println("</div>");


        pw.println("<script src='js/jquery.light-carousel.js'>");pw.println("</script>"); 
        pw.println("<script>");
          pw.println("$('.sample1').lightCarousel();");
        pw.println("</script>"); 
        pw.println("<link href='css/light-carousel.css' rel='stylesheet' type='text/css'>");

pw.println("<script src='js/bootstrap.js'>");pw.println("</script>");
 
pw.println("<div id='loader-wrapper'>");
        pw.println("<div id='preloader_1'>");
                  pw.println("<span>");pw.println("</span>");
                  pw.println("<span>");pw.println("</span>");
                  pw.println("<span>");pw.println("</span>");
                  pw.println("<span>");pw.println("</span>");
                  pw.println("<span>");pw.println("</span>");
              pw.println("</div>");
      pw.println("</div>");
  pw.println("<script type='text/javascript' src='vendor/theme.js'>");pw.println("</script>");
  
pw.println("</body>");
pw.println("</html>");
                    
              } 
              else
              res.sendRedirect("search");
              
                    
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