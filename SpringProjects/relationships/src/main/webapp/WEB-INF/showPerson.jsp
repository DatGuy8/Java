<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Person Info</title>
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
	<h1>Person Details:</h1>
<table class="table">
    <thead class="thead-dark">
        <tr>
            <th>Name</th>
            <th>License Number</th>
            <th>State</th>
            <th>Exp Date</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>
                <c:out value="${person.firstName}"/>
                <c:out value="${person.lastName}"/>
            </td>
            <td><c:out value="${person.license.number}"/></td>
            <td><c:out value="${person.license.state}"/></td>
            <td>
                <c:out value="${person.license.experationDate}"/>
            </td>
        </tr>
    </tbody>
</table>
<a href="/persons/new">Create Person</a>
<a href="/licenses/new">Create License</a>
</body>
</html>