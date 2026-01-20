<html>
    <head>

        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">

        <%--import Bootstrap--%>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    </head>
    <body background="${pageContext.request.contextPath}/resources/images/background.jpg">
         <div class="d-flex justify-content-center align-items-center vh-100">
                 <div class="p-4 mt-3" style="width: 400px;">

                     <h2 class="text-center mb-4">Employee Registration Form</h2>

                     <form:form action="processForm" modelAttribute="userModel">

                         <div class="mb-3">
                             <label class="form-label">User Name</label>
                             <form:input path="userName" class="form-control" placeholder="Enter user name"/>
                             <form:errors path="userName" class="text-danger"/>
                         </div>

                         <div class="mb-3">
                             <label class="form-label">Email</label>
                             <form:input path="email" type="email" class="form-control" placeholder="user@gmail.com"/>
                             <form:errors path="email" class="text-danger"/>
                         </div>

                         <div class="mb-3">
                             <label class="form-label">Password</label>
                             <form:input path="password" type="password" class="form-control" placeholder="Enter password"/>
                             <form:errors path="password" class="text-danger"/>
                         </div>

                         <div class="mb-3">
                             <label class="form-label">Confirm Password</label>
                             <form:input path="confirmPassword" type="password" class="form-control" placeholder="Confirm password"/>
                             <form:errors path="confirmPassword" class="text-danger"/>
                         </div>

                         <button type="submit" class="btn btn-primary w-100">Submit</button>

                     </form:form>
                 </div>
             </div>


    </body>
</html>

