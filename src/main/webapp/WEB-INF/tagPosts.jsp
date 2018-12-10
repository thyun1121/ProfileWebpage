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
    <link rel="stylesheet" href="/css/styles.css" />
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

  <body onload="hashtagInformation('${extraData.cnt}', '${extraData.tagName}')">
    <jsp:include page="header.jsp"></jsp:include>

    <main class="main">
      <h1 class="blog__title">thyun.Ahn's blog</h1>
      <h5 class="blog__subtitle"></h5>
    </main>

    <section class="post__section">
      <div class="post__list">
      	<c:set var="postItem" value="${postList}" scope="request" />
      	<c:forEach var="map" items="${postItem}" varStatus="status">
      		<article class="post__item">
	          <a href="/post/${map[4]}" class="post__detail">
	            <h2 class="post__title">${map[1]}</h2>
	            <h3 class="post__subtitle">${map[2]}</h3>
	          </a>
	          <p class="post__info">
	            Posted by <a href="#">thyun.ahn</a> on ${map[3]}
	          </p>
	        </article>
      	</c:forEach>
      </div>
    </section>
	<jsp:include page="footer.jsp"></jsp:include>
    <script src="/js/tagPosts.js"></script>
  </body>
</html>
