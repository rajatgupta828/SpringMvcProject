<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Registration Form</title>

<style type="text/css">
.error {
	color: red
}
</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="customer">
	
		First Name : <form:input path="firstName" />
		<br>
		<br>
		Last Name(*) : <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error"></form:errors>


		<br>
		<br>
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>