<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Books</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css" />
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1 class="text-center">ALL BOOKS</h1>
	<table class="table container">
		<thead>
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Title</th>
				<th scope="col">Language</th>
				<th scope="col">Number of Pages</th>
				<th scope="col">Edit/Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="book" items="${books }">
				<tr>
					<th scope="row"><c:out value="${book.id }"></c:out></th>
					<td><a href="/book/<c:out value="${book.id }"/>"><c:out
								value="${book.title }" /></a></td>
					<td><c:out value="${book.language }" /></td>
					<td><c:out value="${book.numberOfPages }" /></td>
					<td class="d-flex">
						<button>
							<a href="/books/${book.id }/edit">Edit</a>
						</button>
						<form action="/books/${book.id}" method="post">
							<input type="hidden" name="_method" value="delete"> 
							<input type="submit" value="Delete">
						</form>

					</td>

				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>