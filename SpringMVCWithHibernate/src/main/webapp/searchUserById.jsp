<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Search User</h2>
<form action="searchUser" method="get">
	<label>ID</label>
	<input type="number" name="id"><br/><br><br>
	<input type="submit" value="Search User"/>
	<input type="reset" value="reset"/>
	<br>
</form>
<br/>
${requestScope.msg}
<br/>
<a href="index.jsp">Back</a>
</body>
</html>