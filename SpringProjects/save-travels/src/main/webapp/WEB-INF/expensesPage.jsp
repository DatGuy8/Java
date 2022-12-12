<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Read Share</title>
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
	
	<h1 class="text-center mt-3">Save Travels</h1>
	<table class="table container">
		<thead class="thead-dark">
			<tr>
				<th scope="col">Expense</th>
				<th scope="col">Vendor</th>
				<th scope="col">Amount</th>
				<th scope="col">Edit/Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="expense" items="${expenses }">
				<tr>
					<th scope="row"><a href="/expenses/${expense.id }"><c:out value="${expense.expenseName }" /></a></th>
					<td><c:out value="${expense.vendor }" /></td>
					<td>$<c:out value="${expense.amount }" /></td>
					<td class="d-flex"><a href="/expenses/edit/${expense.id }"><button>edit</button></a>
						<form action="/expenses/delete/${expense.id }" method="post">
							<input type="hidden" name="_method" value="delete" />
							<button>delete</button>
						</form></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<h4 class="text-center">Total Expenses: $<c:out value="${totalExpenses }"/></h4>


	<form:form action="/expenses" method="post" modelAttribute="expense"
		class="container">
		<h2>Add Expense</h2>
		<form:label path="expenseName">Expense Name: </form:label>
		<form:errors path="expenseName" class="text-danger" />
		<form:input input="text" path="expenseName" />
		<br />
		<form:label path="vendor">Vendor: </form:label>
		<form:errors path="vendor" class="text-danger" />
		<form:input input="text" path="vendor" />
		<br />
		<form:label path="amount">Amount: </form:label>
		<form:errors path="amount" class="text-danger" />
		<form:input input="number" path="amount" />
		<br />
		<form:label path="description">Description: </form:label>
		<form:errors path="description" class="text-danger" />
		<form:textarea cols="40" rows="3" path="description" />
		<br />
		<button>Submit</button>
	</form:form>

</body>
</html>