<%@ page import="java.io.*,java.sql.*" %>
<%@ include file="dbcon.jsp" %>
<%!  int i=13,a=10;
      String s="",s1="",s2="",s3="",s4="",s5="",s6="",s7="",s8="",s9="",s10="",s11="",s12="";
   %>

<%
     
        
        s1=request.getParameter("uname");
        s2=request.getParameter("password");
        try
        {
            st=con.createStatement();
            rs=st.executeQuery("select * from admin where email='"+s1+"' and password='"+s2+"'");
            if(rs.next())
            {
            	HttpSession session1=request.getSession();
            	session1.setAttribute("email",s1);
            	response.sendRedirect("admin.jsp");
            }
             else
                  
                {
                  response.sendRedirect("adminlogin.jsp");
                       
                }
          }
           catch(Exception e)
           {
           	out.println(e);
           } 
%>
