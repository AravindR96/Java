<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String n=request.getParameter("userName");  
out.print("Welcome "+n);  
  
//HttpSession session=request.getSession();  
session.setAttribute("userName",n);  

out.print("<a href='jsp2.jsp'>visit</a>");  
          
%>
</body>
</html>