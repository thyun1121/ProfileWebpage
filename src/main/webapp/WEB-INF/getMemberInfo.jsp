<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.Date" %>
<%@page import="java.text.SimpleDateFormat, com.myProfile.thyun.model.Member" %>
<%
  /*  RequestDispatcher rd = request.getRequestDispatcher("/sessionClose");
  rd.forward(request, response);  */
  //response.sendRedirect("/sessionClose");
%>

<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	
	
	<title>Session Test</title>
	</head>
	
	<body>
	
	<%
	Member member = null;
	if(session.getAttribute("isLogin") != null){

		member = (Member) session.getAttribute("member");

		out.println("아이디 : " + member.getId());

		out.println("<br>");

		out.println("이름 : " + member.getName());
		System.out.println("hallo");
		System.out.println(session.getAttribute("member"));

	}else{
		out.println("로그인 되있지 않습니다.");
		//member = (Member) session.getAttribute("member");
		out.println("아이디 : " + session.getAttribute("member"));
	}
	%>
	
	<script>
		alert("hello");
	</script>
	</body>
</html>