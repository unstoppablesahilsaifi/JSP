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
