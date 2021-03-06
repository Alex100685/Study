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
<c:if test="${all[1].fileName != null}">
    
    <form role="form" enctype="multipart/form-data" class="form-horizontal" action="/SpringMVC6/Main/saveEditedDoc" method="post">
    
    
        <div class="form-group"><h3>Edit Document</h3></div>
        
        Publisher :
        <div> 
        <select class="form-group" name="publisher" style="width: 429px; height: 34px">
<c:forEach items="${all[0]}" var="Publisher">
<option>${Publisher.name}</option>
</c:forEach>
</select> 
		</div>
		
		<a href="/SpringMVC6/Main/createNewPublisher">Create new Publisher</a>
		<div class="form-group"><input type="text" class="form-control" value="${all[1].inventaryNumber}" name="inventaryNumber" placeholder="Name" style="width: 429px; " readonly></div>
        <div class="form-group"><input type="text" class="form-control" value="${all[1].name}" name="name" placeholder="Name" style="width: 429px; "></div>
        <div class="form-group"><input type="text" class="form-control" value="${all[1].status}" name="status" placeholder="Status" style="width: 429px; "></div>
        <div class="form-group"><input type="text" class="form-control" value="${all[1].note}" name="note" placeholder="Note" style="width: 429px; "></div>
        <div class="form-group"><input type="text" class="form-control" value="${all[1].docType}" name="doctype" placeholder="Doc. type" style="width: 429px; "></div>
        <div class="form-group"><input type="text" class="form-control" value="${all[1].quantity}" name="quantity" placeholder="Quantity" style="width: 429px; "></div>
            	<a href="/SpringMVC6/Main/deleteFile?in=${all[1].inventaryNumber}">Delete file</a>   	
        
        <div class="form-group"><input type="submit" value="Edit"></div>
        
        
        
    </form>
    </c:if>
    
    
    <c:if test="${all[1].fileName == null}">
    
    <form role="form" enctype="multipart/form-data" class="form-horizontal" action="/SpringMVC6/Main/saveEditedDoc2" method="post">
    
    
        <div class="form-group"><h3>Edit Document</h3></div>
        
        Publisher :
        <div> 
        <select class="form-group" name="publisher" style="width: 429px; height: 34px">
<c:forEach items="${all[0]}" var="Publisher">
<option>${Publisher.name}</option>
</c:forEach>
</select> 
		</div>
		
		<a href="/SpringMVC6/Main/createNewPublisher">Create new Publisher</a>
		<div class="form-group"><input type="text" class="form-control" value="${all[1].inventaryNumber}" name="inventaryNumber" placeholder="Name" style="width: 429px; " readonly></div>
        <div class="form-group"><input type="text" class="form-control" value="${all[1].name}" name="name" placeholder="Name" style="width: 429px; "></div>
        <div class="form-group"><input type="text" class="form-control" value="${all[1].status}" name="status" placeholder="Status" style="width: 429px; "></div>
        <div class="form-group"><input type="text" class="form-control" value="${all[1].note}" name="note" placeholder="Note" style="width: 429px; "></div>
        <div class="form-group"><input type="text" class="form-control" value="${all[1].docType}" name="doctype" placeholder="Doc. type" style="width: 429px; "></div>
        <div class="form-group"><input type="text" class="form-control" pattern = "[0-9]{1,3}$" title="Must contain only numbers from 1 to 999" value="${all[1].quantity}" name="quantity" placeholder="Quantity" style="width: 429px; "></div>
        
            	<div class="form-group">File: <input type="file" name="file"></div> 	
        
        <div class="form-group"><input type="submit" value="Edit"></div>
        
        
        
    </form>
    </c:if>
    
    
</div>
</body>
</html>