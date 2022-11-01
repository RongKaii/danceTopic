<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/purecss@2.1.0/build/pure-min.css">
<meta charset="UTF-8">
<title>DanceStyleAdd</title>
<style>
body {
	height: 8.5in
}

#sidebar1 {
	position: fixed;
	width: 10em;
	height: auto;
	top: 15%;
	right: auto;
	bottom: 100px;
	left: 0;
}

#sidebar2 {
	position: fixed;
	width: 10em;
	height: auto;
	top: 15%;
	right: 0;
	bottom: 100px;
	left: auto;
}

#main {
	text-align: center;
	position: fixed;
	width: auto;
	height: auto;
	top: 15%;
	right: 20em;
	bottom: 100px;
	left: 20em;
}
</style>
</head>
<body style="background-color: #282828">
	<font color="white">
		<div id=sidebar1></div>
		<div id="main">
			<body style="padding: 15px">
				<form class="pure-form" method="post"
					action="${ pageContext.request.contextPath }/updatedancestyle/">
					<fieldset>

						<h1>舞風選擇</h1>
						<p />
						電子信箱: <input type="text" value="${ sessionScope.user.useremail }" id="useremail" name="useremail" readonly="readonly" /><p />
						<p />
						舞風:
						<p />
						<input type="checkbox" name="breaking" value="1">
						Breaking <input type="checkbox" name="popping" value="1">
						popping <input type="checkbox" name="hiphop" value="1">
						hiphop <input type="checkbox" name="locking" value="1">
						locking <input type="checkbox" name="jazz" value="1"> jazz
						<p />
						<input type="checkbox" name="Waacking" value="1"> Waacking
						<input type="checkbox" name="house" value="1"> house <input
							type="checkbox" name="dancehall" value="1"> dancehall <input
							type="checkbox" name="girlstyle" value="1"> girlstyle <input
							type="checkbox" name="krump" value="1"> krump
						<p />
						<button type="submit" class="pure-button pure-button-primary">確認</button>

					</fieldset>
			</body>
		</div>
		<div id=sidebar2></div>
	</font>
</body>
</html>