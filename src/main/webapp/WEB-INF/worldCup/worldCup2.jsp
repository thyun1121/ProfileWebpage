<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
	<div>
		<a href="#" 
			onClick="kakaoLogin('https://kauth.kakao.com/oauth/authorize?client_id=dce1607c54618bb797c23e0493014853&redirect_uri=http://localhost:5100/movies/kauthTest&response_type=code')">
			카카오 로그인
		</a>

		<a href="#" 
			onClick="kakaoLogin('https://kauth.kakao.com/oauth/authorize?client_id=dce1607c54618bb797c23e0493014853&redirect_uri=http://localhost:5100/movies/kauthTest&response_type=code&scope=account_email')">
			동적동의
		</a>

		<a href="#" onClick="logout('http://localhost:5100/movies/logout')">로그아웃</a>
	</div>

	<style>
		.contents{
			width:1000px;
			margin:0 auto;
		}
		.tournamentWrap{
			width:1000px;
			height: 800px;
		    position: absolute;
		    top:50%;
		    margin-top: -200px;
		}
		.tournament8, .tournament4, .tournamentFinal{
			display: inline-block;
			position: relative;
		    margin: auto;
		    background-color: #eee;
		    width: 180px;
		    height: 400px;
		    text-align: center;
		}
		
		
		.firstGame{
			position: relative;
			height: 66px;
			border: 1px solid #FF0000;		/* 경기 사각형 보더 색깔 */
		}
		
		
		.secondGame{
			position: relative;
			height: 66px;
			border: 1px solid #FF0000;		/* 경기 사각형 보더 색깔 */
			margin-top : 170px;
		}
		
		.tournament4 .firstGame{
			margin-top : 135px;
		}
		
		
		.tournament8 .firstGame::before {
			content: '';
		    display: inline-block;
		    height: 2px;
		    background-color: #dedede;
		    width : 50%;
		    right : -20px;
		}
		
		.upInfo{
			margin-top : 10px;
			display: flow-root;
		}
		
		.downInfo{
			margin-top : 10px;
		}
		
		
		strong{
			float : left;
			padding-left:10px;
		}
		
		em{
			float : right;
			padding-right: 10px;
		}
		
	</style>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script src="js/jquery.min.js"></script>
	<script type="text/javascript">
		function nationSetting(){
			var objNation = {};
			
			<c:forEach var = "item" items = "${nationalList}" varStatus="status" >
				var key = "W"+"${status.count}";
				objNation[key] = "${item.nation}";
			</c:forEach>
			
			$.each(objNation, function(index,value){
				$('#'+index).text(value);
			});			
		}
	
		$(document).ready(function(){
			nationSetting();
			window._hello = "hello";
		});
	
	</script>
	
	<title>2018 Russia WorldCup Tournament</title>
	</head>
	
	<body>
		<h1>WorldCup tournament</h1> <br/> 
		
		
		<div class="contents">
			<h2>Tournament</h2>
			<div class="tournamentWrap">
				<div class="tournament8">
					<p>8강</p>
					<div class="firstGame">
						<div class="upInfo">
							<strong id="W1"></strong> 
							<em id="W1Score">0</em>
						</div>
						<div class="downInfo">
							<strong id="W2"></strong> 
							<em id="W2Score">2</em>
						</div>			
					</div>
					<div class="secondGame">
						<div class="upInfo">
							<strong id="W3"></strong> 
							<em id="W1Score">1</em>
						</div>
						<div class="downInfo">
							<strong id="W4"></strong> 
							<em id="W2Score">2</em>
						</div>		
					</div>
				</div>
				<div class="tournament4">
					<p>4강</p>
					<div class="firstGame">
						<div class="upInfo">
							<strong id="W9"></strong> 
							<em id="W1Score">2</em>
						</div>
						<div class="downInfo">
							<strong id="W10"></strong> 
							<em id="W2Score">2</em>
						</div>			
					</div>
				</div>
				<div class="tournamentFinal">
					<p>결승</p>
				</div>
				<div class="tournament4">
					<p>4강</p>
				</div>
				<div class="tournament8">
					<p>8강</p>
					<div class="firstGame">
						<div class="upInfo">
							<strong id="W5"></strong> 
							<em id="W1Score">2</em>
						</div>
						<div class="downInfo">
							<strong id="W6"></strong> 
							<em id="W2Score">2</em>
						</div>			
					</div>
					<div class="secondGame">
						<div class="upInfo">
							<strong id="W7"></strong> 
							<em id="W1Score">0</em>
						</div>
						<div class="downInfo">
							<strong id="W8"></strong> 
							<em id="W2Score">2</em>
						</div>		
					</div>
				</div>
				
			</div>		
		</div>
	
	
	
	</body>
</html>