<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.Date" %>
<%@page import="java.text.SimpleDateFormat, com.myProfile.thyun.model.Member" %>


<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script src="js/jquery.min.js"></script>
	
	
	<title>Session Test</title>
	</head>
	
	<body>
	hello
	<%
	session.invalidate();
	%>
	
	</body>
</html>