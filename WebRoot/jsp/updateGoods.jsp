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
	<center><h2>修改商品</h2></center>
	<form action="${pageContext.request.contextPath }/GoodsServlet?main=update" method="post" >
	<table width="300" height="180" border="1" align="center">
      <tr>
        <th>商品名称:</th>
        <td>
        	<input type="hidden" name="gid" value="${goods.gid }" />
        	<input type="text" name="gname" value="${goods.gname }" />
        </td>
      </tr>
      <tr>
        <th>库存数量:</th>
        <td><input type="text" name="gnum" value="${goods.gnum }" /></td>
      </tr>
      <tr>
        <th>商品种类:</th>
        <td><input type="text" name="gkind" value="${goods.gkind }" /></td>
      </tr>
      <tr>
        <td colspan="2" align="center">
        	<input type="submit" value="确定" />
        </td>
      </tr>
    </table>
	</form>
    <center><h3><a href="${pageContext.request.contextPath }/GoodsServlet?main=showlist"  target="main">[返回]</a></h3></center>
</body>
</html>
