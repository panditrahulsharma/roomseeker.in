
<%@ page import="java.io.*,java.sql.*" %>
<%@ include file="dbcon.jsp" %>

<%

       HttpSession session1 =request.getSession();
            session1.invalidate(); 
            response.sendRedirect("adminlogin.jsp");                    
%>