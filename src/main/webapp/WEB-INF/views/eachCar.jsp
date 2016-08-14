<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="true"%>
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
	<%@include file="header.jsp"%>

	<!-- Main jumbotron for a primary marketing message or call to action -->
	<div class="jumbotron">
		<div class="container">


			<fieldset>

				<div class="form-group">
					<div class="col-lg-10">
						<div class="form-group">
							<div class="col-lg-10">
								<br /> <br /> ID: Nazwa:${car.carName} <br />
								Rocznik:${car.carProductionYear} <br /> Cena wynajmu:
								${car.rentPrice} <br /> Dostepny: tak<br /> <br />
							</div>
						</div>

					</div>

				</div>
			</fieldset>


			<a class="btn btn-primary btn-lg"
				href="<spring:url value="/carList" /> " role="button">Show cars
			</a>
			<c:if test="${user ne 'logged'}">				
					Tylko zalogowani moga wynajac samochod.
						</c:if>
			<c:if test="${user eq 'logged'}">
				<form:form modelAttribute="createRentOrder" method="post">
					
						<input type="submit" name="edit" class="btn btn-primary"
							value="Wynajmij" />
				</form:form>
			</c:if>
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







