<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<h1><center>Update Product</center></h1>

<form:form method="post" action="editSave" modelAttribute="userMap">
		<table border="1" align="center">
			<tr>
			<td colspan="2"><font color="red"><form:errors path="firstName"/></font></td>
			</tr>
			<tr>
				<th>FirstName</th>
				<td><form:input path="firstName" name="firstName" id="firstName" /></td>
			</tr>
			<tr>
			<td colspan="2"><font color="red"><form:errors path="lastname"/></font></td>
			</tr>
			<tr>
				<th>LastName</th>
				<td><form:input path="lastname" name="lastname" id="lastname" /></td>
			</tr>
			<tr>
			<td colspan="2"><font color="red"><form:errors path="email"/></font></td>
			</tr>
			<tr>
				<th>Email</th>
				<td><form:input path="email" name="email" id="email" /></td>
			</tr>
			<tr>
			<td colspan="2"><font color="red"><form:errors path="password"/></font></td>
			</tr>
			<tr>
				<th>Password</th>
				<td><form:password path="password" name="password"
						id="password" /></td>
			</tr>
			<tr>
			<td colspan="2"><font color="red"><form:errors path="email"/></font></td>
			</tr>
			<tr>
				<th>ContactNo</th>
				<td><form:input path="contactNo" name="contactNo" id="contactNo" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Update"></td>
			</tr>
		</table>
	</form:form>
	





