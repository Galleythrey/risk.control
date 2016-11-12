<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>
   <table width=650>
      		<tr>
   			<td>
   	<s:form action="create" method="post">
      <table align="center" border="0">
        <tr>
          <td>project</td>
          <td><input type="text" name="project" size=25></td>
        </tr>
        <tr>
          <td>content</td>
          <td><input type="text" name="content" size=25></td>
        </tr>
        <tr>
          <td>possibility</td>
          <td><input type="text" name="possibility" size=25></td>
        </tr>
        <tr>
          <td>seriousness</td>
          <td><input type="text" name="seriousness" size=25></td>
        </tr>
        <tr>
          <td>trigger</td>
          <td><input type="text" name="triggerY" size=25></td>
        </tr>
        <tr>
          <td>tracker</td>
          <td><input type="text" name="tracker" size=25></td>
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
   		<a href="<%=request.getContextPath()+"/user/register.jsp"%>" >register</a>
   </table>
</p>
</body>
</html>