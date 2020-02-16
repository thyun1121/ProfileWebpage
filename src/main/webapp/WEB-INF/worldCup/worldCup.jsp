<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script src="js/jquery.min.js"></script>
	<script type="text/javascript">
	function kakaoLogin(apiLink){
		  window.open(apiLink, "kakao", "width=420, height=600");
		}

		function logout(apiLink){
		  alert(apiLink);
		  window.location.replace(apiLink);
		}
	
	</script>
	
	<title>Login Test</title>
	</head>
	
	<body>
	<div>
		<a href="#" 
			onClick="kakaoLogin('https://kauth.kakao.com/oauth/authorize?client_id=dce1607c54618bb797c23e0493014853&redirect_uri=http://localhost:5100/users/oAuth&response_type=code')">
			카카오 로그인
		</a>

		<a href="#" 
			onClick="kakaoLogin('https://kauth.kakao.com/oauth/authorize?client_id=dce1607c54618bb797c23e0493014853&redirect_uri=http://localhost:5100/movies/kauthTest&response_type=code&scope=account_email,gender,age_range')">
			동적동의
		</a>

		<a href="#" onClick="logout('http://localhost:5100/movies/logout')">로그아웃</a>
	</div>
	</body>
</html>