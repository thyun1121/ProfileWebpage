<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.Date" %>
<%@page import="java.text.SimpleDateFormat" %>


<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script src="js/jquery.min.js"></script>
	
	
	<title>Session Test</title>
	</head>
	
	<body>
	<% SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");%>
	세션 ID : <%= session.getId() %> <br>
	세션 생성 시간 : <%= sdf.format(new Date(session.getCreationTime())) %><br>
	세션 최종 시간 : <%= sdf.format(new Date(session.getLastAccessedTime())) %>
	</body>
</html>