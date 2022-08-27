<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h1>List Products</h1>

<table border="2" width="70%" cellpadding="2">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Price</th>
		<th>Date Added</th>
	</tr>

	<c:forEach var="product" items="${list}">
		<tr>
			<td>${product.ID}</td>
			<td>${product.name}</td>
			<td>${product.price}</td>
			<td>${product.dateAdded}</td>
		</tr>
	</c:forEach>
</table>

