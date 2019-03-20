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
      String m2=request.getParameter("n1");
      String m3=request.getParameter("n2");
       if(s.equals("null"))
       {
       	response.sendRedirect("login");
       	//out.println("email not recj");
       }
          if(m2.equals(m2))
          {
              response.sendRedirect("login");
          }
              try
              {
                 st1=con.createStatement();
                 st1.executeUpdate("update profile set password='"+m2+"' where email='"+s+"'");
                  session.setAttribute("room",s);
                 response.sendRedirect("profile");
              }
        	catch(Exception e1)
	           {
		        out.println(e1);
		       // out.println("jj");
		        }

     

%>