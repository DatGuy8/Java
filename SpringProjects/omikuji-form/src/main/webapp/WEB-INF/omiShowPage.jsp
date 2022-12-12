<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OMIKUJI!</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<h1 class="text-center">Here's You Omikuji!</h1>

<div id="bluebox">
	<p>
		In
	
		<span><c:out value="${years }"/></span>
		
		years, you will live in
		
		<c:out value="${city }"/>
		
		with
		
		<c:out value="${roommate }"/>
		
		as your roommate, 
		
		<c:out value="${hobby }"/>.
		 
		The next time you see a
		<c:out value="${livingThing }"/>,
		
		you will have good luck. Also,
		
		<c:out value="${somethingNice }"/>
	</p>
</div>
<br />
<div class="mx-auto" style="width:80px;">
	<button><a href="/omikuji">Go Back</a></button>
</div>

</body>
</html>