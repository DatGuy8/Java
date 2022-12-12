<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OMIKUJI FORM!</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

<h1 class="text-center">Send an Omikuji!</h1>
<div id="formbox">
	<form action="/omikuji/sendform" method="post">
		<label for="years">Pick any number from 5 to 25</label>
		<input type="number" name="years" min="5" max="25"/>
		<br />
		<label for="city">Enter the name of any city.</label>
		<input type="text" name="city" />
		<br />
		<label for="roommate">Enter the name of any real person</label>
		<input type="text" name="roommate" />
		<br />
		<label for="hobby">Enter professional endeavor or hobby:</label>
		<input type="text" name="hobby" />
		<br />
		<label for="livingThing">Enter any type of living thing.</label>
		<input type="text" name="livingThing" />
		<br />
		<label for="somethingNice">Say Something nice to someone:</label>
		<textarea name="somethingNice" cols="40" rows="7"></textarea>
		<p>Send and show a friend</p>
		<button>Send</button>
	</form>
</div>

</body>
</html>