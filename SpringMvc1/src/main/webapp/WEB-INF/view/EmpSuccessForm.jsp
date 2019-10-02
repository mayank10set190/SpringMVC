<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>List Of Employee</h1>
<table>
  
  <tr>
    <td>Employee id=</td>
    <td>${emp.eid}</td>
  </tr>
  
  <tr>
    <td>Employee name=</td>
    <td>${emp.ename}</td>
  </tr>
  
  <tr>
    <td>Employee email=</td>
    <td>${emp.email}</td>
  </tr>
  
  <tr>
    <td>Employee address=</td>
    <td>${emp.address}</td>
  </tr>
  
  <tr>
    <td>Employee password=</td>
    <td>${emp.password}</td>
  </tr>
</table>
<a href="http://localhost:8085/SpringMvc1/api/fc"> loginn again</a>

</body>
</html>