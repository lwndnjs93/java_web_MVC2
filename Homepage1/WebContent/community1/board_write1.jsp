<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ page import="net.board1.db.*" %>
<% String id = (String)request.getAttribute("id"); %>
<head>

<link href="../CSS/nanumgothic.css" rel="stylesheet" type="text/css">
<link href="../CSS/nanummyeongjo.css" rel="stylesheet" type="text/css">
<link href="../CSS/nanumbrushscript.css" rel="stylesheet" type="text/css">
<link href="../CSS/nanumpenscript.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="../CSS/font-awesome.min.css">
<!--[if IE 7]>
  <link rel="stylesheet" href="/../CSS/font-awesome-ie7.min.css">
<![endif]-->
<title>오렌지게스트하우스</title><meta name="Title" content="오렌지게스트하우스"><meta name= "viewport"content="user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, width=device-width" />
                  <meta name="format-detection" content="telephone=no" />
                  <meta content="IE=EmulateIE8" http-equiv="X-UA-Compatible">
<meta property="og:title" content="오렌지게스트하우스" />
<meta property="og:description" content="" />
<meta property="og:image" content="../Image/sns_img.jpg" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="../CSS/jquery-ui.custom.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../JS/jquery.min.js"></script>
<script type="text/javascript"  src="../JS/jquery-ui.custom.min.js"></script>
<script type="text/javascript"  src="../JS/jquery.framedialog.js"></script>
<script type="text/javascript" src="../JS/jquery.jScale.js"></script>
<script type="text/javascript" src="../JS/jquery.cookie.js"></script>
<script type="text/javascript" src="../JS/common.js"></script>
</head>
<body class="user">
         <link href="../CSS/background.css" rel="stylesheet" type="text/css" />
<link href="../CSS/index.css" rel="stylesheet" type="text/css" />
<div id="wrap" type="layout" rel="px" relwidth="1180px" relheight="1500px"><div id="ndcs_top" type="layout" rel="px" relwidth="1180px" relheight="360px"><div id="dgc_topMenu_1_0" type="plugin" rel="px" relwidth="1180px" relheight="20px" class="dgc_topMenu_1_01"><script type="text/javascript" src="http://www.xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/dgc_topMenu_1_0/include/js/dgc_topMenu_1_0.js"></script>


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
      <li><a href="/admin" target="_blank" class="engkor"><span>ADMIN</span></a></li>
         

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

<script type="text/javascript" src="http://www.xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/dgc_textnavi/include/js/jquery.corner.js"></script>
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
         <a href="/menu01" class="alink1 ">예약하기</a>
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
         <a href="./BoardList1.bo1" class="alink1 active">커뮤니티</a>
                  <div class="submenu active">
            <ul>
                           <li><h2><a href="../community1/board021.jsp">공지사항</a></h2></li>
                          
                           <li><h2><a href="../community/board02.jsp2">예약문의</a></h2></li>
                          
                           <li><h2><a href="../community3/board023.jsp">방문후기</a></h2></li>
                          
                       
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
   <div class="gu_position_title01">예약문의</div>
   <div class="gu_position_title02">커뮤니티 > 예약문의 </div>
</div></div></div><div id="ndcs_left" type="layout" rel="px" relwidth="200px" relheight="350px"><div id="dgc_leftmenu_1_0" type="plugin" rel="px" relwidth="190px" relheight="550px" class="dgc_leftmenu_1_01"><script type="text/javascript" src="http://www.xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/dgc_leftmenu_1_0/include/js/dgc_leftmenu_1_0.js"></script>
<script type="text/javascript" src="http://www.xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/dgc_leftmenu_1_0/include/js/jquery.accordionMenu.js"></script>

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
   <div class="left_con1_space"></div>
   <!--베너 추가부분 시작-->
   <div class="gu_left_bn"><ul><li><img src="../Image/34fc3a79e9688783d824032844a28709.png" width="200" height="106"></li>   </ul></div>
   <!--베너 추가부분 끝-->
</div>

<script type="text/javascript">
$(document).ready(function () {
   var imgPath = "Image/";
   $("#menuBase").accordion(13, 2, imgPath);
});
</script></div></div><div id="ndcs_container" type="layout" rel="px" relwidth="950px" relheight="550px"><div id="contents" type="plugin" rel="px" relwidth="950px" relheight="300px" class="contents"><link href="http://www.xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/board/views/default/css/board_comm.css" rel="stylesheet" type="text/css" />

<style type="text/css">
/* board write */
.boardWrite {}
.boardWrite .btn_right {float:right; text-align:right; padding:10px 0; }
.boardWrite .btnCancel { float:left; }
.boardWrite .btnModify { padding-left:5px; float:left; }
.boardWrite .btnWrite { padding-left:5px; float:left; }
.boardWrite .subject { padding:5px 0; }
.boardWrite .wcontents { width:100%; padding:5px 0; float:left;}
.boardWrite .tag { padding:5px 0; }
.boardWrite .rss { padding:5px 0; }
.boardWrite .cWriter { padding:5px 0; }
.boardWrite .cUrl { padding:5px 0; }
.boardWrite .file { padding:5px 0; }
.btnWrite input { vertical-align: middle; }

/* etcField */
.boardWrite .etcField{ padding: 10px; margin:0px ; border:1px solid #DFDFDF;} 
.field_text { font-weight:bold; color: #000; }

/* editor */
.boardWrite .field { height:24px; padding: 2px ; margin:0px; }
.boardWrite .field .division { padding-bottom:5px; margin:0;}
.boardWrite .field #subject { padding: 0; margin:0; width:668px; height:20px; }
.boardWrite .field input { background:#fafafa; height:15px; padding:2px 0 0 2px; border-color:#bdbdbd #d1d1d1 #d1d1d1 #bdbdbd; border-style:solid; border-width:1px; color:#666666; font-size:12px; }
.boardWrite .field .checkbox { border:0px; vertical-align:middle; }

.board_content .rp1 {background-color:#f7f7f7; border-bottom:1px solid #9EAEC7; height:30px; text-align:center}
.board_content .rp1.end {padding:0 17px 0 12px; text-align:left; background-color:#FFF}
.board_content .rp1.editor {background-color:#FFF; padding:7px 12px}

/* Author */
.boardWrite .Author { padding: 10px; margin-top:10px; border:1px solid #DFDFDF; }
.boardWrite .Author .AuthorText { padding:0 5px; }
.boardWrite .Author .PasswordText { padding:0 5px; }
.boardWrite .Author .CodeText { padding:0 5px; }
.boardWrite .Author .AuthorInput { }
.boardWrite .Author .CodeImage { padding:0px 5px;}
.boardWrite .Author .CodeInput { }
.boardWrite .Author .CodeResult { padding:2px 5px;}

.user_captcha {font-family:"굴림", "돋움"; font-size:13px; color:BLUE; width:80px; height:16px; font-weight:bold; border:1px solid #ccc; padding-top:2px; text-transform:uppercase; }

.tx_content {width:100%; font-size:12px; }
</style>

<div class="boardHeader">
</div>

<div class="boardBody">

   <form id="tx_editor_form" name="tx_editor_form" action="./BoardAddAction1.bo1?id=<%=id %>" onsubmit="return saveContent();" method="post" enctype="multipart/form-data">
   <input type="hidden" id="contents_no" name="contents_no">
   <div class="boardWrite">
            <div class="clear"></div>
      <div class="field">
         <ul>
            <li class="fleft w70">
               <span class="field_text">옵션선택</span>&nbsp;
            </li>
            <li class="fleft">
               
                        <span><input type="checkbox" name="fixed" value="on" class="checkbox" id="ckbox01" /> <label for="ckbox01">글고정</label></span>
                              
                           </li>
         </ul>
      </div>
            
      <div class="clear"></div>
      <div class="field">
         <ul>
            <li class="fleft w70">
               <span class="field_text">제목입력</span>&nbsp;
            </li>
            <li class="fleft">
               <span><input type="text" name="BOARD1_SUBJECT" id="subject" value="제목을 입력하세요." /></span>
            </li>
         </ul>
      </div>
      
      <li>  
     <span colspan=2><textarea name="BOARD1_CONTENT" cols="150" rows="18"></textarea></span>
      </li>
     
      
      
      
      
      
      
      
      
      
      
      
      
      
      

<div class="body">

      
   <!-- 에디터 컨테이너 끝 -->
</div>
<!-- 에디터 끝 -->
<script type="text/javascript">
   var config = {
      txHost: '', /* 런타임 시 리소스들을 로딩할 때 필요한 부분으로, 경로가 변경되면 이 부분 수정이 필요. ex) http://xxx.xxx.com */
      txPath: '/include/daumeditor/', /* 런타임 시 리소스들을 로딩할 때 필요한 부분으로, 경로가 변경되면 이 부분 수정이 필요. ex) /xxx/xxx/ */
      txService: 'sample', /* 수정필요없음. */
      txProject: 'sample', /* 수정필요없음. 프로젝트가 여러개일 경우만 수정한다. */
      initializedId: "", /* 대부분의 경우에 빈문자열 */
      wrapper: "tx_trex_container", /* 에디터를 둘러싸고 있는 레이어 이름(에디터 컨테이너) */
      form: 'tx_editor_form'+"", /* 등록하기 위한 Form 이름 */
      txIconPath: "../Image/editor/", /*에디터에 사용되는 이미지 디렉터리, 필요에 따라 수정한다. */
      txDecoPath: "../Image/contents/", /*본문에 사용되는 이미지 디렉터리, 서비스에서 사용할 때는 완성된 컨텐츠로 배포되기 위해 절대경로로 수정한다. */
      canvas: {
         styles: {
            color: "#000", /* 기본 글자색 */
            fontFamily: "돋움", /* 기본 글자체 */
            fontSize: "10pt", /* 기본 글자크기 */
            
            backgroundColor: "#fff", /*기본 배경색 */
            lineHeight: "1.5", /*기본 줄간격 */
            padding: "8px" /* 위지윅 영역의 여백 */
         },
         showGuideArea: false
      },
      events: {
         preventUnload: false
      },
      sidebar: {
         attachbox: {
            show: true
         }
            ,attacher: {
            image: {
                 multiple: true,
                  multipleuse: false,
                  checksize: false,
                  boxonly: false,
                  wysiwygonly: true,
                  features: { left:250, top:65, width:520, height:400 },
                  popPageUrl: "/files/upload/?image_width=700&image_height=700&master_dim=width&structure_id=13&module_no=4&module_type=plugin&upload_size=2048&upload_path=Ym9hcmRfdXBsb2FkLzU=&upload_url=/data/admin/board_upload/5&upload_type=&file_type=image"
            },
            file: {
                  multiple: true,
                  multipleuse: false,
                  checksize: true,
                  boxonly: false,//true,
                  wysiwygonly: false,
                  features: { left:250, top:65, width:520, height:400 },
                  popPageUrl: "/files/upload/?image_width=700&image_height=700&master_dim=width&structure_id=13&module_no=4&module_type=plugin&upload_size=2048&upload_path=Ym9hcmRfdXBsb2FkLzU=&upload_url=/data/admin/board_upload/5&upload_type=&file_type=file"
            },
            media: {
                  wysiwygonly: true,
                  useCC: false,
                  features: { left:250, top:65, width:440, height:258 },
                  popPageUrl: "/include/daumeditor/attache/multimedia.html"
            }
            }
      },
      size: {
         contentWidth: 700 /* 지정된 본문영역의 넓이가 있을 경우에 설정 */
      }
   };

   //에디터 로드
   EditorJSLoader.ready(function(Editor) {
      var editor = new Editor(config);
   });
   
</script>

</script>      </div>
      <div class="clear"></div>
<!-- 본문 끝 -->
         
<!-- 기타 입력내용 시작 -->
      <div class="etcField">
         <div class="field">
            <ul>
               <li class="fleft w70">
                  <span class="field_text">파일첨부</span>&nbsp;
               </li>
               <li class="fleft">
                  <input type="file" name="BOARD1_FILE" style="height:24px; border:none;" />
            
               <span class="cAuthorText">작성자</span>
               <span class="cAuthorInput"><input type="text" name="BOARD1_NAME"class="gu_inp02" maxlength="10"></span>
         <span class="PasswordText">패스워드</span>
         <span class="AuthorInput"><input type="password" id="password" name="BOARD1_PASS"  class="gu_inp02" maxlength="20"></span>
       <input type=submit id="bn_submit" value ="글쓰기">&nbsp;
        <input type=submit href="./board021.jsp" class='btn_list' value ="목록">
        </li>
        
</div>
      </div>
   </div>
   </form>
</div>

<div class="boardBottom">

        
        
</div>

<script type="text/javascript">
$(document).ready(function(){
   // 제목필 크기 지정
   $("input:[name='subject']").css({"width": $(".wcontents").width()- 76});
    
   $("input:[name='subject']").click(function(){
      if($(this).val() == "제목을 입력하세요."){
         $(this).val('');
      }
   });

   $("textarea:[name='tx_content']").click(function(){
      if($(this).val() == "내용을 입력합니다."){
         $(this).val('');
      }
   });

   //captcha 체크
   $("#user_captcha").keyup(function(){
      $(this).val($(this).val().toUpperCase());

      if($("#user_captcha").val() == $("#user_captcha_val").val()){
         $(".CodeResult").html("코드가 일치합니다.");
         $(".CodeResult").css({ "color":"BLUE" }); 
         $("#user_captcha_check").val('1');
      } else {
         $(".CodeResult").html("코드가 틀립니다.");
         $(".CodeResult").css({ "color":"RED" });
         $("#user_captcha_check").val('');
      }
   });

   $("#user_captcha").change(function(){
      if($("#user_captcha").val() == $("#user_captcha_val").val()){
         $(".CodeResult").html("코드가 일치합니다.");
         $(".CodeResult").css({ "color":"BLUE" }); 
         $("#user_captcha_check").val('1');
      } else {
         $(".CodeResult").html("코드가 틀립니다.");
         $(".CodeResult").css({ "color":"RED" });
         $("#user_captcha_check").val('');
      }
   });
});

   /*-------- 글 등록할 때 필요한 함수들 시작 ----------*/   
   function saveContent() {
      Editor.save(); /* 이 함수를 호출하여 글을 등록하면 된다. */
   }
   
   /**
    * Editor.save()를 호출한 경우 데이터가 유효한지 검사하기 위해 부르는 콜백함수로 
    * 상황에 맞게 수정하여 사용한다.
    * 모든 데이터가 유효할 경우에 true를 리턴한다. 
    * @function
    * @param {Object} editor - 에디터에서 넘겨주는 editor 객체
    * @returns {Boolean} 모든 데이터가 유효할 경우에 true
    */

   function validForm(editor) { 
      /* 제목 필드가 따로 존재할 경우 'tx_article_title'를 해당 아이디로 교체하여 사용. */
      if($tx('subject').value == "" || $tx('subject').value == "제목을 입력합니다."){
         alert('제목을 입력하세요');
         $tx('tx_article_title').focus();
         return false;
      }

      /* 본문 내용이 입력되었는지 검사하는 부분 */
      var _validator = new Trex.Validator();
      var _content = editor.getContent();
      if(!_validator.exists(_content)) {
         alert('내용을 입력하세요');
         return false;
      }

         if ($("input:[name='nick_name']").val() == '') {
            alert('닉네임을 입력하세요!');
            $("input:[name='nick_name']").focus();
            return false;
         }else if($("input:[name='nick_name']").val() == '관리자' || $("input:[name='nick_name']").val() == 'admin'){
            alert('관리자,admin은 닉네임으로 사용 하실 수 없습니다.');
            $("input:[name='nick_name']").focus();
            return false;
         }else{
            var wname = $("input:[name='nick_name']").val();
         }

      if ($('#password').val() == '') {
         $('#password').focus();
         alert('비밀번호를 입력하세요!');
         return false;
      }

      // 인증번호 체크
      if($('#user_captcha_check').val() !='1'){
         $('#user_captcha').focus();
         alert('코드를 확인하세요!');
         return false;
      }


      return true;
   }
   
   /**
    * Editor.save()를 호출한 경우 데이터가 유효하면
    * Form Summit을 위해 필드를 생성, 변경하기 위해 부르는 콜백함수로 
    * 상황에 맞게 수정하여 사용한다.
    * 정상적인 경우에 true를 리턴한다. 
    * @function
    * @param {Object} editor - 에디터에서 넘겨주는 editor 객체
    * @returns {Boolean} 정상적인 경우에 true
    */
   function setForm(editor) {
      var _formGen = editor.getForm();
      
      var _content = editor.getContent();
      _formGen.createField(
         tx.textarea({ 
            /* 본문 내용을 필드를 생성하여 값을 할당하는 부분 */
            'name': "tx_content", 
            'style': { 'display': "none" } 
         }, 
         _content)
      );

      /* 아래의 코드는 첨부된 데이터를 필드를 생성하여 값을 할당하는 부분으로 상황에 맞게 수정하여 사용한다.
       첨부된 데이터 중에 주어진 종류(image,file..)에 해당하는 것만 배열로 넘겨준다. */  
      var _attachments = editor.getAttachments('image',true);
      for(var i=0,len=_attachments.length;i<len;i++) {
         /* existStage는 현재 본문에 존재하는지 여부 */ 
         if (_attachments[i].existStage) {
            /* data는 팝업에서 execAttach 등을 통해 넘긴 데이터 */
            //alert(_attachments[i].data);
            _formGen.createField(
               tx.input({ 
                  'type': "hidden", 
                  'name': 'tx_attach_image', 
                  'value': _attachments[i].data.imageurl /* 예에서는 이미지경로만 받아서 사용 */
               })
            );
         }
      }
      
      return true;
   }
   /*-------- 글 등록할 때 필요한 함수들 끝 ----------*/
</script>

</div></div><div id="ndcs_foot" type="layout" rel="px" relwidth="1180px" relheight="80px"><div id="web_copyright_0" type="plugin" rel="px" relwidth="1080px" relheight="80px" class="web_copyright_01"><script type="text/javascript" src="http://www.xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/web_copyright_0/include/js/dgc_default.js"></script>
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

<script>
/*
 * 20140626 김근수 
 * [문제점]
 * 하단정보가 노출되는 영역의 가로길이가 지정되지 않아서
 * 하단정보가 너무 길 경우 UI가 틀어지는 문제 

 * [해결법]
 * "쇼룸에서 지정된 카피라이터 가로 길이 - 로고의 가로 길이 - 20" 으로 하단정보가 노출되는 곳의 가로 길이 지정
 *
 * 20140929 김근수
 * 작업한 소스로 인해 문제가 발생하는 경우가 있어서 주석처리
 */

/*
$(document).ready(function(){

   //초기화
   var chu_copy_width = ""; //하단정보 부분의 가로 길이가 저장될 변수

   chu_copy_width = $( "#chu_copy" ).width(); //쇼룸에서 지정한 통합 카피라이터 가로길이를 구해옴

   //하단정보 부분의 가로 길이값에서 로고의 가로 길이값을 감산(공간확보를 위해서 20을 추가로 감산)
   chu_copy_width = chu_copy_width-0-20; 

   //하단정보가 노출되는 곳의 가로 길이 설정
   $('.chu_copy_text li:first-child') 
      .css('width', chu_copy_width+"px")
});
*/
</script>

<div id="chu_copy">

   
   <ul class="chu_copy_text">
      
      <li>전주시 완산구 기린대로 74-15 ((구)풍남동 3가 12-11)ㅣH.P : 010-6688-0892ㅣ대표자 : 유민욱</li>
            <li>계좌번호 : 농협 302-6688-0892-71 예금주 : 유민욱 | 사업자번호 : 402-24-72588</li>
      
      
            
      <li>Copyright &copy; 2016 오렌지게스트하우스. All rights reserved.</li>
      
   </ul>

</div>
</div><div id="dgc_default" type="plugin" rel="px" relwidth="80px" relheight="80px" class="dgc_default1"><script type="text/javascript" src="http://www.xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/dgc_default/include/js/dgc_default.js">
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