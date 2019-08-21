<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation Page!</title>
</head>
<body>

	Thanks!
	
	<h3>${personinfo}</h3>
	
	
	<form action="vehicle-selection">
	  <input type="checkbox" name="vehicle1" value="Bike"> I have a bike<br>
	  <input type="checkbox" name="vehicle2" value="Car"> I have a car<br>
	  <input type="checkbox" name="vehicle3" value="Boat" checked> I have a boat<br><br>
	  <input type="submit" value="Submit">
	</form>
	
	<form action="gender-selection">
		<p>Please select your gender:</p>
	  <input type="radio" name="gender" value="male"> Male<br>
	  <input type="radio" name="gender" value="female"> Female<br>
	  <input type="radio" name="gender" value="other"> Other<br>
	  <input type="submit" value="Submit">
  	</form>

	<form>
		<select name="submit-car">
			<option value="volvo">Volvo</option>
			<option value="saab">Saab</option>
			<option value="mercedes">Mercedes</option>
			<option value="audi">Audi</option>
		</select> 
		<input type="submit" value="Submit">
	</form>
</body>