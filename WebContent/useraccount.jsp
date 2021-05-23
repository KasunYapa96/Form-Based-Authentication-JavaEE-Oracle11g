<%@page import="com.customer.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:powderblue;">

<%  if(session.getAttribute("user")==null) 
{
response.sendRedirect("login.jsp");
}

%>

<h1>Welcome ${user.getName()} !!!!!!!!!!!!!!!!!!</h1>

<h2>Details are shown below</h2>


<h3>${user.getName()}</h3>
<h3>${user.getEmail()}</h3>
<h3>${user.getPhone()}</h3>



<br><br>


  <a href="logout">  
      <input type="submit" value="Logout"/>  
     </a>






</body>
</html>