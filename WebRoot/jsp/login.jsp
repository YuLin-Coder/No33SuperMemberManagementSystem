<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>超市会员管理系统</title>
<style type="text/css">
	table{
		border-collapse:collapse;
	}
	td{
		text-align:center;
	}
</style>
</head>

<body>
	<center><h3>用户登录</h3></center>
    <form action="${pageContext.request.contextPath }/LoginServlet" method="post">
	<table width="280" height="150" align="center" border="1">
    	<tr>
        	<td>用户名:</td>    
            <td><input type="text" name="userName" /></td>
        </tr>
        <tr>
        	<td>密 码:</td>    
            <td><input type="password" name="password" /></td>
        </tr>
        <tr>
        	<td>身 份:</td>    
            <td>
            	<select name="status">
					<option value="member">会员</option>
					<option value="manager">超市管理员</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
            	<input type="submit" value="登录" />
                <input type="reset" value="重置" />
            </td>
        </tr>
    </table>
	</form>
	<center><h4><font color="red">${requestScope.loginError }</font></h4></center>
</body>
</html>
