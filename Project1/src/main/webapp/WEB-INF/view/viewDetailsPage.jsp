<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <!-- Bootstrap -->
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/bootstrap.min.css' />">
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/style.css' />">
</head>

<body>

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">

            <h3>Product Details</h3>

            <div class="form-group">
                <label>Product Name:</label>
                <p class="form-control">${productModel.name}</p>
            </div>

            <div class="form-group">
                <label>Product Name:</label>
                <p class="form-control">${productModel.price}</p>
            </div>
            <div class="form-group">
                <label>Expiration Date:</label>
                <p class="form-control">${productModel.expirationDate}</p>
            </div>
            <form:form action="/">
                <input type="submit" class="btn btn-primary" value="Return"/>
            </form:form>
        </div>
    </div>
</div>

</body>
</html>