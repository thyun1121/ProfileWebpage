<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
    isErrorPage="true"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />

    <title>thyun.Ahn's blog</title>
    <link rel="stylesheet" href="/css/headerFooterStyles.css" />
    <link rel="stylesheet" href="/css/errorStyles.css" />
    <link
      href="https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic"
      rel="stylesheet"
      type="text/css"
    />
    <link
      href="https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800"
      rel="stylesheet"
      type="text/css"
    />
    <link
      href="https://fonts.googleapis.com/css?family=Kaushan+Script"
      rel="stylesheet"
    />
  </head>

  <body>
  	<section class="msg__section">
      <div class="msg__item">
      	<h3> 요청하신 페이지는 존재하지 않아요. </h3>
  		<h4 id="ViewTimer">5초 후에 초기페이지로 이동합니다.</h4>
      </div>
    </section>
  	<script>  		
  		var setTime = 5;		// 최초 설정 시간(기본 : 초)

		function msg_time() {	// 1초씩 카운트
			m = (setTime % 60) + "초";	// 남은 시간 계산
			var msg = m + " 후에 초기페이지로 이동합니다.";
			document.all.ViewTimer.innerHTML = msg;		// div 영역에 보여줌 
			setTime--;					// 1초씩 감소
			if (setTime < 0) {			// 시간이 종료 되었으면..
				clearInterval(this.tid);		// 타이머 해제
				var redirectUrl = location.protocol+"//"+location.host+"/";
				location.replace(redirectUrl);
			}
		}

		window.onload = function TimerStart(){ 
			this.tid = setInterval('msg_time()',1000) 
		};
  	</script>
   
	<jsp:include page="../footer.jsp"></jsp:include>
   <!--  <script src="js/tag.js"></script> -->
  </body>
</html>