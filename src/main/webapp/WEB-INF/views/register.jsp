<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">

<div>
<h1>Registration</h1>
<form action="register" method="post">
<p>Name:<br>
<input type="text" name="name"></p>

<p>Email Id:<br>
<input type="text" name="lname" value="email"></p>

<p>Login Password:<br>
<input type="text" name="lpassword"></p>

<p>Secret question:<br>
<input type="text" name="secret_ques"></p>

<p>Secret Answer:<br>
<input type="text" name="answer"></p>

<p>Date of Birth:<br>
<input type="text" name="dob"></p>
<p>Gender:<br>
  <input type="text" name="gender" ></p>
  <p>
  household_id
  <input type="text" name="house_id"></p>
  <p>
  InvestId
  <input type="text" name="invest_id"></p>

 <input type="submit" name="register" value="Register"> 
<!-- <a href="register" class="button">Register</a><br> -->
</form>
</div>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
	</tiles:putAttribute>
</tiles:insertDefinition>