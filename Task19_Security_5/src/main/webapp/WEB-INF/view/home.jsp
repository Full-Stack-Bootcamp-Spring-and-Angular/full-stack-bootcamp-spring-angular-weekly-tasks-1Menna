<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>
    <head>
         <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/homeStyle.css" />" />
    </head>

    <body>
        <h1> Home Page</h1>

        <div>Hello User: <security:authentication property="principal.username"/> </div>
        <div>Your Role: <security:authentication property="principal.authorities"/> </div>
        <br>
        <form:form action="${pageContext.request.contextPath}/SignOut" method="post">
            <input type="submit" value="LogOut"/>
        </form:form>

        <security:authorize access="hasRole('ADMIN')">
            <div style="color: red; font-weight: bold; margin-left: 5px;"> only Admin Can See This :) </div>
        </security:authorize>
    </body>
</html>