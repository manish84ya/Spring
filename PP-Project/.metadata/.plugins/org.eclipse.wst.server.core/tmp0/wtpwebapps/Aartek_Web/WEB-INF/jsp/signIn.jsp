<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignIn</title>
</head>
<body>
<p>Sign In</p>

<form:form method="post" action="" modelAttribute="userMap">
	
				Email:
				<form:input path="Email" type="text" placeholder="Please enter your email"
					id="Email" />
				Password:
				<form:password path="Password"  type="password" placeholder="Password" id="password" />
	
				<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>