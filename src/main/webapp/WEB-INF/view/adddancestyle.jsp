<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/purecss@2.1.0/build/pure-min.css">
	<meta charset="UTF-8">
	<title>DanceStyleAdd</title>
	</head>
	<body style="padding: 15px">
		<form class="pure-form" method="post" action="${ pageContext.request.contextPath }/adddancestyle/">
			<fieldset>
				<legned>舞風選擇</legned><p/>
				確認電子信箱: <input type="email" id="useremail" name="useremail" placeholder="請再次輸入電子信箱" required="true"/><p/>
				舞風:<p/> 
					 <input type="checkbox" name="breaking" value="1" > Breaking
					 <input type="checkbox" name="popping" value="1"> popping
					 <input type="checkbox" name="hiphop" value="1"> hiphop
					 <input type="checkbox" name="locking" value="1"> locking
					 <input type="checkbox" name="jazz" value="1"> jazz 
					 <p/>
					 <input type="checkbox" name="Waacking" value="1"> Waacking
					 <input type="checkbox" name="house" value="1"> house
					 <input type="checkbox" name="dancehall" value="1"> dancehall
					 <input type="checkbox" name="girlstyle" value="1"> girlstyle
					 <input type="checkbox" name="krump" value="1"> krump
					 <p/>
				<button type="submit" class="pure-button pure-button-primary">確認</button>
			</fieldset>
	</body>
</html>