<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>会员优惠管理</title>
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
	<center><h2>会员优惠管理</h2></center>
	<table width="500" border="1" align="center">
      <tr>
        <th>编号</th>
        <th>会员等级</th>
        <th>折扣</th>
        <th>操作</th>
      </tr>
      
      <c:forEach items="${discount }" var="d" varStatus="dis" >
      	<tr>
	        <td>${dis.count }</td>
	        <td>${d.rgrade }</td>
	        <td>${d.rdiscount }</td>
	        <td>
		       <a href="${pageContext.request.contextPath }/DiscountServlet?main=query&rgrade=${d.rgrade }" target="main">修改</a>
			        /
			   <a href="${pageContext.request.contextPath }/DiscountServlet?main=delete&rgrade=${d.rgrade }" target="main">删除</a>
			</td>
      	</tr>
      </c:forEach>
      
    </table>
    <center><h3><a href="jsp/addDiscount.jsp"  target="main">[添加新折扣]</a></h3></center>
</body>
</html>
