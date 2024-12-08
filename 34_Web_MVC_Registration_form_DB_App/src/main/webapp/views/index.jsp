<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Student Registration</title>
</head>
<body>
	<h3>Employee Registration Form</h3>

	<font color='green'>${msg}</font>

	<form:form action="save" modelAttribute="employee">

		<table>
			<tr>
				<td>Name:</td>
				<td><form:input path="name" /></td>

			</tr>

			<tr>
				<td>Email:</td>
				<td><form:input path="email" /></td>

			</tr>

			<tr>
				<td>Gender:</td>
				<td><form:radiobutton path="gender" value="male" />Male <form:radiobutton
						path="gender" value="female" />Female</td>

			</tr>

			<tr>
				<td>WorkingRole:</td>
				<td><form:select path="workingRole">
						<form:option value="">-Select-</form:option>
						<form:options items="${workingRole}" />
					</form:select></td>
			</tr>

			<tr>
				<td>Timings:</td>
				<td><form:checkboxes items="${timings}" path="timings" /></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="Save" /></td>
			</tr>


		</table>
	</form:form>
	
	<a href="/viewEmployees">viewEmployees</a>

</body>
</html>
