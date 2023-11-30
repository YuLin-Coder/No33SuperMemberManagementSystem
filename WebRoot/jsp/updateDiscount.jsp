<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>修改</title>
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
	<center><h2>修改折扣</h2></center>
	<form action="${pageContext.request.contextPath }/DiscountServlet?main=update" method="post" >
	<table width="300" height="100" border="1" align="center">
      <tr>
        <th>折扣:</th>
        <td>
        	<input type="hidden" name="rgrade" value="${discount.rgrade }" />
        	<input type="text" name="rdiscount" value="${discount.rdiscount }" />       
        </td>
      </tr>
      <tr>
        <td colspan="2" align="center">
        	<input type="submit" value="确定" />
        </td>
      </tr>
    </table>
	</form>
    <center><h3><a href="${pageContext.request.contextPath }/DiscountServlet?main=showlist"  target="main">[返回]</a></h3></center>
</body>
</html>