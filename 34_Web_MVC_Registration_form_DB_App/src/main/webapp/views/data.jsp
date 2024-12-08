<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>
    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Employees</title>
    <style>
        table {
            width: 50%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 10px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h2>View Employees</h2>

<a href="/">Add New Employee</a>
    <table border="1">
        <thead>
            <tr>
                <th>S.No</th>
                <th>Name</th>
                <th>Email</th>
                <th>Gender</th>
                <th>Working Role</th>
                <th>Timings</th>
            </tr>
        </thead>
        <tbody>
    <c:forEach items="${employeeList}" var="employee" varStatus="index">
        <tr>
            <td>${index.count}</td>
            <td>${employee.name}</td>
            <td>${employee.email}</td>
            <td>${employee.gender}</td>
            <td>${employee.workingRole}</td>
            <td>${employee.timings}</td>
        </tr>
    </c:forEach>
</tbody>

    </table>
</body>
</html>
