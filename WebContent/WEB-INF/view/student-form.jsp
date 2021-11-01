<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">

		First Name : <form:input path="firstName"/>
		<br><br>
		Last Name : <form:input path="lastName"/>
		<br><br>
		Country : 
		<form:select path = "country">
			<form:option value="Brazil" label="Brazil"> </form:option>
			<form:option value="U.S" label="U.S"> </form:option>
			<form:option value="India" label="India"> </form:option>
			<form:option value="Russia" label="Russia"> </form:option>
		</form:select>
		<br><br>
		<input type="submit" value="Submit">
		
	</form:form>
</body>
</html>