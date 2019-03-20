

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class contact extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        Connection con=null;
        Statement st=null;
         Statement st2=null;
        ResultSet rs=null;
       
pw.println("<!DOCTYPE html>");
pw.println("<html lang='zxx'>");

pw.println("<head>");
  pw.println("<title>");pw.println("contact-us");pw.println("</title>");
  
  pw.println("<meta name='viewport' content='width=device-width, initial-scale=1'>");
  pw.println("<meta charset='UTF-8' />");
  pw.println("<meta name='keywords' content='find room in kota' />");
  pw.println("<script>");
    pw.println("addEventListener('load', function () {");
      pw.println("setTimeout(hideURLbar, 0);");
    pw.println("}, false);");

   pw.println(" function hideURLbar() {");
      pw.println("window.scrollTo(0, 1);");
    pw.println("}");
  pw.println("</script>");
  
  pw.println("<link rel='stylesheet' href='contact/css/bootstrap.css'>");
   pw.println("<link rel='shortcut icon' type='image/x-icon'  href='admin/img/house.png'>");
  pw.println("<link rel='stylesheet' href='contact/css/style.css' type='text/css' media='all' />");
  
  pw.println("<link href='contact/css/font-awesome.min.css' rel='stylesheet'>");
  pw.println("<link rel='stylesheet' type='text/css' href='vendor/rahul.css'>");
    
  pw.println("<link href='//fonts.googleapis.com/css?family=Nunito+Sans:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i&amp;subset=latin-ext,vietnamese'rel='stylesheet'>");
  pw.println("<link href='//fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese'rel='stylesheet'>");
  
pw.println("</head>");

pw.println("<body>");
  
  pw.println("<div class='breadcrumb-agile'>");
    pw.println("<ol class='breadcrumb'>");
      pw.println("<li class='breadcrumb-item'>");
        pw.println("<a href='index.html'>");pw.println("Home");pw.println("</a>");
      pw.println("</li>");
      pw.println("<li class='breadcrumb-item active' aria-current='page'>");pw.println("Contact Us");pw.println("</li>");
    pw.println("</ol>");
  pw.println("</div>");
  
  pw.println("<section class='contact py-5'>");
    pw.println("<div class='container py-xl-5 py-lg-3'>");
      pw.println("<h3 class='title-w3 text-bl text-center font-weight-bold'>");pw.println("Contact Us");pw.println("</h3>");
      pw.println("<p class='title-sub mb-sm-5 mb-4 text-center'>");pw.println("Caption placed here");pw.println("</p>");
      pw.println("<!-- mail -->");
      pw.println("<div class='row mail-w3l-agile pt-xl-4'>");
        pw.println("<div class='col-md-5 contact-left-w3ls'>");
          pw.println("<h3>");pw.println("Contact Info");pw.println("</h3>");
          pw.println("<div class='row visit'>");
            pw.println("<div class='col-md-2 col-sm-2 col-2 contact-icon-wthree'>");
              pw.println("<span class='fa fa-home' aria-hidden='true'>");pw.println("</span>");
            pw.println("</div>");
            pw.println("<div class='col-md-10 col-sm-10 col-10 contact-text-agileinf0'>");
              pw.println("<h4>");pw.println("Visit us");pw.println("</h4>");
              pw.println("<p>");pw.println("Rajasthan Technical University kota,");pw.println("</p>");
              pw.println("<p>");pw.println("Rajasthan.");pw.println("</p>");
            pw.println("</div>");
          pw.println("</div>");
          pw.println("<div class='row mail-w3 my-4'>");
            pw.println("<div class='col-md-2 col-sm-2 col-2 contact-icon-wthree'>");
              pw.println("<span class='fa fa-envelope-o' aria-hidden='true'>");pw.println("</span>");
            pw.println("</div>");
            pw.println("<div class='col-md-10 col-sm-10 col-10 contact-text-agileinf0'>");
              pw.println("<h4>");pw.println("Mail us");pw.println("</h4>");
              pw.println("<p>");pw.println("<a href='#'>");pw.println("RoomSeeker98@gmail.com");pw.println("</a>");pw.println("</p>");
            pw.println("</div>");
          pw.println("</div>");
          pw.println("<div class='row call'>");
            pw.println("<div class='col-md-2 col-sm-2 col-2 contact-icon-wthree'>");
              pw.println("<span class='fa fa-phone' aria-hidden='true'>");pw.println("</span>");
            pw.println("</div>");
            pw.println("<div class='col-md-10 col-sm-10 col-10 contact-text-agileinf0'>");
              pw.println("<h4>");pw.println("Call us");pw.println("</h4>");
              pw.println("<p>");pw.println("8696248986");pw.println("</p>");
              pw.println("<p>");pw.println("7230848467");pw.println("</p>");
            pw.println("</div>");
          pw.println("</div>");
        pw.println("</div>");
        pw.println("<div class='col-md-6 agileinfo_mail_grid_right mt-md-0 mt-5'>");
          pw.println("<form action='contact1' method='post'>");
            pw.println("<div class='form-group'>");
              pw.println("<input type='text' name='name' class='form-control' placeholder='Name' required=''>");
            pw.println("</div>");
            pw.println("<div class='form-group'>");
              pw.println("<input type='email' name='email' class='form-control' placeholder='Email' required=''>");
            pw.println("</div>");
            pw.println("<div class='form-group'>");
              pw.println("<textarea name='message' placeholder='Message.......' required=''>");pw.println("</textarea>");
            pw.println("</div>");
            pw.println("<button type='submit' class='btn'>");pw.println("Submit");pw.println("</button>");
          pw.println("</form>");
        pw.println("</div>");
      pw.println("</div>");
    pw.println("</div>");
  pw.println("</section>");
  
  pw.println("<div class='cpy-right text-center py-3'>");
    pw.println("<p>");pw.println("© All rights reserved | Design by roomseeker.in");
      
    pw.println("</p>");
  pw.println("</div>");
  
  pw.println("<a href='#home' class='move-top text-center'>");pw.println("</a>");
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

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }
}