<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>thyun.Ahn's blog</title>
    <link rel="stylesheet" href="/css/headerFooterStyles.css" />
    <link rel="stylesheet" href="css/tagStyles.css" />
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
    <jsp:include page="header.jsp"></jsp:include>

    <main class="main">
      <h1 class="blog__title">thyun.Ahn's blog</h1>
      <h5 class="blog__subtitle">tag repository</h5>
    </main>

    <section class="hashtag__section">
      <div class="hashtag__list">
      	<c:set var="tagItem" value="${tagList}" scope="request" />
      	<c:forEach var="map" items="${tagItem}" varStatus="status">
      		<article class="hashtag__item">
      			<a href="/tag/${map[1]}" class="hashtag__detail">
      				<h2 class="hashtag__title">#${map[1]}</h2>
	            	<h3 class="hashtag__subtitle">${map[2]} 게시물</h3>
      			</a>
	        </article>
      	</c:forEach>
      </div>
    </section>
	<jsp:include page="footer.jsp"></jsp:include>
    <script src="js/index.js"></script>
  </body>
</html>
