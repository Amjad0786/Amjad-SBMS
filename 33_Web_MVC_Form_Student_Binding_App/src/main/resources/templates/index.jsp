<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="ISO-8859-1">
    <title>Student Registration</title>
</head>
<body>

    <h3>Student Registration</h3>

    <!-- Display Success/Error Messages -->
    <font color="green" th:if="${msg}" th:text="${msg}"></font>

    <!-- Form Binding -->
    <form th:action="@{/save}" th:object="${student}" method="post">
        <table>
            <!-- Name Field -->
            <tr>
                <td>Name:</td>
                <td><input type="text" th:field="*{name}" /></td>
            </tr>

            <!-- Email Field -->
            <tr>
                <td>Email:</td>
                <td><input type="email" th:field="*{email}" /></td>
            </tr>

            <!-- Gender Radio Buttons -->
            <tr>
                <td>Gender:</td>
                <td>
                    <input type="radio" th:field="*{gender}" value="Male" /> Male
                    <input type="radio" th:field="*{gender}" value="Female" /> Female
                </td>
            </tr>

            <!-- Courses Dropdown -->
            <tr>
                <td>Course:</td>
                <td>
                    <select th:field="*{course}">
                        <option value="">- Select -</option>
                        <option th:each="course : ${courses}" th:value="${course}" th:text="${course}"></option>
                    </select>
                </td>
            </tr>

            <!-- Timings Checkboxes -->
            <tr>
                <td>Timing:</td>
                <td>
                    <div th:each="timing : ${timings}">
                        <input type="checkbox" th:field="*{timings}" th:value="${timing}" />
                        <label th:for="${#ids.prev()}" th:text="${timing}"></label>
                    </div>
                </td>
            </tr>

            <!-- Submit Button -->
            <tr>
                <td></td>
                <td><input type="submit" value="Submit" /></td>
            </tr>
        </table>
    </form>

</body>
</html>
