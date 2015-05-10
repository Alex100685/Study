<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Prog.kiev.ua</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <h3>Advertisements List</h3>

    <form class="form-inline" role="form" action="/SpringMVC6/SpringMVC_war_exploded/search" method="post">
        <input type="text" class="form-control" name="pattern" placeholder="Search">
        <input type="submit" class="btn btn-default" value="Search">
    </form>
    
<form method="post" action="/SpringMVC6/SpringMVC_war_exploded/toBasket">
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
        
        
        
        <c:forEach items="${advs}" var="adv">
            <tr>
                <td><img height="40" width="40" src="/SpringMVC6/SpringMVC_war_exploded/image/${adv.photo.id}" /></td>
                <td>${adv.name}</td>
                <td>${adv.shortDesc}</td>
                <td>${adv.longDesc}</td>
                <td>${adv.phone}</td>
                <td>${adv.price}</td>
                <td><input type="checkbox" name="id []" value="${adv.id}"></td>
            </tr>
        </c:forEach>
    </table>
    
<p><input type="submit" value="Delete to basket"></p>
  </form>
  
<a href="/SpringMVC6/SpringMVC_war_exploded/advsDownload">Download xml-file with advs</a>
  
  <p><a href="/SpringMVC6/SpringMVC_war_exploded/basket">To Basket</a></p>
  
    <form class="form-inline" role="form" action="/SpringMVC6/SpringMVC_war_exploded/add_page" method="post">
        <input type="submit" class="btn btn-default" value="Add new">
    </form>
</div>
</body>
</html>