<html>
<head>
    <%--import Bootstrap--%>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
    <%--import css file--%>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body >
    <div class="text-center">
        <h2 class="text-success">Data submitted successfully</h2>
        <h3> Your Data <h3>
        <table class="table">
          <tr>
            <th>userName</th>
            <th>password</th>
            <th>country</th>
            <th>programmingLanguage</th>
            <th>operatingSystem</th>
          </tr>
          <tr>
            <td>${userModelResult.userName}</td>
            <td>${userModelResult.password}</td>
            <td>${userModelResult.country}</td>
            <td>${userModelResult.programmingLanguage}</td>
            <td>${userModelResult.operatingSystem}</td>
          </tr>
        </table>
    </div>
</body>
</html>


