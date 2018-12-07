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
    <header class="header fixed__top">
      <span><a href="/" class="blog__logo">thyun.ahn</a></span>
      <button class="button__toggle" type="button">
        Menu <span class="button__hamburger">|||</span>
      </button>
      <nav class="navigation menu__item__hide">
        <ul class="menu__list">
          <li class="menu__item"><a href="/" class="menu__link">Home</a></li>
          <li class="menu__item"><a href="/about" class="menu__link">About</a></li>
          <li class="menu__item"><a href="#" class="menu__link">Post</a></li>
        </ul>
      </nav>
    </header>
    <script src="/js/index.js"></script>
  </body>
</html>
