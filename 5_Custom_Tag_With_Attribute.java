// Creating Custom tag with atttibute in JSP

Note- tag.jsp main file hoti h jisme tags likhe jaate h or PrintTable.java file jo h vo hamari taghandler file h and ab tag ko  tag handler file s attach krne k liye
mapping krni pdegi in tld file.
  
//Tag.jsp
  
  <%-- 
    Document   : tag
    Created on : 03-Dec-2022, 10:20:32 pm
    Author     : saifi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/tlds/mylib" prefix="t" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <t:mytag> </t:mytag>
        // Creating Custom tag with atttibute in JSP
        <t:printTable number="23"></t:printTable>
        
    </body>
</html>


//PrintTable.java

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author saifi
 */
public class PrintTable extends TagSupport
{
    public int number;
    //setter

    public void setNumber(int number) {
        this.number = number;
    }
    

    @Override
    public int doStartTag() throws JspException {
        //Print Table
        try{
        JspWriter out = pageContext.getOut();
        out.print("<br>");
        for (int i=1;i<=10;i++){
            out.println((i*number) +  "<br>");
        }}
        catch(Exception e)
        {
            e.printStackTrace();
        }
       return SKIP_BODY; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}


//mylib.tld

<?xml version="1.0" encoding="UTF-8"?>
<taglib version="2.1" xmlns="http://java.sun.com/xml/ns/javaee" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-jsptaglibrary_2_1.xsd">
  <tlib-version>1.0</tlib-version>
  <short-name>mylib</short-name>
  <uri>/WEB-INF/tlds/mylib</uri>
  <!-- A validator verifies that the tags are used correctly at JSP
          translation time. Validator entries look like this: 
       <validator>
           <validator-class>com.mycompany.TagLibValidator</validator-class>
           <init-param>
              <param-name>parameter</param-name>
              <param-value>value</param-value>
           </init-param>
       </validator>
    -->
  <!-- A tag library can register Servlet Context event listeners in
         case it needs to react to such events. Listener entries look
         like this: 
      <listener>
          <listener-class>com.mycompany.TagLibListener</listener-class> 
      </listener>
    -->
  <tag>
      <name>mytag</name>
      <tag-class>tags.MyTagHandler</tag-class>
  </tag>
   <tag>
      <name>printTable</name>
      <tag-class>tags.PrintTable</tag-class>
      <attribute>
          <name>number</name>
          <required>true</required>
      </attribute>
  </tag>
</taglib>

