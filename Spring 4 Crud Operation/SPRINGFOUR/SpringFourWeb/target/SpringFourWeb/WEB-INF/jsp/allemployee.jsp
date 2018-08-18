<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>University Enrollments</title>


<link
	href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script
	src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>

<script>
	$(document).ready(function() {
		$('#example').DataTable({
			"pagingType" : "full_numbers"
		});
	});
</script>
</head>
<body>
<h2 align="center">List of Employees</h2>
<hr>
	<table id="example" align="center" border="1" bordercolor="pink"
		bgcolor="grey">
		<thead>
			<tr>
				<th>ID</th>
				<th>FirstName</th>
				<th>LastName</th>
				<th>Email</th>
				<th>Mobile</th>
				<th>Dept</th>
				<th>Address</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${employees}" var="emp">
				<tr>
					<td><c:out value="${emp.id}" /></td>
					<td><c:out value="${emp.firstName}" /></td>
					<td><c:out value="${emp.lastName}" /></td>
					<td><c:out value="${emp.email}" /></td>
					<td><c:out value="${emp.mobile}" /></td>
					<td><c:out value="${emp.dept}" /></td>
					<td><c:out value="${emp.address}" /></td>
					<td><a href="edit-${emp.id}">Edit</a></td>  
   					<td><a href="delete-${emp.id}">Delete</a></td>
			<%-- <td><a href="<c:url value='/edit-${emp.id}-employee' />">Edit</a></td>
			<td><a href="<c:url value='/delete-${emp.id}-employee' />">Delete</a></td> --%>
				</tr>
			</c:forEach>

		</tbody>
	</table>


	<%-- 
		
<c:forEach items="${employees}" var="emp">
			<tr>
			<td>${emp.id}</td>
			<td>${emp.firstName}</td>
			<td>${emp.lastName}</td>
			<td>${emp.email}</td>
			<td>${emp.mobile}</td>
			<td>${emp.dept}</td>
			<td>${emp.address}</td>
			<td><a href="<c:url value='/edit-${emp.id}-employee' />">${employee.ssn}</a></td>
			<td><a href="<c:url value='/delete-${employee.ssn}-employee' />">delete</a></td>
			</tr>
		</c:forEach>
 --%>
	</table>
	<br />
	<a href="registration">Add New Employee</a>
</body>
</html>
