<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>

<head>
	
	<title>Search Hotel</title>

	<script 
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

	<script type="text/javascript">
		$(document).ready(function() {
			$('#city').change(function() {
				var cityId = $(this).val();
				$.ajax({
					type: 'GET',
					url: '${pageContext.request.contextPath}/hotel/loadHotelsByCity/' + cityId,
					success: function(result) {
						var ddhotel = $('#hotel');
						var result = JSON.parse(result);
						var c = '';
						ddhotel.empty();
						c += '<option>--Select Hotel--</option>';
						for(var i = 0; i < result.length; i++) {
							c += '<option value="' + result[i].hotelId + '">' + result[i].hotelName + '</option>';
						}
						ddhotel.append(c);
					}
				});
			});
		});
	</script>
	
</head>

<body>
	
	<div id="wrapper">
		
		<div id="header">
		
			<h1>Hotel Reservation System</h1>
		
		</div>
	
	</div>

	<div id="content">
		
		<h3>Search Hotels</h3>
		
		<form:form action="checkAvailability" modelAttribute="searchHotel" method="POST">
		
			<table>
		
				<tr>
		
					<td><label>City: </label></td>
		
					<td>
						
						<form:select id="city" path="cityId">
							<form:option value="NONE" label="-- Select City--"/>
							<form:options items="${city}"/>
						</form:select>
		
					</td>
		
				</tr>
		
				<tr>
		
					<td><label>Hotel: </label></td>
		
					<td>
						<form:select id="hotel" path="hotelId" action="loadHotelsByCity" modelAttribute="">
							<option>--Select Hotel--</option>
						</form:select>
					</td>
					
				</tr>
				
				<tr>
				
					<td>
						<label>Date: </label>
					</td>
					
					<td>
						<form:input type="date" path="date"/>
					</td>
					
				</tr>
				
				<tr>
				
					<td>
						<input type="submit" value="Check Availability"/>
					</td>
				
				</tr>
				
			</table>
			
		</form:form>
	
	</div>

</body>

</html>