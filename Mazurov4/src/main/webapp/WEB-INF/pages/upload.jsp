<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">

    <form role="form" enctype="multipart/form-data" class="form-horizontal" action="/SpringMVC6/Main/upload" method="post">
        <div class="form-group"><h3>Upload file</h3></div>
        <div class="form-group"><input type="text" class="form-control" name="inventaryNumber" value="${document.inventaryNumber}" placeholder="Number in section" style="width: 429px; " readonly></div>
        <div class="form-group">File: <input type="file" name="file"></div>
        <div class="form-group"><input type="submit" value="Add"></div>
    </form>
</div>
</body>
</html>