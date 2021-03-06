<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form</title>
<style type="text/css">
	.error {color: red}
</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">

		First Name : <form:input path="firstName" />
		<br>
		<br>
		Last Name : <form:input path="lastName" />
		<br>
		<br>
		Country : 
		<form:select path="country">
			<form:options items="${student.countryOptions}" />
		</form:select>
		<br>
		<br>
		Favourite Language : 
		Java : <form:radiobutton path="favouriteLanguage" value="Java" />
		Python : <form:radiobutton path="favouriteLanguage" value="Python" />
		Ruby : <form:radiobutton path="favouriteLanguage" value="Ruby" />


		<br>
		<br>
		Operating Systems : 
		Linux : <form:checkbox path="os" value="Linux" />
		Mac : <form:checkbox path="os" value="Mac" />

		<br>
		<br>
		<input type="submit" value="Submit">

	</form:form>
</body>
</html>