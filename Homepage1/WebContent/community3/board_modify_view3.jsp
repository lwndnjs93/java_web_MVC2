<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="utf-8"%>
<%@ page import="net.board3.db.*" %>
<%
	BoardBean3 board = (BoardBean3)request.getAttribute("boarddata");
%>

<head>
<link href="../CSS/nanumgothic.css" rel="stylesheet" type="text/css">
<link href="../CSS/nanummyeongjo.css" rel="stylesheet" type="text/css">
<link href="../CSS/nanumbrushscript.css" rel="stylesheet" type="text/css">
<link href="../CSS/nanumpenscript.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="../CSS/font-awesome.min.css">


   <link rel="stylesheet" type="text/css" href="../CSS/base.css" />
   <link rel="stylesheet" type="text/css" href="../CSS/contents.css" />
   <link rel="stylesheet" type="text/css" href="../CSS/layout.css" />
   <!-- sub page에 필요 -->
   <link rel="stylesheet" type="text/css" href="../CSS/board.css" />
<!--[if IE 7]>
  <link rel="stylesheet" href="/include/font-awesome/css/font-awesome-ie7.min.css">
<![endif]-->
<title>오렌지게스트하우스</title>

<meta name="Title" content="오렌지게스트하우스">

<meta name= "viewport"content="user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, width=device-width" />
                  <meta name="format-detection" content="telephone=no" />
                  <meta content="IE=EmulateIE8" http-equiv="X-UA-Compatible">
<meta property="og:title" content="오렌지게스트하우스" />
<meta property="og:description" content="" />
<meta property="og:image" content="../Image/sns_img.jpg" />
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link href="../CSS/jquery-ui.custom.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../JS/jquery.min.js"></script>
<script type="text/javascript"  src="../JS/jquery-ui.custom.min.js"></script>
<script type="text/javascript"  src="../JS/jquery.framedialog.js"></script>
<script type="text/javascript" src="../JS/jquery.jScale.js"></script>
<script type="text/javascript" src="../JS/jquery.cookie.js"></script>
<script type="text/javascript" src="../JS/common.js"></script>
<script type="text/javascript">
// 자바스크립트에서 사용하는 전역변수 선언
var g4_path      = "..";
var g4_bbs       = "bbs";
var g4_bbs_img   = "img";
var g4_url       = "http://www.bonggubeer.com";
var g4_is_member = "";
var g4_is_admin  = "";
var g4_bo_table  = "C_01_new";
var g4_sca       = "";
var g4_charset   = "euc-kr";
var g4_cookie_domain = "";
var g4_is_gecko  = navigator.userAgent.toLowerCase().indexOf("gecko") != -1;
var g4_is_ie     = navigator.userAgent.toLowerCase().indexOf("msie") != -1;
</script>

   <script language="javascript">
   
   function form_store()
   {
      var form = document.store_form;

      if(form.wr_1.value=='')
      {
         alert('지역을 선택해주세요.');
         form.wr_1.focus();
         return false;
      }

      form.submit();

   
   }

   </script>

<script type="text/javascript" src="../JS/wcslog.js"></script>
<script type="text/javascript">
if(!wcs_add) var wcs_add = {};
wcs_add["wa"] = "74f6a89354315";
wcs_do();
</script>

<script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','https://www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-93290736-1', 'auto');
  ga('send', 'pageview');

</script>

<script>
   function print(printArea) {
      win = window.open();
      self.focus();
      win.document.open();

      /*
         1. div 안의 모든 태그들을 innerHTML을 사용하여 매개변수로 받는다.
         2. window.open() 을 사용하여 새 팝업창을 띄운다.
         3. 열린 새 팝업창에 기본 <html><head><body>를 추가한다.
         4. <body> 안에 매개변수로 받은 printArea를 추가한다.
         5. window.print() 로 인쇄
         6. 인쇄 확인이 되면 팝업창은 자동으로 window.close()를 호출하여 닫힘
       */
      win.document.write('<html><'head'><title></title><style>');
      win.document
            .write('body, td {font-falmily: Verdana; font-size: 10pt;}');
      win.document.write('</style></haed><body>');
      win.document.write(printArea);
      win.document.write('</body></html>');
      win.document.close();
      win.print();
      win.close();
   }
</script>

</head>
<body class="user">
         <link href="../CSS/background.css" rel="stylesheet" type="text/css" />
<link href="../CSS/index.css" rel="stylesheet" type="text/css" />
<div id="wrap" type="layout" rel="px" relwidth="1180px" relheight="1500px"><div id="ndcs_top" type="layout" rel="px" relwidth="1180px" relheight="360px"><div id="dgc_topMenu_1_0" type="plugin" rel="px" relwidth="1180px" relheight="20px" class="dgc_topMenu_1_01"><script type="text/javascript" src="../JS/dgc_topMenu_1_0.js"></script>


<style type="text/css">
.chu_topMenu1 li {list-style:none;}
.chu_topMenu1 {width:100%; height:20pxpx; line-height:20px; *zoom:1;
   font-size:11px;                  /* 폰트 사이즈 */
   }

.chu_topMenu1:after {display:block; clear:both; content: "";}

.chu_topMenu1_area {*zoom:1;
   float:right;            /* 탑메뉴 정렬 */
   }            
.chu_topMenu1_area:after {display:block; clear:both; content: "";}

div.chu_topMenu1 ul.chu_topMenu1_area li a:link,
div.chu_topMenu1 ul.chu_topMenu1_area li a:visited {text-decoration:none; color:#5b5b5b;}    /* 평상시 폰트 색상 */
div.chu_topMenu1 ul.chu_topMenu1_area li a:active,
div.chu_topMenu1 ul.chu_topMenu1_area li a:hover {text-decoration:none; color:#181818;}    /* 오버시 폰트 색상 */

div.chu_topMenu1 ul.chu_topMenu1_area li a span {color:#5b5b5b;}
div.chu_topMenu1 ul.chu_topMenu1_area li a span:hover {color:#181818;}

.chu_topMenu1 li {float:left;}
.chu_topMenu1 img {border:0;}
.chu_topMenu1 a,
.chu_topMenu1 input,
.chu_topMenu1 span,
.chu_topMenu1 img {vertical-align:middle;}

.chu_top_space1 {height:20pxpx;
   width:10px;            /* 간격 넓이 */
      background-position:center center;
   background-repeat:no-repeat;
   }
.chu_topMenu1 .kor {letter-spacing:-1px; font-size:11px; font-family: 돋움;}
.chu_topMenu1 .engkor {
   letter-spacing:0px;               /* 자간 설정 */
   font-family:tahoma;}            /* 폰트 종류
                                    영문1 - tahoma
                                    영문2 - Palatino Linotype
                                    영문3 - Comic Sans MS
                                    영문4 - Impact

                                    한글1 - "돋움", dotum
                                    한글2 - "굴림", gulim
                                 */
</style>


<div class="chu_topMenu1">
<ul class="chu_topMenu1_area">
   
   <!-- 홈(회원제 비회원제 모두 노출) -->
         <li><a href="/main" class="engkor"><span>HOME</span></a></li>
      
      

   <!-- 추가등록1 -->
      <!-- 추가등록2 -->
      <!-- 추가등록3 -->
      <!-- 추가등록4 -->
      <!-- 관리자(회원제 비회원제 모두 노출) -->
         <li class="chu_top_space1">&nbsp;</li>
      <li><a href="../main/adminlogin.jsp" target="_blank" class="engkor"><span>ADMIN</span></a></li>
         

   <!-- 즐겨찾기 -->
   
   <!-- 시작페이지 -->
   </ul>
</div>
</div><div id="banner" type="plugin" rel="px" relwidth="300px" relheight="270px" class="banner1"><a href="/main" onfocus=this.blur(); target="_self"> <img src="../Image/79f4b5a7e3180e9ebfaa80df40913920.png" width="300" height="270" class="banner1_css" title="logo" alt="logo" ></a></div><div id="dgc_textnavi" type="plugin" rel="px" relwidth="1180px" relheight="60px" class="dgc_textnavi1"><style type="text/css">

img {border:0;}
a {text-decoration:none;}
#text_navi_warp_dgc_textnavi1 {position:absolute; z-index:999; *zoom:1;}
#text_navi_warp_dgc_textnavi1:after {content:""; clear:both; display:block;} 
#text_navi_warp_dgc_textnavi1 a {text-decoration:none;}
.glovalnavi_tx_dgc_textnavi1 {float:left; list-style:none; *zoom:1; 
                 margin-top:14px;   /* 대메뉴 위치 상단 */
                 margin-left:100px;   /* 대메뉴 위치 왼쪽 */
                 }
.glovalnavi_tx_dgc_textnavi1:after {content:""; clear:both; display:block;}

.glovalnavi_tx_dgc_textnavi1 li {float:left; text-align:center; position:relative; width:130px; margin-right:50px;      /* 대메뉴 간격 */}
.glovalnavi_tx_dgc_textnavi1 li a.alink1 {/* float:left; */padding:0 5px;  font-size:14px !important; letter-spacing:-1px; font-weight:bold;
                     color:#ffffff;               /* 대메뉴 텍스트 색상 - 평상시 */
                     font-family:돋음;
                     *display:block;
                     } /* 대메뉴 폰트 설정[나눔고딕(NanumGothic)
                                                                       옥션고딕(AuctionGothic_Medium)
                                                                       돋움
                                                                       굴림 ] */

.glovalnavi_tx_dgc_textnavi1 li:hover a.alink1, 
.glovalnavi_tx_dgc_textnavi1 li a.alink1:hover
, .glovalnavi_tx_dgc_textnavi1 li a.active
 
                              { color:#fff200;} /* 대메뉴 텍스트 색상 - 오버시 */

.glovalnavi_tx_dgc_textnavi1 div.submenu {
   
                                    position:absolute;  
                                 margin-top:20px;                   /* 대메뉴와 상하 간격 1-2 (1-1과 동일 적용) */
                                 left:-100000px;                       /* 소메뉴 시작위치 */
                                    display:none;
                                 z-index:99999;
                                 width:120px;        /* 소메뉴 가로넓이 1-1 */
                                 }
.glovalnavi_tx_dgc_textnavi1 .over { overflow:visible !important; }
.glovalnavi_tx_dgc_textnavi1 .over div.submenu
 {
                              opacity:1;
                               filter: alpha(opacity=80);
                                                            border:solid 1px #2e2e2e;
                               }

.glovalnavi_tx_dgc_textnavi1 li .submenu ul { list-style:none; z-index:99999;
                                                             opacity:1;
                               filter: alpha(opacity=100);
                                                               }

.glovalnavi_tx_dgc_textnavi1 li .submenu img {vertical-align:middle; margin:0 3px;}

.glovalnavi_tx_dgc_textnavi1 .submenu ul li {
                        width:100%; 
                        line-height:22px; 
                        overflow:hidden;
                        text-align:left;
                                                                        border-bottom:1px 
                                                dotted 
                         
                        #777; 
                         
                        background:#d8d8d8;      /* 소메뉴 박스 색상 */
                        }

.glovalnavi_tx_dgc_textnavi1 .submenu ul li a { display:block !important; width:100%; 
   padding:0px 3px 0px 
    
   10px
      !important;
}

.glovalnavi_tx_dgc_textnavi1 .submenu ul li h2  {margin:0; letter-spacing:-1px; font-size:11px; font-family:돋음;
                                    }   /* 소메뉴 점선 색상 */

.glovalnavi_tx_dgc_textnavi1 .submenu ul li h2 a { color:#333333;
font-weight:normal !important;
}                  /* 소메뉴 텍스트 색상 1-1 */
.glovalnavi_tx_dgc_textnavi1 .submenu ul li h2 a:hover {color:#000; background:#b4b4b4;}                /* 소메뉴 오버시 텍스트 색상 1-1 */

.glovalnavi_tx_dgc_textnavi1 .submenu ul li a.alink2 {height:auto; padding:2px 0 7px 0; letter-spacing:-1px;
                                 font-size:11px; font-family:돋음; text-indent:0;
                                 padding-top:5px !important;
                                 text-align:left !important;
                                  
                                 padding-left:30px !important;
                                                                  color:#333333;   /* 소메뉴 텍스트 색상 1-2 (1-1과 동일 적용) */
                                 font-weight:normal !important;
                                 }
.glovalnavi_tx_dgc_textnavi1 .submenu ul li a.alink2:hover {
                                 color:#000;  /* 소메뉴 오버시 텍스트 색상 1-2(1-1과 동일 적용) */
                                 background:#b4b4b4;
                                 }
.glovalnavi_tx_dgc_textnavi1 .submenu ul li a.alink2:hover img {
}
/******************전체메뉴********************************/

/* .glovalnavi_tx_dgc_textnavi1 { width:100%; } */
</style>

<script type="text/javascript" src="../JS/jquery.corner.js"></script>
<script>
   
   _menu = false;         // 이전 메뉴 객체
   
   $(function(){
      
      var delay = 250;          // animate 딜레이
      
      // 3차 아이콘 이미지 오버
      $(".alink2").hover(function(){
         $(this).find("img").attr("src", "../Image/arrow.gif"); 
      }, function(){
         $(this).find("img").attr("src", "../Image/arrow_over.gif"); 
      });

      // 대메뉴 오버
      //$("#text_navi_warp_dgc_textnavi1 .menu1").hover(function(){
      $(".menu1").hover(function(){
         
         var _this = $(this);
         
                  
         var idx = $(this).index();
         
         // 이전 open 된 메뉴 close
         if(_menu) menu_hide(_menu);
         
         // 메뉴 마지막 css 제거
         _this.find(".submenu").find("li").last().css("border-bottom", "none");
          
         var h = _this.find(".submenu").height();//.find("li").length * 37 + 20);
         // 초기 height 저장
         if(!_this.find(".submenu").attr("default-height")){
            _this.find(".submenu").attr("default-height", h).css("height", "0px");
            
         }else h = _this.find(".submenu").attr("default-height");
         _this.addClass("over").find(".submenu").stop().animate({height : h + "px"}, delay, "swing");
         
         _menu = _this;

      }, function(e){
         // 타 영역 아웃시 close
         //if(!$(e.relatedTarget).hasClass("dgc_textnavi1") && !$(e.relatedTarget).parents().hasClass("dgc_textnavi1")) menu_hide($(this));
      }); 

      // 서브메뉴 아웃
      $("#text_navi_warp_dgc_textnavi1 .submenu").mouseleave(function(e){
         if(!$(e.relatedTarget).hasClass("dgc_textnavi1") && !$(e.relatedTarget).parents().hasClass("dgc_textnavi1")) menu_hide($(this).parent());
      });
      
      // 실제 메뉴 닫는 부분
      function menu_hide(obj){
                  obj.find(".submenu").stop().animate({height : "0px"}, delay, "swing", function(){
            obj.removeClass("over");
            $(this).hide();
            $("#text_navi_warp_dgc_textnavi1 .point").hide();
         });
      }
      
      // 서브 on
       
      
      /*if($.browser.msie){
         if($.browser.version < 8){
            $(".all").corner("round 8px");
         }else{
            $(".submenu").corner("round 8px");
         }
      }else{
         $(".submenu").corner("round 8px");
      }*/
   });
   
</script>

<div id="text_navi_warp_dgc_textnavi1" style="line-height:1.5;">
   <ul class="glovalnavi_tx_dgc_textnavi1">
         <li class="menu1">
         <a href="/introduction" class="alink1 ">오렌지게스트하우스</a>
                  <div class="submenu ">
            <ul>
                           <li><h2><a href="/introduction/introduction01">인사말</a></h2></li>
                          
                           <li><h2><a href="/introduction/map01">오시는길</a></h2></li>
                          
                       
            </ul>
         </div>
                    
      </li>
         <li class="menu1">
         <a href="/product" class="alink1 ">이용안내</a>
                  <div class="submenu ">
            <ul>
                           <li><h2><a href="/product/product01">이용안내</a></h2></li>
                          
                       
            </ul>
         </div>
                    
      </li>
         <li class="menu1">
         <a href="/album" class="alink1 ">객실둘러보기</a>
                  <div class="submenu ">
            <ul>
                           <li><h2><a href="/album/album01">객실둘러보기</a></h2></li>
                                 <li><a href="/album/album01_1" class="alink2">석류(2인)</a></li>
                                 <li><a href="/album/album01_2" class="alink2">애플(2인)</a></li>
                                 <li><a href="/album/album01_3" class="alink2">포도(기준2인, 최대3인)</a></li>
                                 <li><a href="/album/album01_4" class="alink2">체리(기준2인, 최대4인)</a></li>
                                 <li><a href="/album/album01_5" class="alink2">다래(기준2인, 최대4인)</a></li>
                                 <li><a href="/album/album01_6" class="alink2">머루(기준2인, 최대4인)</a></li>
                          
                           <li><h2><a href="/album/album02">전경둘러보기</a></h2></li>
                          
                       
            </ul>
         </div>
                    
      </li>
         <li class="menu1">
         <a href="../menu01/menu01_1.jsp" class="alink1 ">예약하기</a>
                  <div class="submenu ">
            <ul>
                           <li><h2><a href="/menu01/menu01_1">예약안내</a></h2></li>
                          
                           <li><h2><a href="/menu01/menu01_2">실시간예약</a></h2></li>
                          
                       
            </ul>
         </div>
                    
      </li>
         <li class="menu1">
         <a href="/menu02" class="alink1 ">갤러리</a>
                  <div class="submenu ">
            <ul>
                           <li><h2><a href="/menu02/menu02_1">포토갤러리</a></h2></li>
                          
                       
            </ul>
         </div>
                    
      </li>
         <li class="menu1">
         <a href="/community" class="alink1 active">커뮤니티</a>
                  <div class="submenu active">
            <ul>
                           <li><h2><a href="/community/board01">공지사항</a></h2></li>
                          
                           <li><h2><a href="/community/board02">예약문의</a></h2></li>
                          
                           <li><h2><a href="/community/board03">방문후기</a></h2></li>
                          
                       
            </ul>
         </div>
                    
      </li>
      </ul>
   </div></div></div><div id="ndcs_con_a" type="layout" rel="px" relwidth="1180px" relheight="50px"><div id="dgc_navigation_bar_1_0" type="plugin" rel="px" relwidth="1140px" relheight="50px" class="dgc_navigation_bar_1_01"><style type="text/css">

.gu_position01{position:relative; width:100%; height:100%; overflow:hidden;}

.gu_position_title01 {position:absolute; left:10px; top:50%; margin-top:-8px; font:bold 15px Gulim,Arial; letter-spacing:-1px;}
.gu_position_title02 {position:absolute; right:10px; top:50%; margin-top:-4px; font:11px Dotum,Arial; letter-spacing:-1px;}

</style>

<div class="gu_position01">
   <div class="gu_position_title01">방문후기</div>
   <div class="gu_position_title02">커뮤니티 > 방문후기 </div>
</div></div></div><div id="ndcs_left" type="layout" rel="px" relwidth="200px" relheight="350px"><div id="dgc_leftmenu_1_0" type="plugin" rel="px" relwidth="190px" relheight="550px" class="dgc_leftmenu_1_01">
<script type="text/javascript" src="../JS/dgc_leftmenu_1_0.js"></script>
<script type="text/javascript" src=.../JS/jquery.accordionMenu.js"></script>

<style type="text/css">
@font-face {font-family:NanumGothic; src:url('../Image/NanumGothic.eot');}

a {text-decoration:none;}

.gu_left_wrap {width:100%;}/*가로사이즈*/

/* 1뎁스 글꼴설정 */
.gu_left_title01 {margin-bottom:10px; font-family:Gulim,Arial; font-size:16px; font-weight:bold; color:#000000; line-height:50px; text-align:center; letter-spacing:-1px;}

.gu_left_accordion {list-style-type:none; padding:0; margin:0;}
.gu_left_accordion ul {padding:0; margin:0; width:100%; no-repeat 10px 10px;}
.gu_left_accordion li {width:100%; cursor:pointer; list-style-type:none; padding:0; margin:0;}
.gu_left_accordion ul li.active a { background: url('../Image/minus.gif') no-repeat 10px 10px;}

/* 2-3뎁스 글꼴설정 */
.gu_left_accordion a {font:12px Gulim,Arial; letter-spacing:-1px; line-height:14px; display:block; padding:5px 5px 5px 0; margin-left:19px; cursor:pointer; text-decoration:none; vertical-align:middle;}

.gu_left_accordion a:hover {text-decoration:none;}

/*3뎁스메뉴 배경색 설정*/
.gu_left_accordion li ul li {background:#eee; font-size:12px;}

.left_con1_space {width:100%; height:20px;}

.gu_left_bn ul li { list-style-type:none; margin:0; padding:0; float:left;}

.left_2deth {border-bottom:1px dotted #999; overflow:hidden;}

.left_con1_01 {float:left; margin:9px 0 0 10px;}
.left_con1_02 {float:left;}
</style>

<script>
   
   $(function(){
      // 
      $(".top-menu").click(function (){

         // 서브메뉴가 있을때만
         var sub_count = $(this).next("ul.left_con1_02").children("li").size();
         if(sub_count > 0){
            $(this).next("ul.left_con1_02").slideToggle('fast');
            return false;
         }
      });
   });
</script>

<div class="gu_left_wrap">
   <div class="gu_left_title01">커뮤니티</div>
   <ul class="gu_left_accordion" id="menuBase" name="menuBase">
               <li class="left_2deth" id="12">
            <img class="left_con1_01" src="../Image/plus.gif"><a href="/community/board01" class="top-menu">공지사항</a>
            <ul class="left_con1_02">
                           </ul>
         </li>
               <li class="left_2deth" id="13">
            <img class="left_con1_01" src="../Image/plus.gif"><a href="/community/board02" class="top-menu">예약문의</a>
            <ul class="left_con1_02">
                           </ul>
         </li>
               <li class="left_2deth" id="44">
            <img class="left_con1_01" src="../Image/plus.gif"><a href="/community/board03" class="top-menu">방문후기</a>
            <ul class="left_con1_02">
                           </ul>
         </li>
         </ul>
     <div class="gu_left_bn">
   <ul>
   <li>
   <img src="../Image/34fc3a79e9688783d824032844a28709.png" width="200" height="106">
   </li>   
   </ul>
   </div>
   <!--베너 추가부분 끝-->
</div>


<div id=printArea >



            <!--body_content-->

               <div id="content_text">

<style>
.event_bt { width:100%; text-align:center; }
.event_bt ul { width:100%; }
.event_bt li { margin:0 0 20px 0; height:40px; line-height:40px; width:33%; border:1px solid #e9e9e9; float:left;}
.event_bt a { width:100%; height:100%; display:block; border-right:1px solid #e9e9e; color:#231f20; font-size:12px; font-weight:600; }
.event_bt a:hover { background:#f9df06; color:#231f20; }
</style>

<script src='../cheditor5/cheditor.js'></script>
        <script type='text/javascript'>
        var ed_wr_content = new cheditor('ed_wr_content');
        ed_wr_content.config.editorHeight = '250';
        ed_wr_content.config.editorWidth = '100%';
        ed_wr_content.inputForm = 'tx_wr_content';
        </script>
<div style="height:14px; line-height:1px; font-size:1px;">&nbsp;</div>

<style type="text/css">
.write_head { height:30px; text-align:center; color:#8492A0; }
.field { border:1px solid #ccc; }
</style>

<script type="text/javascript">
// 글자수 제한
var char_min = parseInt(0); // 최소
var char_max = parseInt(0); // 최대
</script>




<div id="ndcs_container" type="layout" rel="px" relwidth="950px" relheight="550px" margin-right ="20px;">
<div id="contents" type="plugin" rel="px" relwidth="950px" relheight="300px" class="contents">

<form action="./BoardModifyAction3.bo3?num=<%=board.getBOARD3_NUM()%>" method="post"  name="modifyform" enctype="multipart/form-data"> 
   
<table class="write" summary="오렌지 게스트하우스">
   <caption>오렌지 게스트하우스</caption>
   <colgroup>
      <col width="25%">
      <col width="">
   </colgroup>
    
<tr>
  <th>제목</th>
  <td>
  <input style="width:100%;" id="wr_subject" name="BOARD3_SUBJECT" itemname="제목" value="<%=board.getBOARD3_SUBJECT()%>">
  </td>
</tr>
 
  <tr>
    <th>작성자</th>
    <td>
    <input  title="제목"  name="BOARD3_NAME" type="text" placeholder="작성자" size="20" maxlength="10" value="<%=board.getBOARD3_NAME()%>"/>
    <input title="제목"  name="BOARD3_PASS"  type="password" placeholder="비밀번호"/>
    </td>
  </tr>
     
     <tr>  
     <td colspan=2><textarea name="BOARD3_CONTENT" cols="150" rows="18"><%=board.getBOARD3_CONTENT()%></textarea></td>
      </tr>
     
    <tr>
    <th>첨부파일
   <span onclick="add_file();" style="cursor:pointer;" name="BOARD_FILE" ><img src="../Image/btn_file_add.gif"></span> 
                <span onclick="del_file();" style="cursor:pointer;"><img src="../Image/btn_file_minus.gif">
               </span>
   </th>
    <td>
   <table id="variableFiles" cellpadding=0 cellspacing=0></table>        
   
   </div>
   <script type="text/javascript">
        var flen = 0;
        function add_file(delete_code)
        {
            var upload_count = 2;
            if (upload_count && flen >= upload_count)
            {
                alert("이 게시판은 "+upload_count+"개 까지만 파일 업로드가 가능합니다.");
                return;
            }

            var objTbl;
            var objRow;
            var objCell;
            if (document.getElementById)
                objTbl = document.getElementById("variableFiles");
            else
                objTbl = document.all["variableFiles"];

            objRow = objTbl.insertRow(objTbl.rows.length);
            objCell = objRow.insertCell(0);

            objCell.innerHTML = "<input type='file' class='ed' name='bf_file[]' title='파일 용량 1,048,576 바이트 이하만 업로드 가능'>";
            if (delete_code)
                objCell.innerHTML += delete_code;
            else
            {
                                ;
            }

            flen++;
        }

        add_file('');

        function del_file()
        {
            // file_length 이하로는 필드가 삭제되지 않아야 합니다.
            var file_length = 0;
            var objTbl = document.getElementById("variableFiles");
            if (objTbl.rows.length - 1 > file_length)
            {
                objTbl.deleteRow(objTbl.rows.length - 1);
                flen--;
            }
        }
        </script>
   </td>
  </tr>
  </table>

<div class="center btn_r">
       <input type=submit id="bn_submit" value ="수정하기">&nbsp;
        <input type=submit href="./board02.jsp" class='btn_list' value ="목록">
</div>
</form>




<script type="text/javascript" src="../JS/jquery.kcaptcha.js"></script>
<script type="text/javascript">

with (document.fwrite) 
{
    if (typeof(wr_name) != "undefined")
        wr_name.focus();
    else if (typeof(wr_subject) != "undefined")
        wr_subject.focus();
    else if (typeof(wr_content) != "undefined")
        wr_content.focus();

    if (typeof(ca_name) != "undefined")
        if (w.value == "u")
            ca_name.value = "";
}

function html_auto_br(obj) 
{
    if (obj.checked) {
        result = confirm("자동 줄바꿈을 하시겠습니까?\n\n자동 줄바꿈은 게시물 내용중 줄바뀐 곳을<br>태그로 변환하는 기능입니다.");
        if (result)
            obj.value = "html2";
        else
            obj.value = "html1";
    }
    else
        obj.value = "";
}

function fwrite_submit(f) 
{
    /*
    var s = "";
    if (s = word_filter_check(f.wr_subject.value)) {
        alert("제목에 금지단어('"+s+"')가 포함되어있습니다");
        return false;
    }

    if (s = word_filter_check(f.wr_content.value)) {
        alert("내용에 금지단어('"+s+"')가 포함되어있습니다");
        return false;
    }
    */

    if (document.getElementById('char_count')) {
        if (char_min > 0 || char_max > 0) {
            var cnt = parseInt(document.getElementById('char_count').innerHTML);
            if (char_min > 0 && char_min > cnt) {
                alert("내용은 "+char_min+"글자 이상 쓰셔야 합니다.");
                return false;
            } 
            else if (char_max > 0 && char_max < cnt) {
                alert("내용은 "+char_max+"글자 이하로 쓰셔야 합니다.");
                return false;
            }
        }
    }

    if (document.getElementById('tx_wr_content')) {
        if (!ed_wr_content.outputBodyText()) { 
            alert('내용을 입력하십시오.'); 
            ed_wr_content.returnFalse();
            return false;
        }
    }

    document.getElementById('tx_wr_content').value = ed_wr_content.outputBodyHTML();
    var subject = "";
    var content = "";
    $.ajax({
        url: "../skin/board/basic_new5/ajax.filter.php",
        type: "POST",
        data: {
            "subject": f.wr_subject.value,
            "content": f.wr_content.value
        },
        dataType: "json",
        async: false,
        cache: false,
        success: function(data, textStatus) {
            subject = data.subject;
            content = data.content;
        }
    });

    if (subject) {
        alert("제목에 금지단어('"+subject+"')가 포함되어있습니다");
        f.wr_subject.focus();
        return false;
    }

    if (content) {
        alert("내용에 금지단어('"+content+"')가 포함되어있습니다");
        if (typeof(ed_wr_content) != "undefined") 
            ed_wr_content.returnFalse();
        else 
            f.wr_content.focus();
        return false;
    }

    if (!check_kcaptcha(f.wr_key)) {
        return false;
    }

  //  document.getElementById('btn_submit').disabled = true;
  //  document.getElementById('btn_list').disabled = true;

    f.action = './write_update.php';    
    return true;
}
</script>

<script type="text/javascript" src="../JS/board.js"></script>
<script type="text/javascript"> window.onload=function() { drawFont(); } </script>
               <div class="clear_div"></div>




</div>

</div>

<div id="ndcs_foot" type="layout" rel="px" relwidth="1180px" relheight="80px"><div id="web_copyright_0" type="plugin" rel="px" relwidth="1080px" relheight="80px" class="web_copyright_01"><script type="text/javascript" src="../JS/dgc_default.js"></script>





<style type="text/css">
@font-face {font-family:NanumGothic; src:url('../Image/NanumGothic.eot');}
</style>
<style type="text/css">

#chu_copy {*zoom: 1; font-size:11px;
   font-family:nanumgothic;      /* 폰트 종류 */
   }
#chu_copy:after {display: block; clear: both; content: "";}

.chu_copy_logo {float:left;}

.chu_copy_text {/*float:left;*/
   margin-top:10px;         /* 위치-상단 위치 */
   margin-left:30px;         /* 위치-왼쪽 위치 */
   color:#ffffff;               /* 텍스트 색상 */
   }

.chu_copy_text li {list-style:none;
   line-height:20px;         /* 행간 */
   letter-spacing:0px;      /* 자간 */
   }
</style>



<div id="chu_copy">

   
   <ul class="chu_copy_text">
      
      <li>전주시 완산구 기린대로 74-15 ((구)풍남동 3가 12-11)ㅣH.P : 010-6688-0892ㅣ대표자 : 유민욱</li>
            <li>계좌번호 : 농협 302-6688-0892-71 예금주 : 유민욱 | 사업자번호 : 402-24-72588</li>
      
      
            
      <li>Copyright &copy; 2016 오렌지게스트하우스. All rights reserved.</li>
      
   </ul>

</div>
</div><div id="dgc_default" type="plugin" rel="px" relwidth="80px" relheight="80px" class="dgc_default1"><script type="text/javascript" src=".../JS/dgc_default.js">
</script>

<!-- 20141222 이은주 시작 for : 에스크로 적용 -->
<!--농협 에스크로 이체 인증마크 적용 시작-->

<script>
function onPopCertMar(key){
window.open('','self','height=700, width=650, status=yes, toolbar=no, menubar=no, location=no');
document.CERTMARK_FORM.certMarkURLKey.value = key;
document.CERTMARK_FORM.action='https://escrow.nonghyup.com/?certMarkURLKey=' + key; 
document.CERTMARK_FORM.target='self';
document.CERTMARK_FORM.submit();
}
</script>

<FORM name='CERTMARK_FORM' METHOD='POST'>
   <input type="hidden" name="certMarkURLKey">
</FORM>

<a href="javascript:onPopCertMar('ac9365a1ab49e08a4494fbeb5d898f41')">
   <img src="../Image/nh_mark.png" alt='에스크로이체로 결제하기' border='0'style="width:75px; height:75px; margin-top:2px;"/>
</a> 

<!--농협 에스크로 이체 인증마크 적용 종료-->
<!-- 20141222 이은주 종료 -->
</div></div></div>
<script type="text/javascript">

</script></body></html>