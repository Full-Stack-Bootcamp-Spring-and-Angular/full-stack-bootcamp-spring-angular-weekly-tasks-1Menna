<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>

    </head>

    <body>
        <h1> Home Page</h1>

        <form:form action="${pageContext.request.contextPath}/SignOut" method="post">
            <input type="submit" value="LogOut"/>
        </form:form>
    </body>
</html>