<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>All Customers</title>
</head>
<body>

<table>
    <tr>
        <td><c:out value="ID"/></td>
        <td><c:out value="NAME"/></td>
        <td><c:out value="SURNAME"/></td>
        <td><c:out value="ZIP CODE"/></td>
        <td><c:out value="EMAIL ADDRESS"/></td>
    </tr>
    <jsp:useBean id="customers" scope="request" type="java.util.List"/>
    <c:forEach items="${customers}" var="customer">
        <tr>
            <td><c:out value="${customer.id}"/></td>
            <td><c:out value="${customer.name}"/></td>
            <td><c:out value="${customer.surname}"/></td>
            <td><c:out value="${customer.zipCode}"/></td>
            <td><c:out value="${customer.email}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
