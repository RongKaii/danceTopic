<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@2.1.0/build/pure-min.css">
		<meta charset="UTF-8">
		<title>updateUserEmail</title>
	</head>
	<body style="padding: 15px">
		<form class="pure-form" method="post" action="${ pageContext.request.contextPath }/updateemail/">
			<fieldset>
				<legend> UserEmail修改</legend>
				舊電子信箱: <input type="text" value="${ sessionScope.user.useremail }" id="useremail" name="useremail" readonly="readonly" /><p />
				新電子信箱: <input type="email" value="" id="new_useremail" name="new_useremail" required="required" placeholder="請輸入新電子信箱"/><p />
				<button type="submit" class="pure-button pure-button-primary">修改</button>
			</fieldset>
		</form>
	</body>
</html>