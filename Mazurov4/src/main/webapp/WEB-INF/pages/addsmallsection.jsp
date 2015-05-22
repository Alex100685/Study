<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>New</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <form role="form" enctype="multipart/form-data" class="form-horizontal" action="/SpringMVC6/Main/saveSmallSection" method="post">
        <div class="form-group"><h3>New Small Section</h3></div>
        
<div>
<select class="form-group" name="UpperSection" style="width: 304px; height: 35px">
<c:forEach items="${BigSection}" var="BigSection">
<option>${BigSection.name}</option>
</c:forEach>
</select>
</div>

<div class="form-group"><input type="text" class="form-control" name="number" pattern = "[0-9]{1,3}$" title="Must contain only numbers from 1 to 999" placeholder="Number of section" style="width: 304px; "></div>

        <div class="form-group"><input type="text" class="form-control" name="name" placeholder="Name of section" style="width: 304px; "></div>
        <div class="form-group"><input type="submit"  value="Add"></div>
    </form>
</div>
</body>
</html>