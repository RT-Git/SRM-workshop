<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
	<style>
.button {
    background-color: #4CAF50;
    border: none;
    color: white;
    padding: 10px 20px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 14px;
    margin: 4px 2px;
    cursor: pointer;
}
</style>

<div>
<h1>Registration</h1>
<form method="get" action="login">
<p><b>Name:<br>
<input type="text" name="name"></p>

<p>Email Id:<br>
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

<input type="submit" class="button" name="register" value="Register">
</form>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
	</tiles:putAttribute>
</tiles:insertDefinition>