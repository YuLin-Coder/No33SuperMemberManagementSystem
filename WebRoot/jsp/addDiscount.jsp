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
</style>
</head>

<body>
	<center><h2>添加新折扣</h2></center>
	<form action="${pageContext.request.contextPath }/DiscountServlet?main=add" method="post" >
	<table width="300" height="130" border="1" align="center">
      <tr>
        <th>等级:</th>
        <td><input type="text" name="rgrade" /></td>
      </tr>
      <tr>
        <th>折扣:</th>
        <td><input type="text" name="rdiscount" /></td>
      </tr>
      <tr>
        <td colspan="2" align="center">
        	<input type="submit" value="确定" />
        	<input type="reset" value="重置" />
        </td>
      </tr>
    </table>
	</form>
	<center><h4><font color="red">${requestScope.error }</font></h4></center>
    <center><h3><a href="${pageContext.request.contextPath }/DiscountServlet?main=showlist"  target="main">[返回]</a></h3></center>
</body>
</html>