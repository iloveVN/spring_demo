<%--
  Created by IntelliJ IDEA.
  User: 0283000196
  Date: 2019/11/29
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
    <script src="<%=request.getContextPath()%>/webjars/jquery/3.3.1-2/jquery.js"></script>
<body>
    <form action="<%=request.getContextPath()%>/test/save", method="post">
        姓名：<input type="text" name="username" >
        地址：<input type="text" name="address" >
        性别：<input type="hidden" name="sex" value="1">
        <input type="submit">
    </form>

    <br/>

    <form id="form1">
        姓名：<input type="text" name="user[].username" value="234">
        地址：<input type="text" name="address" value="234">
        性别：<input type="hidden" name="sex" value="1">
        <br/>
        姓名：<input type="text" name="username" value="123">
        地址：<input type="text" name="address" value="123">
        性别：<input type="hidden" name="sex" value="0">
        <br/>
        姓名：<input type="text" name="username" value="345">
        地址：<input type="text" name="address" value="345">
        性别：<input type="hidden" name="sex" value="1">
    </form>


    <script>
        /*var arry = $("#form1").serializeJson();
        var str = JSON.stringify(arry);*/
        var arr = [];
        arr.push({username: "1234", address: "3213", sex: "1"});
        arr.push({username: "12345", address: "32135", sex: "0"});
        arr.push({username: "123456", address: "32136", sex: "1"});
        $.ajax({
            url: "<%=request.getContextPath()%>/test/saves",
            data: JSON.stringify(arr),
            contentType: "application/json",
            type:"post",
            success: function () {
                alert("success");
            }
        })

    </script>
</body>
</html>
