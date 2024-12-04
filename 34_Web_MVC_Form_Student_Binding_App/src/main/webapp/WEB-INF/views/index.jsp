<%@ page contentType="text/html; charset=ISO-8859-1" language="java"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Form</title>
</head>
<body>

	<h3>Student Registration</h3>

	<font color='green'>${msg}</font>

	<form:form action="save" modelAttribute="name" method="post"></form:form>

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
			<td><form:radiobutton path="gender" />Male <form:radiobutton
					path="gender" /> Female</td>
		</tr>

		<tr>
			<td>Course:</td>
			<td><form:select path="course">
					<form:option value="">-select-</form:option>
					<form:options items="${courses}" />
				</form:select></td>
		</tr>

		<tr>
			<td>Timing:</td>
			<td><form:checkboxes items="${timings}" path="timings" /></td>
		</tr>

		<tr>
			<td></td>
			<td><input type="submit" value="Save" /></td>
		</tr>





	</table>

</body>
</html>