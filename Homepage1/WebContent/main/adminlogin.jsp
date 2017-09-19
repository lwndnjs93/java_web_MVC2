<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
   <head>
      <title>DangGunWeb 로그인</title>
      <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
      <style type="text/css">
      *{margin:0; padding:0; font-size:12px; line-height:normal; font-style:normal; font-family:"돋움", Dotum, "굴림", Gulim, AppleGothic, Sans-serif;}
      body {margin:0;}
      #admin_con {width:420px; height:185px; margin:20% auto; position:relative;}
      #admin_con #lbox {width:420px; height:192px; background-image:url(../Image/adlogin1.gif); background-repeat:no-repeat; overflow:hidden;}
      #admin_con #lbox .box {width:209px; height:46px; margin:100px 0 0 0px;}
      #admin_con #lbox .box .t_field {float:left; width:120px; height:46px;}
      #admin_con #lbox .box .i_btn {float:left; margin:0 0 0 4px;}
      #admin_con #lbox .box .input_text1{border:1px solid #b8b8b8; width:114px; height:14px; background:#f1f1f1; color:#444; margin-bottom:1px; padding:4px 2px 0 2px; font-size:11px; vertical-align:top;}
      #admin_con #lbox .box .input_text2{border:1px solid #b8b8b8; width:114px; height:14px; background:#f1f1f1; color:#444; margin-top:1px; padding:4px 2px 0 2px; font-size:11px; vertical-align:top;}
      #admin_con #lbox .copyright {width:420px; height:13px; text-align:center; padding:9px 0 0 0;}
      #admin_con #lbox .memory {width:209px; padding:0px; margin:0px; text-align:left; font-size:11px; }
      </style>
      <script type="text/javascript" src="http://www.xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/include/js/jquery.min.js"></script>
      <script type="text/javascript" src="http://www.xn--o79a21trqia095bdya41eyucq8bc06bhtg.kr/include/js/common.js"></script>
   </head>
   <body>
      <div id="admin_con" align="center">
         <div id="lbox">
            <form name="login_form" id="login_form" method="post" action="adminloginche.jsp">
            <div class="box">
               <div class="t_field">
                  <input name="ADMIN_ID" type="text" maxlength="25" class="input_text1" title="아이디" style="ime-mode:disabled" autofocus="autofocus" value="" />
                  <input name="ADMIN_PW" type="password" maxlength="16" class="input_text2" title="비밀번호" />
               </div>
               <div class="i_btn"><input type="image" name="imageField" id="imageField" src="../Image/adlogin.gif" href="javascript:loginform.submit()" /></div>
            </div>
            
            <div class="copyright">
               <a target="_blank" onfocus=this.blur()></a>
            </div>
         </form>
         </div>
      </div>
   </body>
</html>