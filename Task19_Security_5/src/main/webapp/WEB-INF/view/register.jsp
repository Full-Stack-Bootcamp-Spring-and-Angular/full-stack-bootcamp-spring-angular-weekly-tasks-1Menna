<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.min.css" />">
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/loginStyle.css" />">
    </head>

    <body>
        <div class="container">
            <div class="card custom-card p-5 mx-auto" style="max-width: 450px;">
                <div class="text-center mb-4">
                    <h2 class="fw-bold" style="color: #444;">Sign Up</h2>
                    <p class="text-muted">Please enter your details</p>
                </div>

                <form:form action="${pageContext.request.contextPath}/addNewUser" method="post">

                    <div class="mb-4">
                        <input type="text" name="username" placeholder="Username" class="form-control"/>
                    </div>

                    <div class="mb-4">
                        <input type="password" name="password" placeholder="Password" class="form-control"/>
                    </div>

                    <button type="submit" class="btn btn-custom w-100 mb-3">register</button>
                </form:form>
                <div>
                    already have account?
                    <form:form action="login" style="display: inline;">
                        <input type="submit" value="login" class="link-button">
                    </form:form>
                </div>

            </div>
        </div>
    </body>
</html>