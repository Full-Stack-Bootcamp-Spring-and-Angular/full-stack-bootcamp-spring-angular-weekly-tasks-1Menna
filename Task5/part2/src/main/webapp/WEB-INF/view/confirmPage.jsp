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
            <th>Firstname</th>
            <th>Lastname</th>
            <th>Email</th>
            <th>City</th>
            <th>Date</th>
          </tr>
          <tr>
            <td>${firstName}</td>
            <td>${lastName}</td>
            <td>${email}</td>
            <td>${city}</td>
            <td>${date}</td>
          </tr>
        </table>
    </div>
</body>
</html>


