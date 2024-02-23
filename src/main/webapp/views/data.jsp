<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Students</title>
</head>
<body>
 <h3>View Students</h3>
     <a href="/">Add new Student</a>
     <table border="1">
        <thead>
            <tr>
                <th>S.no</th>
                <th>Name</th>
                <th>Email</th>
                <th>Gender</th>
                <th>Courses</th>
                <th>Timings</th>
            </tr>
        </thead>

        <tbody>
            <c:forEach items="${students}" var="stu" varStatus="index">
                <tr>
                    <td>${index.count}</td>
                    <td>${stu.name}</td>
                    <td>${stu.email}</td>
                    <td>${stu.gender}</td>
                    <td>${stu.course}</td>
                    <td>${stu.timings}</td>
                </tr>
            </c:forEach>
        </tbody>

     </table>
</body>
</html>
