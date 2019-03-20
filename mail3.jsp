<%@ page contentType="text/html; charset=utf-8" language="java" 
import="java.sql.*,javax.mail.*,javax.mail.internet.*,java.util.*,java.io.*,javax.activation.*,java.net.*,javax.servlet.http.*,com.sun.net.ssl.internal.www.protocol.https.*,java.security.Security" errorPage="" %>

<%! String toa="";%>
<%
Random rand = new Random();
String otp= String.valueOf(rand.nextInt(9000) + 1000);
String a="" ,b="",c="",d="",e="";
try
{

	 toa=request.getParameter("verify");
     String []to=toa.split(",");
               		
Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
String host = "smtp.gmail.com";//GOOGLE SERVER NAME....
String from = "your@gmail.com";//THIS GMAIL ID WILL SEND MAIL....
    String pass = "yourpass";//THIS IS PASSWORD OF SPECIFIED ID....
    Properties props = System.getProperties();
    props.put("mail.smtp.starttls.enable", "true"); // IF IT IS TRUE ONLY THEN EMAIL WILL BE //SENT....
    props.put("mail.smtp.host", host);
    props.put("mail.smtp.user", from);
    props.put("mail.smtp.password", pass);
props.put("mail.smtp.port", "587");//ASSIGN A PORT THROUGH WHICH ALL WORKING IS //DONE....
    props.put("mail.smtp.auth", "true");//MAKE AUTHORIZATION TRUE....
 
	
	Session session1 = Session.getInstance(props,null);

    MimeMessage message = new MimeMessage(session1);//THIS WILL BE USED TO ATTACH A //FILE LATER....
    message.setFrom(new InternetAddress(from));
 
    InternetAddress[] toAddress = new InternetAddress[to.length];
 
    //TO GET THE ADDRESS OF ARRAY....
    for( int i=0; i < to.length; i++ ) 
    { 
        toAddress[i] = new InternetAddress(to[i]);
    }
   
 //THIS WILL READ THE ADDRESSES ONE BY ONE WHICH ARE SPECIFIED TO SEND MAIL....
    for( int i=0; i < toAddress.length; i++)
    { 
        message.addRecipient(Message.RecipientType.TO, toAddress[i]);
    }
    message.setSubject("Verify Mail");
    message.setText(otp);
Transport transport = session1.getTransport("smtp");
  
transport.connect(host, from, pass);

transport.sendMessage(message, message.getAllRecipients());
    transport.close();

	}
	catch(Exception e1)
	{
		out.println("Please Connect to the Internat");
		response.sendRedirect("login");
		}


%>

<!DOCTYPE html>
<html lang="en">
<head>
	<title>Processing Running Please Wait...</title>
	<meta charset="UTF-8">
	   <meta name="keywords" content="Find Your Ideal Rooms,Hostels and Flats In kota">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="detail/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="detail/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="detail/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="detail/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="detail/vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="detail/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="detail/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="detail/vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="detail/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="detail/css/util.css">
	<link rel="stylesheet" type="text/css" href="detail/css/main.css">
<!--===============================================================================================-->
</head>
<body>
	
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-50">
				<form class="login100-form validate-form" action="passupdate.jsp" name="form1">
					<span class="login100-form-title p-b-33">
						Please Enter Otp
					</span>
                     <% 
                    session.setAttribute("rooms",toa);
           
                     %>
                      <input type="hidden" name="hidden2" value="<%=otp%>" />
                     <% out.println("Time left");%>
					<div class="wrap-input100 validate-input">

						<input class="input100" type="text" name="time" >
						
					</div>

					<div class="wrap-input100 rs1 validate-input" data-validate="Password is required">
						<input class="input100" type="password" name="verify1" placeholder="Enter Otp here...">
						
					</div>

					<div class="container-login100-form-btn m-t-20">
						<button class="login100-form-btn" value="submit">
							Submit Otp
						</button>
					</div>

					<br><br>

					<div class="text-center">
						<span class="txt1">
						Please Don't Refresh Pgae..
						</span>

					</div>
				</form>
			</div>
		</div>
	</div>
	

	
    <script type="text/javascript">
        var a = 120;
        var t;
        function f1()
        {
            document.form1.time.value=a;
            if(a==0)
            {
                window.location.href='login';
            }
            a=a-1;

            t = setTimeout("f1()",1000)
        }
        f1();
    </script>

</body>
</html>