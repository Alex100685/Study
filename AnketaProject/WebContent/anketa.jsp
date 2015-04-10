<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Data</title>
</head>
<body>
<form method="POST" action="/AnketaProject/statistics">
<p>
	<h4>First name:</h4> <input type="text" name="firstname"><br>
	<h4>Last Name:</h4><input type="text" name="lastname"><br>
	</p>
	<p>
	<h4>Your age:</h4> <input type="text" name="age"><br>
	</p>
	<p>
	<h4>Your sex:</h4><br>
	Male<br>
	 <input type="radio" name="sexType" id="sex" value="man"><br>
	Female<br>
	 <input type="radio" name="sexType" id="sex" value="woman"><br>
	</p>
	<p>
	<h4>Your education:</h4><br>
	No educated<br>
	 <input type="radio" name="educationLevel" id="education" value="noEducated"><br>
	School<br>
	 <input type="radio" name="educationLevel" id="education" value="school"><br>
	Technical school<br>
	 <input type="radio" name="educationLevel" id="education" value="technicalSchool"><br>
	Higher<br>
	 <input type="radio" name="educationLevel" id="education" value="higher"><br>
	Scientist<br>
	 <input type="radio" name="educationLevel" id="education" value="scientist"><br>
	</p>
	<p>
	<h4>Which music do you prefer?</h4><br>
	Pop<br> 
	<input type="radio" name="musicPrefer" id="music" value="pop"> <br>
	Rock<br>
	 <input type="radio" name="musicPrefer" id="music" value="rock"><br>
	Dance<br>
	 <input type="radio" name="musicPrefer" id="music" value="dance"><br>
	Country<br>
	 <input type="radio" name="musicPrefer" id="music" value="country"><br>
	Rap<br>
	 <input type="radio" name="musicPrefer" id="music" value="rap"><br>
	Classic<br>
	 <input type="radio" name="musicPrefer" id="music" value="classic"><br>
	</p>
	<button>Done & Go to statistics</button>
</form>

</body>
</html>