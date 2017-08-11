<!--isELIgnored设定为真，那么JSP中的表达式被当成字符串处理,false则反之,表示支持EL-->
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<html>
<head>
    <title>hester</title>
</head>
<body>
${requestScope.users}
<br/>
</body>
</html>
