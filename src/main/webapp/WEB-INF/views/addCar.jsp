<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ page session="true" %>
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Rent Car Now!</title>
</head>

      
      <body>

  <%@include file="header.jsp" %>

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
      <div class="container">
       
       <form:form modelAttribute="newCar" method="post" class="form-horizontal">
			<fieldset>
			
				<div class="form-group">
						<div class="col-lg-10"> 
						ID:<form:input id="carId" path="carId" type="number" class="form:input-large"/> <br />
						Nazwa:<form:input id="carName" path="carName" type="text" class="form:input-large"/> <br />
						ROK PROD:<form:input id="carProductionYear" path="carProductionYear" type="number" class="form:input-large"/> <br />
						CENA WYNAJMU:<form:input id="rentPrice" path="rentPrice" type="number" class="form:input-large"/> <br />
						DOSTEPNOSC<form:checkbox path="carIsAvailable"></form:checkbox> <br />						
					</div>
				</div>

			
		
				


				<div class="form-group">
				
						<input type="submit" id="btnAdd" class="btn btn-primary" value ="Add New Car"/>
			
				</div>
				
			</fieldset>
		</form:form>
       <p><a class="btn btn-primary btn-lg" href="#" role="button">Show cars </a></p>
      </div>
    </div>

      <footer>
        <p>&copy; 2015 Company, Inc.</p>
      </footer>
    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="../../dist/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>







