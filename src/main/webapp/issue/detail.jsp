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
<p>id<s:property value="#request.Issue.id"/></p>
<p>项目<s:property value="#request.Issue.project"/></p>
<p>内容<s:property value="#request.Issue.content"/></p>
<p>可能性<s:property value="#request.Issue.possibility"/></p>
<p>影响程度<s:property value="#request.Issue.seriousness"/></p>
<p>阈值<s:property value="#request.Issue.triggerY"/></p>
<p>提交者<s:property value="#request.Issue.committer"/></p>
<p>跟踪者<s:property value="#request.Issue.tracker"/></p>
</body>
</html>