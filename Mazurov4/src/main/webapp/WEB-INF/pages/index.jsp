<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" trimDirectiveWhitespaces="true"%>
<html>
<head>
    <title>mazurov.company</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <h3>Documents List</h3>


    

    <table class="table table-striped">
    
    
    <thead>
        <tr>
        <td><b></b></td>
            <td><b><form class="form-inline" role="form" action="/SpringMVC6/Main/searchByInvNumb" method="post" style="width: 90px; ">
        
        <input type="submit" value="Search"><input type="text" class="form-control" name="pattern" placeholder="by numb" style="width: 76px; ">
    </form></b></td>
            <td><b><form class="form-inline" role="form" action="/SpringMVC6/Main/searchByName" method="post" style="width: 90px; ">
        
        <input type="submit" value="Search"><input type="text" class="form-control" name="pattern" placeholder="by Name" style="width: 110px; ">
    </form></b></td>
            <td><b><form class="form-inline" role="form" action="/SpringMVC6/Main/searchByPublisher" method="post" style="width: 90px; ">
        
        <input type="submit" value="Search"><input type="text" class="form-control" name="pattern" placeholder="by Publisher" style="width: 110px; ">
    </form></b></td>
            <td><b></b></td>
            <td><b></b></td>
            <td><b></b></td>
            <td><b></b></td>
            <td><b></b></td>
            <td><b></b></td>
        </tr>
        </thead>
        
        	
      <thead>
        <tr>
        	<td style="width: 60px; "><b>Select</b></td>
            <td style="width: 70px; "><b>Inv.numb.</b>
            <form action="/SpringMVC6/Main/sortByInvNum" style="width: 53px; ">
    <button type="submit">sort</button>
</form>
            </td>
            <td style="width: 210px; "><b>Name</b>
            <form action="/SpringMVC6/Main/sortByName" style="width: 54px; ">
    <button type="submit">sort</button>
</form>
            </td>
            
            <td style="width: 196px; "><b>Publisher</b>
            <form action="/SpringMVC6/Main/sortByPublisher" style="width: 52px; ">
    <button type="submit">sort</button>
</form>
            </td>
            
            <td style="width: 135px; "><b>Status</b>
            <form action="/SpringMVC6/Main/sortByStatus" style="width: 55px; ">
    <button type="submit">sort</button>
</form>
            </td>
            
            
            <td style="width: 159px; "><b>Note</b>
            <form action="/SpringMVC6/Main/sortByNote" style="width: 54px; ">
    <button type="submit">sort</button>
</form>
            </td>
            
            
            <td style="width: 109px; "><b>Doc.type</b>
            <form action="/SpringMVC6/Main/sortByDocType" style="width: 54px; ">
    <button type="submit">sort</button>
</form>
            </td>
            
            
            <td style="width: 73px; "><b>Quantity</b>
            <form action="/SpringMVC6/Main/sortByQuantity" style="width: 52px; ">
    <button type="submit">sort</button>
</form>
            </td>
            
            <td><b>Edit</b></td>
            <td><b>Action</b></td>
            
            
        </tr>
        </thead>
        
        
        <form method="post" action="/SpringMVC6/Main/deleteDocuments">
            	
            	 <c:forEach items="${document}" var="document">
            <tr>
            <td><input type="checkbox" name="id []" value="${document.inventaryNumber}"></td>
            	<td>${document.inventaryNumber}</td>
            	<td>${document.name}</td>
            	<td>${document.publisher.name}</td>
            	<td>${document.status}</td>
            	<td>${document.note}</td>
            	<td>${document.docType}</td>
            	<td>${document.quantity}</td>
            	<td><a href="/SpringMVC6/Main/edit?in=${document.inventaryNumber}">Edit</a></td>
            	
            	
            	<td>
            	<c:if test="${document.fileName == null}"><a href="/SpringMVC6/Main/uploadFile?in=${document.inventaryNumber}">Upload file</a></c:if>
            	<c:if test="${document.fileName != null}"><a href="/SpringMVC6/Main/downloadFile?in=${document.inventaryNumber}">Download file</a></c:if>
            	
            	</td>
            	
            	
            	
                 </tr>
        </c:forEach>
    </table>
    
<p><input type="submit" value="Delete"></p>
  </form>
  
    <form class="form-inline" role="form" action="/SpringMVC6/Main/addDocument" method="post">
        <input type="submit" value="Add new">
    </form>
</div>
</body>
</html>