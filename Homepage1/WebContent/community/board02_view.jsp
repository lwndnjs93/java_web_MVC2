<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="UTF-8"%>
<%@ page import="net.board2.db.*" %>
<%
	BoardBean board = (BoardBean)request.getAttribute("boarddata");
	BoardBean board2 = (BoardBean)request.getAttribute("boarddata2");
%>
<%
   int num=Integer.parseInt(request.getParameter("num"));
%>

<html lang="ko">
<head>
<link href="http://fonts.googleapis.com/earlyaccess/nanumgothic.css" rel="stylesheet" type="text/css">
<link href="http://fonts.googleapis.com/earlyaccess/nanummyeongjo.css" rel="stylesheet" type="text/css">
<link href="http://fonts.googleapis.com/earlyaccess/nanumbrushscript.css" rel="stylesheet" type="text/css">
<link href="http://fonts.googleapis.com/earlyaccess/nanumpenscript.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="/include/font-awesome/css/font-awesome.min.css">
<!--[if IE 7]>
  <link rel="stylesheet" href="/include/font-awesome/css/font-awesome-ie7.min.css">
<![endif]-->
<title>오렌지게스트하우스</title><meta name="Title" content="오렌지게스트하우스"><meta name= "viewport"content="user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, width=device-width" />
						<meta name="format-detection" content="telephone=no" />
						<meta content="IE=EmulateIE8" http-equiv="X-UA-Compatible">
<meta property="og:title" content="오렌지게스트하우스" />
<meta property="og:description" content="" />
<meta property="og:image" content="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/images/sns_img.jpg" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/include/css/jquery-ui.custom.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/include/js/jquery.min.js"></script>
<script type="text/javascript"  src="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/include/js/jquery-ui.custom.min.js"></script>
<script type="text/javascript"  src="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/include/js/jquery.framedialog.js"></script>
<script type="text/javascript" src="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/include/js/jquery.jScale.js"></script>
<script type="text/javascript" src="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/include/js/jquery.cookie.js"></script>
<script type="text/javascript" src="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/include/js/common.js"></script>
</head>
<body class="user">
<link href="../CSS/background.css" rel="stylesheet" type="text/css" />
<link href="../CSS/index.css" rel="stylesheet" type="text/css" />
<div id="wrap" type="layout" rel="px" relwidth="1180px" relheight="1500px"><div id="ndcs_top" type="layout" rel="px" relwidth="1180px" relheight="360px"><div id="dgc_topMenu_1_0" type="plugin" rel="px" relwidth="1180px" relheight="20px" class="dgc_topMenu_1_01"><script type="text/javascript" src="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/dgc_topMenu_1_0/include/js/dgc_topMenu_1_0.js"></script>


<style type="text/css">
.chu_topMenu1 li {list-style:none;}
.chu_topMenu1 {width:100%; height:20pxpx; line-height:20px; *zoom:1;
	font-size:11px;						/* 폰트 사이즈 */
	}

.chu_topMenu1:after {display:block; clear:both; content: "";}

.chu_topMenu1_area {*zoom:1;
	float:right;				/* 탑메뉴 정렬 */
	}				
.chu_topMenu1_area:after {display:block; clear:both; content: "";}

div.chu_topMenu1 ul.chu_topMenu1_area li a:link,
div.chu_topMenu1 ul.chu_topMenu1_area li a:visited {text-decoration:none; color:#5b5b5b;}	 /* 평상시 폰트 색상 */
div.chu_topMenu1 ul.chu_topMenu1_area li a:active,
div.chu_topMenu1 ul.chu_topMenu1_area li a:hover {text-decoration:none; color:#181818;}	 /* 오버시 폰트 색상 */

div.chu_topMenu1 ul.chu_topMenu1_area li a span {color:#5b5b5b;}
div.chu_topMenu1 ul.chu_topMenu1_area li a span:hover {color:#181818;}

.chu_topMenu1 li {float:left;}
.chu_topMenu1 img {border:0;}
.chu_topMenu1 a,
.chu_topMenu1 input,
.chu_topMenu1 span,
.chu_topMenu1 img {vertical-align:middle;}

.chu_top_space1 {height:20pxpx;
	width:10px;				/* 간격 넓이 */
		background-position:center center;
	background-repeat:no-repeat;
	}
.chu_topMenu1 .kor {letter-spacing:-1px; font-size:11px; font-family: 돋움;}
.chu_topMenu1 .engkor {
	letter-spacing:0px;					/* 자간 설정 */
	font-family:tahoma;}				/* 폰트 종류
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
			<li>
			<a href="../main/main.jsp" class="engkor">
			<span>HOME</span>
			</a>
			</li>
		
		

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
</div>
<div id="banner" type="plugin" rel="px" relwidth="300px" relheight="270px" class="banner1">
<a href="../main/main.jsp" onfocus=this.blur(); target="_self"> 
<img src="../Image/79f4b5a7e3180e9ebfaa80df40913920.png" width="300" height="270" class="banner1_css" title="logo" alt="logo" >
</a>
</div>
<div id="dgc_textnavi" type="plugin" rel="px" relwidth="1180px" relheight="60px" class="dgc_textnavi1">
<style type="text/css">

img {border:0;}
a {text-decoration:none;}
#text_navi_warp_dgc_textnavi1 {position:absolute; z-index:999; *zoom:1;}
#text_navi_warp_dgc_textnavi1:after {content:""; clear:both; display:block;} 
#text_navi_warp_dgc_textnavi1 a {text-decoration:none;}
.glovalnavi_tx_dgc_textnavi1 {float:left; list-style:none; *zoom:1; 
					  margin-top:14px;	/* 대메뉴 위치 상단 */
					  margin-left:100px;	/* 대메뉴 위치 왼쪽 */
					  }
.glovalnavi_tx_dgc_textnavi1:after {content:""; clear:both; display:block;}

.glovalnavi_tx_dgc_textnavi1 li {float:left; text-align:center; position:relative; width:130px; margin-right:50px;		/* 대메뉴 간격 */}
.glovalnavi_tx_dgc_textnavi1 li a.alink1 {/* float:left; */padding:0 5px;  font-size:14px !important; letter-spacing:-1px; font-weight:bold;
						   color:#ffffff;					/* 대메뉴 텍스트 색상 - 평상시 */
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
											margin-top:20px;						 /* 대메뉴와 상하 간격 1-2 (1-1과 동일 적용) */
											left:-100000px;							  /* 소메뉴 시작위치 */
												display:none;
										   z-index:99999;
										   width:120px;		  /* 소메뉴 가로넓이 1-1 */
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
								 
								background:#d8d8d8;		/* 소메뉴 박스 색상 */
							   }

.glovalnavi_tx_dgc_textnavi1 .submenu ul li a { display:block !important; width:100%; 
	padding:0px 3px 0px 
	 
	10px
		!important;
}

.glovalnavi_tx_dgc_textnavi1 .submenu ul li h2  {margin:0; letter-spacing:-1px; font-size:11px; font-family:돋음;
												}	/* 소메뉴 점선 색상 */

.glovalnavi_tx_dgc_textnavi1 .submenu ul li h2 a { color:#333333;
font-weight:normal !important;
}					   /* 소메뉴 텍스트 색상 1-1 */
.glovalnavi_tx_dgc_textnavi1 .submenu ul li h2 a:hover {color:#000; background:#b4b4b4;}					 /* 소메뉴 오버시 텍스트 색상 1-1 */

.glovalnavi_tx_dgc_textnavi1 .submenu ul li a.alink2 {height:auto; padding:2px 0 7px 0; letter-spacing:-1px;
											font-size:11px; font-family:돋음; text-indent:0;
											padding-top:5px !important;
											text-align:left !important;
											 
											padding-left:30px !important;
																						color:#333333;	/* 소메뉴 텍스트 색상 1-2 (1-1과 동일 적용) */
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

<script type="text/javascript" src="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/dgc_textnavi/include/js/jquery.corner.js"></script>
<script>
	
	_menu = false;		   // 이전 메뉴 객체
	
	$(function(){
		
		var delay = 250;			 // animate 딜레이
		
		// 3차 아이콘 이미지 오버
		$(".alink2").hover(function(){
		   $(this).find("img").attr("src", "http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/dgc_textnavi/views/default/images/arrow.gif"); 
		}, function(){
		   $(this).find("img").attr("src", "http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/dgc_textnavi/views/default/images/arrow_over.gif"); 
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
			<a href="../menu02/gallery.jsp" class="alink1 ">갤러리</a>
						<div class="submenu ">
				<ul>
									<li><h2><a href="../menu02/gallery.jsp">포토갤러리</a></h2></li>
								  
							  
				</ul>
			</div>
						  
		</li>
			<li class="menu1">
			<a href="board01.jsp" class="alink1 active">커뮤니티</a>
						<div class="submenu active">
				<ul>
									<li><h2><a href="board01.jsp">공지사항</a></h2></li>
								  
									<li><h2><a href="./BoardList.bo2">예약문의</a></h2></li>
								  
									<li><h2><a href="board03.jsp">방문후기</a></h2></li>
								  
							  
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
</div></div></div><div id="ndcs_left" type="layout" rel="px" relwidth="200px" relheight="350px"><div id="dgc_leftmenu_1_0" type="plugin" rel="px" relwidth="190px" relheight="550px" class="dgc_leftmenu_1_01"><script type="text/javascript" src="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/dgc_leftmenu_1_0/include/js/dgc_leftmenu_1_0.js"></script>
<script type="text/javascript" src="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/dgc_leftmenu_1_0/include/js/jquery.accordionMenu.js"></script>

<style type="text/css">
@font-face {font-family:NanumGothic; src:url('http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/dgc_leftmenu_1_0/views/default/images/NanumGothic.eot');}

a {text-decoration:none;}

.gu_left_wrap {width:100%;}/*가로사이즈*/

/* 1뎁스 글꼴설정 */
.gu_left_title01 {margin-bottom:10px; font-family:Gulim,Arial; font-size:16px; font-weight:bold; color:#000000; line-height:50px; text-align:center; letter-spacing:-1px;}

.gu_left_accordion {list-style-type:none; padding:0; margin:0;}
.gu_left_accordion ul {padding:0; margin:0; width:100%; no-repeat 10px 10px;}
.gu_left_accordion li {width:100%; cursor:pointer; list-style-type:none; padding:0; margin:0;}
.gu_left_accordion ul li.active a { background: url('http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/dgc_leftmenu_1_0/views/default/images/minus.gif') no-repeat 10px 10px;}

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
				<img class="left_con1_01" src="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/dgc_leftmenu_1_0/views/default/images/plus.gif"><a href="board01.jsp" class="top-menu">공지사항</a>
				<ul class="left_con1_02">
									</ul>
			</li>
					<li class="left_2deth" id="13">
				<img class="left_con1_01" src="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/dgc_leftmenu_1_0/views/default/images/plus.gif"><a href="./BoardList.bo2" class="top-menu">예약문의</a>
				<ul class="left_con1_02">
									</ul>
			</li>
					<li class="left_2deth" id="44">
				<img class="left_con1_01" src="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/dgc_leftmenu_1_0/views/default/images/plus.gif"><a href="board03.jsp" class="top-menu">방문후기</a>
				<ul class="left_con1_02">
									</ul>
			</li>
			</ul>
	<div class="left_con1_space"></div>
	<!--베너 추가부분 시작-->
	<div class="gu_left_bn">
	<ul>
	<li>
	<img src="../Image/34fc3a79e9688783d824032844a28709.png" width="200" height="106">
	</li>	
	</ul>
	</div>
	<!--베너 추가부분 끝-->
</div>

<script type="text/javascript">
$(document).ready(function () {
	var imgPath = "http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/dgc_leftmenu_1_0/views/default/images/";
	$("#menuBase").accordion(13, 2, imgPath);
});
</script></div></div><div id="ndcs_container" type="layout" rel="px" relwidth="950px" relheight="550px"><div id="contents" type="plugin" rel="px" relwidth="950px" relheight="300px" class="contents"><script type="text/javascript" src="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/include/js/jquery.md5.js"></script>
<link href="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/board/views/default/css/board_comm.css" rel="stylesheet" type="text/css" />
<style type="text/css">
/* board view */
.boardViewFont { padding:5px 0; text-align:right; }

.boardViewInfo { float:left; width:100%; border-bottom:1px solid #DFDFDF; border-top:1px solid #DFDFDF; padding:7px 0;}
.boardViewInfo .titleSubject { width:100%; float:left; padding:2px 0 10px 0; font-weight:bold; font-size:14px; letter-spacing:-1px; line-height:140%; }
.boardViewInfo .titleSubject .viewcate01 { font-size:12px; font-weight:normal; letter-spacing:0; background:url('/plugins/board/views/default/images/icon_cate01.gif') no-repeat 0 1px; padding:3px 6px 3px 54px; }
.boardViewInfo .titleEtc { float:right; padding-top:2px; }
.boardViewInfo .num { font-size:11px; }
.boardViewInfo .sect {color:#dfdfdf; font-size:10px; margin:0 8px; }
.boardAuthor { float:left; width:100%; padding:10px 0 30px; 0; }
.boardAuthor .membersIcon { float:left;}
.boardAuthor .author { float:left; font-weight:bolder; }

.wContents { word-wrap:break-word; padding: 10px 0; }

.boardViewEtc a { color:#999999; }
.boardViewEtc .boardFiles { padding:5px 0; }
.boardViewEtc .boardFiles a:hover { text-decoration:underline }
.boardViewEtc .tag { padding:5px 0; color:#999999; }
.boardViewEtc .rss { padding:5px 0; color:#999999; }
.boardViewEtc .authorOrg { padding:5px 0; color:#999999; }
.boardViewEtc .dateOrg { padding:5px 0; color:#999999; }
.boardViewEtc .urlOrg { padding:5px 0; color:#999999; }

.boardViewEtc .recommend { width:100%; text-align:center; padding:10px; }


.boardComment { clear:both; border:1px solid #EDEDED; color:#666}
.boardComment .commentList {background-color:#F7F7F7; text-align:center; padding:5px 20px; }
.boardComment .commentList .commentRow { }
.boardComment .commentList .commentRow .commentTitle { float:left; width:100%; padding-top: 10px;}
.boardComment .commentList .commentRow .commentInfo { float:left; }
.boardComment .commentList .commentRow .commentContents { line-height:140%; clear:both; width:auto !important; overflow-y:auto;overflow-x:hidden;word-wrap:break-word; overflow:hidden; text-align:left; padding:5px 0; border-color:#DDDDDD !important; color:#4D4D4D;border-style:none none dotted; border-width:1px 0; vertical-align:top;}
.boardComment .commentList .commentRow .commentBtn { float:right;}

.boardComment .commentWrite { clear:both; background-color:#F7F7F7; padding:10px 20px;  text-align:center; }
.boardComment .commentWrite .commentAuthor { background-color:#F7F7F7; }
.boardComment .commentWrite .commentAuthor .cAuthorText { float:left; padding:3px 5px;}
.boardComment .commentWrite .commentAuthor .cAuthorInput { float:left;}
.boardComment .commentWrite .commentAuthor .cPasswordText { float:left; padding:3px 5px;}
.boardComment .commentWrite .commentAuthor .cAuthorInput { float:left;}
.boardComment .commentWrite .commentAuthor .cCodeText { float:left; padding:3px 5px;}
.boardComment .commentWrite .commentAuthor .cCodeImage { float:left; padding:0px 5px;}
.boardComment .commentWrite .commentAuthor .cCodeInput { float:left;}
.boardComment .commentWrite .commentAuthor .cCodeResult { float:left; padding:2px 5px;}

.boardComment .commentWrite .cWrite { background-color:#f7f7f7; }
.boardComment .commentWrite .cWrite .commentWContent { float:left; width:88%; }
.boardComment .commentWrite .cWrite .commentButton { text-align:right; }
.boardComment .commentWrite .cWrite .wcontent { width:100%; height:40px; border:1px solid #ccc; padding:4px 2px 2px 2px; margin: 0; font-size:12px; vertical-align:top; }
.boardComment .commentWrite .commentOption { text-align:left; padding:5px 0; }


.boardBottomList { clear:both; padding:10px 0; }
.boardBottomList .bottomPrevious { height:20px; padding-top:7px; border-top:1px solid #DFDFDF; border-bottom:1px solid #DFDFDF; }
.boardBottomList .bottomPrevious .or2 { padding:0 12px; height:30px; }
.boardBottomList .bottomNext { height:20px; padding-top:7px; border-bottom:1px solid #DFDFDF; }
.boardBottomList .bottomNext .or2 { padding:0 12px; height:30px; }

.board_content { float:left; width:100%; padding:10px 10px; }
.board_content .bl {margin:0 0 15px 0;}
.board_content .or2 {padding:0 0 0 12px; width:85%; height:30px; }
.board_content .wp1 {background-color:#f7f7f7; border-top:1px solid #dfdfdf; border-bottom:1px solid #dfdfdf; height:30px; padding:0 0 0 12px}
.board_content .wp1.end {border-right:none; padding:0 12px 0 0; font-size:11px;}
.board_content .sect {color:#dfdfdf; font-size:10px; margin:0 8px}
.board_content .wp2 {height:30px; padding:20px 12px; line-height:24px}
.board_img {text-align:center}

.user_captcha {font-family:"굴림", "돋움"; font-size:13px; color:BLUE; width:80px; height:16px; font-weight:bold; border:1px solid #ccc; padding-top:2px; text-transform:uppercase; }
.cCodeResult {color:RED;}

.board_control {margin:0 0 15px 0}
.board_control .pagelist {float:left; width:10%}
.board_control .pagenum {float:left; width:80%; *width:69%; text-align:center; font-family:Verdana, Geneva, sans-serif; font-size:10px}
.board_control .btn_left {float:left; width:10%; text-align:left; margin-top:-1px}
.board_control .btn_left a {text-decoration:none;}
.board_control .btn_left a:hover {color:#86a1c6}
.board_control .btn_right {float:right; width:10%; text-align:right; margin-top:-1px}
.board_control .btn_right a {text-decoration:none;}
.board_control .btn_right a:hover {color:#86a1c6}
.board_control .search {clear:left; text-align:center; padding:5px 0 0 0; *margin-top:-10px}

/* Viewbottom List 이전글다음글형 */
.boardBottomList .bottomPrevious .or1 {padding:0 40px; text-align:center; background:url(/plugins/board/views/default/images/pnvbg.gif) repeat-x; background-position:right; background-repeat:no-repeat}
.boardBottomList .bottomNext .or1 {padding:0 40px; text-align:center; background:url(/plugins/board/views/default/images/pnvbg.gif) repeat-x; background-position:right; background-repeat:no-repeat}

/* board list 목록형 */
.boardListInfo img, input { vertical-align:middle; }
.boardListInfo .boardListCategory { float:left; padding:5px 0; font-family:NanumGothic,Gulim; }
.boardListInfo .boardListCount { float:right; font-size:7.5pt; font-family:NanumGothic,Gulim; padding:5px 0; }
.boardList { clear:both; width:100%; }
.boardList th { font-weight:bold; padding:7px 0; border-color:#DFDFDF !important; border-top:1px solid #dfdfdf; border-bottom:1px solid #dfdfdf; }
.boardList td { line-height:normal; padding:9px 0; text-align:center; vertical-align:top; white-space:nowrap; border-color:#dfdfdf !important; border-bottom:1px dotted; }
.boardList .subject { text-align:left; padding-left:7px; }
.boardList .listCommentCount { color:#FF0000; font-size:11px; }

</style>



<div class="boardHeader">
</div>

<div class="boardBody">
<!-- 뷰 페이지 시작 -->
<!-- boardContents 시작 -->
	<div class="boardContents">
		<div class="boardViewInfo">
			<span class="titleSubject">
					<%=board.getBOARD_SUBJECT()%></span>
			<span class="titleEtc">

				<span class="sect">|</span>
				<span class="hitCount">조회&nbsp;<span class="num"><%=board.getBOARD_READCOUNT()%></span></span>

				
				<span class="sect">|</span>
				<span class="regDate"><span class="num"><%=board.getBOARD_DATE()%></span></span>

 

			</span>
		</div>
<!-- 게시물 기본 정보 끝 -->

<!-- 글쓴이,주소 표시 시작 -->
			<div class="boardAuthor">
				<span class="author">
		<%=board.getBOARD_NAME() %>	 &nbsp;
				</span>
			</div>
<!-- 글쓴이,주소 표시 끝 -->
<input type="hidden" id="board_passwd" name="board_passwd" value="c9c58362454b0125e86f2728564c3af2" />


<!-- 게시물 내용 출력 시작 -->
		<div class="wContents" id="wcontents">

<!-- 파일 업로드시 해당 파일이 파일업로드(에디터x) 일경우 컨텐츠 영역에 없을때 출력 시작 -->
<!-- 파일 업로드시 해당 파일이 파일업로드(에디터x) 일경우 컨텐츠 영역에 없을때 출력 시작 -->

			<!--글씨크기용-->
		<span id="chgsize" style='word-break:break-all;'>
		<%=board.getBOARD_CONTENT() %>
		</span>
		
		</div>
<!-- 게시물 내용 출력 끝 -->
<img src="../boardupload/<%=board.getBOARD_FILE() %>">

<!-- 기타 게시물 정보사항 시작 -->
		<div class="boardViewEtc">

<!-- 첨부파일 정보 시작 -->
<!-- 첨부파일 정보 끝 -->

<div class="recommend">
<!-- 추천 기능 시작 -->
 
<!-- 추천 기능 끝 -->
<!-- 신고 기능 시작 -->
 
<!-- 신고 기능 끝 -->
</div>
<!-- 태그 정보 시작 -->
<!-- 태그 정보 끝 -->

<!-- RSS정보 시작 -->
<!-- RSS정보 끝 -->

<!-- 원저작자 시작 -->
<!-- 원저작자 끝 -->

<!-- 원저작일 시작 -->
<!-- 원저작일 끝 -->

<!-- 원래글url 시작 -->
<!-- 원래글url 긑 -->
		</div>
<!-- 기타 게시물 정보사항 끝 -->


		<div class="boardControl" style="height:15px;">
			<div class="btnLeft">&nbsp;</div>
<!-- 버튼 출력 시작 -->
	    	<div class="btnRight">
	    	<a href="./BoardList.bo2" id="btn_list">
	    	<img src="../Image/board_listbtn.gif">
	    	</a>

				<a href="BoardModify.bo2?num=<%=board.getBOARD_NUM() %>" id="btn_modify"><img src="../Image/board_modifybtn.gif"></a>

				<a href="BoardDelete.bo2?num=<%=board.getBOARD_NUM() %>" id="btn_delete"  onclick="return confirm('삭제하시겠습니까?')"><img src="../Image/board_delete.gif"></a>

				<a href="BoardWrite.bo2?num=<%=board.getBOARD_NUM() %>" id="btn_write"><img src="../Image/board_wirtebtn.gif"></a>
			</div>
		</div>
<!-- 버튼 출력 시작 -->

<!-- 덧글 시작 -->
		<div class="boardComment">
<!-- 덧글 리스트 시작 -->	

		
			<div class="commentList">
				<div class="commentRow" id="row_num_1">
					<div class="commentTitle">
						<div class="commentInfo">
							<span class="bl"><%=board2.getBOARD2RE_NAME() %></span>

						</div>
						<div class="commentBtn">
						<%=board2.getBOARD2RE_DATE() %>
						</div>
					</div>
					<input type="hidden" id="commentC1" name="commentC1" value=" " />
					<input type="hidden" name="comment_passwd1" id="comment_passwd1" value="d41d8cd98f00b204e9800998ecf8427e">
					<div class="commentContents">
					<%=board2.getBOARD2RE_CONTENT() %>
					</div>
				</div>
			</div>
			
<!-- 덧글 리스트 끝 -->

<!-- 덧글쓰기 시작 -->
			<div class="commentWrite">
				
			<form name="add_comment" id="add_comment" method="post" action="BoardReplyAction.bo2?num=<%=num%>">
					<input type="hidden" name="contents_no" id="contents_no" value="199">
					<input type="hidden" name="page" id="page" value="1">
					<input type="hidden" name="h_comment_count" id="h_comment_count" value="1">
					<input type="hidden" name="comment_method" id="comment_method" value="insert">
					<input type="hidden" name="comment_modify_no" id="comment_modify_no" value="">
					<input type="hidden" name="capcha_word" value="TEZJSFNK">
				
				
				<div class="commentAuthor" style="height:26px;">
					<span class="cAuthorText">닉네임</span>
					<span class="cAuthorInput">
					<input type="text" name="BOARD2RE_NAME" class="gu_inp02" maxlength="30">
					</span>
				</div>
				
				<div class="cWrite">
					<div class="commentWContent">
						<textarea name="BOARD2RE_CONTENT" id="wcontent" class="wcontent" rows="3"></textarea>
					</div>
					<div Class="commentButton">
						<img id="add_comment_button" src="../Image/comment_writebtn.gif" style="cursor:pointer;">
					</div>
				</div>
				
				</form>
			</div>
		</div>
<!-- 덧글 끝 -->
	</div> 
<!-- boardContents 끝 -->


</div>

<div class="boardBottom">
       
</div>


<script>
// 댓글 삭제
function comment_delete(board_id,row_no,views_no){
	$(function(){
		$.ajax({
 			type: "POST",
 			url: "/board/action/delete",
 			data: {
 				"admin_id" : 'admin',
				"board_id" : board_id,
 				"row_no" : row_no,
 				"views_no" : views_no
 			},
 			success : function(data,status){
 				if(data == "1") {
 					$('#row_num_'+row_no).remove();
					var hh_val = Number($('#h_comment_count').val())-1;
					$('#h_comment_count').val(hh_val);
 				} else {
 					alert(data);
				}
 			}
		});
	});
}

$(document).ready(function(){
	$("#search_btn").click(function(){
		var sfl_val = $("select[name=sfl] option:selected").val();
        if($("#q").val() == ''){
			alert('검색어를 입력하세요');
			return false;
		} else {

			var act = '/community/board02/?method=lists&page=1&q='+$("#q").val()+'&sfl='+sfl_val;
			$("#bd_search").attr('action', act).submit();
    	}
	});

	// 게시물 이동
    $("#post_move_btn").click(function(){
    	var m_select = '';
    	var ss = "";
    	var to_table = $("select[name=move_table] option:selected").val();

    	if(to_table == ''){
    		alert('이동할 게시판을 선택하세요.');
    		return false;
    	} else {

    		$(":input:checkbox[id=select_nos]:checked").each(function() {
    			ss = $(this).val();
    			//alert(ss);
    			m_select += ss+"|";
    		});

    		$.ajax({
    			type:"POST",
    			url:"/board/action/post_move",
    			dataType:"text",
    			data:{
    				"table":"board02",
    				"admin_id":"admin",
    				"to_table":to_table,
    				"m_select":m_select
    			},
    			complete:function() {
    				alert('게시물이 이동되었습니다.');
    				location.reload();
    			}
    		});
    	}
    });

	
	// 덧글 수정
	$(".comment_modify_btn").click(function(){
		$("#comment_modify_no").val($(this).attr('rev'));
		$("#comment_method").val("modify");
		var comment_div = $(this).parent().parent().parent();

		//글쓴이 이름을 가져온다.
	 
			$("input:[name='nick_name']").val(comment_div.children(".commentTitle").children(".commentInfo").children(".bl").html());

		/* 개행 태그의 변환 */
		var BR = /<BR>/g;
		var br = /<br>/g;
		var comment = comment_div.children(".commentContents").html();
		comment= comment.replace(BR, '\n');
		comment= comment.replace(br, '\n');

		//글내용을 가져온다.
		$("#wcontent").val(comment);
	});

//비밀글 댓글확인
	$(".comment_passwd_ch").click(function(){
		var com_no = $("#comment_modify_no").val();
		if(com_no){
			var board_in_pwd = $("input:[name='board_passwd']").val();
			var com_pwd = $("#comment_passwd"+com_no).val();
			var com_in_pwd = $("input:[name='password']").val();
			var commentC = $("#commentC"+com_no).val();
			if(com_in_pwd){
				var passwd_md5= $.md5(com_in_pwd);
				if(passwd_md5==com_pwd || passwd_md5==board_in_pwd){
					$("#wcontent").val(commentC);
				}
			}else{
				alert("댓글 비밀번호를 입력해주세요.");
			}
		}else{
			alert("댓글 수정버튼을 클릭해주세요.");
		}
	});

 	// 덧글 추가
    $("#add_comment_button").click(function(){
        var textarea = $("#wcontent");
        var contents = textarea.val();

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
		if ($("input:[name='password']").val() == '') {
			alert('비밀번호를 입력하세요!');
			$("input:[name='password']").focus();
			return false;
		} else{
			var password = $("input:[name='password']").val();
		}

		

		
		if (contents == '') {
			alert('내용을 입력하세요!');
			textarea.focus();
			return false;
		} else {
			var h_val = $('#h_comment_count').val();
			
			if($('#comment_method').val() == 'modify'){
				var msg = confirm("덧글을 수정 하시겠습니까?");

				if(msg){
					$("#add_comment").attr('action','/community/board02/?method=comment_modify&no=199&comment_no=1&page=1');
					$("#add_comment").submit();
				}
			}else{
				var msg = confirm("덧글을 입력 하시겠습니까?");

				if(msg){
					$("#add_comment").submit();
				}
			}				
	 	}
	});

});


</script>
<script type="text/javascript" src="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/include/js/imageresize.js"></script> 
<script type="text/javascript">
$(window).bind('load', function () {
		var img_size = Number(700);
	var boardContentsSize = $(".boardViewInfo").width();
	
	if(img_size <= 100){
		img_size = (boardContentsSize * img_size)/100;
	}
	
	resizeBoardImage(img_size);
});
</script></div></div><div id="ndcs_foot" type="layout" rel="px" relwidth="1180px" relheight="80px"><div id="web_copyright_0" type="plugin" rel="px" relwidth="1080px" relheight="80px" class="web_copyright_01"><script type="text/javascript" src="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/web_copyright_0/include/js/dgc_default.js"></script>
<style type="text/css">
@font-face {font-family:NanumGothic; src:url('http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/web_copyright_0/views/default/images/NanumGothic.eot');}
</style>
<style type="text/css">

#chu_copy {*zoom: 1; font-size:11px;
	font-family:nanumgothic;		/* 폰트 종류 */
	}
#chu_copy:after {display: block; clear: both; content: "";}

.chu_copy_logo {float:left;}

.chu_copy_text {/*float:left;*/
	margin-top:10px;			/* 위치-상단 위치 */
	margin-left:30px;			/* 위치-왼쪽 위치 */
	color:#ffffff;					/* 텍스트 색상 */
	}

.chu_copy_text li {list-style:none;
	line-height:20px;			/* 행간 */
	letter-spacing:0px;		/* 자간 */
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
</div><div id="dgc_default" type="plugin" rel="px" relwidth="80px" relheight="80px" class="dgc_default1"><script type="text/javascript" src="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/dgc_default/include/js/dgc_default.js">
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
	<img src="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/dgc_default/include/images/nh_mark.png" alt='에스크로이체로 결제하기' border='0'style="width:75px; height:75px; margin-top:2px;"/>
</a> 

<!--농협 에스크로 이체 인증마크 적용 종료-->
<!-- 20141222 이은주 종료 -->
</div></div></div>
<script type="text/javascript">
<!--
jQuery(document).ready(function(){
	var fadeTime = parseInt($("#body").attr("fadetime")) * 1000;
	var changeTime = parseInt($("#body").attr("changetime")) * 1000;
	var changeBackgroundCount = 2;
	var changeBackgroundTid;

	function changeBackground(){
		var changeBackgroundDiv1 = $("#body");
		var changeBackgroundDiv2 = $("#body2");
		var changeBackgroundRel = $("#body").attr("rel");

		if(changeBackgroundDiv2.css("display") == "none")
		{
			changeBackgroundDiv2.attr("class","bodybackground" + changeBackgroundCount);
			changeBackgroundDiv1.fadeOut(fadeTime);
			changeBackgroundDiv2.fadeIn(fadeTime);
		}
		else
		{
			changeBackgroundDiv1.attr("class","bodybackground" + changeBackgroundCount);
			changeBackgroundDiv2.fadeOut(fadeTime);
			changeBackgroundDiv1.fadeIn(fadeTime);
		}
	
		if(changeBackgroundCount >= changeBackgroundRel) 
			changeBackgroundCount = 1;
		else
			changeBackgroundCount++;
	}

	// div중 id가 body가 있을경우
	if($("div").is("#body") && $("#body").attr("rel") != "" && parseInt($("#body").attr("rel")) > 1){
		changeBackgroundTid = setInterval(changeBackground, changeTime); //5초후 
	}

	// wrap div에 clear:both스타일을 가진 div를 추가(백그라운드를 본문내용에 맞게 출력하기 위함)
	$("#wrap").append("<div style=\"clear:both;\"></div>");
});
//-->
</script></body></html>