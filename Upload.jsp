<%@ page import="java.io.*,java.sql.*" %>
<%


    //to get the content type information from JSP Request Header
    String contentType = request.getContentType();
    //here we are checking the content type is not equal to Null and
 //as well as the passed data from mulitpart/form-data is greater than or
 //equal to 0
    Connection con=null;
    Statement st=null;
     Statement st1=null;
    ResultSet rs=null;

   
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
        
   String s1=(String)session.getAttribute("room");
  
     if(s1==null)
      {
        out.println("wrong email");
        response.sendRedirect("index.html");
   }

    if ((contentType != null) && (contentType.indexOf("multipart/form-data") >= 0))
 {

        DataInputStream in = new DataInputStream(request.getInputStream());
        //we are taking the length of Content type data
        int formDataLength = request.getContentLength();
        byte dataBytes[] = new byte[formDataLength];
        int byteRead = 0;
        int totalBytesRead = 0;
        //this loop converting the uploaded file into byte code
     
        while (totalBytesRead < formDataLength)
 {
            byteRead = in.read(dataBytes, totalBytesRead,formDataLength);
            totalBytesRead += byteRead;
            }

        String file = new String(dataBytes);
        //for saving the file name
        String saveFile = file.substring(file.indexOf("filename=\"") + 10);
		String extt=new String();
		
 //out.println(saveFile);        
saveFile = saveFile.substring(0, saveFile.indexOf("\n"));
 //out.println(saveFile);        
saveFile = saveFile.substring(saveFile.lastIndexOf("\\") + 1,saveFile.indexOf("\""));
        
 //out.println(saveFile);
int lastIndex = contentType.lastIndexOf("=");
        String boundary = contentType.substring(lastIndex + 1,contentType.length());
        int pos;
        //extracting the index of file 
        pos = file.indexOf("filename=\"");
        pos = file.indexOf("\n", pos) + 1;
        pos = file.indexOf("\n", pos) + 1;
        pos = file.indexOf("\n", pos) + 1;
        int boundaryLocation = file.indexOf(boundary, pos) - 4;
        int startPos = ((file.substring(0, pos)).getBytes()).length;
        int endPos = ((file.substring(0, boundaryLocation)).getBytes()).length;

        // creating a new file with the same name and writing the 
//content in new file
out.println(saveFile);

        FileOutputStream fileOut = new FileOutputStream("C:/Program Files/Apache Software Foundation/Tomcat 9.0/webapps/session3/profilepic/"+s1+".jpg");
        fileOut.write(dataBytes, startPos, (endPos - startPos));
        fileOut.flush();
        fileOut.close();
   

       try
       {
           st=con.createStatement();
          st1=con.createStatement();
            rs=st.executeQuery("select * from profile where email='"+s1+"'");
                if(rs.next())
                {
                	
                st1.executeUpdate("update profile set pic='"+s1+".jpg' where email='"+s1+"'");
                out.println("update successfullly ");
                response.sendRedirect("profile");
                
                
                }
                
         con.close();  

       }

       catch(SQLException e3)
       {
           out.println(e3);
       }
       catch(Exception e4)
       {
           out.println(e4);
       }
     }
        %>
