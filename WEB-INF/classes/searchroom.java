

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class searchroom extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        Connection con=null;
        Statement st=null;
        Statement st2=null;
        ResultSet rs=null;
        ResultSet rs3=null;
        Statement st3=null;
        ResultSet rs2=null;
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
      String s1="", s2="",s3="",s4="",s5="",s6="",s7="",s8="",s9="",s10="",m2="";
      int m1,m3,m4,m8;
      String p2="",p3="",p4="",p5="",p6="",p7="",p8="",p9="",c5;
       s2=req.getParameter("k1");
        s3=req.getParameter("k2");
       if(s2.equals("null") || s3.equals("null"))
       {
       	res.sendRedirect("search");
       }
        int p1=0;
        try
        {
                 st=con.createStatement();
                 rs=st.executeQuery("select nearid from near where nearname='"+s2+"'");
                 while(rs.next())
                 {
                       p1=rs.getInt(1);
                     
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





                           
               
pw.println("<!DOCTYPE html>");
pw.println("<html>");
pw.println("<head>");
pw.println("<style type='text/css'>");
    pw.println(".thumbnail1 a img{");
       pw.println("width: 380px !important;");
       pw.println("height: 270px !important;");
     pw.println("}");
      pw.println("#MyForm{");
  pw.println("display: none;");
pw.println("}");
pw.println("#Mybtn");
pw.println("{");
  
  pw.println("background-color: rgb(047BD5);");
  pw.println("width: 100%;");

pw.println("}");
  pw.println("</style>");
pw.println("<title>");pw.println("Search room");pw.println("</title>");
pw.println("<!-- for-mobile-apps -->");
pw.println("<meta name='viewport' content='width=device-width, initial-scale=1'>");
pw.println("<meta http-equiv='Content-Type' content='text/html; charset=utf-8' />");
pw.println("<meta name='keywords' content='search room ,Tolet for student,room for rent' />");
pw.println("<script type='application/x-javascript'>"); pw.println("addEventListener('load', function() { setTimeout(hideURLbar, 0); }, false);");
pw.println("function hideURLbar(){ window.scrollTo(0,1); }"); pw.println("</script>");
pw.println("<!-- //for-mobile-apps -->");
 pw.println("<link rel='shortcut icon' type='image/x-icon'  href='admin/img/house.png'>");
pw.println("<link href='css/bootstrap.css' rel='stylesheet' type='text/css' media='all' />");
pw.println("<link rel='stylesheet' type='text/css' href='css/zoomslider.css' />");
pw.println("<link rel='stylesheet' type='text/css' href='css/style.css' />");
pw.println("<link rel='stylesheet' type='text/css' href='css/component.css' />");
pw.println("<link rel='stylesheet' type='text/css' href='css/jquery-ui1.css'>");
pw.println("<link href='css/font-awesome.min.css' rel='stylesheet' type='text/css' media='all' />");
pw.println("<script type='text/javascript' src='js/modernizr-2.6.2.min.js'>");pw.println("</script>");
pw.println("<!--/web-fonts-->");

pw.println("<link rel='stylesheet' type='text/css' media='all' href='css2/style2.css'>");
  pw.println("<script type='text/javascript' src='js2/jquery-1.9.1.min2.js'>");pw.println("</script>");
  pw.println("<script type='text/javascript' src='js2/jquery.autocomplete.min2.js'>");pw.println("</script>");
  pw.println("<script type='text/javascript' src='js2/currency-autocomplete2.js'>");pw.println("</script>");


pw.println("<link href='//fonts.googleapis.com/css?family=Open+Sans:400,600,600italic,300,300italic,700,400italic' rel='stylesheet' type='text/css'>");
pw.println("<link href='//fonts.googleapis.com/css?family=Wallpoet' rel='stylesheet' type='text/css'>");
pw.println("<link href='//fonts.googleapis.com/css?family=Ubuntu:400,500,700,300' rel='stylesheet' type='text/css'>");
pw.println("<!--//web-fonts-->");

 pw.println("<script type='text/javascript'>");
       pw.println(" $('.product-list').click(function() {");
            pw.println("$(this).siblings('input:checkbox').prop('checked', false);");
       pw.println(" });");
      pw.println("</script>");
pw.println("<script type='text/javascript'>");
pw.println("$(document).ready(function(){");
  pw.println("$('#Mybtn').click(function(){");
      pw.println("$('#MyForm').toggle(1000);");
 pw.println(" });");

    
pw.println("});");
pw.println("</script>");
pw.println("<script type='text/javascript'>");
       pw.println(" $('.product-list1').click(function() {");
            pw.println("$(this).siblings('input:checkbox').prop('checked', false);");
       pw.println(" });");
      pw.println("</script>");
pw.println("<script type='text/javascript'>");
       pw.println(" $('.product-list2').click(function() {");
            pw.println("$(this).siblings('input:checkbox').prop('checked', false);");
       pw.println(" });");
      pw.println("</script>");
pw.println("<script type='text/javascript'>");
       pw.println(" $('.product-list3').click(function() {");
            pw.println("$(this).siblings('input:checkbox').prop('checked', false);");
       pw.println(" });");
      pw.println("</script>");
pw.println("<script type='text/javascript'>");
       pw.println(" $('.product-list4').click(function() {");
            pw.println("$(this).siblings('input:checkbox').prop('checked', false);");
       pw.println(" });");
      pw.println("</script>");
pw.println("<script type='text/javascript'>");
       pw.println(" $('.product-list5').click(function() {");
            pw.println("$(this).siblings('input:checkbox').prop('checked', false);");
       pw.println(" });");
      pw.println("</script>");



pw.println("</head>");
pw.println("<body>");
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
                   pw.println("sidebarbtn.addEventListener('click', function () {");
                  pw.println("if(sidebar.classList.contains('visible')){");
                    pw.println("sidebar.classList.remove('visible');"); 
                   pw.println("}else {");
                    pw.println("sidebar.className = 'visible';");
                 pw.println(" }");
                 pw.println(" });");
                pw.println("</script>");
        
           
           
          pw.println("</div>");pw.println("<br>");
      
          pw.println("<div class='clearfix'>");pw.println("</div>");
        
  ////////////////////////////////////////////////
    
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
   ////////////////////////////////////   
    pw.println("</div>");
   pw.println("</div>");
pw.println("<!-- discounts-->");
      pw.println("<div class='modal ab fade' id='myModal1' tabindex='-1' role='dialog' aria-labelledby='myModalLabel'>");
        pw.println("<div class='modal-dialog about' role='document'>");
          pw.println("<div class='modal-content about'>");
            pw.println("<div class='modal-header'>");
              pw.println("<button type='button' class='close ab' data-dismiss='modal' aria-label='Close'>");pw.println("<span aria-hidden='true'>");pw.println("&times;");pw.println("</span>");pw.println("</button>"); 
                pw.println("<div class='discount'>");
                  pw.println("<h3>");pw.println("Get Offers & Discount of");pw.println("</h3>");
                  pw.println("<p>");pw.println("Catchy Carz Brand VL in New York");pw.println("</p>");
                    pw.println("<form action='#' method='post'>");
                      pw.println("<select id='country5' onchange='change_country(this.value)' class='frm-field required'>");
                        pw.println("<option selected='selected' value='-1'>");pw.println("-Buying Time Period-");pw.println("</option>");
                        pw.println("<option value='0'>");pw.println("Just Researching");pw.println("</option>");
                        pw.println("<option value='7'>");pw.println("1 Week");pw.println("</option>");
                        pw.println("<option value='14'>");pw.println("2 Weeks");pw.println("</option>");
                        pw.println("<option value='30'>");pw.println("1 Month");pw.println("</option>");
                        pw.println("<option value='60'>");pw.println("2 Months");pw.println("</option>");
                      pw.println("</select>");
                      pw.println("<input type='text' class='Pin code' placeholder='Pin code' required=''>");
                    pw.println("</form>");
                pw.println("</div>");             
            pw.println("</div>");
             pw.println("<div class='modal-body about'>");
                
                pw.println("<div class='dis-contact'>");
                  pw.println("<h4>");pw.println("Contact Information");pw.println("</h4>");
                        pw.println("<form action='#' method='post'>");
                          pw.println("<input type='text' name='name' class='name active' placeholder='Name' required=''>");
                          pw.println("<input type='text' name='email' class='email' placeholder='Email' required=''>");
                          pw.println("<input type='text' name='phone' class='phone' placeholder='send message..' required=''>");
                          pw.println("<div class='d-c'>");  
                            pw.println("<span class='checkbox1'>");
                              pw.println("<label class='checkbox'>");pw.println("<input type='checkbox' name='' checked=''>");pw.println("<i>"); pw.println("</i>");pw.println("I agree to Terms and Conditions.");pw.println("</label>");
                            pw.println("</span>");                          

                          pw.println("</div>");
                          pw.println("<input type='submit' value='Find Offers'>");
                          
                          pw.println("</form>");
                pw.println("</div>");
             pw.println("</div>");
          pw.println("</div>");
        pw.println("</div>");
      pw.println("</div>");
    
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
                 pw.println("<form action='search' method='get'>");
                              pw.println("<select id='country12' onchange='change_country(this.value)' class='frm-field required'>");
                            pw.println("<option value='null'>"); pw.println("Select City");pw.println("</option>");
                            pw.println("<option value='kota'>");pw.println("kota");pw.println("</option>");
                            pw.println("<option value='jaipur'>");pw.println("jaipur");pw.println("</option>");
                            pw.println("<option value='alwar'>");pw.println("alwar");pw.println("</option>");
                            pw.println("<option value='ajmer'>");pw.println("ajmer");pw.println("</option>");
                          
                    pw.println("</select>");
                pw.println("</form>");
                   pw.println("</div>");
              
              
             pw.println("</div>");

                
          pw.println("</div>");
        pw.println("</div>");
      pw.println("</div>");
    
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
                     pw.println("<li>");pw.println("<i class='fa fa-truck' aria-hidden='true'>");pw.println("</i>");pw.println("<h6>"); pw.println("Road-side ");pw.println("<br>"); pw.println("assistance");pw.println("</h6>");pw.println("</li>");
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
  
        pw.println("<div class='service-breadcrumb'>");
        pw.println("<div class='container'>");
          pw.println("<div class='wthree_service_breadcrumb_left'>");
            pw.println("<ul>");
              pw.println("<li>");pw.println("<a href='index.html'>");pw.println("Home");pw.println("</a>"); pw.println("<i>");pw.println("|");pw.println("</i>");pw.println("</li>");
              pw.println("<li>");pw.println("Search Room");pw.println("</li>");
            pw.println("</ul>");
          pw.println("</div>");
          pw.println("<div class='wthree_service_breadcrumb_right'>");
           
          pw.println("</div>");
          pw.println("<div class='clearfix'>"); pw.println("</div>");
        pw.println("</div>");
      pw.println("</div>");
  
    pw.println("<div class='search-car w3l'>");
      pw.println("<div class='container'>");
      
          pw.println("<div class='search-car-inner w3l'>");
    
            pw.println("<div class='col-md-3 search-car-left-sidebar'>");
             pw.println("<button class='btn btn-primary fill1' id='Mybtn'>"); pw.println("Filter");pw.println("</button>");
          
               pw.println("<form action='#' id='MyForm'>");
               pw.println("<section class='sky-form'>");
                 pw.println("<h4>");pw.println("Filter");pw.println("</h4>");
               pw.println("<div class='range'>");
          
                pw.println("<ul class='dropdown-menu6'>");
                  pw.println("<li>");
                                  
                    pw.println("<div id='slider-range'>");pw.println("</div>");             
                      pw.println("<input type='text' id='amount' style='border: 0; color: #ffffff; font-weight: normal;' />");

                  pw.println("</li>");      
                  pw.println("</ul>");
    
              
                pw.println("</div>");
                 pw.println("</section>");
                   pw.println("<section class='sky-form'>");
pw.println("<h4>");pw.println("Select price");pw.println("</h4>");
pw.println("<div class='form-inner'>");
pw.println("<label class='checkbox'>");pw.println("<input type='checkbox' name='price1' class='product-list' value='2000'>");pw.println("<i>");pw.println("</i>");pw.println("rs.1500-2000");pw.println("</label>");
pw.println("<label class='checkbox'>");pw.println("<input type='checkbox' name='price1' class='product-list' value='4000'>");pw.println("<i>");pw.println("</i>");pw.println("rs.2000-4000");pw.println("</label>");
pw.println("<label class='checkbox'>");pw.println("<input type='checkbox' name='price1' class='product-list' value='6000'>");pw.println("<i>");pw.println("</i>");pw.println("rs.4000-6000");pw.println("</label>");
                                
                            pw.println("</div>");
                  pw.println("</section>");
                  pw.println("<section class='sky-form'>");
                    pw.println("<h4>");pw.println("Search Rent for");pw.println("</h4>");
                     pw.println("<div class='form-inner'>");
                              pw.println("<label class='checkbox'>");pw.println("<input type='checkbox' name='rent1' value='student' class='product-list1'>");pw.println("<i>");pw.println("</i>");pw.println("Students");pw.println("</label>");
                              pw.println("<label class='checkbox'>");pw.println("<input type='checkbox' name='rent1' value='family' class='product-list1'>");pw.println("<i>");pw.println("</i>");pw.println("family");pw.println("</label>");
                                pw.println("<label class='checkbox'>");pw.println("<input type='checkbox' name='rent1' value='Professional' class='product-list1'>");pw.println("<i>");pw.println("</i>");pw.println("Professional");pw.println("</label>");
                            pw.println("</div>");
                  pw.println("</section>");
                    
                  
                  pw.println("<section class='sky-form'>");
                        pw.println("<h4>");pw.println("Select category");pw.println("</h4>");
                         
                              pw.println("<div class='form-inner'>");
                              
                              pw.println("<label class='checkbox'>");pw.println("<input type='checkbox' name='category1' class='product-list2' value='rooms'>");pw.println("<i>");pw.println("</i>");pw.println("Rooms");pw.println("</label>");
                              pw.println("<label class='checkbox'>");pw.println("<input type='checkbox' name='category1' class='product-list2' value='hostel'>");pw.println("<i>");pw.println("</i>");pw.println("Hostels");pw.println("</label>");
                             pw.println("<label class='checkbox'>");pw.println("<input type='checkbox' name='category1' class='product-list2' value='flat'>");pw.println("<i>");pw.println("</i>");pw.println("Flats");pw.println("</label>");
                             pw.println("<label class='checkbox'>");pw.println("<input type='checkbox' name='category1' class='product-list2' value='shop'>");pw.println("<i>");pw.println("</i>");pw.println("Shops");pw.println("</label>");
                              
                           
                            pw.println("</div>");

                   pw.println("</section>");
                  pw.println("<section class='sky-form'>");
                        pw.println("<h4>");pw.println("Preferred Gender");pw.println("</h4>");
                          
                         
                                pw.println("<div class='form-inner'>");
                              pw.println("<label class='checkbox'>");pw.println("<input type='checkbox' name='Gender1' class='product-list3' value='male'>");pw.println("<i>");pw.println("</i>");pw.println("Male");pw.println("</label>");
                              pw.println("<label class='checkbox'>");pw.println("<input type='checkbox' name='Gender1' class='product-list3' value='female'>");pw.println("<i>");pw.println("</i>");pw.println("Female");pw.println("</label>");
                  
                            pw.println("</div>");
                          
                    
                          
                  pw.println("</section>");
                    pw.println("<section class='sky-form' >");
                        pw.println("<h4>");pw.println("Furnicher");pw.println("</h4>");
                          
                         
                            
                                pw.println("<div class='form-inner'>");
                              pw.println("<label class='checkbox'>");pw.println("<input type='checkbox' name='Furnicher' class='product-list4' value='Furnished'>");pw.println("<i>");pw.println("</i>");pw.println("Furnished");pw.println("</label>");
                              pw.println("<label class='checkbox'>");pw.println("<input type='checkbox' name='Furnicher' class='product-list4' value='Nonfurnished'>");pw.println("<i>");pw.println("</i>");pw.println("Nonfurnished");pw.println("</label>");
                              
                  
  
                          pw.println("</div>");
                    
                          
                  pw.println("</section>");


                  
                  
                  pw.println("</section>");
                  pw.println("<section class='sky-form'>");
                    pw.println("<h4>");pw.println("properties");pw.println("</h4>");
                     pw.println("<div class='form-inner'>");
                              pw.println("<label class='checkbox'>");pw.println("<input type='checkbox' name='properties1' class='product-list5' value='rent'>");pw.println("<i>");pw.println("</i>");pw.println("Rent");pw.println("</label>");
                              pw.println("<label class='checkbox'>");pw.println("<input type='checkbox' name='properties1' class='product-list5' value='sale'>");pw.println("<i>");pw.println("</i>");pw.println("Sale");pw.println("</label>");
                                
                            pw.println("</div>");
                  pw.println("</section>");
                  pw.println("<section class='sky-form'>");
                    pw.println("<h4>");pw.println("<label class='text'>");pw.println("<input type='submit' value='apply filter'>");pw.println("</label>");pw.println("</h4>");
                     
                  
              
                
            pw.println("</div>");
          pw.println("</section>");
          pw.println("<script type='text/javascript'>");
        pw.println("$('.product-list').on('change', function() {");
            pw.println("$('.product-list').not(this).prop('checked', false); "); 
       pw.println(" });");
      pw.println("</script>");
       pw.println("<script type='text/javascript'>");
        pw.println("$('.product-list1').on('change', function() {");
            pw.println("$('.product-list1').not(this).prop('checked', false); "); 
       pw.println(" });");
      pw.println("</script>");
       pw.println("<script type='text/javascript'>");
        pw.println("$('.product-list2').on('change', function() {");
            pw.println("$('.product-list2').not(this).prop('checked', false); "); 
       pw.println(" });");
      pw.println("</script>");
       pw.println("<script type='text/javascript'>");
        pw.println("$('.product-list3').on('change', function() {");
            pw.println("$('.product-list3').not(this).prop('checked', false); "); 
       pw.println(" });");
      pw.println("</script>");
       pw.println("<script type='text/javascript'>");
        pw.println("$('.product-list4').on('change', function() {");
            pw.println("$('.product-list4').not(this).prop('checked', false); "); 
       pw.println(" });");
      pw.println("</script>");
       pw.println("<script type='text/javascript'>");
        pw.println("$('.product-list5').on('change', function() {");
            pw.println("$('.product-list5').not(this).prop('checked', false); "); 
       pw.println(" });");
      pw.println("</script>"); pw.println("</form>");
            pw.println("<div class='col-md-9 search-car-right-text w3'>");
              pw.println("<div class='well well-sm'>");
                pw.println("<strong>");pw.println("Display");pw.println("</strong>");
                pw.println("<div class='btn-group'>");
                  pw.println("<a href='#' id='list' class='btn btn-default btn-sm'>");pw.println("<span class='glyphicon glyphicon-th-list'>");
                  pw.println("</span>");pw.println("List");pw.println("</a>"); pw.println("<a href='#' id='grid' class='btn btn-default btn-sm two'>");pw.println("<span");
                   pw.println("class='glyphicon glyphicon-th'>");pw.println("</span>");pw.println("Grid");pw.println("</a>");
                pw.println("</div>");
              pw.println("</div>");
                        pw.println("<div id='products' class='row list-group'>");

   try
   {
   	                  st2=con.createStatement();
   	                  rs2=st2.executeQuery("select postid from post where post.nearid='"+p1+"' and post.catagary='"+s3+"'");
   	    while(rs2.next())
   	      {       
               m1=rs2.getInt(1);
               try
               {
                  st3=con.createStatement();
                   rs3=st3.executeQuery("select post.pathh,post.email,post.img1,post.price,post.catagary,post.properties,post.ptype,near.nearname,post.title,post.email from post inner join near on near.nearid=post.nearid and postid='"+m1+"'");
                   while(rs3.next())
                   {
                //    m8=rs3.getInt(1);
                    c5=rs3.getString(1);
                   	s1=rs3.getString(2);
                   	p8=rs3.getString(3);
                   	m2=rs3.getString(4);
                   	p3=rs3.getString(5);
                   	p4=rs3.getString(6);
                   	p5=rs3.getString(7);
                   	p6=rs3.getString(8);
                   	p7=rs3.getString(9);
                   	p9=rs3.getString(10);
            //c5=Integer.toString(m8);
           pw.println("<div class='item  col-xs-4 col-lg-4'>");
                  pw.println("<div class='thumbnail thumbnail1'>");
                     pw.println("<a href='des?post1="+m1+"' data-toggle='modal' >");pw.println("<img class='group list-group-image' src='postpic/"+s1+"/"+c5+"/"+p8+"' alt='no image found' width='150px' height='150px'>");pw.println("</a>");
                                           pw.println("<div class='table-text'>");
                                                                pw.println("<h4 >");pw.println("<a href='des?post1="+m1+"' title='Maruti Suzuki 800 AC' class='click-search'>");pw.println("<span class='spancarname'>");pw.println(p7);pw.println("</span>");pw.println("</a>");pw.println("</h4>");
                                                                pw.println("<p class='gridViewPrice hide'>");
                                                                    pw.println("<a href='des?post1="+m1+"'>");
                                                                        pw.println("<span class='rupee-lac'>");pw.println("<i class='fa fa-search'>");pw.println("</i>");pw.println("₹7,000");pw.println("</span>"); 
                                                                    pw.println("</a>");
                                                                pw.println("</p>");
                                                                pw.println("<div class='other-details'>");
                                                                
                                                                    pw.println("<a href='des?post1="+m1+"'>");
                                                                      pw.println("<span class='rupee-lac slprice'>");pw.println("price-"+m2);pw.println("</span>"); 
                                                                    pw.println("</a>");  
                                pw.println("<div class='clearfix'>");pw.println("</div>");                                  
                                                                    pw.println("<a href='des?post1="+m1+"'>");
                                                                        pw.println("<p class='listing-item-kms'>");pw.println("<span class='slkms'>");pw.println(p3);pw.println("&nbsp;");pw.println("</span>");pw.println("<span class='margin-left5 margin-right5'>");pw.println("|");pw.println("</span>");pw.println("<span class='fuel'>");pw.println(p4);pw.println("</span>");pw.println("<span class='margin-left5 margin-right5'>");pw.println("|");pw.println("</span>");pw.println("<span>");pw.println(p5);pw.println("</span>");pw.println("</p>");
                                                                        pw.println("<p class='listing-item-area'>");pw.println("<span class='cityname'>");pw.println("<i class='fa fa-map-marker'>");pw.println("</i>");pw.println("&nbsp");
                                                                     pw.println(p6);pw.println("</span>");pw.println("</p>");
                                                                        pw.println("<p class='text-light-grey deliverytext'>");pw.println("</p>");
                                                                    pw.println("</a>");
                                                                pw.println("</div>");
         
                                                              pw.println("<div class='clearfix'>");pw.println("</div>");
                                                                pw.println("<div class='list-form'>");
                                                                    pw.println("<div class='phone-info'>");
                                     pw.println("<form action='des?post1="+m1+"' method='post'>");
                                       pw.println("<input type='text' class='phone' placeholder='send message..' required=''>");
                                     pw.println("</form>");
                                  pw.println("</div>");
                                  pw.println("<div class='get-one'>");pw.println("<a href='des?post1="+m1+"'>");pw.println("send message");pw.println("<a>");pw.println("</div>");
                                                                    pw.println("<div class='clearfix'>");pw.println("</div>");
                                                                pw.println("</div>");
                                                               
                                                            pw.println("</div>");
                    
                                                   pw.println("</div>");
                                        pw.println("</div>");
                                    }
                                }
                              catch(SQLException e)
                                     {
                                       pw.println(e);
                                      }
       
                    }
                    
     }
     catch(SQLException e)
       {
           pw.println(e);
       }
     catch(Exception e1)
     {
     	pw.println(e1);
     }
                pw.println("</div>");
              pw.println("</div>");
             pw.println("</div>");
                    
        
            pw.println("<div class='clearfix'>");pw.println("</div>");
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
          
          pw.println("<div class='clearfix'>"); pw.println("</div>");
        pw.println("</div>");
        pw.println("<div class='col-md-3 footer-grid animated wow slideInLeft' data-wow-delay='.8s'>");
          pw.println("<h3>");pw.println("Blog Posts");pw.println("</h3>");
          pw.println("<div class='footer-grid-sub-grids'>");
            pw.println("<div class='footer-grid-sub-grid-left'>");
              pw.println("<a href='single.html'>");pw.println("<img src='images/22.jpeg' alt=' ' class='img-responsive' />");pw.println("</a>");
            pw.println("</div>");
            pw.println("<div class='footer-grid-sub-grid-right'>");
              pw.println("<h4>");pw.println("<a href='single.html'>");pw.println("best site for Rooms ");pw.println("</a>");pw.println("</h4>");
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
        
        pw.println("</div>");
        pw.println("<div class='clearfix'>"); pw.println("</div>");
      pw.println("</div>");
    
      pw.println("<div class='copy-right animated wow slideInUp' data-wow-delay='.5s'>");
        pw.println("<p>");pw.println("&copy roomseeker.in");pw.println("</p>");
      pw.println("</div>");
    pw.println("</div>");
  pw.println("</div>");
pw.println("<script src='js/bootstrap.js'>");pw.println("</script>");
        
          
              pw.println("<script type='text/javascript'>");
              pw.println("$(window).load(function(){");
               pw.println("$( '#slider-range' ).slider({");
                    pw.println("range: true,");
                    pw.println("min: 0,");
                    pw.println("max: 50000,");
                    pw.println("values: [ 1000, 50000 ],");
                    pw.println("slide: function( event, ui ) {  $( '#amount' ).val( '₹' + ui.values[ 0 ] + ' - ₹' + ui.values[ 1 ] );");
                    pw.println("}");
               pw.println("});");
              pw.println("$( '#amount' ).val( '₹' + $( '#slider-range' ).slider( 'values', 0 ) + ' - ₹' + $( '#slider-range' ).slider( 'values', 1 ) );");

              pw.println("});");  

              pw.println("</script>");
pw.println("<script>");
 pw.println(" $(document).ready(function() {");
    pw.println("$('#list').click(function(event){event.preventDefault();$('#products .item').addClass('list-group-item');});");
    pw.println("$('#grid').click(function(event){event.preventDefault();$('#products .item').removeClass('list-group-item');$('#products .item').addClass('grid-group-item');});");
pw.println("});");
pw.println("</script>");


pw.println("</body>");
pw.println("</html>");

              
                 
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }
}