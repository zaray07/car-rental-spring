<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false"%>
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Rent Car Now!</title>
</head>


<body>

	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Zaray Car Rental</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<form class="navbar-form navbar-right">
					<div class="form-group">
						<input type="text" placeholder="Email" class="form-control">
					</div>
					<div class="form-group">
						<input type="password" placeholder="Password" class="form-control">
					</div>
					<button type="submit" class="btn btn-success">Sign in</button>
				</form>
			</div>
			<!--/.navbar-collapse -->
		</div>
	</nav>

	<!-- Main jumbotron for a primary marketing message or call to action -->
	<div class="jumbotron">
		<div class="container">


			<fieldset>

				<div class="form-group">
					<div class="col-lg-10">

						<form:form modelAttribute="car" method="post"
							class="form-horizontal">
							<fieldset>

								<div class="form-group">
									<div class="col-lg-10">
										ID:
										<form:input id="carId" path="carId" type="number"
											class="form:input-large" />
										<br /> Nazwa:
										<form:input id="carName" path="carName" type="text"
											class="form:input-large" />
										<br /> ROK PROD:
										<form:input id="carProductionYear" path="carProductionYear"
											type="number" class="form:input-large" />
										<br /> CENA WYNAJMU:
										<form:input id="rentPrice" path="rentPrice" type="number"
											class="form:input-large" />
										<br /> DOSTEPNOSC
										<form:checkbox path="carIsAvailable"></form:checkbox>
										<br />
									</div>
								</div>






								<div class="form-group">
									<div class="col-lg-offset-2 col-lg-10">
										<input type="submit" name="edit" class="btn btn-primary"
											value="Edit" />
									</div>
										<div class="col-lg-offset-2 col-lg-10">
										<input type="submit" name="delete" class="btn btn-primary"
											value="Delete" />
									</div>
								</div>

							</fieldset>
						</form:form>
					</div>
				</div>






			

			</fieldset>

			<p>
				<a class="btn btn-primary btn-lg" href="<spring:url value="/adminPanel/carList" /> " role="button">Show
					cars </a>
			</p>
		</div>
	</div>

	<footer>
		<p>&copy; 2015 Company, Inc.</p>
	</footer>
	</div>
	<!-- /container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script>
		window.jQuery
				|| document
						.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')
	</script>
	<script src="../../dist/js/bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>






