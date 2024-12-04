<%@ page contentType="text/html; charset=ISO-8859-1" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>User Form</title>
</head>
<body>

    <!-- Display message -->
    <font color='green'>
        ${msg}
    </font>

    <h1>User Form</h1>

    <!-- Form using JSP tag library -->
    <form action="user" method="post">
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" value="${user.name}"></td>
            </tr>

            <tr>
                <td>Email:</td>
                <td><input type="email" name="email" value="${user.email}"></td>
            </tr>

            <tr>
                <td>Phone:</td>
                <td><input type="number" name="phone" value="${user.phone}"></td>
            </tr>

            <tr>
                <td></td>
                <td><input type="submit" value="Submit"></td>
            </tr>
        </table>
    </form>

</body>
</html>
