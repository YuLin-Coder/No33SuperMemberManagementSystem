<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>会员购物管理</title>
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
	<center><h2>会员购物管理</h2></center>
	<table width="800" border="1" align="center">
      <tr>
        <th>购物账单</th>
        <th>会员编号</th>
        <th>折扣</th>
        <th>总价</th>
        <th>购物时间</th>
        <th>操作</th>
      </tr>
      <c:forEach items="${bill }" var="b" >
      	<tr>
	        <td>${b.did }</td>
	        <td>${b.hid }</td>
	        <td>${b.sdiscount }</td>
	        <td>${b.sallprice }</td>
	        <td>${b.stime }</td>
	        <td>
				<a href="${pageContext.request.contextPath }/DetailBillServlet?did=${b.did }">查看详细账单</a>
			</td>
      	</tr>
      </c:forEach>
    </table>
</body>
</html>

