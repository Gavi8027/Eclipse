<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>

	<h1>Registeration Details</h1>
	<form action="teach" method="post">
		<pre>
<b>
First Name</b>     <input type="text" name="fname" placeholder="Fname" />
<b>Last Name</b>      <input type="text" name="lname" placeholder="Lname" />
Gender 
<b>Male</b>            <input type="radio" name="gender" id="male" value="male" placeholder="Gender" />  
<b>Female</b>          <input type="radio" name="gender" id="female" value="female" /> 
<b>others</b>		<input type="radio" name="gender" />
       
Address		
<textarea rows="5" cols="20" name="address" placeholder="Adress"></textarea>
Reason		
<textarea rows="5" cols="20" name="reason" placeholder="Reason"></textarea>
   


<input type="submit" value="send" /> 

</pre>

	</form>

</body>
</html>