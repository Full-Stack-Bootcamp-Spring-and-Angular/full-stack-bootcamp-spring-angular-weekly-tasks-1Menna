<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <%--        import Bootstrap--%>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.min.css" />">

    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css" />">

</head>
<body>
        <form:form action="processUpdateProductForm" modelAttribute="productModel" method="post">
            <div class="container mt-5">
                <div class="row justify-content-center">
                    <div class="col-md-6">
                        <div class="form-group">
                            <h3>Update Product</h3>
                        </div>
                        <div class="form-group">
                            <label for="id">Id</label>
                            <form:input type="text" cssClass="form-control" path="id" readonly="true" style="pointer-events: none;"/>
                        </div>
                        <div class="form-group">
                            <label for="name">product name</label>
                            <form:input type="text" cssClass="form-control" path="name" />
                            <form:errors path="name" cssClass="error"/>
                        </div>
                        <div class="form-group">
                            <label for="expirationDate">Expiration Date</label>
                            <form:input type="text" cssClass="form-control" path="expirationDate" />
                            <form:errors path="expirationDate" cssClass="error"/>
                        </div>
                        <div class="form-group">
                            <label for="manufacturer">Manufacturer</label>
                            <form:input type="text" cssClass="form-control" path="manufacturer" />
                            <form:errors path="manufacturer" cssClass="error"/>
                        </div>
                        <div class="form-group">
                            <label for="price">Price</label>
                            <form:input type="text" cssClass="form-control" path="price"/>
                            <form:errors path="price" cssClass="error"/>
                        </div>
                        <div class="form-group">
                            <label for="available">Availability</label>
                            <form:input type="text" cssClass="form-control" path="available" placeholder="dd/mm/yyyy"/>
                            <form:errors path="available" cssClass="error"/>
                        </div>
                        <input type="submit" class="btn btn-primary"/>
                    </div>
                </div>
            </div>
        </form:form>
</body>

</html>