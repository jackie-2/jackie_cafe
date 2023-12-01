<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	* {
		margin: 0;
		padding: 0;
	}
	
.login {
		font:bold 16px "malgun gothic";
		width:700px;
		height:50px;
		background: #ccc;
		color:black;
		line-height: 50px; 
		margin:0 auto;
		text-align: center;
	}	
</style> 
</head>
<body>
<div class = "login">
	<form class="loginForm" action="/loginProcess" method="post">
	<input type = "text" name = "loginId"/>
	<input type = "password" name = "loginPwd"/>
	<input type = "submit" value = "로그인"/>
	</form>
</div>	
</body>
</html>