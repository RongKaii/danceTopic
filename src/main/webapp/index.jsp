<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="height: 937px;">
<head>
<meta charset="UTF-8">
<title>首頁</title>
<style>
body {
	height: 8.5in
}

#header {
	position: static;
	width: 100%;
	height: 90px;
	top: 0;
	right: 0;
	bottom: 80px;
	left: 0;
}
</style>
</head>
<body style='background-color: #282828';>

	<div id=header>
		<div id="topnav">
			<div class="inner_area">
				<div style="float: left;">
					<a href="http://localhost:8080/danceTopic/"> <img
						src="https://i.imgur.com/uOK7bwO.jpg" width="90px" height="90px">
					</a>
					<h1>首頁</h1>
					<ul>
						<li><a href="http://localhost:8080/danceTopic/login/">登入</a></li>
						<li><a href="http://localhost:8080/danceTopic/adduser/">註冊</a></li>
						<li><a href="http://localhost:8080/danceTopic/upadteuserin/">修改資料</a></li>
						<li><a href="http://localhost:8080/danceTopic/updateemail/">修改電子信箱</a></li>
						<li><a href="http://localhost:8080/danceTopic/updatepassword/">修改密碼</a></li>
						<li><a href="http://localhost:8080/danceTopic/updatedancestyle/">修改舞風</a></li>
						<li><a href="http://localhost:8080/danceTopic/logout/">登出</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</body>
</html>