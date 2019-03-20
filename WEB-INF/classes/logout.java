

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class logout extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        Connection con=null;
        Statement st=null;
         Statement st2=null;
              ResultSet rs=null;

       HttpSession session =req.getSession();
            session.invalidate(); 
            res.sendRedirect("index.html");                    

    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
    {
        doGet(req, res);
    }
}