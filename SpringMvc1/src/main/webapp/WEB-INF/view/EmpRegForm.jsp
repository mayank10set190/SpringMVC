<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<pre>
	<h1>Employee Regisreation Forms</h1>
	<form:form action="./save" modelAttribute="emp" method="post">
		<table>

			<tr>
				<td>Employee Id</td>
				<td><form:input path="eid" /></td>
			</tr>




			<tr>
				<td>Employee name :</td>
				<td><form:input path="ename" /></td>
			</tr>


			<tr>
				<td>Employee email :</td>
				<td><form:input path="email" /></td>
			</tr>



			<tr>
				<td>Employee password :</td>
				<td><form:password path="password" /></td>
			</tr>



			<tr>
				<td>Employee address :</td>
				<td><form:textarea cols="25" rows="5" path="address" /></td>
			</tr>
		</table>
</pre>

		<tr>
			<td><input type="submit" value=" save"></td>
			<td><input type="reset" value=" reset"></td>

		</tr>



	</form:form>
</body>
</html>