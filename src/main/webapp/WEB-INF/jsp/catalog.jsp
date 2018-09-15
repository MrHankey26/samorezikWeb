<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
/* Remove the navbar's default margin-bottom and rounded borders */
.navbar {
	margin-bottom: 0;
	border-radius: 0;
}

/* Add a gray background color and some padding to the footer */
footer {
	background-color: #f2f2f2;
	padding: 25px;
}

.carousel-inner img {
	width: 100%; /* Set width to 100% */
	margin: auto;
	min-height: 200px;
}

/* Hide the carousel text when the screen is less than 600 pixels wide */
@media ( max-width : 600px) {
	.carousel-caption {
		display: none;
	}
}
</style>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Logo</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Главная</a></li>
					<li><a href="#">Каталог</a></li>
					<li><a href="#">Контакты</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>
							Login</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<table class="table table-striped">
		<thead>
			<th>#</th>
			<th>Наименование</th>		
			<th>Количество</th>
			<th>Цена</th>
		</thead>

		<tbody>
			<c:forEach var="product" items="${geely}">
				<tr>
					<td><a href="/img/${geely.imgUrl}"><img alt="geely"
							src="/img/${geely.imgUrl}" width="30" height="30"></a></td>
					<td>${geely.model}</td>
					<td>${geely.year}</td>
					<td>${geely.price}</td>
					

				</tr>
			</c:forEach>
		</tbody>
	</table>


	<div class="container text-center">
		<h3>What We Do</h3>
		<br>
		<div class="row">
			<div class="col-sm-4">
				Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolorem at
				dolore nihil, ipsam officiis deserunt quis, eveniet eius vitae
				maiores culpa iste excepturi. Deleniti reiciendis earum fugiat,
				placeat laboriosam aliquam excepturi, qui molestiae mollitia
				adipisci fuga quo modi est possimus explicabo quae ducimus, et
				magnam! Incidunt vero, molestiae quasi, libero repellat numquam
				laudantium esse nobis quia neque molestias vitae dolores animi alias
				id quidem. Eum consequatur a, in necessitatibus autem.
				<p>Current Project</p>
			</div>
			<div class="col-sm-4">
				<img src="https://placehold.it/150x80?text=IMAGE"
					class="img-responsive" style="width: 100%" alt="Image">
				<p>Project 2</p>
			</div>
			<div class="col-sm-4">
				<div class="well">
					<p>г. Бобруйск</p>
					<p>ул. Джержинкого 23/3</p>
				</div>
				<div class="well">
					<p>+37555-55-555-55</p>
				</div>
			</div>
		</div>
	</div>
	<br>

	<footer class="py-5 bg-dark">
		<div class="container">
			<p class="m-0 text-center text-white">Copyright &copy; Your
				Website 2018</p>
		</div>
		<!-- /.container -->
	</footer>

</body>
</html>
