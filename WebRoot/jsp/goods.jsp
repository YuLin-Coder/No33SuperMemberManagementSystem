<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>商品信息管理</title>
<style type="text/css">
	td{
		text-align:center;
	}
	table{
		border-collapse:collapse;
	}
</style>
</head>

<body>
	<center><h2>商品信息管理</h2></center>
	<table width="500" border="1" align="center">
      <tr>
        <th>商品编号</th>
        <th>商品名称</th>
        <th>商品种类</th>
        <th>库存数量</th>
        <th>操作</th>
      </tr>
      <c:forEach items="${goods }" var="g" >
      	<tr>
	        <td>${g.gid }</td>
	        <td>${g.gname }</td>
	        <td>${g.gnum }</td>
	        <td>${g.gkind }</td>
	        <td>
		       <a href="${pageContext.request.contextPath }/GoodsServlet?main=query&gid=${g.gid }" target="main">修改</a>
			        /
			   <a href="${pageContext.request.contextPath }/GoodsServlet?main=delete&gid=${g.gid }" target="main">删除</a>
			</td>
      	</tr>
      </c:forEach>
    </table>
    <center><h3><a href="jsp/addGoods.jsp"  target="main">[添加新商品]</a></h3></center>
</body>
</html>
