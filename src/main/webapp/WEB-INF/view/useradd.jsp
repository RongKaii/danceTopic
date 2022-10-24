<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@2.1.0/build/pure-min.css">
		<meta charset="UTF-8">
		<title>UserAdd</title>
	</head>
	<body style="padding: 15px">
		<form class="pure-form" method="post" action="${ pageContext.request.contextPath }/adduser/">
			<fieldset>
				<legned>註冊</legned><p/>
				姓名: <input style="width:225px;" type="text" value="${ requestScope.user.username }" id="username" name="username" placeholder="請輸入姓名"/><p/> 
				舞者名: <input style="width:210px;" type="text" value="${ requestScope.user.dancername }" id="dancername" name="dancername" placeholder="請輸入舞者名"/><p/>
				電子信箱: <input type="email" value="${ requestScope.user.useremail }" id="useremail" name="useremail" placeholder="請輸入電子信箱" requied="required" /><p/>
				密碼: <input style="width:225px;" type="password" value="${ requestScope.user.password }" id="password" name="password" placeholder="請輸入密碼" requied="required" /><p/>
				生日: <input style="width:225px;" type="date" name="birth" value="birth" required><p/>
				性別: <input type="radio" name="sex" value="man">男&nbsp;&nbsp;<input type="radio" name="sex" value="woman">女<br>
				<p/>
				居住縣/市: <select name="area" style="width:185px;">				
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
					 </select>
					 <p/>
				<button type="submit" class="pure-button pure-button-primary">下一步</button>
			</fieldset>
		</form>
	</body>
</html>