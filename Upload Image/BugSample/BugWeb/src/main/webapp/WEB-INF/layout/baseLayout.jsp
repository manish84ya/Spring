<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- Step no 6:- Create baseLayout.jsp file -->


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<tr>

			<td><tiles:insertAttribute name="header" /></td>

		</tr>

		<tr>

			<td><tiles:insertAttribute name="menu" /></td>

		</tr>

		<tr>

			<td><tiles:insertAttribute name="body" /></td>

		</tr>

		<tr>

			<td><tiles:insertAttribute name="footer" /></td>

		</tr>





	</table>

</body>
</html>