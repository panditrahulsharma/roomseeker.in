

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class post extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        Connection con=null;
        Statement st=null;
         Statement st1=null;
              ResultSet rs1=null;
int c4=0;
               HttpSession session =req.getSession();
       String s1=(String)session.getAttribute("room");
    if(s1==null)
    {
       	res.sendRedirect("login");
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
 try
        {
          st1=con.createStatement();      
         rs1=st1.executeQuery("select count(postid) from post where email='"+s1+"'");   
         while(rs1.next())
         {     
         c4=rs1.getInt(1);
     }
             
        }
        
       
       catch(Exception e4)
       {
           pw.println(e4);
       }
      

       if(c4>2)
       {
        res.sendRedirect("maxpost");
       }
   else
   {  


pw.println("<!DOCTYPE html>");
pw.println("<html lang='en'>");
pw.println("<head>");
pw.println("<title>");pw.println("post free add");pw.println("</title>");
pw.println("<link rel='stylesheet' type='text/css' href='vendor/rahul.css'>");
     pw.println("<link rel='shortcut icon' type='image/x-icon'  href='admin/img/house.png'>");
pw.println("<link rel='stylesheet' href='post/css/bootstrap.min.css'>");pw.println("<!-- bootstrap-CSS -->");
pw.println("<link rel='stylesheet' href='post/css/bootstrap-select.css'>");pw.println("<!-- bootstrap-select-CSS -->");
pw.println("<link href='post/css/style.css' rel='stylesheet' type='text/css' media='all' />");pw.println("<!-- style.css -->");
pw.println("<link rel='stylesheet' href='post/css/font-awesome.min.css' />");pw.println("<!-- fontawesome-CSS -->");
pw.println("<link rel='stylesheet' href='post/css/menu_sideslide.css' type='text/css' media='all'>");pw.println("<!-- Navigation-CSS -->");
pw.println("<!-- meta tags -->");
pw.println("<meta name='viewport' content='width=device-width, initial-scale=1'>");
pw.println("<meta http-equiv='Content-Type' content='text/html; charset=utf-8' />");
pw.println("<meta name='keywords' content='room for rent,post your add here' />");
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
      pw.println("<span class='agile-breadcrumbs'>");pw.println("<a href='index.html'>");pw.println("<i class='fa fa-home home_1'>");pw.println("</i>");pw.println("</a>"); pw.println("/"); pw.println("<span>");pw.println("Post your Ad For Rent");pw.println("</span>");pw.println("</span>");
    pw.println("</div>");
  pw.println("</div>");
  pw.println("<!-- //breadcrumbs -->");
  pw.println("<!-- Submit Ad -->");
  pw.println("<div class='submit-ad main-grid-border'>");
    pw.println("<div class='container'>");
      pw.println("<h2 class='w3-head'>");pw.println("Post your Ads here");pw.println("</h2>");
      pw.println("<div class='post-ad-form'>");
        pw.println("<form method='post' action='postdata' enctype = 'multipart/form-data'>");
          
          pw.println("<label>");pw.println("Select Category"); pw.println("<span>");pw.println("*");pw.println("</span>");pw.println("</label>");
          pw.println("<select class='' name='sm1' required=''>");
            pw.println("<option>");pw.println("Select");pw.println("</option>");
            pw.println("<option value='rooms'>");pw.println("Rooms");pw.println("</option>");
            pw.println("<option value='hostel'>");pw.println("Hostel");pw.println("</option>");
            pw.println("<option value='flat'>");pw.println("Flats");pw.println("</option>");
            pw.println("<option value='shop'>");pw.println("Shop");pw.println("</option>");
            
          pw.println("</select>");
          pw.println("<div class='clearfix'>");pw.println("</div>");
          pw.println("<label>");pw.println("Prefered types"); pw.println("<span>");pw.println("*");pw.println("</span>");pw.println("</label>");
          pw.println("<select class='' name='sm2' required=''>");
            pw.println("<option>");pw.println("Select");pw.println("</option>");
            pw.println("<option value='family'>");pw.println("Family");pw.println("</option>");
            pw.println("<option value='Student'>");pw.println("Student");pw.println("</option>");
            pw.println("<option value='Professional'>");pw.println("Professional");pw.println("</option>");
            //pw.println("<option value='Others'>");pw.println("Others");pw.println("</option>");
            
          pw.println("</select>");
          pw.println("<div class='clearfix'>");pw.println("</div>");
          pw.println("<label>");pw.println("Prefered Gender ");pw.println("<span>");pw.println("*");pw.println("</span>");pw.println("</label>");
          pw.println("<select class='' name='sm3' required=''>");
            pw.println("<option>");pw.println("Select");pw.println("</option>");
            pw.println("<option value='Male'>");pw.println("Male ");pw.println("</option>");
            pw.println("<option value='Female'>");pw.println("Female");pw.println("</option>");
            
          pw.println("</select>");
          pw.println("<div class='clearfix'>");pw.println("</div>");
          pw.println("<label>");pw.println("Properties "); pw.println("<span>");pw.println("*");pw.println("</span>");pw.println("</label>");
          pw.println("<select class='' name='sm4' required=''>");
            pw.println("<option>");pw.println("Select Category");pw.println("</option>");
            pw.println("<option value='rent'>");pw.println("For Rent");pw.println("</option>");
            pw.println("<option value='sale'>");pw.println("For Sale");pw.println("</option>");
            
          pw.println("</select>");

          pw.println("<div class='clearfix'>");pw.println("</div>");
          pw.println("<div class='clearfix'>");pw.println("</div>");
          pw.println("<label>");pw.println("Bedrooms"); pw.println("<span>");pw.println("*");pw.println("</span>");pw.println("</label>");
          pw.println("<select class='' name='sm5' required=''>");
            pw.println("<option>");pw.println("Select");pw.println("</option>");
            pw.println("<option value='1'>");pw.println("1");pw.println("</option>");
            pw.println("<option value='2'>");pw.println("2");pw.println("</option>");
            pw.println("<option value='3'>");pw.println("3");pw.println("</option>");
            pw.println("<option value='4'>");pw.println("4");pw.println("</option>");
            
          pw.println("</select>");
          
          pw.println("<div class='clearfix'>");pw.println("</div>");
         
          pw.println("<label>");pw.println("Furnishing"); pw.println("<span>");pw.println("*");pw.println("</span>");pw.println("</label>");
          pw.println("<select class='' name='sm7' required=''>");
            pw.println("<option>");pw.println("Select Category");pw.println("</option>");
            pw.println("<option value='Furnished'>");pw.println("Furnished");pw.println("</option>");
            pw.println("<option value='Nonfurnished'>");pw.println("nonFurnished");pw.println("</option>");
            
            
          pw.println("</select>");
          
          pw.println("<div class='clearfix'>");pw.println("</div>");
          pw.println("<label>");pw.println("hostel-Names/title"); pw.println("<span>");pw.println("*");pw.println("</span>");pw.println("</label>");
          pw.println("<input type='text' class='phone' placeholder='your property name ,house no.' name='title' required=''>");
          pw.println("<div class='clearfix'>");pw.println("</div>");
          pw.println("<label>");pw.println("Address"); pw.println("<span>");pw.println("*");pw.println("</span>");pw.println("</label>");
          pw.println("<textarea class='mess' placeholder='please fill your full address' name='des' required=''>");pw.println("</textarea>");
          pw.println("<div class='clearfix'>");pw.println("</div>");
               pw.println("<label>");pw.println("Enter city"); pw.println("<span>");pw.println("*");pw.println("</span>");pw.println("</label>");
          pw.println("<select class='' name='sm8'>");
            pw.println("<option>");pw.println("Select City");pw.println("</option>");
            pw.println("<option value='kota'>");pw.println("kota");pw.println("</option>");
            pw.println("<option value='jaipur'>");pw.println("jaipur");pw.println("</option>");
            pw.println("<option value='Alear'>");pw.println("Alwar");pw.println("</option>");
            pw.println("<option value='Jodhpur'>");pw.println("Jodhpur");pw.println("</option>");
            
            
          pw.println("</select>");
          
          pw.println("<div class='clearfix'>");pw.println("</div>");

          pw.println("<label>");pw.println("Select Locality"); pw.println("<span>");pw.println("*");pw.println("</span>");pw.println("</label>");
          pw.println("<select class='' name='sm9'>");
            pw.println("<option>");pw.println("nearby..");pw.println("</option>");
            pw.println( "<optgroup label='kota'>");
     pw.println("<option value='Anantpura kota'>");pw.println("Anantpura kota");pw.println("</option>");
    pw.println("<option value='Bajrang Nagar kota'>");pw.println("Bajrang Nagar kota");pw.println("</option>");
    pw.println("<option value='Bargaon kota'>");pw.println("Bargaon kota");pw.println("</option>");
    pw.println("<option value='Bhimganj Mandi kota'>");pw.println("Bhimganj Mandi kota");pw.println("</option>");
    pw.println("<option value='Borkhera kota'>");pw.println("Borkhera kota ");pw.println("</option>");
    pw.println("<option value='Bundi Road kota'>");pw.println("Bundi Road kota");pw.println("</option>");
    pw.println("<option value='Chawani kota'>");pw.println("Chawani kota");pw.println("</option>");
    pw.println("<option value='Civil Lines kota'>");pw.println("Civil Lines kota");pw.println("</option>");
    pw.println("<option value='Dadabari kota'>");pw.println("Dadabari kota");pw.println("</option>");
    pw.println("<option value='Dadwara kota'>");pw.println("Dadwara kota");pw.println("</option>");
    pw.println("<option value='Dhanmandi kota'>");pw.println("Dhanmandi kota");pw.println("</option>");
    pw.println("<option value='Electricity Board Area kota'>");pw.println("Electricity Board Area kota");pw.println("</option>");
      pw.println("<option value='Engineering college Kota'>");pw.println("Engineering college Kota");pw.println("</option>");
    pw.println("<option value='Ganesh Nagar kota'>");pw.println("Ganesh Nagar kota");pw.println("</option>");
    pw.println("<option value='Gaytri Vihar kota'>");pw.println("Gaytri Vihar kota");pw.println("</option>");
    pw.println("<option value='Girdharpura kota'>");pw.println("Girdharpura kota");pw.println("</option>");
    pw.println("<option value='Gudla kota'>");pw.println("Gudla kota");pw.println("</option>");
    pw.println("<option value='Gumanpura kota'>");pw.println("Gumanpura kota");pw.println("</option>");
    pw.println("<option value='Indraprastha Industrial Area kota'>");pw.println("Indraprastha Industrial Area kota");pw.println("</option>");
     pw.println("<option value='Keshavpura kota'>");pw.println("Keshavpura kota");pw.println("</option>");
    pw.println("<option value='Kishorepura kota'>");pw.println("Kishorepura kota");pw.println("</option>");
   pw.println("<option value='Kota Industrial Area kota'>");pw.println(" Kota Industrial Area kota");pw.println("</option>");
   pw.println("<option value='Kunhari kota'>");pw.println(" Kunhari kota");pw.println("</option>");
   pw.println("<option value='Ladpura kota'>");pw.println(" Ladpura kota");pw.println("</option>");
   pw.println("<option value='Laxmi Pura kota'>");pw.println(" Laxmi Pura kota");pw.println("</option>");
   pw.println("<option value='Mahaveer Colony kota'>");pw.println(" Mahaveer Colony kota");pw.println("</option>");
    pw.println("<option value='Mahaveer Nagar kota'>");pw.println("Mahaveer Nagar kota");pw.println("</option>");
    pw.println("<option value='Mandana kota'>");pw.println("Mandana kota");pw.println("</option>");
    pw.println("<option value='Nanta kota'>");pw.println("Nanta kota");pw.println("</option>");
    pw.println("<option value='Naya Gaon kota'>");pw.println("Naya Gaon kota");pw.println("</option>");
    pw.println("<option value='Nayapura kota'>");pw.println("Nayapura kota");pw.println("</option>");
    pw.println("<option value='New Railway Colony kota'>");pw.println("New Railway Colony kota");pw.println("</option>");
    pw.println("<option value='Police Line kota'>");pw.println("Police Line kota");pw.println("</option>");
    pw.println("<option value='Railway Station Area kota'>");pw.println("Railway Station Area kota");pw.println("</option>");
    pw.println("<option value='Raipura kota'>");pw.println("Raipura kota");pw.println("</option>");
    pw.println("<option value='Rama Krishna Puram kota'>");pw.println("Rama Krishna Puram kota");pw.println("</option>");
    pw.println("<option value='Ramganj Mandi kota'>");pw.println("Ramganj Mandi kota");pw.println("</option>");
    pw.println("<option value='Rampura kota'>");pw.println("Rampura kota");pw.println("</option>");
    pw.println("<option value='Rangbari kota'>");pw.println("Rangbari kota");pw.println("</option>");
    pw.println("<option value='Ranpur kota'>");pw.println("Ranpur kota");pw.println("</option>");
    pw.println("<option value='Rawatbhata Road kota'>");pw.println("Rawatbhata Road kota");pw.println("</option>");
    pw.println("<option value='Sakat Pura kota'>");pw.println("Sakat Pura kota");pw.println("</option>");
    pw.println("<option value='Sawaimadhopur Road kota'>");pw.println("Sawaimadhopur Road kota");pw.println("</option>");
    pw.println("<option value='Shashtri Nagar kota'>");pw.println("Shashtri Nagar kota");pw.println("</option>");
    pw.println("<option value='shivpura kota'>");pw.println("shivpura kota");pw.println("</option>");
    pw.println("<option value='Shrinath Puram kota'>");pw.println("Shrinath Puram kota");pw.println("</option>");
    pw.println("<option value='Shripura kota'>");pw.println("Shripura kota");pw.println("</option>");
    pw.println("<option value='Shubhash Nagar kota'>");pw.println("Shubhash Nagar kota");pw.println("</option>");
    pw.println("<option value='Shyam Nagar Kota'>");pw.println("Shyam Nagar Kota");pw.println("</option>");
    pw.println("<option value='Sultanpur kota'>");pw.println("Sultanpur kota");pw.println("</option>");
    pw.println("<option value='Swami Vivekananda Nagar kota'>");pw.println("Swami Vivekananda Nagar kota");pw.println("</option>");
    pw.println("<option value='Talwandi kota'>");pw.println("Talwandi kota");pw.println("</option>");
    pw.println("<option value='Transport Nagar kota'>");pw.println("Transport Nagar kota");pw.println("</option>");
    pw.println("<option value='Vigyan Nagar kota'>");pw.println("Vigyan Nagar kota");pw.println("</option>");
  


            pw.println(" </optgroup>");
            
          pw.println("</select>");
          
          pw.println("<div class='clearfix'>");pw.println("</div>");
          
            
            pw.println("<div class='clearfix'>");pw.println("</div>");
            pw.println("<label>");pw.println("Enter Demand Price");pw.println("<span>");pw.println("*");pw.println("</span>");pw.println("</label>");
            pw.println("<input type='text' class='name' placeholder='Price..' required='' name='price'>");
            pw.println("<div class='clearfix'>");pw.println("</div>");
            pw.println("<div class='clearfix'>");pw.println("</div>");pw.println("<label>");pw.println("Upload your four PIC");
            
              pw.println("<span>");pw.println("*");pw.println("</span>");pw.println("</label>");

pw.println("<div id='wrapper'>");
  pw.println("<img id='z1'/ width='50' height='50'>");
 pw.println("<input type='file' class='i1' id='a1' name='file1' onchange='preview_image(event)' required=''>");
pw.println("<label for='a1'>");pw.println("+");pw.println("</label>");
pw.println("</div>");
pw.println("<div id='wrapper1'>");
  pw.println("<img id='z2'/ width='50' height='50'>");
 pw.println("<input type='file' class='i1' id='a2'  onchange='preview_image1(event)' name='file1' required=''>");
 pw.println("<label for='a2'>");pw.println("+");pw.println("</label>");
pw.println("</div>");
pw.println("<div id='wrapper2'>");
  pw.println("<img id='z3'/ width='50' height='50'>");
 pw.println("<input type='file' class='i1' id='a3' onchange='preview_image2(event)'name='file1' required=''>");
 pw.println("<label for='a3'>");pw.println("+");pw.println("</label>");
pw.println("</div>");
pw.println("<div id='wrapper3'>");
  pw.println("<img id='z4'/ width='50' height='50'>");
 pw.println("<input type='file' class='i1' id='a4' onchange='preview_image3(event)' name='file1' required=''>");
 pw.println("<label for='a4'>");pw.println("+");pw.println("</label>");
pw.println("</div>");
            pw.println("<div class='clearfix'>");pw.println("</div>");
          pw.println("<div class='clearfix'>");pw.println("</div>");
          pw.println("<p class='post-terms'>");pw.println("By clicking"); pw.println("<strong>");pw.println("POST");pw.println("</strong>"); pw.println(" button you accept our ");pw.println("<a href='#' >");pw.println("Terms of Use"); pw.println("</a>"); pw.println("and ");pw.println("<a href='#' >");pw.println("Privacy Policy");pw.println("</a>");pw.println("</p>");
          pw.println("<input type='submit' value='Post'>");         
        pw.println("<div class='clearfix'>");pw.println("</div>");

          pw.println("</form>");
      pw.println("</div>");
    pw.println("</div>"); 
  pw.println("</div>");
   
    pw.println("<footer>");
      
      pw.println("<div class='agileits-footer-bottom text-center'>");
      pw.println("<div class='container'>");
        
        
        pw.println("<div class='copyrights'>");
          pw.println("<p>"); pw.println("2019 All Rights Reserved roomseeker.in");pw.println("</p>");
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

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }
}