<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/update-name" var="update-name"/>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Update form</title>
</head>
<body>
<h1>Update Form Name</h1><br>

<form action="update-name" method="post">
  <input type="text" name="name" id="name" placeholder="NAME" value="${corp.name}"/><br>
  <input type="text" name="date" id="date" placeholder="DATE" value="<fmt:formatDate value="${corp.createdAt}" pattern="dd/MM/yyyy"/>"/><br>
  <input type="hidden" name="id" id="id" value="${corp.id}"/>
  <input type="submit" value="update"/>
</form>
</body>
</html>
