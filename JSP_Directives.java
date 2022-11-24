// Directive tags (The jsp directives are messages that tells the web container how to translate a JSP page into the corresponding servlet.)
1) Page Directive
2) Include Directive
3) Taglib Directive


//Page Directive (BY this we can tell the direction vo jo hme pure page per apply krni h)
Basically page directive ek import statement ki tarah h jaise normal java page m hm import statement use krte h usi tarah JSP page m import use krne k liye page directive
lgana pdta h.
  
  Syntax of JSP Directive
<%@ directive attribute="value" %>  
  
Ex-
  <html>  
<body>  
  
<%@ page import="java.util.Date" %>  // page directive
Today is: <%= new Date() %>  
  
</body>  
</html> 
 
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// Include directive (ye basically kisi or file ko apne existing page m add krne k liye use kiya jata h)
  
  Syntax of include directive
<%@ include file="resourceName" %>
  
  
//Example of include directive
In this example, we are including the content of the header.html file. To run this example you must create an header.html file.

<html>  
<body>  
  
<%@ include file="header.html" %>  
  
Today is: <%= java.util.Calendar.getInstance().getTime() %>  
  
</body>  
</html> 

// ab header.html file m jo bhi banaynge vo is jsp m bhi include hokr run hoga.


+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// Taglib directive
It is used when we want to use other tag library  in our JSP Page succh as JSTL.
  
  Syntax JSP Taglib directive
<%@ taglib uri="uriofthetaglibrary" prefix="prefixoftaglibrary" %>  
Example of JSP Taglib directive
In this example, we are using our tag named currentDate. To use this tag we must specify the taglib directive so the container may get information about the tag.

<html>  
<body>  
  
<%@ taglib uri="http://www.javatpoint.com/tags" prefix="mytag" %>  
  
<mytag:currentDate/>  
  
</body>  
</html>  
