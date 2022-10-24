<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
				舞風:<p/> 
					
					<input type="checkbox" name="breaking" value="breaking"> Breaking
					 <input type="checkbox" name="popping" value="popping"> popping
					 <input type="checkbox" name="hiphop" value="hiphop"> hiphop
					 <input type="checkbox" name="locking" value="locking"> locking
					 <input type="checkbox" name="jazz" value="jazz"> jazz 
					 <p/>
					 <input type="checkbox" name="Waacking" value="Waacking"> Waacking
					 <input type="checkbox" name="house" value="house"> house
					 <input type="checkbox" name="dancehall" value="dancehall"> dancehall
					 <input type="checkbox" name="girlstyle" value="girlstyle"> girlstyle
					 <input type="checkbox" name="krump" value="girlstyle"> krump
					 <p/>
			</fieldset>
	</body>
</html>