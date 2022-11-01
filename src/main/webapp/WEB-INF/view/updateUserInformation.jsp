<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@2.1.0/build/pure-min.css">
		<meta charset="UTF-8">
		<title>updateUserInformation</title>
	</head>
	<body style="padding: 15px">
		<form class="pure-form" method="post" action="${ pageContext.request.contextPath }/upadteuserin/">
			<fieldset>
				<legend> User 資料修改</legend>
				電子信箱: <input type="text" value="${ sessionScope.user.useremail }" id="useremail" name="useremail" readonly="readonly" /><p />
				姓名: <input type="text" value="${ sessionScope.user.username }" id="username" name="username" required="required"/><p/>
				舞者名: <input type="text" value="${ sessionScope.user.dancername }" id="dancername" name="dancername" required="required"/><p/>
				生日: <input style="width: 225px;" type="date" name="birth" value=${ sessionScope.user.birth } required="required"><p />
				居住縣/市: <select name="area" value="${ sessionScope.user.area }" required="required" style="width: 225px; height: auto;">
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
						<input type="radio" name="sex" value="max" required="required">男&nbsp;&nbsp;
						<input type="radio" name="sex" value="woman" required="required">女<br><p />
						
						<button type="submit" class="pure-button pure-button-primary">修改</button>
			</fieldset>
		</form>
	</body>
</html>