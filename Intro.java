**JSP
// JSP is the extension of servlet and it provides the more functionality than the servlets.
// JSP page m java ka code bhi embadd kr sakte h html css and js k sath.

// Important tags in JSP
1. Declarative tag

   <%!
   variables;
   methods;
   %>
  
2. Scriptlet tag
   
    <%
      
     Source Code; // isme hm jo bhi likhenge vo servvice  method k andar jayga like koi response generate krna h ya print krna h
     
     %>
       
3. Expression tag (used to print on browser)

   <%= statement %>
       
       
       
  // Code
       
  //FJ.jsp
       
       
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <h1>Hello World!</h1>
    // Declaration tag
    <%!
        int a = 50;
        int b = 10;
        String name = "Sahil Saifi";

        public int doSum() {
            return a + b;
        }

        public String reverse() {
            StringBuffer br = new StringBuffer(name);
            return br.reverse().toString();
        }

    %>
    // Scriptlet tag
    <%
    out.println(a);
    out.println("<br>");
    out.println(b);
    out.println("<br>");
    out.println("Sum is "+doSum());
     out.println("<br>");
      out.println(reverse());
    
    
    %>
    // Expression tag
    <h1>Sum is <%=doSum()%></h1>
    <h1><%=a%></h1>
</body>
</html>
