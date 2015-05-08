<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BASKET</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<p><a href="/SpringMVC6/SpringMVC_war_exploded/">Homepage</a></p>
<div class="container">
    <h3>Deleted List</h3>
    
    

    <form class="form-inline" role="form" action="/SpringMVC6/SpringMVC_war_exploded/searchDeleted" method="post">
        <input type="text" class="form-control" name="pattern" placeholder="Search">
        <input type="submit" class="btn btn-default" value="Search">
    </form>
    
<form method="post" action="/SpringMVC6/SpringMVC_war_exploded/restore">
    <table class="table table-striped">
        <thead>
        <tr>
            <td><b>Photo</b></td>
            <td><b>Name</b></td>
            <td><b>Short Desc</b></td>
            <td><b>Long Desc</b></td>
            <td><b>Phone</b></td>
            <td><b>Price</b></td>
            <td><b>Action</b></td>
        </tr>
        </thead>
        
        
        
        <c:forEach items="${basket}" var="basket">
            <tr>
                <td><img height="40" width="40" src="/SpringMVC6/SpringMVC_war_exploded/imageDeleted/${basket.id}" /></td>
                <td>${basket.name}</td>
                <td>${basket.shortDesc}</td>
                <td>${basket.longDesc}</td>
                <td>${basket.phone}</td>
                <td>${basket.price}</td>
                <td><input type="checkbox" name="id []" value="${basket.id}"></td>
            </tr>
        </c:forEach>
    </table>
    
    
    
<p><input type="submit" value="Restore"></p>
  </form>
  <p><a href="/SpringMVC6/SpringMVC_war_exploded/deleteFromBasket">DELETE ALL</a></p>
  
</div>
</body>
</html>