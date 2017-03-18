<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">

<div>
<h1>Registration</h1>
<form>
<p><b>Name:<br>
<input type="text" name="name"></p>

<p>Login Name:<br>
<input type="text" name="lname"></p>

<p>Login Password:<br>
<input type="password" name="lpassword"></p>

<p>Secret question:<br>
<input type="text" name="secret_ques"></p>

<p>Secret Answer:<br>
<input type="password" name="answer"></p>

<p>Date of Birth:<br>
<input type="date" name="dob"></p>
<p>Gender:<br>
  <input type="radio" name="gender" value="m" checked> Male
  <input type="radio" name="gender" value="f"> Female<br>

<input type="submit" name="register" value="Register">
</form>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
	</tiles:putAttribute>
</tiles:insertDefinition>