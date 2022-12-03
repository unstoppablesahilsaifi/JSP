// Creating custom tag
Kisi bhi class ko tag handler banane k liye ek interface h tag and is interface ko implement krlo and uske method vgera override krlo
//Note- Ek file hoti h Tag Lib Descriptor(aapne kon konse tag banaye h vo info iske andar hogi) jo ki webINF k andar bnti h 
  
  
  MyTagHandler.java
  
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
public class MyTagHandler extends TagSupport{

    @Override
    public int doStartTag() throws JspException {
        try{
            // yha per vo task likhenge jo hm tag s krana chah rhe h
            JspWriter out=pageContext.getOut();
            out.println("<h1> Hello this  is my custom tag from tag handler</h1>    ");
        }catch(Exception e){
            e.printStackTrace();
        }
        return SKIP_BODY; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}


// TLD File

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
</taglib>
 
        
        
        //      tag.jsp
        
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
    </body>
</html>


//O/P

Hello World!
Hello this is my custom tag from tag handler
