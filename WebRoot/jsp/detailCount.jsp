<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>详细账单</title>
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
	<center><h2>详细账单</h2></center>
	<table width="800" border="1" align="center">
      <tr>
      	<th>账单编号</th>
        <th>商品编号</th>
        <th>商品名称</th>
        <th>商品种类</th>
        <th>商品单价</th>
        <th>金额</th>
        <th>数量</th>
      </tr>
      <tr>
        <td>${detailbill.did }</td>
        <td>${detailbill.gid }</td>
        <td>${detailbill.dname }</td>
        <td>${detailbill.dkind }</td>
        <td>${detailbill.dprice }</td>
        <td>${detailbill.dmoney }</td>
        <td>${detailbill.dcount }</td>
      </tr>
    </table>
    <center><h3><a href="${pageContext.request.contextPath }/BillServlet?main=showlist"  target="main">[返回]</a></h3></center>
</body>
</html>
