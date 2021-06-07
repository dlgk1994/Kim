<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Favicon-->
<link rel="icon" type="image/x-icon" href="assets/favicon.ico" />

<!-- Bootstrap icons-->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css"
	rel="stylesheet" />

<!-- Core theme CSS (includes Bootstrap)-->
<link href="css/styles.css" rel="stylesheet" />
<style type="text/css">
	section#container { padding: 20px 0; border-top: 2px solid #eee; border-bottom: 2px solid #eee; }
 	section#container::after { content: ""; display: block; clear: both; }
	aside { float: left; width: 200px; padding: 0 0 0 10px; }
 	div#container_box { float: right; width: calc(100% - 200px - 20px); }
 	aside ul li { margin-bottom: 10px; list-style: none; }
</style>
</head>
<body>
	<c:import url="../header.jsp"/>	
	<section id="container">
		<aside>
			<c:import url="../aside.jsp"/>				
		</aside>
		<div id="container_box">
		<h3>장바구니</h3>
			<div>
				<table border="1" style="width: 90%;">
					<tr>
						<th>상품선택</th><th colspan="2">상품명</th><th>대여가격</th><th>대여가능여부</th><th>선택</th>
					</tr>
					<c:if test="${ cartList.size() == 0 }">
						<tr><th colspan="5">장바구니가 비어 있습니다</th></tr>
					</c:if>
					<c:forEach var="dto" items="${ cartList }">
						<tr>
							<td><input type="checkbox"></td>
							<td colspan="2"><img src="${ dto.cart_photo }" style="width: 50px; height: 50px">${ dto.product_name }</td>
							<td>${ dto.payment_total }</td>
							<td>${ dto.cart_state }</td>
							<td>
								<button type="button" onclick="#">대여</button>
								<button type="button" onclick="#">삭제</button>
							</td>
						</tr>
					</c:forEach>
					<tr>
						<td colspan="6">
							<c:forEach	var="num" begin="1" end="${ repeat }">
								<a href="${ contextPath }/mypage/myCart?num=${ num }">[${ num }]</a>
							</c:forEach>
							<button type="button">선택 상품 주문</button>
							<button type="button">전체 상품 주문</button>
						</td>
					</tr>
				</table>
			</div>
			<div>
				
			</div>
		</div>
	</section>
	<c:import url="../footer.jsp"/>
	
	<!-- Bootstrap core JS-->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>

	<!-- Core theme JS-->
	<script src="js/scripts.js"></script>
</body>
</html>