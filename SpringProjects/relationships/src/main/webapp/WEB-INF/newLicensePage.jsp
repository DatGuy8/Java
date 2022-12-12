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
<title>Add License</title>
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

	<h1>New License</h1>

	<form:form action="/licenses" method="post" modelAttribute="license">
		<!--- Drop down select menu --->
		<form:select path="person">
			<c:forEach var="onePerson" items="${persons}">
				<!--- Each option VALUE is the id of the person --->
				
				<form:option value="${onePerson.id}" path="person">
					<!--- This is what shows to the user as the option --->
					<c:out value="${onePerson.firstName}" />
					<c:out value="${onePerson.lastName}"/>
				</form:option>
				
			</c:forEach>
		</form:select>
		<form:errors path="state" class="text-danger" />
		<form:label path="state">State: </form:label>
		<form:input input="text" path="state" />
		<form:errors path="experationDate"/>
		<form:label path="experationDate">Exp Date: </form:label>
		<form:input type="date" path="experationDate"/>
		
		
		<button>Submit</button>
	</form:form>



</body>
</html>