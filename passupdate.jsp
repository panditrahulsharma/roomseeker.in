<%@ page import="java.sql.*,java.io.*" %>

<% 
  String contentType = request.getContentType();
    Connection con=null;
    Statement st=null;
       ResultSet rs=null;
     Statement st1=null;
    ResultSet rs1=null;
   Statement st2=null;
    ResultSet rs2=null;
   String s1="",s2="",s3="",s4="";
   try
      {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user1","root","admin");
        }
        catch(ClassNotFoundException e1)
       {
           out.println(e1);
       }
       catch(SQLException e7)
       {
           out.println(e7);
       }
  
   String s=(String)session.getAttribute("rooms");
          String ab=request.getParameter("verify1");
      String ba=request.getParameter("hidden2");
   
       if(s.equals("null"))
       {
       	response.sendRedirect("login");
       	//out.println("email not recj");
       }
       if(ab.equals(ba))
      {
              try
              {
                 st1=con.createStatement();
                 rs1=st1.executeQuery("select name,lname,pic from profile where email='"+s+"'");
                 if(rs1.next())
                 {
                         
                      s2=rs1.getString(1);
                      s3=rs1.getString(2);
                      s4=rs1.getString(3);
                     
                    
                 }	
              }
        	catch(Exception e1)
	           {
		        out.println(e1);
		       // out.println("jj");
		        }

      }
      else
      {
 	         response.sendRedirect("login");
      }

%>
<!DOCTYPE HTML>
<html lang="zxx">

<head>
	<title></title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="UTF-8" />
	<meta name="keywords" content="vf" />
	<script>
		addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>
	<style type="text/css">
		.round
		{
			height: 90px !important;
			width: 90px !important;
			border-radius: 50px !important;
		}
		
	</style>
	<!-- Meta tag Keywords -->

	<!-- css files -->
	<link rel="stylesheet" href="detail/css1/style.css" type="text/css" media="all" />
	<!-- Style-CSS -->
	<link href="detail/css1/font-awesome.min.css" rel="stylesheet">
	<link href="//fonts.googleapis.com/css?family=Source+Sans+Pro:200,200i,300,300i,400,400i,600,600i,700,700i,900,900i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese"
	 rel="stylesheet">
	<!-- //web-fonts -->
</head>

<body >
	<div class="main-bg">
		<!-- title -->
		<h1>Welcome mr.<% out.println(s2+s3); %></h1>
		<!-- //title -->
		<!-- content -->
		<div class="sub-main-w3">
			<div class="bg-content-w3pvt">
				<div class="top-content-style">
					<img src="detail/images/user.jpg" alt="" class="round" />
				</div>
				<form action="update3.jsp" method="post">
					<p class="legend">Please Enter New Password..<span class="fa fa-hand-o-down"></span></p>
					
					<div class="input">
						
						<input type="text" placeholder="New password.." name="n1" required />
						<span class="fa fa-lock"></span>
					</div>
					<div class="input">
						<input type="password" placeholder="Confirm Password.." name="n2" required />
						<span class="fa fa-lock"></span>
					</div>
					<button type="submit" class="btn submit">
						<span class="fa fa-sign-in"></span>
					</button>
				</form>
				</div>
		</div>
		<!-- //content -->
		<!-- copyright -->
		<div class="copyright">
			<h2>&copy; 2019  All rights reserved | www.Roomseeker.in
				</h2>
		</div>
		<!-- //copyright -->
	</div>
</body>

</html>