<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Expense</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css" />
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/script.js"></script>
</head>
<body>

	<div
		class="d-flex justify-content-between align-items-center mt-3 container">
		<h1>Expense Details</h1>
		<a href="/" class="col-7">Go Back</a>
	</div>
	<div class="container-sm d-flex">
		<div class="leftSideBox col-3">
			<p>Expense Name:</p>
			<br />
			<p>Expense Description:</p>
			<br />
			<p>Vendor:</p>
			<br />
			<p>Amount Spent:</p>
		</div>
		<div class="rightSideBox col-5">
			<p><c:out value="${expense.expenseName}"/></p>
			<br />
			<p><c:out value="${expense.description}"/></p>
			<br />
			<p><c:out value="${expense.vendor}"/></p>
			<br />
			<p>$<c:out value="${expense.amount}"/></p>
			
		</div>
	</div>
</body>
</html>