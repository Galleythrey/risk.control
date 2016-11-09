<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>register page</title>
</head>
<body>
<table width="650" border="0" >
  <tr>
    <td width="650" height="80" background="../image/top.jpg">&nbsp;</td>
  </tr>
  <tr>
    <td >
	<a href="/register.jsp">Register</a>&nbsp;&nbsp;
	</td>
  </tr>
</table>
<br>
<br>
<H1><%=request.getAttribute("mess") %></H1>
<BR>
<p>
   <table width=650>
      		<tr>
   			<td>
   	<s:form action="/User/register" method="post">
      <table align="center" border="0">
        <tr>
          <td>User name</td>
          <td><input type="text" name="username" size=25></td>
        </tr>
        <tr>
          <td>Password</td>
          <td><input type="password" name="password" size=25></td>
        </tr> 
        <tr>
          <td>Retype password</td>
          <td><input type="password" name="passwordTwo" size=25></td>
        </tr> 
        <tr>
          <td colspan="2" align="center">
          <s:submit value="Submit"/><br>
          <s:reset value="Reset"/>
          </td>
        </tr>
      </table>
    </s:form>
   			</td>
   		</tr>
   </table>
</p>


</body>
</html>