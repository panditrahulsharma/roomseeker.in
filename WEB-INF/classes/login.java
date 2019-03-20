import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;
public class login extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
    {
        PrintWriter pw = res.getWriter();
Connection con=null;
        Statement st=null;
         Statement st2=null;
              ResultSet rs=null;

       HttpSession session =req.getSession();
       String s1=(String)session.getAttribute("room");
       if(s1==null)
       {
pw.println("<!DOCTYPE html>");
pw.println("<html>");

pw.println("<!-- Head -->");
pw.println("<head>");

  pw.println("<title>");pw.println("rooms Login & Register Forms");pw.println("</title>");

    pw.println("<meta name='viewport' content='width=device-width, initial-scale=1' />");
    pw.println("<meta http-equiv='Content-Type' content='text/html; charset=utf-8' />");
    pw.println("<meta name='keywords' content='Flat Login & Register Forms' />");
    pw.println("<script type='application/x-javascript'>"); 
    pw.println("addEventListener('load', function() { setTimeout(hideURLbar, 0); }, false); ");
    pw.println("function hideURLbar(){ window.scrollTo(0,1); } ");
    pw.println("</script>");

  pw.println("<link rel='stylesheet' href='login2/css/style.css' type='text/css' media='all' />");
 pw.println("<link rel='shortcut icon' type='image/x-icon'  href='admin/img/house.png'>");
  pw.println("<link rel='stylesheet' type='text/css' href='vendor/rahul.css'>");
    
    pw.println("<link href='//fonts.googleapis.com/css?family=Raleway:400,500,600,700,800' rel='stylesheet' type='text/css'>");
    pw.println("<link href='//fonts.googleapis.com/css?family=Open+Sans:400,600,700' rel='stylesheet' type='text/css'>");

     pw.println("<script>");
       pw.println("function f1() {");
  pw.println("var letters = /^[A-Za-z]+$/;");
    pw.println("var digits = /^[0-9]+$/;");
  pw.println("if(document.form1.fname.value.match(letters))");
  pw.println("{");
        pw.println("if(document.form1.lname.value.match(letters))");
       pw.println("{");
         pw.println("       var x = document.forms['form1']['email'].value;");
        pw.println("      var atpos = x.indexOf('@');");
         pw.println("     var dotpos = x.lastIndexOf('.');");
           pw.println("   if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length) ");
            pw.println("     {");
             pw.println("         alert('Not a valid e-mail address');");
             pw.println("         return false;");
              pw.println("    }");
               pw.println("else{");
           pw.println("var contact_len = document.form1.phone.value.length;");
           pw.println("if(document.form1.phone.value.match(digits) && contact_len == 10)");
           pw.println("{");
               pw.println("return true;");
           pw.println("}");
            pw.println("else{");
                      pw.println("alert('contact number is not valid');");
                      pw.println("return false;");
                pw.println("}");
                 pw.println("  }");
       pw.println("}");
       pw.println("else");
       pw.println("{");
           pw.println("alert('Last name must have alphabets only'); ");
           pw.println("return false;");
       pw.println("}");
  pw.println("}");
  pw.println("else");
  pw.println("{");
  pw.println("alert('First name must have alphabets only'); ");
  pw.println("return false;");
  pw.println("}");
pw.println("}");
        
  pw.println("  </script>");
  
pw.println("</head>");

pw.println("<body>");

  pw.println("<h1>");pw.println("Rooms LOGIN & REGISTER FORMS");pw.println("</h1>");

  pw.println("<div class='container w3layouts agileits'>");

    pw.println("<div class='login w3layouts'>");
      pw.println("<form action='insert5' method='get'>");
        pw.println("<label>");pw.println("Email");pw.println("</label>");
        pw.println("<input type='email' class='user' name='email' placeholder='Email' required=''>");
        pw.println("<label>");pw.println("Password");pw.println("</label>");
        pw.println("<input type='password' class='pass' name='password' placeholder='Password' required=''>");
      pw.println("<ul>");
        pw.println("<li>");
          pw.println("<input type='checkbox' id='brand1' value=''>");
          pw.println("<label for='brand1'>");pw.println("<span>");pw.println("</span>");pw.println("Remember me");pw.println("</label>");
        pw.println("</li>");
      pw.println("</ul>");
      pw.println("<input type='submit' value='LOGIN'>");pw.println("</form>");
      pw.println("<div class='clear'>");pw.println("</div>");
    pw.println("</div>");

    pw.println("<div class='social agileits'>");
      pw.println("<h5>");pw.println("Or Login with");pw.println("</h5>");
      pw.println("<ul class='social-icons'>");
        pw.println("<li>");pw.println("<a href='#' class='facebook' title='Go to Our Facebook Page'>");pw.println("</a>");pw.println("</li>");
        pw.println("<li>");pw.println("<a href='#' class='twitter' title='Go to Our Twitter Account'>");pw.println("</a>");pw.println("</li>");
        pw.println("<li>");pw.println("<a href='#' class='googleplus' title='Go to Our Google Plus Account'>");pw.println("</a>");pw.println("</li>");
      pw.println("</ul>");
      pw.println("<div class='clear'>");pw.println("</div>");
    pw.println("</div>");

    pw.println("<div class='reg w3l aits'>");

     // pw.println("<h3>");pw.println("Not a member?");pw.println("</h3>");
    pw.println("<a href='recover.jsp'>");pw.println("<h3>");pw.println("Forgot Password");pw.println("</h3>");pw.println("</a>");
      pw.println("<a class='popup-with-zoom-anim hvr-underline-from-left' href='#small-dialog'>");pw.println("Register Here");pw.println("</a>");
      pw.println("<div class='clear'>");pw.println("</div>");

      
      pw.println("<div id='popup w3l'>");
        pw.println("<div id='small-dialog' class='mfp-hide aits'>");
          pw.println("<div class='pop_up agileits'>");
            pw.println("<div class='register w3layouts'>");
              pw.println("<form action='mailing.jsp' method='get' name='form1' onsubmit='return f1();'>");
                pw.println("<label>");pw.println("First Name");pw.println("</label>");
                pw.println("<input type='text' name='fname' placeholder='First Name' required=''>");
                pw.println("<label>");pw.println("Last Name");pw.println("</label>");
                pw.println("<input type='text' name='lname' placeholder='Last Name' required=''>");
                pw.println("<label>");pw.println("Email");pw.println("</label>");
                pw.println("<input type='text' name='email' placeholder='Email' required=''>");
                pw.println("<label>");pw.println("Password");pw.println("</label>");
                pw.println("<input type='password' name='password' placeholder='Password' required=''>");
                pw.println("<label>");pw.println("Confirm Password");pw.println("</label>");
                pw.println("<input type='password' name='cpassword' class='lessgap' placeholder='Confirm Password' required=''>");
                pw.println("<label>");pw.println("Phone Number");pw.println("</label>");
                pw.println("<input type='text' name='phone' placeholder='Phone Number' required=''>");
                pw.println("<div class='send-button'>");
                  pw.println("<input type='submit' value='REGISTER'>");
                pw.println("</div>");
              pw.println("</form>");
            pw.println("</div>");
          pw.println("</div>");
        pw.println("</div>");
      pw.println("</div>");
      pw.println("<button title='Close (Esc)' type='button' class='mfp-close w3layouts'>");pw.println(" X ");pw.println("</button>");
      

    pw.println("</div>");

  pw.println("</div>");

  pw.println("<div class='footer'>");
    pw.println("<p>"); pw.println("&copy; Rooms Flat Login & Register Forms");pw.println("</p>");
  pw.println("</div>");

    pw.println("<script src='login2/js/jquery-2.1.4.min.js'>");pw.println("</script>");
      pw.println("<script src='login2/js/jquery.magnific-popup.js' type='text/javascript'>");pw.println("</script>");
      pw.println("<script>");
        pw.println("$(document).ready(function() {");
          pw.println("$('.popup-with-zoom-anim').magnificPopup({");
            pw.println("type: 'inline',");
            pw.println("fixedContentPos: false,");
            pw.println("fixedBgPos: true,");
            pw.println("overflowY: 'auto',");
            pw.println("closeBtnInside: true,");
            pw.println("preloader: false,");
            pw.println("midClick: true,");
            pw.println("removalDelay: 300,");
            pw.println("mainClass: 'my-mfp-zoom-in'");
          pw.println("});");
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
  //pw.println("<script type='text/javascript' src='vendor/jquery.2.2.3.min.js'>");pw.println("</script>");
  pw.println("<script type='text/javascript' src='vendor/theme.js'>");pw.println("</script>");
  
pw.println("</body>");
pw.println("</html>");
} 
else
{
  res.sendRedirect("profile");
}
}

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }
}