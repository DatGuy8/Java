<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- =========JSTL TAGS==========-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- ========For Forms ============-->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a Person</title>
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
	<h1>New Person</h1>

	<form:form action="/persons/new" method="post" modelAttribute="person">
		<form:errors path="firstName" class="text-danger" />
		<form:label path="firstName">First Name: </form:label>
		<form:input input="text" path="firstName" />
		<form:errors path="lastName" class="text-danger" />
		<form:label path="lastName">Last Name: </form:label>
		<form:input input="text" path="lastName" />
		<button>Submit</button>
	</form:form>

</body>
</html>