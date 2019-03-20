import java.io.File;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


public class postdata extends HttpServlet {

  //String UPLOAD_DIRECTORY = "C:/Program Files/Apache Software Foundation/Tomcat 9.0/webapps/p/login";
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          
        }
    }

 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
     {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
HttpSession session =request.getSession();
       String s1=(String)session.getAttribute("room");
     
 PrintWriter out = response.getWriter();
        Connection con=null;
        Statement st=null;
         Statement st2=null;
         Statement st3=null;
          Statement st4=null;
           Statement st5=null;
         ResultSet rs=null;
           ResultSet rs1=null;
           ResultSet rs2=null;
           ResultSet rs3=null;
           ResultSet rs4=null;
                      ResultSet rs5=null;
                 
      int c1=0,c2=0,c3=0,c4=0;
      String c5;
        if(s1==null)
        {
          response.sendRedirect("index.html");
        }
          try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user1","root","admin");
        }
        catch(ClassNotFoundException e1)
       {
           out.println(e1);
       }
       catch(SQLException e2)
       {
           out.println(e2);
       }
       try
        {
          st5=con.createStatement();      
         rs5=st5.executeQuery("select count(postid) from post where email='"+s1+"'");   
         while(rs5.next())
         {     
         c4=rs5.getInt(1);
     }
             
        }
         catch(SQLException e3)
       {
           out.println(e3);
       }
       catch(Exception e4)
       {
           out.println(e4);
       }
      
       try
        {
          st3=con.createStatement();      
         rs1=st3.executeQuery("select pid from profile where email='"+s1+"'");
                   while(rs1.next())
                   {
                    c3=rs1.getInt(1);
              
                   }
        }
         catch(SQLException e3)
       {
           out.println(e3);
       }
       catch(Exception e4)
       {
           out.println(e4);
       }
        
    
  Random randomValue=new Random();
  int rahul=Math.abs(randomValue.nextInt());
     c5=Integer.toString(rahul);
        String UPLOAD_DIRECTORY1="C:/Program Files/Apache Software Foundation/Tomcat 9.0/webapps/session3/postpic/".concat(s1);
      File directory = new File(UPLOAD_DIRECTORY1);
      if(!directory.exists())
      {
        directory.mkdir();
      }
      String UPLOAD_DIRECTORY=UPLOAD_DIRECTORY1+"/".concat(c5);
       File directory1 = new File(UPLOAD_DIRECTORY1);
    
if(!directory1.exists())
      {
        directory1.mkdir();
      }
       
        String fname = "";
        String ved = "",p1="";
        String a[]=new String[20];
        String b[]=new String[20];
        int i=0,j=0;
       
        if(ServletFileUpload.isMultipartContent(request))
        {
            try{
                List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
                for(FileItem item : multiparts)
                {
                    if(!item.isFormField())
                    {
                        fname = new File(item.getName()).getName();
                        item.write(new File(UPLOAD_DIRECTORY + File.separator + fname));
                        b[i]=fname;
                        //out.println(b[i]);
                        i++;
                    }
                     if(item.isFormField())
                    {
                     ved = item.getString();
                     a[j]=ved;
                    // out.println(a[j]);
                     j++;
                    }
            }
               
        }
           catch (FileUploadException ex)
            {
                Logger.getLogger(postdata.class.getName()).log(Level.SEVERE, null, ex);
            }
             catch (Exception ex) 
             {
                Logger.getLogger(postdata.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
        else
        {
            out.println("jhdsmsh");
        }
             
        try
        {
          st2=con.createStatement();      
         rs=st2.executeQuery("select nearid,cityid from near where nearname='"+a[9]+"'");
                   while(rs.next())
                   {
                    c1=rs.getInt(1);
                    c2=rs.getInt(2);
          
                   }
        }
         catch(SQLException e5)
       {
           out.println(e5);
       }
       catch(Exception e6)
       {
           out.println(e6);
       }
   
          try
          {
            st5=con.createStatement();
            rs5=st5.executeQuery("select curdate()");
            while(rs5.next())
            {
                p1=rs5.getString(1);

            }
          }
          catch(Exception ex)
          {
            out.println(ex);
          }
  
        if(c1==0)
        {
          response.sendRedirect("profile");
        }
        else
        {
          if(c4>2)
          {
          response.sendRedirect("maxpost"); 
          }
          else
          {
      try
       {
           st=con.createStatement();    
               
        st.executeUpdate("insert into post(cityid,nearid,pid,catagary,ptype,gender,properties,bedrooms,furnish,title,email,price,img1,img2,img3,img4,date,address,pathh) values('"+c2+"','"+c1+"','"+c3+"','"+a[0]+"','"+a[1]+"','"+a[2]+"','"+a[3]+"','"+a[4]+"','"+a[5]+"','"+a[6]+"','"+s1+"','"+a[10]+"','"+b[0]+"','"+b[1]+"','"+b[2]+"','"+b[3]+"','"+p1+"','"+a[7]+"','"+c5+"')");
          
          //st5.executeUpdate("insert into image(img1,img2,img3,img4) values('"+b[0]+"','"+b[1]+"','"+b[2]+"','"+b[3]+"') ");
          response.sendRedirect("profile");
       }
      
       catch(Exception e4)
       {
           out.println(e4);
       }
   }
   }

   }
   
    }


