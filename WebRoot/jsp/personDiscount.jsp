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
	<center><h2>优惠等级查询管理</h2></center>
	<table width="400" border="1" align="center">
      <tr>
        <th>编号</th>
        <th>会员等级</th>
        <th>折扣</th>
      </tr>
      <c:forEach items="${discount }" var="d" varStatus="dis" >
      	<tr>
	        <td>${dis.count }</td>
	        <td>${d.rgrade }</td>
	        <td>${d.rdiscount }</td>
      	</tr>
      </c:forEach>
    </table>
    
    <table width="400" border="0" align="center">
      <tr>
      	<th width="50">&nbsp;</th>
        <th><font size="+4">☞</font></th>
        <th align="left">累计积分达到200则为2级会员</th>
      </tr>
      <tr>
      	<th>&nbsp;</th>
        <th><font size="+4">☞</font></th>
        <th align="left">累计积分达到300则为3级会员</th>
      </tr>
      <tr>
      	<th>&nbsp;</th>
        <th><font size="+4">☞</font></th>
        <th align="left">累计积分达到400则为4级会员...</th>
      </tr>  
    </table>    
</body>
</html>
