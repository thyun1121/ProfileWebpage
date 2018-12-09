<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>blogDesign</title>
    
    <link rel="stylesheet" href="/css/postStyles.css" />
    <link rel="stylesheet" href="https://stackedit.io/style.css" />
    

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

  <body  onload="rewriteHashtags('${postData.hashtag.hashtagName}');">
      <jsp:include page="header.jsp"></jsp:include>    
      <main class="main" style="background-image: url('${postData.post.subject.subjectImgUrl}')">
        <div class="container">
          <div class="row">
            <div class="container__inside">
              <div class="post__title">
                <h1 class="post__heading">${postData.post.subject.subjectName}</h1>
                <h2 class="post__subheading">
                  Javascript 기초부터 심화까지 공부해보자.
                </h2>
                <p class="post__info"></p>
                <!-- <p class="post__info">Posted by thyun.ahn on November 13, 2018</p> -->
              </div>
            </div>
          </div>
        </div>
      </main>

    <article class="stackedit">
      <div class="container">
        <div class="row">
          <div class="container__inside">
              ${postData.post.postConts}
          </div>
        </div>
      </div>
    </article>

    <jsp:include page="footer.jsp"></jsp:include>
    <script src="/js/index.js"></script>
    <script src="/js/post.js"></script>
  </body>
</html>

