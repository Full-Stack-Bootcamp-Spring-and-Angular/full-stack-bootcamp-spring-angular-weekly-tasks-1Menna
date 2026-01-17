<html>
    <head>

        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">

        <%--import Bootstrap--%>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    </head>
    <body background="${pageContext.request.contextPath}/resources/images/background.jpg">
        <div class="container m-5">

          <h2>User Registration</h2>

          <form:form action="processForm"  modelAttribute="userModel">

            <div class="mb-3 mt-3">
              <form:input type="text" class="form-control" id="userName" placeholder="Enter user name" path="userName"/>

              <form:input type="password" class="form-control" id="password" placeholder="Enter password" path="password"/>
            </div>

            <form:select path="country" class="form-control">
                <form:option value="Brazil" label="Brazil"/>
                <form:option value="Egypt" label="Egy"/>
                <form:option value="Saudia Arabia" label="KSA"/>
            </form:select>

            <div>
                <h3>Preferred Programming Language</h3>

                Java <form:radiobutton path="programmingLanguage" value="Java"/>
                Python <form:radiobutton path="programmingLanguage" value="Python"/>
                C++ <form:radiobutton path="programmingLanguage" value="C++"/>
            </div>

             <div>
                <h3>Preferred Operating System</h3>

                Linux <form:checkbox path="operatingSystem" value="Linux"/>
                Mac OS <form:checkbox path="operatingSystem" value="Mac OS"/>
                C+MS Windows <form:checkbox path="operatingSystem" value="MS Windows"/>
            </div>


            <button type="submit" class="btn btn-danger">Submit</button>

          </form:form>

        </div>

    </body>
</html>

