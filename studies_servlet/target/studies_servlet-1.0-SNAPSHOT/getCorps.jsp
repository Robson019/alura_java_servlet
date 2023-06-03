<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/update-corporation" var="update-corporation"/>
<c:url value="/remove-corporation" var="remove-corporation"/>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Corp list</title>
</head>
<body>
  <h1>List of Corporations</h1>
  <c:if test="${not empty corp_name}">
    <h2>you registered: ${corp_name}</h2>
  </c:if>
  <ul>
    <c:forEach items="${corps}" var="corp">
      <li>
          ${corp.name} - <fmt:formatDate value="${corp.createdAt}" pattern="dd/MM/yyyy"/>
          <a href="update-corporation?id=${corp.id}" rel="next">update</a>
          <a href="remove-corporation?id=${corp.id}" rel="next">remove</a>
      </li>
    </c:forEach>
  </ul>
</body>
</html>

<!-- JAVA SERVER PAGE (JSP) -->