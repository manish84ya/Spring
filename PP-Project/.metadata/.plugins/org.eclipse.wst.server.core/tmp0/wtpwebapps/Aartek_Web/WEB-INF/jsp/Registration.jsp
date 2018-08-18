<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
<form:form method="post" action="SignUp.do" modelAttribute="userRegistrationMap">
	<table>
		<tr>
			<td>FirstName:<form:input path="FirstName"  placeholder="Enter First Name" id="FirstName" /></td>
			<td><form:errors path="FirstName"/></td>
		</tr>
			
		<tr>
			 <td>LastName:<form:input path="LastName"  placeholder="Enter Last Name" id="LastName" /></td>
			 <td><form:errors path="LastName"/></td>
		</tr>
			
		<tr>
                <td>EmailID:<form:input path="Email" placeholder="Enter EmailID" id="Email" /></td>
                <td><form:errors path="Email"/></td>
 		</tr>
		<tr>
			<td>Mobile:<form:input path="Mobile"  placeholder="Mobile Number" id="Mobile" /></td>
			<td><form:errors path="Mobile"/></td>
		</tr>
			
		<tr>
			<td>Password:<form:password path="Password" placeholder="Password" id="password" /></td>
			<td><form:errors path="Password"/></td>
		</tr>
			
			<tr>
				<td colspan="2"><input type="submit" value="Register"/></td>
			</tr>
			</table>


	</form:form>

</body>
</html>