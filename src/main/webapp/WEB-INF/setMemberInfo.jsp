<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.Date" %>
<%@page import="java.text.SimpleDateFormat, com.myProfile.thyun.model.Member" %>

<%
  /* RequestDispatcher rd = request.getRequestDispatcher("/getMemberInfo");
  rd.forward(request, response); */
  //response.sendRedirect("/getMemberInfo");
%>
<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script src="js/jquery.min.js"></script>
	
	
	<title>Session Test</title>
	</head>
	
	<body>
	<%
	session.setAttribute("isLogin", true);
	Member member = new Member();
	member.setName("홍길동");
	member.setId("gil");
	session.setAttribute("member", member);

	
	%>
	</body>
</html>