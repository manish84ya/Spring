<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Edit Employee</h1>  
       <form:form modelAttribute="employee" method="POST" action="editSave" >    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden  path="id" /></td>  
         </tr>   
         <tr>    
          <td>FirstName : </td>   
          <td><form:input path="firstName"  /></td>  
         </tr>
         
         <tr>    
          <td>LastName : </td>   
          <td><form:input path="lastName"  /></td>  
         </tr>
             
             
         <tr>    
          <td>dept : </td>   
          <td><form:input path="dept"  /></td>  
         </tr>
             
         <tr>    
          <td>email :</td>    
          <td><form:input path="email" /></td>  
         </tr>   
         <tr>    
          <td>mobile :</td>    
          <td><form:input path="mobile" /></td>  
         </tr>   
         
         <tr>    
          <td>address :</td>    
          <td><form:input path="address" /></td>  
         </tr>   
             
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form>  