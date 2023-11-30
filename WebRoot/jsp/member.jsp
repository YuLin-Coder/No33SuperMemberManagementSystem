<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>会员信息管理</title>
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
	<center><h2>会员信息管理</h2></center>
	<table width="800" border="1" align="center">
      <tr>
        <th>编号</th>        
        <th>密码</th>
        <th>等级</th>
        <th>姓名</th>
        <th>性别</th>
        <th>年龄</th>
        <th>电话</th>
        <th>工作单位</th>
        <th>积分</th>
        <th>操作</th>
      </tr>
      
      <c:forEach items="${member }" var="m">
      	<tr>
	        <td>${m.hid }</td>
	        <td>${m.hpassword }</td>
	        <td>${m.rgrade }</td>
	        <td>${m.hname }</td>
	        <td>${m.hsex }</td>
	        <td>${m.hage }</td>
	        <td>${m.htel }</td>
	        <td>${m.hjob }</td>
	        <td>${m.hintegral }</td>
	        <td>
		        <a href="${pageContext.request.contextPath }/MemberServlet?main=query&hid=${m.hid}" target="main">修改</a>
		        /
		        <a href="${pageContext.request.contextPath }/MemberServlet?main=delete&hid=${m.hid}" target="main">删除</a>
	        </td>
      	</tr>
      </c:forEach>          
    </table>
    <center><h3><a href="jsp/addMember.jsp"  target="main">[添加新会员]</a></h3></center>
</body>
</html>
