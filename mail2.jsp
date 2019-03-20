<%@ page contentType="text/html; charset=utf-8" language="java" 
import="java.sql.*,javax.mail.*,javax.mail.internet.*,java.util.*,java.io.*,javax.activation.*,java.net.*,javax.servlet.http.*,com.sun.net.ssl.internal.www.protocol.https.*,java.security.Security" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
</head>

<body>
<%
try
{
	String toa=request.getParameter("email");
            String []to=toa.split(",");
            String sub=request.getParameter("t2").trim();
            String body=request.getParameter("t3");
			
Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
String host = "smtp.gmail.com";//GOOGLE SERVER NAME....
String from = "your@gmail.com";//THIS GMAIL ID WILL SEND MAIL....
    String pass = "your pass";//THIS IS PASSWORD OF SPECIFIED ID....
    Properties props = System.getProperties();
    props.put("mail.smtp.starttls.enable", "true"); // IF IT IS TRUE ONLY THEN EMAIL WILL BE //SENT....
    props.put("mail.smtp.host", host);
    props.put("mail.smtp.user", from);
    props.put("mail.smtp.password", pass);
props.put("mail.smtp.port", "587");//ASSIGN A PORT THROUGH WHICH ALL WORKING IS //DONE....
    props.put("mail.smtp.auth", "true");//MAKE AUTHORIZATION TRUE....
 
	
	Session session3 = Session.getInstance(props,null);
/*    Session session3 =    Session.getDefaultInstance(props,
            new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("username","pwd");
                }
            });*/

    MimeMessage message = new MimeMessage(session3);//THIS WILL BE USED TO ATTACH A //FILE LATER....
    message.setFrom(new InternetAddress(from));
 
    InternetAddress[] toAddress = new InternetAddress[to.length];
 
    //TO GET THE ADDRESS OF ARRAY....
    for( int i=0; i < to.length; i++ ) 
    { 
        toAddress[i] = new InternetAddress(to[i]);
    }
    //System.out.println(Message.RecipientType.TO);
 //THIS WILL READ THE ADDRESSES ONE BY ONE WHICH ARE SPECIFIED TO SEND MAIL....
    for( int i=0; i < toAddress.length; i++)
    { 
        message.addRecipient(Message.RecipientType.TO, toAddress[i]);
    }
    message.setSubject(sub);
    message.setText(body);
out.println("hello1");    
Transport transport = session3.getTransport("smtp");
//Transport transport = new SMTPTransport(mailSession,new URLName("localhost"));

out.println("hello2");    
transport.connect(host, from, pass);

out.println("hello3");    
transport.sendMessage(message, message.getAllRecipients());
    transport.close();
    RequestDispatcher dp=request.getRequestDispatcher("mailbox.jsp");//IF MAILING IS COMPLETED //SUCCESSFULLUL THEN THIS JSP PAGE WILL BE OPENED....
    dp.forward(request, response);
	
	
	}
	catch(Exception e)
	{
		out.println("Please Connect to the Internat");
        response.sendRedirect("login");
    
        }


%>
</body>
</html>