<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/purecss@2.1.0/build/pure-min.css">
<meta charset="UTF-8">
<title>UserAdd</title>
<style>
body {
	height: 8.5in
}
#top {
  	position:static;
	width:auto; height:100px;
	
 }
#main {
	text-align: center;
	position: static;
	width: auto;
	height: auto;
	
}
</style>
</head>
<body style="background-color: #282828; padding: 15px">
	<div id="top">
				<div style="float: left;">
					<a href="http://localhost:8080/danceTopic/"> <img
						src="https://i.imgur.com/uOK7bwO.jpg" width="90px" height="90px">
					</a>
				</div>
	</div>
	<div id=main>

			<form class="pure-form" method="post"
				action="${ pageContext.request.contextPath }/adduser/">

				<fieldset>
					<font color="white">
						<h1>註冊</h1><p />

						<p>姓名:</p> 
						<input style="width: 225px;" type="text"
						value="${ requestScope.user.username }" id="username"
						name="username" placeholder="請輸入姓名" required="required"/><p />
						 舞者名:<p />
						<input style="width: 225px;" type="text"
						value="${ requestScope.user.dancername }" id="dancername"
						name="dancername" placeholder="請輸入舞者名" required="required"/><p />
						 電子信箱:<p /> 
						<input style="width: 225px;" type="email" value="${ requestScope.user.useremail }"
						id="useremail" name="useremail" placeholder="請輸入電子信箱" required="required" /><p /> 
						密碼:<p /> 
						<input style="width: 225px;" type="password"
						value="${ requestScope.user.password }" id="password"
						name="password" placeholder="請輸入密碼" required="required" /><p /> 
						生日:<p /> 
						<input style="width: 225px;" type="date" name="birth"
						value="birth" required="required"><p /> 
					    居住縣/市:<p/>  
					    <select name="area" required="required" style="width: 225px; height: auto;">
							<option value="">請選擇居住縣/市</option>
							<option value="keelung">基隆</option>
							<option value="newtaipei">新北</option>
							<option value="taipei">臺北</option>
							<option value="taoyuan">桃園</option>
							<option value="Xinzhu">新竹</option>
							<option value="miaoli">苗栗</option>
							<option value="taichung">臺中</option>
							<option value="changhua">彰化</option>
							<option value="nantou">南投</option>
							<option value="yunlin">雲林</option>
							<option value="chiayi">嘉義</option>
							<option value="tainan">臺南</option>
							<option value="kaohsiung">高雄</option>
							<option value="pingtung">屏東</option>
							<option value="yilan">宜蘭</option>
							<option value="hualien">花蓮</option>
							<option value="taitung">臺東</option>
							<option value="penghu">澎湖</option>
							<option value="kinmen">金門</option>
							<option value="matsu">馬祖</option>
							<option value="greenisland">綠島</option>
							<option value="orchidisland">蘭嶼</option>
						</select><p />
						性別:<p />
						<input type="radio" name="sex" value="man" required="required">男&nbsp;&nbsp;
						<input type="radio" name="sex" value="woman" required="required">女<br><p />
						
						<button type="submit" class="pure-button pure-button-primary">下一步</button>
					</font>
				</fieldset>
			</form>
		</body>

	</div>
</body>
</html>