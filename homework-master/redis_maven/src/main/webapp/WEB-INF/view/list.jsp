<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<link href="<%=request.getContextPath() %>/js/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
<body>
<%-- <table>
	<tr>
		<td>编号</td>
		<td>姓名</td>
		<td>密码</td>
		<td>年龄</td>
	</tr>
	<c:forEach items="${list }" var="c">
		<tr>
			<td>${c.id }</td>
			<td>${c.username }</td>
			<td>${c.password }</td>
			<td>${c.age }</td>
		</tr>
	</c:forEach>
</table> --%>



<table class="table">
  <caption>基本</caption>
  <thead>
    <tr>
      <th>编号</th>
      <th>姓名</th>
      <th>密码</th>
      <th>年龄</th>
    </tr>
  </thead>
  <c:forEach items="${list }" var="a">
  	<tbody>
    <tr>
      <td>${a.id }</td>
      <td>${a.username }</td>
      <td>${a.password }</td>
      <td>${a.age }</td>
    </tr>
  </tbody>
  </c:forEach>
  
</table>

</body>
</html>