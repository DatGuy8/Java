<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit a Burger</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css" />
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div
		class="container d-flex justify-content-between align-items-center mt-3">
		<h1>Edit A Burger</h1>
		<a href="/">Go Back</a>
	</div>

	<form:form action="/burgers/${burger.id }" method="put"
		modelAttribute="burger">
		<input type="hidden" name="_method" value="put">
		<form:label path="burgerName">Name of Burger: </form:label>
		<form:errors path="burgerName" class="text-danger" />
		<form:input path="burgerName" value="${burger.burgerName }" />
		<br />
		<form:label path="resturantName">Resturant: </form:label>
		<form:errors path="resturantName" class="text-danger" />
		<form:input path="resturantName" value="${burger.resturantName }" />
		<br />
		<form:label path="rating">Rating out of 5: </form:label>
		<form:errors path="rating" class="text-danger" />
		<form:input path="rating" type="number" min="0" max="5"
			value="${burger.rating }" />
		<br />
		<form:label path="note">Notes: </form:label>
		<form:errors path="note" class="text-danger" />
		<form:textarea path="note" type="textarea" cols="30" rows="3"
			value="${burger.note }" />
		<button>Summit</button>

	</form:form>
</body>
</html>