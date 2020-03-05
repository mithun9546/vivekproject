<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method="post" modelAttribute="product">
		<table>

			<tr>
				<td><form:select path="product_type" items="${productsType}" /></td>
				<td><input type="submit" value="Search" /></td>
			</tr>

		</table>
	</form:form>
	<table border="1">


		<c:forEach var="product" items="${productlist}">


			<tr>

				<td>${product}</td>
			</tr>


		</c:forEach>


	</table>
</body>
</html>