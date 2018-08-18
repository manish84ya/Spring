<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form  name ="myproducts" id="prdct" action="product.do" method="post" modelAttribute="prodMap">
		<pre>
		         
 				<form:errors path="prodname" class="error"/>
				Product name      : <form:input path="prodname"/>
 				<form:errors path="proddesc" class="error"/>
				Product Desc      : <form:input path="proddesc"/>
 				<form:errors path="prodprice" class="error"/>
				Product Price     : <form:input path="prodprice"/>
				<form:errors path="prodqty" class="error"/>
				Product Quantity  : <form:input path="prodqty"/>
							 <input type="submit" value="Submit">
							 
		</pre>

</form:form>

<hr>
<table border="1" align="center">
	<tr>
		<td><B>Product Id</B></td>
		<td><B>Product Name</B></td>
		<td><B>Product Description</B></td>
		<td><B>Product Price</B></td>
		<td><B>Product Quantity</B></td>
	</tr>

	 <c:choose>
	 <c:when test="${empty prodList}">
	    No Such Record Found...
	 </c:when>
	 <c:otherwise>
	<c:forEach items="${prodList}" var="prod">
	
	<tr>
			<td><c:out value="${prod.prodid}"/></td>
			<td><c:out value="${prod.prodname}"/></td>
			<td><c:out value="${prod.proddesc}"/></td>
			<td><c:out value="${prod.prodprice}"/></td>
			<td><c:out value="${prod.prodqty}"/></td>

		</tr>
	</c:forEach> 
	</c:otherwise>
	</c:choose>
	
</table>
</body>
</html>