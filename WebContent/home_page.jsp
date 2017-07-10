<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
  <meta charset="utf-8">
  <title></title>
  <meta name="viewport" content="width=device-width">
  <link rel="stylesheet" href="css/carousel/example.css">

  <style>
    body {
      -webkit-font-smoothing: antialiased;
      font: normal 15px/1.5 "Helvetica Neue", Helvetica, Arial, sans-serif;
      color: #232525;
      padding-top:70px;
      background-color: #eee;
    }
    #slides {
      display: none
    }

    #slides .slidesjs-navigation {
      margin-top:5px;
    }

    a.slidesjs-next,
    a.slidesjs-previous,
    a.slidesjs-play,
    a.slidesjs-stop {
      background-image: url(img/btns-next-prev.png);
      background-repeat: no-repeat;
      display:block;
      width:12px;
      height:18px;
      overflow: hidden;
      text-indent: -9999px;
      float: left;
      margin-right:5px;
    }

    a.slidesjs-next {
      margin-right:10px;
      background-position: -12px 0;
    }

    a:hover.slidesjs-next {
      background-position: -12px -18px;
    }

    a.slidesjs-previous {
      background-position: 0 0;
    }

    a:hover.slidesjs-previous {
      background-position: 0 -18px;
    }

    a.slidesjs-play {
      width:15px;
      background-position: -25px 0;
    }

    a:hover.slidesjs-play {
      background-position: -25px -18px;
    }

    a.slidesjs-stop {
      width:18px;
      background-position: -41px 0;
    }

    a:hover.slidesjs-stop {
      background-position: -41px -18px;
    }

    .slidesjs-pagination {
      margin: 7px 0 0;
      float: right;
      list-style: none;
    }

    .slidesjs-pagination li {
      float: left;
      margin: 0 1px;
    }

    .slidesjs-pagination li a {
      display: block;
      width: 13px;
      height: 0;
      padding-top: 13px;
      background-image: url(img/pagination.png);
      background-position: 0 0;
      float: left;
      overflow: hidden;
    }

    .slidesjs-pagination li a.active,
    .slidesjs-pagination li a:hover.active {
      background-position: 0 -13px
    }

    .slidesjs-pagination li a:hover {
      background-position: 0 -26px
    }

    #slides a:link,
    #slides a:visited {
      color: #333
    }

    #slides a:hover,
    #slides a:active {
      color: #9e2020
    }

    .navbar {
      overflow: hidden
    }
  </style>

  <style>
    #slides {
      display: none
    }

    .container {
      margin: 0 auto
    }

    @media (max-width: 767px) {
      body {
        padding-left: 20px;
        padding-right: 20px;
      }
      .container {
        width: auto
      }
    }

    @media (max-width: 480px) {
      .container {
        width: auto
      }
    }

    @media (min-width: 768px) and (max-width: 979px) {
      .container {
        width: 750px
      }
    }

    /* For larger displays */
    @media (min-width: 980px) and (min-width: 1200px) {
      .container {
        width: 1000px
      }
    }
  </style>

  <style>
    .top-banner {
      background-color: #333;
    }
  </style>
</head>
<body>
  <div class="container">
    <div id="slides">
      <img src="http://www.ruite-tec.com/uploadfile/2016/0914/20160914032441291.jpg">
      <img src="http://www.ruite-tec.com/uploadfile/2016/0914/20160914032441291.jpg">
      <img src="http://bpic.ooopic.com/15/94/42/15944235-0ad80039a19213cf1e206ea8e7228eff-1.jpg">
      <img src="http://bpic.ooopic.com/15/94/42/15944235-0ad80039a19213cf1e206ea8e7228eff-1.jpg">
    </div>
  </div>
  <script src="js/carousel/jquery-1.9.1.min.js"></script>
  <script src="js/carousel/jquery.slides.min.js"></script>
  <script>
    $(function() {
      $('#slides').slidesjs({
        width: 2000,
        height: 2000,
        play: {
          active: true,
          auto: true,
          interval: 2000,
          swap: true
        }
      });
    });
  </script>
</body>
</html>
