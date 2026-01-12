<html>
    <head>

        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">

        <%--import Bootstrap--%>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">

    </head>
    <body background="${pageContext.request.contextPath}/resources/images/background.jpg">
        <div class="container mt-3">

          <h2>User Registration</h2>

          <form action="processForm">

            <div class="mb-3 mt-3">
              <label for="firstName">First Name</label>
              <input type="text" class="form-control" id="firstName" placeholder="Enter first name" name="firstName">

              <label for="lastName">last Name</label>
              <input type="text" class="form-control" id="lastName" placeholder="Enter last name" name="lastName">

              <label for="email">Email</label>
              <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">

              <label for="date">Date</label>
              <input type="date" class="form-control" id="date" placeholder="DD-MM-YYYY" name="date">

              <label for="city">City</label>
              <input type="text" class="form-control" id="city" placeholder="Enter city" name="city">
            </div>

            <button type="submit" class="btn btn-primary">Submit</button>

          </form>

        </div>

    </body>
</html>

