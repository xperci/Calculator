
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
 


</head>
<body>	
  <table style="width:50%" class="table table-hover table-dark .table-striped">
		<tr>
						<td></td>
						<td></td>
		</tr>
		<tr>
						<td>Resultado</td>
						<td><%= request.getAttribute("res") %></td>
		</tr>
			<tr>
						<td colspan="1"></td>
						<td>
		<a href="index.html" style="color:yellow">Regresar</a></td>
		</tr>
	</table>
	
			


</body>
</html>