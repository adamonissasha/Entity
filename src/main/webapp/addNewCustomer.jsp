<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <link href="${pageContext.request.contextPath}/style.css" rel="stylesheet" type="text/css">
    <title>New Customers</title>
</head>
<body>
<form action="addNew" method="Get">
    <p>Name</p>
    <label>
        <input type="text" name="name">
    </label>
    <br/>
    <p>Surname</p>
    <label>
        <input type="text" name="surname">
    </label>
    <br/>
    <p>Zip code</p>
    <label>
        <input type="number" name="zip">
    </label>
    <br/>
    <p>Email</p>
    <label>
        <input type="email" name="email">
    </label>
    <br/>
    <button type="submit"><p>Add customer</p></button>
    <br/>
    <button><a href="/Entity">To main page</a></button>
</form>
</body>
</html>
