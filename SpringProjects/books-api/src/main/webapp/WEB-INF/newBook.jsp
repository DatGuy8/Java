<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a Book</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>New Book</h1>
	<form:form action="/books" method="post" modelAttribute="book">
		<form:label path="title">Title:</form:label>
		<form:errors path="title" class="text-danger"/>
		<form:input type="text" path="title" />
		<br />
		<form:label path="description">Description: </form:label>
		<form:errors path="description" class="text-danger"/>
		<form:input type="text" path="description"/>
		<br />
		<form:label path="language">Language: </form:label>
		<form:errors path="language" class="text-danger"/>
		<form:input type="text" path="language" />
		<br />
		<form:label path="numberOfPages">How many pages?</form:label>
		<form:errors path="numberOfPages" class="text-danger"/>
		<form:input type="number" path="numberOfPages"/>
		<br />
		<button>Summit</button>
	</form:form>
</body>
</html>