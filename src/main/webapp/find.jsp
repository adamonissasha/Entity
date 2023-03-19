<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
  <link href="${pageContext.request.contextPath}/style.css" rel="stylesheet" type="text/css">
  <title>Find</title>
</head>
<body>
<form action="getByStr" method="Get">
  <p>Input substring</p>
  <label>
    <input type="text" name="str">
  </label>
  <br/>
  <button type="submit"><p>Find</p></button>
  <br/>
  <button><a href="/Entity">To main page</a></button>
</form>
</body>
</html>
