<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>添加</title>
<style type="text/css">
	td{
		text-align:center;
	}
	table{
		border-collapse:collapse;
	}
	.sex{
		text-align:left;
		padding-left:17px;
	}
	.s{
		font-size:16px;
	}
</style>
</head>

<body>
	<center><h2>添加新会员</h2></center>
	<form action="${pageContext.request.contextPath }/MemberServlet?main=add" method="post" >
	<table width="300" height="350" border="1" align="center">
      <tr>
        <th>密码:</th>
        <td><input type="password" name="hpassword" /></td>
      </tr>
      <tr>
        <th>等级:</th>
        <td><input type="text" name="rgrade" /></td>
      </tr>
      <tr>
        <th>姓名:</th>
        <td><input type="text" name="hname" /></td>
      </tr>
      <tr>
        <th>性别:</th>
        <td class="sex">
        	<select  class="s" name="hsex">
            	<option value="男">男</option>
                <option value="女">女</option>
            </select>
        </td>
      </tr>
      <tr>
        <th>年龄:</th>
        <td><input type="text" name="hage" /></td>
      </tr>
      <tr>
        <th>电话:</th>
        <td><input type="text" name="htel" /></td>
      </tr>
      <tr>
        <th>工作单位:</th>
        <td><input type="text" name="hjob" /></td>
      </tr>
      <tr>
        <th>积分:</th>
        <td><input type="text" name="hintegral" /></td>
      </tr>
      <tr>
        <td colspan="2" align="center">
        	<input type="submit" value="确定" />
        	<input type="reset" value="重置" />
        </td>
      </tr>
    </table>
	</form>
    <center><h3><a href="${pageContext.request.contextPath }/MemberServlet?main=showlist"  target="main">[返回]</a></h3></center>
</body>
</html>
