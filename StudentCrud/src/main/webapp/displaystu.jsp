<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- display data in table format -->
<table >
<tr>
<th>Student id</th>
<th> FirstName</th>
<th>LastName</th>
<th>actions</th>
</tr>
<!--it will retrieve list from request object and apply for loop to generate 
row in the table for each employee -->
<c:forEach var="s" items="${list}">
<tr>
<!-- it gives call to appropriate getter methods -->
<td>${s.id}</td> 
<td>${s.namefirst}</td>
<td>${s.namelast}</td>
<td>
<a href="deleteemp?eid=${s.id}">delete</a>/
<a href="editemp?eid=${s.id}">edit</a>
</td>

</tr>
</c:forEach>
</table>
<a href="addemp.jsp">Add new Employee</a>
</body>
</html>