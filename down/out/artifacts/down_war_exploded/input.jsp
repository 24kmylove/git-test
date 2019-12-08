<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: my computer
  Date: 2019/12/1
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="download2">
    <s:textfield label="用户名"/>
    <s:password label="密码"/>
    <s:submit value="登陆"/>
</s:form>

</body>
</html>
