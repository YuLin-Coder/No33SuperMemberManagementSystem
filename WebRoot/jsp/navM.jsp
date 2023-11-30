<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<style type="text/css">
	td{
		text-align:right;
	}
</style>
</head>

<body>
	<table width="200" height="200">
    	<tr>
        	<td><a href="${pageContext.request.contextPath }/PersonMemberServlet?main=personMember" target="main" >个人信息管理</a></td>
        </tr>
        <tr>
        	<td><a href="${pageContext.request.contextPath }/PersonDiscountServlet" target="main" >优惠等级查询</a></td>
        </tr>
        <tr>
        	<td><a href="${pageContext.request.contextPath }/PersonDetailCountServlet?main=personDetailBill" target="main" >个人账单管理</a></td>
        </tr>
    </table>
</body>
</html>
