<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Confirmation</title>
</head>
<body>
	Student is confirmed : ${student.firstName}  ${student.lastName} of ${student.country} has a favourite Language  ${student.favouriteLanguage} 
	<br><br>
	prefers :
	<ul>
		<c:forEach var = "temp" items="${student.os}">
			<li>
				${temp}
			</li>
		</c:forEach>
	</ul>
</body>
</html>