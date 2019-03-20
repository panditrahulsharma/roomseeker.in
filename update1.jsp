<%@ page import="java.io.*,java.sql.*" %>
<%@ include file="dbcon.jsp" %>
<% String s="";
   response.setContentType("text/html");
   HttpSession session1 =request.getSession();
        s=(String)session1.getAttribute("email");
        if(s==null)
        {
            response.sendRedirect("adminlogin.jsp");
        }

   String s1="",s2="",s3="";
   s1=request.getParameter("name1");
   s2=request.getParameter("name2");
   s3=request.getParameter("name3");
       try
       {
       	st=con.createStatement();
       	st1=con.createStatement();
       	 rs=st.executeQuery("select * from admin where email='"+s+"'");
                if(rs.next())
                {
       	st1.executeUpdate("update admin set name='"+s1+"',lname='"+s2+"',address='"+s3+"' where email='"+s+"'");
       	response.sendRedirect("admin.jsp");
       }
       }
       catch(Exception e)
       {
           out.println(e);
       }
%>