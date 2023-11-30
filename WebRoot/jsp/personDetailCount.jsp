<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>个人账单管理</title>
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
	<center><h2>个人账单管理</h2></center>
	<table width="800" border="1" align="center">
      <tr>
      	<th>账单编号</th>
        <th>商品编号</th>
        <th>商品名称</th>
        <th>商品种类</th>
        <th>商品单价</th>
        <th>金额</th>
        <th>数量</th>
        <th>操作</th>
      </tr>
     <c:forEach items="${detailbill }" var="d">
      	<tr>
        <td>${d.did }</td>
        <td>${d.gid }</td>
        <td>${d.dname }</td>
        <td>${d.dkind }</td>
        <td>${d.dprice }</td>
        <td>${d.dmoney }</td>
        <td>${d.dcount }</td>
        <td><a href="${pageContext.request.contextPath }/PersonDetailCountServlet?main=delete&did=${d.did }">删除</a></td>
      </tr>
     </c:forEach>     
    </table>
</body>
</html>
