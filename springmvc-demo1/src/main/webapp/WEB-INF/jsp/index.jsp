<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
    <title>Title</title>
    <script typet="text/javascript" src="http://libs.baidu.com/jquery/1.9.1/jquery.min.js"></script>
    <script>
        $(function(){
            $.post("${ctx}/user/test.json",{},
                    function (data) {
                        alert(data.b)
                    });
        });
    </script>
</head>
<body>
<input type="hidden" value="呵呵" id="testhh">
<table border="1" width="100%" style="text-align: center">
    <tr>
        <td>姓名</td>
        <td>用户名</td>
        <td>地址</td>
    </tr>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.userName}</td>
            <td>${user.userCode}</td>
            <td>${user.address}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
