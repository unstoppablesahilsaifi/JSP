// Error handling

jstl.jsp

<%-- 
    Document   : jstl
    Created on : 24-Nov-2022, 9:07:24 pm
    Author     : saifi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="error.jsp" %> // ab bhi error aaygi to page calll ho jaygi or print ho jayga  browser per
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Example of taglib directive</title>
    </head>
    <body>
        <h1>Hello Taglib Directive</h1>
        <hr><!-- comment -->
        <p:out value="${34+56}"></p:out>
        <%!
            int a = 20;
            int b = 0;
        %>

        <%
            int division = a / b;
        %>
        <h1>Division is= <%=division %></h1>

    </body>
</html>



//error.jsp

<%-- 
    Document   : error
    Created on : 24-Nov-2022, 9:28:44 pm
    Author     : saifi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %> //  is page ko hmne error page bna diya h yhaaa
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Something went wrong.......</title>
    </head>
    <body>
        <h1>Something went wrong.......</h1>
        <br><!-- comment -->
        <p> Beta Dhyaan s dekhio niche kya machai h..........</p><!-- comment -->
        <p><%=exception%></p>
        
    </body>
</html>



++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

Index.html

<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->
<html>
    <head>
        <title>Add Module Project ! Home Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-6 offset-md-3">
                    <form action="op.jsp">
                    <div class="card">
                        <div class="card-header bg-dark text-white">
                            <h3>Provide two numbers</h3>
                        </div>
                        <div class="card-body bg-secondary">
                            <div class="form-group">                                                            
                            <input name="n1" type="number" class="form-control" placeholder="Enter no 1">
                            </div>
                              <div class="form-group">  
                            <input name="n2" type="number" class="form-control" placeholder="Enter no 2">
                            </div>
                        </div>
                        <div class="card-footer text-center bg-dark text-white">
                            <button type="submit" class="btn btn-outline-light">Divide</button>
                        </div>
                     
                            
                    </div>
                    </form>
                </div>
                
            </div>
        </div>
    </body>
</html>


//op.jsp



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="error_ex.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        //Scriptlet tag
        <%
            //fetch two numbers
            String n1 = request.getParameter("n1");
            String n2 = request.getParameter("n2");
            //converting string into integer........
            int a = Integer.parseInt(n1);
            int b = Integer.parseInt(n2);
            int c = a / b;

        %>
        //Expression tag
        <h1> Result  is : <%=c%></h1>
    </body>
</html>


// error_ex.jsp



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Something went wrong.</title>
                <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    </head>
    <body>
        <div class="conntainer p-3 text-center">
            <img src="img/error.png" class="img-fluid"/>
         <h1 class="display-3">Sorry! Something went wrong....</h1>
         <p><%=exception%></p>
         <a class="btn btn-outline-primary" href="index.html">Home Page</a>

        </div>
        
    </body>
</html>


//error_404.jsp



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page not found</title>
                <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    </head>
    <body>
        <div class="conntainer p-3 text-center">
            <img src="img/404error.png" class="img-fluid"/>
         <h1 class="display-3">Sorry! Page not found....</h1>
        
         <a class="btn btn-outline-primary" href="index.html">Home Page</a>

        </div>
        
    </body>
</html>


//web.xml

<?xml version="1.0" encoding="UTF-8"?>

<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
	 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	 xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd"
	 version="3.1">
    <error-page>
        <error-code>404</error-code>
        <location>/error_404.jsp</location>
    </error-page>
    <session-config>
        <session-timeout>
            30
        </session-timeout>
    </session-config>
</web-app>
///
