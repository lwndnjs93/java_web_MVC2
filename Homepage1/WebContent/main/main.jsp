<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String id = null;
	if (session.getAttribute("ADMIN_ID") != null) {
		id = (String) session.getAttribute("ADMIN_ID");
	}
%>
<html lang="ko">
<head>
<link href="http://fonts.googleapis.com/earlyaccess/nanumgothic.css" rel="stylesheet" type="text/css">
<link href="http://fonts.googleapis.com/earlyaccess/nanummyeongjo.css" rel="stylesheet" type="text/css">
<link href="http://fonts.googleapis.com/earlyaccess/nanumbrushscript.css" rel="stylesheet" type="text/css">
<link href="http://fonts.googleapis.com/earlyaccess/nanumpenscript.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="../main_css/font-awesome.min.css">
<!--[if IE 7]>
  <link rel="stylesheet" href="/include/font-awesome/css/font-awesome-ie7.min.css">
<![endif]-->
<title>오렌지게스트하우스</title><meta name="Title" content="오렌지게스트하우스">
<meta name= "viewport"content="user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, width=device-width" />
<meta name="format-detection" content="telephone=no" />
<meta content="IE=EmulateIE8" http-equiv="X-UA-Compatible">
<meta property="og:title" content="오렌지게스트하우스" />
<meta property="og:description" content="" />
<meta property="og:image" content="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/images/sns_img.jpg" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="../main_css/jquery-ui.custom.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../main_js/jquery.min.js"></script>
<script type="text/javascript"  src="../main_js/jquery-ui.custom.min.js"></script>
<script type="text/javascript"  src="../main_js/jquery.framedialog.js"></script>
<script type="text/javascript" src="../main_js/jquery.jScale.js"></script>
<script type="text/javascript" src="../main_js/jquery.cookie.js"></script>
<script type="text/javascript" src="../main_js/common.js"></script>
</head>
<body class="user">
<link href="../main_css/background.css" rel="stylesheet" type="text/css" />
<link href="../main_css/index.css" rel="stylesheet" type="text/css" />
<div id="body" type="background" rel="3" changetime="5" fadetime="2" style="overflow: hidden;" class="bodybackground1"></div><div type="none" id="body2" style="overflow: hidden; display:none;" class="bodybackground2"></div><div id="wrap" type="layout" rel="px" relwidth="1180px" relheight="1394px"><div id="ndcm_top" type="layout" rel="px" relwidth="1180px" relheight="360px"><div id="dgc_topMenu_1_0" type="plugin" rel="px" relwidth="1180px" relheight="20px" class="dgc_topMenu_1_01"><script type="text/javascript" src="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/dgc_topMenu_1_0/include/js/dgc_topMenu_1_0.js"></script>


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
			<li><a href="main.jsp" class="engkor"><span>HOME</span></a></li>
		
		

	<!-- 추가등록1 -->
		<!-- 추가등록2 -->
		<!-- 추가등록3 -->
		<!-- 추가등록4 -->
		<!-- 관리자(회원제 비회원제 모두 노출) -->
			<li class="chu_top_space1">&nbsp;</li>
		<li><a href="adminlogin.jsp" target="_blank" class="engkor"><span>ADMIN</span></a></li>
			

	<!-- 즐겨찾기 -->
	
	<!-- 시작페이지 -->
	</ul>
</div>
</div>
<div id="banner" type="plugin" rel="px" relwidth="300px" relheight="270px" class="banner1">
<a href="main.jsp" onfocus=this.blur(); target="_self"> 
<img src="../Image/20234e075ca6e2b061f8c606d677ade5.png" width="300" height="270" class="banner1_css" title="logo" alt="logo" >
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
			
			
		<%if(id!=null && id.equals("ADMIN")){ %>
		<li class="admin">
			<a href="./ReserlistAction.rs" class="alink1 ">예약현황(ADMIN)</a>			
		</li>
		<%} %>
		
		<%if(id==null){ %>	
		<li class="menu1">
			<a href="../introduction/introduction01.jsp" class="alink1 ">오렌지게스트하우스</a>
						<div class="submenu ">
				<ul>
									<li><h2><a href="/introduction/introduction01">인사말</a></h2></li>
								  
									<li><h2><a href="/introduction/map01">오시는길</a></h2></li>		  
				</ul>
			</div>			  
		</li>
		<%} %>
		
			<li class="menu1">
			<a href="../product/service.jsp" class="alink1 ">이용안내</a>
						<div class="submenu ">
				<ul>
									<li><h2><a href="../product/service.jsp">이용안내</a></h2></li>
								  
							  
				</ul>
			</div>
						  
		</li>
			<li class="menu1">
			<a href="../album/pomegranate.jsp" class="alink1 ">객실둘러보기</a>
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
			<a href="./BoardList1.bo1?id=<%=id %>" class="alink1 ">커뮤니티</a>
						<div class="submenu ">
				<ul>
									<li><h2><a href="../community1/board021.jsp">공지사항</a></h2></li>
								  	
									<li><h2><a href="../community/board02.jsp">예약문의</a></h2></li>
								  	
									<li><h2><a href="../community3/board023.jsp">방문후기</a></h2></li>
				</ul>
			</div>
		</li>
		
		
		
		
		</ul>
	</div>
	</div>
	</div>
	<div id="ndcm_con_a" type="layout" rel="px" relwidth="1180px" relheight="294px">
	<div id="dgc_rolloverbanner_1_0" type="plugin" rel="px" relwidth="294px" relheight="294px" class="dgc_rolloverbanner_1_01">
	<script type="text/javascript" src="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/dgc_rolloverbanner_1_0/include/js/dgc_default.js">
	</script>
<script type="text/javascript">
$(document).ready(function () {
	
	var colour_dgc_rolloverbanner_1_01 = $(".overlay_dgc_rolloverbanner_1_01 ");
	var content_dgc_rolloverbanner_1_01 = $(".hover_dgc_rolloverbanner_1_01 ");
		
	content_dgc_rolloverbanner_1_01.hide();
	//colour.hide();	
		
	$(".overbnwrap_dgc_rolloverbanner_1_01 ").hover(function() {
		//20131205 김근수 시작
		
				//colour_dgc_rolloverbanner_1_01.stop().fadeTo(200, 0) //보여지는 이미지 투명도 낮추기
		content_dgc_rolloverbanner_1_01.stop().fadeTo(200, 1) //숨겨있던 이미지 투명도 높이기
				//20131205 김근수 종료
	}
	,function() {
		//20131205 김근수
						content_dgc_rolloverbanner_1_01.stop().fadeTo(200, 0) //보여지는 이미지 투명도 낮추기
		//colour_dgc_rolloverbanner_1_01.stop().fadeTo(200, 1) //숨겨있던 이미지 투명도 높이기
				//20131205 김근수 종료
	});
	
});
</script>

<style type="text/css">

.rolloverbanner_warp_dgc_rolloverbanner_1_01 {*zoom:1;
	width:294;/* 레이아웃 가로 사이즈 */;
	height:294;/* 레이아웃 세로 사이즈 */;
	}
.rolloverbanner_warp_dgc_rolloverbanner_1_01:after {display:block; clear:both; content:""; }
.rolloverbanner_warp_dgc_rolloverbanner_1_01 img {border:0;}
.rolloverbanner_warp_dgc_rolloverbanner_1_01 ul {}

.rolloverbanner_warp_dgc_rolloverbanner_1_01 ul {position:relative; overflow:hidden; z-index:0; margin:0; padding:0;}
.overlay_dgc_rolloverbanner_1_01{position:relative; left:0; top:0;}
.hover_dgc_rolloverbanner_1_01{display:none; position:absolute; z-index:3; left:0; top:0;}
</style> 

<div class="rolloverbanner_warp_dgc_rolloverbanner_1_01">
		<ul class="overbnwrap_dgc_rolloverbanner_1_01">
							<li class="overlay_dgc_rolloverbanner_1_01"><a href="../introduction/introduction01.jsp" target="_self"><img src="../Image/28482320743d4c3ab0138cc438c1de16.png" width="294" height="294" ></a></li>
				<li class="hover_dgc_rolloverbanner_1_01"><a href="/introduction/introduction01" target="_self"><img src="../Image/cbe5aadeeb36b0152013756f7716a56d.png" width="294" height="294"></a></li>
					</ul>
</div>
</div><div id="dgc_rolloverbanner_1_0" type="plugin" rel="px" relwidth="294px" relheight="294px" class="dgc_rolloverbanner_1_02"><script type="text/javascript" src="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/dgc_rolloverbanner_1_0/include/js/dgc_default.js"></script>
<script type="text/javascript">
$(document).ready(function () {
	
	var colour_dgc_rolloverbanner_1_02 = $(".overlay_dgc_rolloverbanner_1_02 ");
	var content_dgc_rolloverbanner_1_02 = $(".hover_dgc_rolloverbanner_1_02 ");
		
	content_dgc_rolloverbanner_1_02.hide();
	//colour.hide();	
		
	$(".overbnwrap_dgc_rolloverbanner_1_02 ").hover(function() {
		//20131205 김근수 시작
		
				//colour_dgc_rolloverbanner_1_02.stop().fadeTo(200, 0) //보여지는 이미지 투명도 낮추기
		content_dgc_rolloverbanner_1_02.stop().fadeTo(200, 1) //숨겨있던 이미지 투명도 높이기
				//20131205 김근수 종료
	}
	,function() {
		//20131205 김근수
						content_dgc_rolloverbanner_1_02.stop().fadeTo(200, 0) //보여지는 이미지 투명도 낮추기
		//colour_dgc_rolloverbanner_1_02.stop().fadeTo(200, 1) //숨겨있던 이미지 투명도 높이기
				//20131205 김근수 종료
	});
	
});
</script>

<style type="text/css">

.rolloverbanner_warp_dgc_rolloverbanner_1_02 {*zoom:1;
	width:294;/* 레이아웃 가로 사이즈 */;
	height:294;/* 레이아웃 세로 사이즈 */;
	}
.rolloverbanner_warp_dgc_rolloverbanner_1_02:after {display:block; clear:both; content:""; }
.rolloverbanner_warp_dgc_rolloverbanner_1_02 img {border:0;}
.rolloverbanner_warp_dgc_rolloverbanner_1_02 ul {}

.rolloverbanner_warp_dgc_rolloverbanner_1_02 ul {position:relative; overflow:hidden; z-index:0; margin:0; padding:0;}
.overlay_dgc_rolloverbanner_1_02{position:relative; left:0; top:0;}
.hover_dgc_rolloverbanner_1_02{display:none; position:absolute; z-index:3; left:0; top:0;}
</style> 

<div class="rolloverbanner_warp_dgc_rolloverbanner_1_02">
		<ul class="overbnwrap_dgc_rolloverbanner_1_02">
							<li class="overlay_dgc_rolloverbanner_1_02"><a href="../product/service.jsp" target="_self"><img src="../Image/99e793353a840f94badd07223ebd9f98.png" width="294" height="294" ></a></li>
				<li class="hover_dgc_rolloverbanner_1_02"><a href="/product/product01" target="_self"><img src="../Image/4e7c7bd6f357a232de10ce8cdd8418c3.png" width="294" height="294"></a></li>
					</ul>
</div>
</div><div id="dgc_rolloverbanner_1_0" type="plugin" rel="px" relwidth="294px" relheight="294px" class="dgc_rolloverbanner_1_03"><script type="text/javascript" src="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/dgc_rolloverbanner_1_0/include/js/dgc_default.js"></script>
<script type="text/javascript">
$(document).ready(function () {
	
	var colour_dgc_rolloverbanner_1_03 = $(".overlay_dgc_rolloverbanner_1_03 ");
	var content_dgc_rolloverbanner_1_03 = $(".hover_dgc_rolloverbanner_1_03 ");
		
	content_dgc_rolloverbanner_1_03.hide();
	//colour.hide();	
		
	$(".overbnwrap_dgc_rolloverbanner_1_03 ").hover(function() {
		//20131205 김근수 시작
		
				//colour_dgc_rolloverbanner_1_03.stop().fadeTo(200, 0) //보여지는 이미지 투명도 낮추기
		content_dgc_rolloverbanner_1_03.stop().fadeTo(200, 1) //숨겨있던 이미지 투명도 높이기
				//20131205 김근수 종료
	}
	,function() {
		//20131205 김근수
						content_dgc_rolloverbanner_1_03.stop().fadeTo(200, 0) //보여지는 이미지 투명도 낮추기
		//colour_dgc_rolloverbanner_1_03.stop().fadeTo(200, 1) //숨겨있던 이미지 투명도 높이기
				//20131205 김근수 종료
	});
	
});
</script>

<style type="text/css">

.rolloverbanner_warp_dgc_rolloverbanner_1_03 {*zoom:1;
	width:294;/* 레이아웃 가로 사이즈 */;
	height:294;/* 레이아웃 세로 사이즈 */;
	}
.rolloverbanner_warp_dgc_rolloverbanner_1_03:after {display:block; clear:both; content:""; }
.rolloverbanner_warp_dgc_rolloverbanner_1_03 img {border:0;}
.rolloverbanner_warp_dgc_rolloverbanner_1_03 ul {}

.rolloverbanner_warp_dgc_rolloverbanner_1_03 ul {position:relative; overflow:hidden; z-index:0; margin:0; padding:0;}
.overlay_dgc_rolloverbanner_1_03{position:relative; left:0; top:0;}
.hover_dgc_rolloverbanner_1_03{display:none; position:absolute; z-index:3; left:0; top:0;}
</style> 

<div class="rolloverbanner_warp_dgc_rolloverbanner_1_03">
		<ul class="overbnwrap_dgc_rolloverbanner_1_03">
							<li class="overlay_dgc_rolloverbanner_1_03"><a href="../menu01/menu01_1.jsp" target="_self"><img src="../Image/dc23c5b522338e7da808d6a1efc9e2b5.png" width="294" height="294" ></a></li>
				<li class="hover_dgc_rolloverbanner_1_03"><a href="/menu01/menu01_1" target="_self"><img src="../Image/e632750302e64e1214aa2570ea69d786.png" width="294" height="294"></a></li>
					</ul>
</div>
</div><div id="dgc_rolloverbanner_1_0" type="plugin" rel="px" relwidth="294px" relheight="294px" class="dgc_rolloverbanner_1_04"><script type="text/javascript" src="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/dgc_rolloverbanner_1_0/include/js/dgc_default.js"></script>
<script type="text/javascript">
$(document).ready(function () {
	
	var colour_dgc_rolloverbanner_1_04 = $(".overlay_dgc_rolloverbanner_1_04 ");
	var content_dgc_rolloverbanner_1_04 = $(".hover_dgc_rolloverbanner_1_04 ");
		
	content_dgc_rolloverbanner_1_04.hide();
	//colour.hide();	
		
	$(".overbnwrap_dgc_rolloverbanner_1_04 ").hover(function() {
		//20131205 김근수 시작
		
				//colour_dgc_rolloverbanner_1_04.stop().fadeTo(200, 0) //보여지는 이미지 투명도 낮추기
		content_dgc_rolloverbanner_1_04.stop().fadeTo(200, 1) //숨겨있던 이미지 투명도 높이기
				//20131205 김근수 종료
	}
	,function() {
		//20131205 김근수
						content_dgc_rolloverbanner_1_04.stop().fadeTo(200, 0) //보여지는 이미지 투명도 낮추기
		//colour_dgc_rolloverbanner_1_04.stop().fadeTo(200, 1) //숨겨있던 이미지 투명도 높이기
				//20131205 김근수 종료
	});
	
});
</script>

<style type="text/css">

.rolloverbanner_warp_dgc_rolloverbanner_1_04 {*zoom:1;
	width:294;/* 레이아웃 가로 사이즈 */;
	height:294;/* 레이아웃 세로 사이즈 */;
	}
.rolloverbanner_warp_dgc_rolloverbanner_1_04:after {display:block; clear:both; content:""; }
.rolloverbanner_warp_dgc_rolloverbanner_1_04 img {border:0;}
.rolloverbanner_warp_dgc_rolloverbanner_1_04 ul {}

.rolloverbanner_warp_dgc_rolloverbanner_1_04 ul {position:relative; overflow:hidden; z-index:0; margin:0; padding:0;}
.overlay_dgc_rolloverbanner_1_04{position:relative; left:0; top:0;}
.hover_dgc_rolloverbanner_1_04{display:none; position:absolute; z-index:3; left:0; top:0;}
</style> 

<div class="rolloverbanner_warp_dgc_rolloverbanner_1_04">
		<ul class="overbnwrap_dgc_rolloverbanner_1_04">
							<li class="overlay_dgc_rolloverbanner_1_04"><a href="../community/board02.jsp" target="_self"><img src="../Image/0bbc5a157ccb107524217a654d3c9a57.png" width="294" height="294" ></a></li>
				<li class="hover_dgc_rolloverbanner_1_04"><a href="/community/board02" target="_self"><img src="../Image/70daa5b105a12f05654c89f87bed3de0.png" width="294" height="294"></a></li>
					</ul>
</div>
</div></div><div id="ndcm_con_b" type="layout" rel="px" relwidth="1180px" relheight="294px"><div id="dgc_rolloverbanner_1_0" type="plugin" rel="px" relwidth="294px" relheight="294px" class="dgc_rolloverbanner_1_05"><script type="text/javascript" src="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/dgc_rolloverbanner_1_0/include/js/dgc_default.js"></script>
<script type="text/javascript">
$(document).ready(function () {
	
	var colour_dgc_rolloverbanner_1_05 = $(".overlay_dgc_rolloverbanner_1_05 ");
	var content_dgc_rolloverbanner_1_05 = $(".hover_dgc_rolloverbanner_1_05 ");
		
	content_dgc_rolloverbanner_1_05.hide();
	//colour.hide();	
		
	$(".overbnwrap_dgc_rolloverbanner_1_05 ").hover(function() {
		//20131205 김근수 시작
		
				//colour_dgc_rolloverbanner_1_05.stop().fadeTo(200, 0) //보여지는 이미지 투명도 낮추기
		content_dgc_rolloverbanner_1_05.stop().fadeTo(200, 1) //숨겨있던 이미지 투명도 높이기
				//20131205 김근수 종료
	}
	,function() {
		//20131205 김근수
						content_dgc_rolloverbanner_1_05.stop().fadeTo(200, 0) //보여지는 이미지 투명도 낮추기
		//colour_dgc_rolloverbanner_1_05.stop().fadeTo(200, 1) //숨겨있던 이미지 투명도 높이기
				//20131205 김근수 종료
	});
	
});
</script>

<style type="text/css">

.rolloverbanner_warp_dgc_rolloverbanner_1_05 {*zoom:1;
	width:294;/* 레이아웃 가로 사이즈 */;
	height:294;/* 레이아웃 세로 사이즈 */;
	}
.rolloverbanner_warp_dgc_rolloverbanner_1_05:after {display:block; clear:both; content:""; }
.rolloverbanner_warp_dgc_rolloverbanner_1_05 img {border:0;}
.rolloverbanner_warp_dgc_rolloverbanner_1_05 ul {}

.rolloverbanner_warp_dgc_rolloverbanner_1_05 ul {position:relative; overflow:hidden; z-index:0; margin:0; padding:0;}
.overlay_dgc_rolloverbanner_1_05{position:relative; left:0; top:0;}
.hover_dgc_rolloverbanner_1_05{display:none; position:absolute; z-index:3; left:0; top:0;}
</style> 

<div class="rolloverbanner_warp_dgc_rolloverbanner_1_05">
		<ul class="overbnwrap_dgc_rolloverbanner_1_05">
							<li class="overlay_dgc_rolloverbanner_1_05"><a href="../album/pomegranate.jsp" target="_self"><img src="../Image/0c399e6eacb9633e817b1e49412a4a21.png" width="294" height="294" ></a></li>
				<li class="hover_dgc_rolloverbanner_1_05"><a href="/album/album01_1" target="_self"><img src="../Image/bfdf80739fa8686c44daef16a3c74bf2.png" width="294" height="294"></a></li>
					</ul>
</div>
</div><div id="dgc_rolloverbanner_1_0" type="plugin" rel="px" relwidth="294px" relheight="294px" class="dgc_rolloverbanner_1_06"><script type="text/javascript" src="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/dgc_rolloverbanner_1_0/include/js/dgc_default.js"></script>
<script type="text/javascript">
$(document).ready(function () {
	
	var colour_dgc_rolloverbanner_1_06 = $(".overlay_dgc_rolloverbanner_1_06 ");
	var content_dgc_rolloverbanner_1_06 = $(".hover_dgc_rolloverbanner_1_06 ");
		
	content_dgc_rolloverbanner_1_06.hide();
	//colour.hide();	
		
	$(".overbnwrap_dgc_rolloverbanner_1_06 ").hover(function() {
		//20131205 김근수 시작
		
				//colour_dgc_rolloverbanner_1_06.stop().fadeTo(200, 0) //보여지는 이미지 투명도 낮추기
		content_dgc_rolloverbanner_1_06.stop().fadeTo(200, 1) //숨겨있던 이미지 투명도 높이기
				//20131205 김근수 종료
	}
	,function() {
		//20131205 김근수
						content_dgc_rolloverbanner_1_06.stop().fadeTo(200, 0) //보여지는 이미지 투명도 낮추기
		//colour_dgc_rolloverbanner_1_06.stop().fadeTo(200, 1) //숨겨있던 이미지 투명도 높이기
				//20131205 김근수 종료
	});
	
});
</script>

<style type="text/css">

.rolloverbanner_warp_dgc_rolloverbanner_1_06 {*zoom:1;
	width:294;/* 레이아웃 가로 사이즈 */;
	height:294;/* 레이아웃 세로 사이즈 */;
	}
.rolloverbanner_warp_dgc_rolloverbanner_1_06:after {display:block; clear:both; content:""; }
.rolloverbanner_warp_dgc_rolloverbanner_1_06 img {border:0;}
.rolloverbanner_warp_dgc_rolloverbanner_1_06 ul {}

.rolloverbanner_warp_dgc_rolloverbanner_1_06 ul {position:relative; overflow:hidden; z-index:0; margin:0; padding:0;}
.overlay_dgc_rolloverbanner_1_06{position:relative; left:0; top:0;}
.hover_dgc_rolloverbanner_1_06{display:none; position:absolute; z-index:3; left:0; top:0;}
</style> 

<div class="rolloverbanner_warp_dgc_rolloverbanner_1_06">
		<ul class="overbnwrap_dgc_rolloverbanner_1_06">
							<li class="overlay_dgc_rolloverbanner_1_06"><a href="../album/panorama.jsp" target="_self"><img src="../Image/926fac0716b9a4bc0968f2516a399210.png" width="294" height="294" ></a></li>
				<li class="hover_dgc_rolloverbanner_1_06"><a href="/album/album02" target="_self"><img src="../Image/1ecd4e157fb6273e06632034b8596ae6.png" width="294" height="294"></a></li>
					</ul>
</div>
</div><div id="dgc_rolloverbanner_1_0" type="plugin" rel="px" relwidth="294px" relheight="294px" class="dgc_rolloverbanner_1_07"><script type="text/javascript" src="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/dgc_rolloverbanner_1_0/include/js/dgc_default.js"></script>
<script type="text/javascript">
$(document).ready(function () {
	
	var colour_dgc_rolloverbanner_1_07 = $(".overlay_dgc_rolloverbanner_1_07 ");
	var content_dgc_rolloverbanner_1_07 = $(".hover_dgc_rolloverbanner_1_07 ");
		
	content_dgc_rolloverbanner_1_07.hide();
	//colour.hide();	
		
	$(".overbnwrap_dgc_rolloverbanner_1_07 ").hover(function() {
		//20131205 김근수 시작
		
				//colour_dgc_rolloverbanner_1_07.stop().fadeTo(200, 0) //보여지는 이미지 투명도 낮추기
		content_dgc_rolloverbanner_1_07.stop().fadeTo(200, 1) //숨겨있던 이미지 투명도 높이기
				//20131205 김근수 종료
	}
	,function() {
		//20131205 김근수
						content_dgc_rolloverbanner_1_07.stop().fadeTo(200, 0) //보여지는 이미지 투명도 낮추기
		//colour_dgc_rolloverbanner_1_07.stop().fadeTo(200, 1) //숨겨있던 이미지 투명도 높이기
				//20131205 김근수 종료
	});
	
});
</script>

<style type="text/css">

.rolloverbanner_warp_dgc_rolloverbanner_1_07 {*zoom:1;
	width:294;/* 레이아웃 가로 사이즈 */;
	height:294;/* 레이아웃 세로 사이즈 */;
	}
.rolloverbanner_warp_dgc_rolloverbanner_1_07:after {display:block; clear:both; content:""; }
.rolloverbanner_warp_dgc_rolloverbanner_1_07 img {border:0;}
.rolloverbanner_warp_dgc_rolloverbanner_1_07 ul {}

.rolloverbanner_warp_dgc_rolloverbanner_1_07 ul {position:relative; overflow:hidden; z-index:0; margin:0; padding:0;}
.overlay_dgc_rolloverbanner_1_07{position:relative; left:0; top:0;}
.hover_dgc_rolloverbanner_1_07{display:none; position:absolute; z-index:3; left:0; top:0;}
</style> 

<div class="rolloverbanner_warp_dgc_rolloverbanner_1_07">
		<ul class="overbnwrap_dgc_rolloverbanner_1_07">
				<li class="overlay_dgc_rolloverbanner_1_07">
				<a href="../community/board03.jsp" target="_self">
				<img src="../Image/146b1fb1a9eab15275867a3c6aa155ab.png" width="294" height="294" >
				</a>
				</li>
				<li class="hover_dgc_rolloverbanner_1_07">
				<a href="../community/board03.jsp" target="_self">
				<img src="../Image/02a165ae35fac9f739090314f0307816.png" width="294" height="294">
				</a>
				</li>
				</ul>
</div>
</div><div id="dgc_rolloverbanner_1_0" type="plugin" rel="px" relwidth="294px" relheight="294px" class="dgc_rolloverbanner_1_08"><script type="text/javascript" src="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/dgc_rolloverbanner_1_0/include/js/dgc_default.js"></script>
<script type="text/javascript">
$(document).ready(function () {
	
	var colour_dgc_rolloverbanner_1_08 = $(".overlay_dgc_rolloverbanner_1_08 ");
	var content_dgc_rolloverbanner_1_08 = $(".hover_dgc_rolloverbanner_1_08 ");
		
	content_dgc_rolloverbanner_1_08.hide();
	//colour.hide();	
		
	$(".overbnwrap_dgc_rolloverbanner_1_08 ").hover(function() {
		//20131205 김근수 시작
		
				//colour_dgc_rolloverbanner_1_08.stop().fadeTo(200, 0) //보여지는 이미지 투명도 낮추기
		content_dgc_rolloverbanner_1_08.stop().fadeTo(200, 1) //숨겨있던 이미지 투명도 높이기
				//20131205 김근수 종료
	}
	,function() {
		//20131205 김근수
						content_dgc_rolloverbanner_1_08.stop().fadeTo(200, 0) //보여지는 이미지 투명도 낮추기
		//colour_dgc_rolloverbanner_1_08.stop().fadeTo(200, 1) //숨겨있던 이미지 투명도 높이기
				//20131205 김근수 종료
	});
	
});
</script>

<style type="text/css">

.rolloverbanner_warp_dgc_rolloverbanner_1_08 {*zoom:1;
	width:294;/* 레이아웃 가로 사이즈 */;
	height:294;/* 레이아웃 세로 사이즈 */;
	}
.rolloverbanner_warp_dgc_rolloverbanner_1_08:after {display:block; clear:both; content:""; }
.rolloverbanner_warp_dgc_rolloverbanner_1_08 img {border:0;}
.rolloverbanner_warp_dgc_rolloverbanner_1_08 ul {}

.rolloverbanner_warp_dgc_rolloverbanner_1_08 ul {position:relative; overflow:hidden; z-index:0; margin:0; padding:0;}
.overlay_dgc_rolloverbanner_1_08{position:relative; left:0; top:0;}
.hover_dgc_rolloverbanner_1_08{display:none; position:absolute; z-index:3; left:0; top:0;}
</style> 

<div class="rolloverbanner_warp_dgc_rolloverbanner_1_08">
		<ul class="overbnwrap_dgc_rolloverbanner_1_08">
							<li class="overlay_dgc_rolloverbanner_1_08"><a href="../introduction/map01.jsp" target="_self"><img src="../Image/f1e1ab0853109b52e3353b40bdb5dfad.png" width="294" height="294" ></a></li>
				<li class="hover_dgc_rolloverbanner_1_08"><a href="/introduction/map01" target="_self"><img src="../Image/4bd2e30479b97cc38754c714b8cfbbad.png" width="294" height="294"></a></li>
					</ul>
</div>
</div></div><div id="ndcm_con_c" type="layout" rel="px" relwidth="1180px" relheight="176px"><div id="banner" type="plugin" rel="px" relwidth="300px" relheight="176px" class="banner2"><img src="../Image/bf4c888df2a311cedab8109b1020ff32.png" width="300" height="176" class="banner2_css" title="고객센터" alt="고객센터" ></div></div><div id="ndcm_foot" type="layout" rel="px" relwidth="1180px" relheight="80px"><div id="web_copyright_0" type="plugin" rel="px" relwidth="1080px" relheight="80px" class="web_copyright_01"><script type="text/javascript" src="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/web_copyright_0/include/js/dgc_default.js"></script>
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
</div><div id="dgc_default" type="plugin" rel="px" relwidth="100px" relheight="80px" class="dgc_default1"><script type="text/javascript" src="http://xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/plugins/dgc_default/include/js/dgc_default.js">
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