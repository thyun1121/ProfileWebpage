<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>thyun.Ahn's blog - about</title>
	<link rel="stylesheet" href="/css/headerFooterStyles.css" />
    <link rel="stylesheet" href="css/aboutStyles.css" />

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

    <main class="main js__fullHeight">
      <div class="container">
        <div class="row">
          <div class="container__inside text__center">
            <div class="my__info">
              <div class="thyun__pic"></div>
              <h1 class="thyun__name"><span>thyun.ahn</span></h1>
              <h3 class="thyun__job"><span>Programmer</span></h3>
              <ul class="sns__list">
                <li class="sns__item">
                  <a href="https://github.com/thyun1121">
                    <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24">
                      <path
                        d="M12 0c-6.626 0-12 5.373-12 12 0 5.302 3.438 9.8 8.207 11.387.599.111.793-.261.793-.577v-2.234c-3.338.726-4.033-1.416-4.033-1.416-.546-1.387-1.333-1.756-1.333-1.756-1.089-.745.083-.729.083-.729 1.205.084 1.839 1.237 1.839 1.237 1.07 1.834 2.807 1.304 3.492.997.107-.775.418-1.305.762-1.604-2.665-.305-5.467-1.334-5.467-5.931 0-1.311.469-2.381 1.236-3.221-.124-.303-.535-1.524.117-3.176 0 0 1.008-.322 3.301 1.23.957-.266 1.983-.399 3.003-.404 1.02.005 2.047.138 3.006.404 2.291-1.552 3.297-1.23 3.297-1.23.653 1.653.242 2.874.118 3.176.77.84 1.235 1.911 1.235 3.221 0 4.609-2.807 5.624-5.479 5.921.43.372.823 1.102.823 2.222v3.293c0 .319.192.694.801.576 4.765-1.589 8.199-6.086 8.199-11.386 0-6.627-5.373-12-12-12z"
                      />
                    </svg>
                  </a>
                </li>
                <li class="sns__item">
                  <a href="https://www.linkedin.com/in/thyun1121/">
                    <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24">
                      <path
                        d="M4.98 3.5c0 1.381-1.11 2.5-2.48 2.5s-2.48-1.119-2.48-2.5c0-1.38 1.11-2.5 2.48-2.5s2.48 1.12 2.48 2.5zm.02 4.5h-5v16h5v-16zm7.982 0h-4.968v16h4.969v-8.399c0-4.67 6.029-5.052 6.029 0v8.399h4.988v-10.131c0-7.88-8.922-7.593-11.018-3.714v-2.155z"
                      />
                    </svg>
                  </a>
                </li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </main>

    <div>
      <div class="container">
        <div class="row">
          <div class="container__inside">
            <div class="about__title"><h1>About Me</h1></div>
          </div>
        </div>
        <div class="row">
          <div class="container__inside">
            <div class="about__info">
              <h2>Taehyun Ahn (thyun.ahn)</h2>
              <p class="about__me">
                IT 기술에 관심이 많으며, 웹 개발을 좋아합니다.
                <br />
                최근에는 보안 및 개인정보보호를 웹 개발과 연관짓기 위한 궁리 중입니다.
                <br />
                <a href="https://contractfortheweb.org/">#ForTheWeb</a>
              </p>
              
              <h2>Technical Skills</h2>
              <h3>Backend</h3>
              <p class="about__list">Java7</p>
              <p class="about__list">Spring Framework / JSP</p>
              <p class="about__list">MyBatis / JPA</p>
              <p class="about__list">Oracle / Tibero</p>
              <h3>Frontend</h3>
              <p class="about__list">Javascript (~ES6) / JQuery</p>
              <p class="about__list">React</p>
              <p class="about__list">HTML5 / CSS( Flexbox, CSS Grid)</p>
              <h3>Server</h3>
              <p class="about__list">Apache / WebToB</p>
              <p class="about__list">Tomcat / Jeus7</p>
              <p class="about__list">Linux / Windows</p>
              <h3>Tooling / DevOps</h3>
              <p class="about__list">Git / SVN</p>
              <p class="about__list">Jenkins</p>
              <p class="about__list">bash</p>
              <h2>Works</h2>
              <ul>
                <li class="about__list no__padding">
                  경희대학교 차세대정보시스템 1단계 구축 [Info21], 2017.07 -
                  2018.10
                </li>
                <li class="about__list no__padding">
                  국립대 자원관리시스템 구축 [KORUS], 2015.06 - 2017.04
                </li>
              </ul>
              <h2>Personal Projects</h2>
              <ul>
              	<li class="about__list no__padding">
                  Spring Framework + JPA를 이용한 블로그 개발
                </li>
                <li class="about__list no__padding">
                  NodeJS + ReactJS를 이용한 웹 서비스 개발
                </li>
              </ul>
              <h2>Language</h2>
              <p class="about__list">영어 (업무 의사소통 가능)</p>
              <h2></h2>
            </div>
          </div>
        </div>
      </div>
    </div>

    <jsp:include page="footer.jsp"></jsp:include>
    <script src="js/index.js"></script>
    <script src="js/about.js"></script>
  </body>
</html>

