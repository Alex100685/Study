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
    <form role="form" enctype="multipart/form-data" class="form-horizontal" action="/SpringMVC6/Main/createDocument" method="post">
        <div class="form-group"><h3>New Document</h3></div>
        
        <div class="form-group"><input type="text" value="${all[1].name}"  class="form-control" name="sectionName" placeholder="Section Name" style="width: 429px; " readonly></div>
        
        Publisher :
        <div> 
        <select class="form-group" name="publisher" style="width: 429px; height: 34px">
<c:forEach items="${all[0]}" var="Publisher">
<option>${Publisher.name}</option>
</c:forEach>
</select> 
		</div>
		
		<a href="/SpringMVC6/Main/createNewPublisher">Create new Publisher</a>
        
<div class="form-group"><input type="text" class="form-control" pattern = "[0-9]{1,3}$" title="Must contain only numbers from 1 to 999" name="numberInSection" required = "required" placeholder="Number in section" style="width: 429px; "></div>
        <div class="form-group"><input type="text" class="form-control" pattern = "(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{1,1000}" title="Must contain at least one uppercase and lowercase letter, and at least 1 or more characters" name="name" placeholder="Name" style="width: 429px; "></div>
        

        <div class="form-group"><input type="text" class="form-control" name="status" placeholder="Status" style="width: 429px; "></div>
        <div class="form-group"><input type="text" class="form-control" name="note" placeholder="Note" style="width: 429px; "></div>
        <div class="form-group"><input type="text" class="form-control" name="doctype" placeholder="Doc. type" style="width: 429px; "></div>
        <div class="form-group"><input type="text" pattern = "[0-9]{1,3}$" title="Must contain only numbers from 1 to 999" required = "required" class="form-control" name="quantity" placeholder="Quantity" style="width: 429px; "></div>
        
        
        <div class="form-group">File: <input type="file" name="file"></div>

        <div class="form-group"><input type="submit" value="Add"></div>
    </form>
</div>
</body>
</html>