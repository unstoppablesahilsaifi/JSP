//JSP Implicit Objects
Implicit Objects are created during the translation phase of JSP to Servlet.
These objects can be directly used in scriptlet that goes in the  service method.
They are created by container automatically, and they can be accessed using objects.
// For More-   https://www.javatpoint.com/jsp-implicit-objects

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
3 jsp page bnaye h  page 1 run krega or jab ham go to page 2 per click krenge to page 3 run krega yhi hoti h page redirection
redirection ka code page2.jsp mm h
  
  
  
  
  // page1.jsp
  <%-- 
    Document   : page1
    Created on : 06-Dec-2022, 4:23:04 pm
    Author     : saifi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>This is page 1</h1>
        <a href="page2.jsp">Go to Page 2</a>
    </body>
</html>


//page2.jsp
  <%-- 
    Document   : page2
    Created on : 06-Dec-2022, 4:23:18 pm
    Author     : saifi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>This is page 2</h1>
        
        //Redirection Code
        
        <%
        
        response.sendRedirect("page3.jsp");
        %>
    </body>
</html>


//page3.jsp

<%-- 
    Document   : page3
    Created on : 06-Dec-2022, 4:23:26 pm
    Author     : saifi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>This is page 3</h1>
    </body>
</html>


