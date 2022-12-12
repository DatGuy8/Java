<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Burger Tracker</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css" />
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1 class="text-center mt-5">Burger Tracker</h1>

	<table class="table container">
		<thead>
			<tr>
				<th scope="col">Burger Name</th>
				<th scope="col">Resturant Name</th>
				<th scope="col">Rating (out of 5)</th>
				<th scope="col">Edit/Delete</th>


			</tr>
		</thead>
		<tbody>
			<c:forEach var="burger" items="${burgers }">
				<tr>
					<th scope="row"><c:out value="${burger.burgerName }" /></th>
					<td><c:out value="${burger.resturantName }" /></td>
					<td><c:out value="${burger.rating }" /></td>
					<td class="d-flex">
						<button>
							<a href="/burgers/edit/<c:out value="${burger.id }" />">Edit</a>
						</button>
						<form action="/burgers/${burger.id}" method="post">
							<input type="hidden" name="_method" value="delete"> 
							<input type="submit" value="Delete">
						</form>
					</td>



				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="container mt-3">
		<form:form action="/" method="post" modelAttribute="burger">
			<form:label path="burgerName">Name of Burger: </form:label>
			<form:errors path="burgerName" class="text-danger" />
			<form:input path="burgerName" />
			<br />
			<form:label path="resturantName">Resturant: </form:label>
			<form:errors path="resturantName" class="text-danger" />
			<form:input path="resturantName" />
			<br />
			<form:label path="rating">Rating out of 5: </form:label>
			<form:errors path="rating" class="text-danger" />
			<form:input path="rating" type="number" min="0" max="5" />
			<br />
			<form:label path="note">Notes: </form:label>
			<form:errors path="note" class="text-danger" />
			<form:textarea path="note" type="textarea" cols="30" rows="3" />
			<button>Summit</button>

		</form:form>

	</div>
</body>
</html>