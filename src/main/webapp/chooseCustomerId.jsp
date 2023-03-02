<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
  <link href="${pageContext.request.contextPath}/style.css" rel="stylesheet" type="text/css">
  <title>Input id</title>
</head>
<body>
<form action="getById" method="Get">
  <p>Input customer ID</p>
  <label>
    <input type="number" name="id">
  </label>
  <br/>
  <button type="submit"><p>Find</p></button>
  <br/>
  <button><a href="/Entity">To main page</a></button>
</form>
</body>
</html>
