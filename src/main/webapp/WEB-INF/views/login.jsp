<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">

<div>
<h3>Login Page</h3>
		<p>This is for Login/ Register page</p>
		<body>
        <form align="center" action="login.jsp">
            <name="login" value="LOGIN ID"><b>
                User Name: </b><input type="text" name="id" size="20"><br><br>
            <name="login" value="LOGIN"><b>
                Password: </b><input type="password" name="pwd" size="20"><br><br>
                <head>
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
</head>
<body>

</body>
                <input type="submit" class="button" name="submit" value="Login" >
                
                <a href=register class="button">Register</a><br>
                <a href="forgetpwd.jsp" class="button">Forgot Password</a>                
        </form>
    </body> 

</div>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
	</tiles:putAttribute>
</tiles:insertDefinition>