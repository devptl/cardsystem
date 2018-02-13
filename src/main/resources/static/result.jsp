
<%@page contentType = "text/html;charset = UTF-8" language = "java" %>
<%@page isELIgnored = "false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>

   <body>
      <h2>Submitted Student Information</h2>
      <table>
         <tr>
            <td>cust id</td>
            <td>${custid}</td>
         </tr>
         <tr>
            <td>first name </td>
            <td>${firstname}</td>
         </tr>
         <tr>
            <td>last name</td>
            <td>${lastname}</td>
         </tr>
      </table>  
   </body>
   
</html>>