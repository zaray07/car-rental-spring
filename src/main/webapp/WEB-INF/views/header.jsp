<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="true"%>

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
				<a class="navbar-brand" href="/carrental/">Zaray Car Rental</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<c:if test="${user ne 'logged'}">

					<form:form method="post" class="navbar-form navbar-right">
						<div class="form-group">
							<input id="userEmail" name="userEmail" type="text" class="form-control" />

						</div>
						<div class="form-group">
							<input id="userPassword" name="userPassword" type="password" class="form-control" />
						</div>
						<button type="submit" name="loginForm" class="btn btn-success">Sign
							in</button>
					</form:form>
				</c:if>
				<c:if test="${user eq 'logged'}">
				<a class="navbar-brand" href="#">Zalogowany jako  ${userName}.</a>
				</c:if>
			</div>
			<!--/.navbar-collapse -->
		</div>
	</nav>