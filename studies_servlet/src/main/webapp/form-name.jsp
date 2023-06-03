<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/insert-name" var="insert-name"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>form name</title>
</head>
<body>
    <h1>Form Name</h1><br>

    <form action="insert-name" method="post">
        <input type="text" name="name" id="name" placeholder="NAME"/><br>
        <input type="text" name="date" id="date" placeholder="DATE"/><br>
        <input type="submit" value="submit"/>
    </form>
</body>
</html>