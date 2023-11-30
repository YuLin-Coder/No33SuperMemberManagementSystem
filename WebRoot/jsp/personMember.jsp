<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>个人信息管理</title>
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
	<center><h2>个人信息管理</h2></center>
	<form action="${pageContext.request.contextPath }/PersonMemberServlet?main=update" method="post" >
	<table width="300" height="350" border="1" align="center">
      <tr>
        <th>密码:</th>
        <td>
        	<input type="hidden" name="hid" value="${m.hid }" />
        	<input type="text" name="hpassword" value="${m.hpassword }" />
        	<input type="hidden" name="rgrade" value="${m.rgrade }" />
        </td>
      </tr>
      <tr>
        <th>姓名:</th>
        <td><input type="text" name="hname" value="${m.hname }" /></td>
      </tr>
      <tr>
        <th>性别:</th>
        <td class="sex">
        	<input type="radio" name="hsex" value="男"  <c:if test="${m.hsex=='男' }">checked="checked"</c:if> />男
        	<input type="radio" name="hsex" value="女"  <c:if test="${m.hsex=='女' }">checked="checked"</c:if> />女
        </td>
      </tr>
      <tr>
        <th>年龄:</th>
        <td><input type="text" name="hage" value="${m.hage }" /></td>
      </tr>
      <tr>
        <th>电话:</th>
        <td><input type="text" name="htel" value="${m.htel }" /></td>
      </tr>
      <tr>
        <th>工作单位:</th>
        <td>
        	<input type="text" name="hjob" value="${m.hjob }" />
        	<input type="hidden" name="hintegral" value="${m.hintegral }" />
        </td>
      </tr>
      <tr>
        <td colspan="2" align="center">
        	<input type="submit" value="修改" />
        </td>
      </tr>
    </table>
	</form>
	<center><h4>您的积分为:${m.hintegral } &nbsp; 等级为:${m.rgrade }</h4></center>
</body>
</html>
