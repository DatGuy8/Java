<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ninja Gold</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css" />
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div>
		<h2 class="text-center">Your Gold:</h2>
		<h2 class="text-center">
			<c:out value="${gold }" />
		</h2>
	</div>
	<!--===== 4 different locations to get gold ===========-->
	<div id="bigbox">
		<div>
			<form class="form1" action="/processgold" method="post">
				<h3>Farm</h3>
				<p>(earns 10-20 gold)</p>
				<input type="hidden" name="location" value="farm" />
				<button>Find Gold!</button>
			</form>
		</div>
		<div>
			<form class="form1" action="/processgold" method="post">
				<h3>Cave</h3>
				<p>(earns 10-20 gold)</p>
				<input type="hidden" name="location" value="cave" />
				<button>Find Gold!</button>
			</form>
		</div>
		<div>
			<form class="form1" action="/processgold" method="post">
				<h3>House</h3>
				<p>(earns 10-20 gold)</p>
				<input type="hidden" name="location" value="house" />
				<button>Find Gold!</button>
			</form>
		</div>
		<div>
			<form class="form1" action="/processgold" method="post">
				<h3>Quest</h3>
				<p>(earns 0-50 gold)</p>
				<input type="hidden" name="location" value="quest" />
				<button>Find Gold!</button>
			</form>
		</div>
	</div>
	<div id="middleit">
		<form action="/processgold" method="post">
			<input type="hidden" name="location" value="reset" />
			<button class="mx-auto">Reset GOLD</button>
		</form>
	</div>
	<h3 class="text-center">Activity</h3>
	<div id="activityBox">

	</div>

</body>
</html>