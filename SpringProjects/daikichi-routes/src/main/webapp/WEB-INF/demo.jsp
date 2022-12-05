
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.Date"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JOHN'S AWESOME PAGE</title>
</head>
<body>
	<h1>EFEHAOFSDIKFOASIK</h1>
	<h2>The time is <%=new Date() %></h2>
	<%for (int i = 0;i <10;i++){%>
		<H3><%=i %> boom</H3>
	<%}%> 
	
	<h2>Two plus 2 equals</h2>
	<h2><c:out value="${2+2}"/></h2>
	
</body>
</html>