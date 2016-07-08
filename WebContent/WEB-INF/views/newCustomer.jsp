<%@page import="java.sql.DriverManager, java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Cadastro de Clientes</title>

    <!-- Bootstrap -->
    <link href="/rentalx/resources/vendors/bootstrap-3.3.6-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="/rentalx/resources/vendors/font-awesome-4.5.0/css/font-awesome.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
  </head>
  <body>
    
    <h1>TESTE!</h1>
    
    
    <div class="container">
		<form action="api/customer/add" method="post">
			<!-- Start Requester -->
			<h3 class=""><i class="fa fa-user"></i> - <span class="glyphicon glyphicon-user"></span>Customer</h3>
			<div class="panel panel-default">
				<div class="panel-body">
					
					<div class="row">
						
						<div class="col-md-2">
							<div class="form-group">
								<input type="text" class="form-control" 
										name="Customer.name" placeholder="Name">
							</div>
						</div>
						<div class="col-md-2">
							<div class="form-group">
								<input type="text" class="form-control" 
										name="PersonalDocument.docNumber" placeholder="CNH">
							</div>
						</div>
						<div class="col-md-2">
							<div class="form-group">
								<input type="date" class="form-control" 
										name="PersonalDocument.expirationDate" placeholder="Expiration Date">
							</div>
						</div>
										
					</div>
				</div>	
			</div>
			
			<h4>Contact Info</h4>
			<div class="panel panel-default">
				<div class="panel-body">
					
					<div class="row">
						<div class="col-md-2">
							<div class="form-group">
								<input type="text" class="form-control" 
										name="ContactInfo.street" placeholder="Address">			
							</div>
						</div>
						<div class="col-md-2">
							<div class="form-group">
								<input type="text" class="form-control" 
										name="ContactInfo.streetNumber" placeholder="streetNumber">
							</div>
						</div>
						<div class="col-md-2">
							<div class="form-group">
								<input type="text" class="form-control" 
										name="ContactInfo.city" placeholder="City">
							</div>
						</div>
						<div class="col-md-2">
							<div class="form-group">
								<input type="text" class="form-control" 
										name="ContactInfo.country" placeholder="Country">
							</div>
						</div>
						<div class="col-md-2">
							<div class="form-group">
								<input type="text" class="form-control" 
										name="ContactInfo.phone" placeholder="Phone">
							</div>
						</div>
					
					</div>
				</div>	
			</div>
			<!-- / Schedule -->

			<input type="submit" value="create" id="create"/>
		</form>
		    
    </div>
    

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="/rentalx/resources/vendors/bootstrap-3.3.6-dist/js/bootstrap.min.js"></script>
  </body>
</html>