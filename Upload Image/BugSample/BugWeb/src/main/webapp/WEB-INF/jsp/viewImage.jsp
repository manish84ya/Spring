<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="true"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<META http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>Welcome</title>
</head>
<body><!-- 
<h2><a href="uploadfile.jsp">Upload Example</a></h2> -->
<a href="product.do">Product</a>
<%
System.out.println(" hello "+session.getAttribute("uploadFile"));
if (session.getAttribute("uploadFile") != null
&& !(session.getAttribute("uploadFile")).equals("")) {
%>
<h3>Uploaded File</h3>
<br>
<%System.out.println(" Manish"+session.getAttribute("uploadFile")); %>
<img src="<%=session.getAttribute("uploadFile")%>" alt="Upload Image" />

<%System.out.println("Chaurasiya "+session.getAttribute("uploadFile")); %>
<%
session.removeAttribute("uploadFile");

}
%>
</body>
</html>
