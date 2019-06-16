<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加账户信息</title>
</head>
<body>

        <form action="${pageContext.request.contextPath}/account/save" method="post">
            账户名称：<input type="text" name="name"><br>
            账户金额：<input type="text" name="money"><br>
            <input type="submit" value="保存">
        </form>

</body>
</html>
