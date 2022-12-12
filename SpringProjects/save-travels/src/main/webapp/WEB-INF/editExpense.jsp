<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit My Task</title>
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
		class="container d-flex justify-content-between align-items-center mt-3">
		<h1>Edit Expense</h1>
		<a href="/">Go Back</a>
	</div>
	<!-- ===========EDIT ACTION PART================ -->
	<form:form action="/expenses/${expense.id }" method="put" modelAttribute="expense">
		<input type="hidden" name="_method" value="put">
		<form:label path="expenseName">Expense Name: </form:label>
		<form:errors path="expenseName" class="text-danger" />
		<form:input input="text" path="expenseName" value="${expense.expenseName }"/>
		<br />
		<form:label path="vendor">Vendor: </form:label>
		<form:errors path="vendor" class="text-danger" />
		<form:input input="text" path="vendor" value="${expense.vendor }"/>
		<br />
		<form:label path="amount">Amount: </form:label>
		<form:errors path="amount" class="text-danger" />
		<form:input input="number" path="amount" value="${expense.amount }"/>
		<br />
		<form:label path="description">Description: </form:label>
		<form:errors path="description" class="text-danger" />
		<form:textarea cols="40" rows="3" path="description" value="${expense.description }" />
		<br />
		<button>Submit</button>
	</form:form>
</body>
</html>