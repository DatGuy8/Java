<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hooper's Receipt</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/script.js"></script>
</head>
<body>
	<span class="badge bg-danger">Danger</span>
	<p class="text-center">
		Name :
		<c:out value="${name }" />
	</p>
	<p>
		Item :
		<c:out value="${itemName }" />
	</p>
	<p>
		Price : $
		<c:out value="${ price}" />
	</p>
	<p>
		Description :
		<c:out value="${ description}" />
	</p>
	<p>
		Vendor :
		<c:out value="${vendor }" />
	</p>
	<div class="alert alert-danger" role="alert">A simple</div>
	<div class="card" style="width: 18rem;">
		<img src="..." class="card-img-top" alt="...">
		<div class="card-body">
			<h5 class="card-title">Card title</h5>
			<p class="card-text">Some quick example text to build on the card
				title and make up the bulk of the card's content.</p>
			<a href="#" class="btn btn-primary">Go somewhere</a>
		</div>
	</div>



</body>
</html>