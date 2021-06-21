<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <c:set var="contextPath" value="<%=request.getContextPath()%>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<!-- Favicon-->
    <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
    <!-- Bootstrap icons-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="${contextPath }/resources/css/styles.css" rel="stylesheet" />
    
</head>
<body>
	
    <c:import url="../header.jsp"/>
    
    <div class="orderInfo">
 		<form role="form" method="post" autocomplete="off">
 			<input type="hidden" name="amount" value="${sum}" />
    
    		<div class="inputArea">
   				<label for="">수령인</label>
			    <input type="text" name="orderRec" id="orderRec" required="required" />
			</div>
  
  			<div class="inputArea">
		    	<label for="orderPhon">수령인 연락처</label>
		    	<input type="text" name="orderPhon" id="orderPhon" required="required" />
            </div>
  
  			<div class="inputArea">
		    	<label for="userAddr1">우편번호</label>
   				<input type="text" name="userAddr1" id="userAddr1" required="required" />
  			</div>
  
  			<div class="inputArea">
   				<label for="userAddr2">1차 주소</label>
   				<input type="text" name="userAddr2" id="userAddr2" required="required" />
  			</div>
  
  			<div class="inputArea">
   				<label for="userAddr3">2차 주소</label>
   				<input type="text" name="userAddr3" id="userAddr3" required="required" />
  			</div>
  
  			<div class="inputArea">
   				<button type="submit" class="order_btn">주문</button>
   				<button type="button" class="cancel_btn">취소</button> 
  			</div>
  
 		</form> 	
	</div>
    
	<c:import url="../footer.jsp"/>
    
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/jquery.js"></script>
		<script src="js/smooth-scroll.polyfills.min.js"></script>
		<script src="js/script.js"></script>
		<script>
        	var scroll = new SmoothScroll('a[href*="#"]');
    	</script>
    	   	
    	
    </body>
</html>
