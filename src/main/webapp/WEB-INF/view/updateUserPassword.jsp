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
		<form class="pure-form" method="post" action="${ pageContext.request.contextPath }/updatepassword/">
			<fieldset>
				<legend> UserEmail修改</legend>
				電子信箱: <input type="text" value="${ sessionScope.user.useremail }" id="useremail" name="useremail" readonly="readonly" /><p />
				原密碼: <input type="password" value="" id="password" name="password" required="required" placeholder="請輸入原密碼"/><p />
				新密碼: <input type="password" value="" id="new_password" name="new_password" required="required" placeholder="請輸入新密碼"/><p />
				<button type="submit" class="pure-button pure-button-primary">修改</button>
			</fieldset>
		</form>
	</body>
</html>