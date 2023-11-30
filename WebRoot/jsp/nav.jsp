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
        	<td><a href="${pageContext.request.contextPath }/MemberServlet?main=showlist" target="main" >会员信息管理</a></td>
        </tr>
        <tr>
        	<td><a href="${pageContext.request.contextPath }/DiscountServlet?main=showlist" target="main" >会员优惠管理</a></td>
        </tr>
        <tr>
        	<td><a href="${pageContext.request.contextPath }/GoodsServlet?main=showlist" target="main" >商品信息管理</a></td>
        </tr>
        <tr>
        	<td><a href="${pageContext.request.contextPath }/BillServlet?main=showlist" target="main" >会员购物管理</a></td>
        </tr>
    </table>
</body>
</html>
