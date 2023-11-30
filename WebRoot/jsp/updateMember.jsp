<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>添加</title>
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
	.s{
		font-size:16px;
	}
</style>
</head>

<body>
	<center><h2>修改会员</h2></center>
	<form action="${pageContext.request.contextPath }/MemberServlet?main=update" method="post" >
	<table width="300" height="350" border="1" align="center">
      <tr>
        <th>等级:</th>
        <td>
        	<input type="text" name="rgrade" value="${member.rgrade }" />
        	<input type="hidden" name="hid" value="${member.hid }" /> 
        	<input type="hidden" name="hpassword" value="${member.hpassword }" />
        </td>
      </tr>
      <tr>
        <th>姓名:</th>
        <td><input type="text" name="hname" value="${member.hname }" /></td>
      </tr>
      <tr>
        <th>性别:</th>
        <td class="sex">
        	<input type="radio" name="hsex" value="男"  <c:if test="${member.hsex=='男' }">checked="checked"</c:if> />男
        	<input type="radio" name="hsex" value="女"  <c:if test="${member.hsex=='女' }">checked="checked"</c:if> />女
        </td>
      </tr>
      <tr>
        <th>年龄:</th>
        <td><input type="text" name="hage" value="${member.hage }" /></td>
      </tr>
      <tr>
        <th>电话:</th>
        <td><input type="text" name="htel" value="${member.htel }" /></td>
      </tr>
      <tr>
        <th>工作单位:</th>
        <td><input type="text" name="hjob" value="${member.hjob }" /></td>
      </tr>
      <tr>
        <th>积分:</th>
        <td><input type="text" name="hintegral" value="${member.hintegral }" /></td>
      </tr>
      <tr>
        <td colspan="2" align="center">
        	<input type="submit" value="确定" />
        </td>
      </tr>
    </table>
	</form>
    <center><h3><a href="${pageContext.request.contextPath }/MemberServlet?main=showlist" target="main">[返回]</a></h3></center>
</body>
</html>
