<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	${requestScope.msg}
	<h2>Update User</h2>
	<form action="updateUser" method="post">
		<label>Id</label> <input type="number" name="id" required><br /><br>
		<label>FirstName</label> <input type="text" name="firstName" required><br /><br>
		<label>LastName</label> <input type="text" name="lastName" required><br /><br>

		<label>Age</label> <input type="number" name="Age" required><br /><br>
		<input type="submit" value="Update User" /> <input type="reset"
			value="reset" />
	</form>
	<br />
	<a href="index.jsp">Back</a>
</body>
</html>