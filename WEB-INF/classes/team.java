import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class team extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
    {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
   
        pw.println("<!DOCTYPE html>");
pw.println("<html lang='en'>");
	pw.println("<head>");
		pw.println("<meta charset='UTF-8'>");

		pw.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");

		pw.println("<title>");pw.println("Meet Our Team");pw.println("</title>");
		 pw.println("<link rel='shortcut icon' type='image/x-icon'  href='admin/img/house.png'>");
		pw.println("<link rel='icon' type='image/png' sizes='56x56' href='team/images/fadv-icon/icon.png'>");
		pw.println("<link rel='stylesheet' type='text/css' href='team/css/style.css'>");
		pw.println("<link rel='stylesheet' type='text/css' href='team/css/responsive.css'>");
		pw.println("<style type='text/css'>");
		pw.println(".rah");
		pw.println("{");
			pw.println("border-radius: 50% !important;");
			pw.println("height:180px !important; ");
			pw.println("width: 180px !important;");
		pw.println("}");

		pw.println(".img");
			pw.println("{");
			
				pw.println("margin-left: 80px !important;");
			pw.println("}");
	pw.println("</style>");	
	pw.println("</head>");

	pw.println("<body>");
		pw.println("<div class='main-page-wrapper'>");
			pw.println("<div id='blog-section'>");
				pw.println("<div class='container'>");
					pw.println("<div class='theme-title'>");
						pw.println("<h2>");pw.println("Meet Our Team");pw.println("</h2>");
						pw.println("<p>");pw.println("We are a goal oriented web design consultancy. There are a ton of things we Would like to tell you about what we do & how we do it. So bear with us and we promise we Will try and make it interesting.");pw.println("</p>");
					pw.println("</div>"); 

					pw.println("<div class='clear-fix'>");
						pw.println("<div class='col-lg-6 col-md-6 col-sm-6 col-xs-12'>");
							pw.println("<div class='single-news-item'>");
								pw.println("<div class='img'>");pw.println("<img class='rah' src='team/images/blog/1.jpg' alt='Image'>");
									pw.println("<a href='#' class='opacity tran4s'>");pw.println("<i class='fa fa-link' aria-hidden='true'>");pw.println("</i>");pw.println("</a>");
								pw.println("</div>"); pw.println("<!-- /.img -->");

								pw.println("<div class='post'>");
									pw.println("<h6>");pw.println("<a href='#' class='tran3s'>");pw.println("Mr.Vikarm Singh Gurjar");pw.println("</a>");pw.println("</h6>");
									pw.println("<a href='#'>"); pw.println("<span class='p-color'>");pw.println("Computer Science Engineer");pw.println("</span>");pw.println("</a>");
									pw.println("<p>");pw.println("Frontend And Backend  Developer..."); pw.println("<a href='#' class='tran3s'>");pw.println("Read More");pw.println("</a>");pw.println("</p>");
								pw.println("</div>");
							pw.println("</div>"); 
						pw.println("</div>"); 

						pw.println("<div class='col-lg-6 col-md-6 col-sm-6 col-xs-12'>");
							pw.println("<div class='single-news-item'>");
								pw.println("<div class='img'>");pw.println("<img class='rah' src='team/images/blog/2.jpg' alt='Image'>");
									pw.println("<a href='#' class='opacity tran4s'>");pw.println("<i class='fa fa-link' aria-hidden='true'>");pw.println("</i>");pw.println("</a>");
								pw.println("</div>"); pw.println("<!-- /.img -->");

								pw.println("<div class='post'>");
									pw.println("<h6>");pw.println("<a href='#' class='tran3s'>");pw.println("Mr. Rahul Pandit");pw.println("</a>");pw.println("</h6>");
									pw.println("<a href='#'>");pw.println("<span class='p-color'>");pw.println("Computer Science Engineer");pw.println("</span>");pw.println("</a>");
									pw.println("<p>");pw.println("Frontend And Backend  Developer..."); pw.println("<a href='#' class='tran3s'>");pw.println("Read More");pw.println("</a>");pw.println("</p>");
								pw.println("</div>"); 
							pw.println("</div>"); 
						pw.println("</div>"); 

						pw.println("<div class='col-lg-6 col-md-6 col-sm-6 col-xs-12'>");
							pw.println("<div class='single-news-item'>");
								pw.println("<div class='img'>");pw.println("<img class='rah' class='rah' src='team/images/blog/3.jpg' alt='Image'>");
									pw.println("<a href='#' class='opacity tran4s'>");pw.println("<i class='fa fa-link' aria-hidden='true'>");pw.println("</i>");pw.println("</a>");
								pw.println("</div>"); 

								pw.println("<div class='post'>");
									pw.println("<h6>");pw.println("<a href='#' class='tran3s'>"); pw.println("Mr. Ankit Yadav");pw.println("</a>");pw.println("</h6>");
									pw.println("<a href='#'>");pw.println("<span class='p-color'>");pw.println("Computer Science Engineer");pw.println("</span>");pw.println("</a>");
									pw.println("<p>");pw.println("Frontend And Backend  Developer... ");pw.println("<a href='#' class='tran3s'>");pw.println("Read More");pw.println("</a>");pw.println("</p>");
								pw.println("</div>"); 
							pw.println("</div>"); 
						pw.println("</div>");
						pw.println("<div class='col-lg-6 col-md-6 col-sm-6 col-xs-12'>");
							pw.println("<div class='single-news-item'>");
								pw.println("<div class='img'>");pw.println("<img class='rah' src='team/images/blog/3.jpg' alt='Image'>");
									pw.println("<a href='#' class='opacity tran4s'>");pw.println("<i class='fa fa-link' aria-hidden='true'>");pw.println("</i>");pw.println("</a>");
								pw.println("</div>"); 

								pw.println("<div class='post'>");
									pw.println("<h6>");pw.println("<a href='#' class='tran3s'>");pw.println("Mr. vedshansu Nagar");pw.println("</a>");pw.println("</h6>");
									pw.println("<a href='#'>");pw.println("<span class='p-color'>");pw.println("Computer Science Engineer");pw.println("</span>");pw.println("</a>");
									pw.println("<p>");pw.println("Frontend And Backend  Developer... ");pw.println("<a href='#' class='tran3s'>");pw.println("Read More");pw.println("</a>");pw.println("</p>");
								pw.println("</div>"); 
							pw.println("</div>"); 
						pw.println("</div>"); 
					pw.println("</div>"); 
				pw.println("</div>"); 
			pw.println("</div>"); 



			pw.println("<footer>");
				pw.println("<div class='container'>");	
					pw.println("<p>");pw.println("Copyright @2019 All rights reserved RoomSeeker.in");pw.println("</p>");
				pw.println("</div>");
			pw.println("</footer>");


	pw.println("<div id='loader-wrapper'>");
				pw.println("<div id='preloader_1'>");
	                pw.println("<span>");pw.println("</span>");
	                pw.println("<span>");pw.println("</span>");
	                pw.println("<span>");pw.println("</span>");
	                pw.println("<span>");pw.println("</span>");
	                pw.println("<span>");pw.println("</span>");
	            pw.println("</div>");
			pw.println("</div>");
	pw.println("<script type='text/javascript' src='team/vendor/jquery.2.2.3.min.js'>");pw.println("</script>");
	pw.println("<script type='text/javascript' src='team/js/theme.js'>");pw.println("</script>");
	
		pw.println("</div>"); 
	pw.println("</body>");
pw.println("</html>");
         }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }
}