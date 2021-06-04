<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<c:set var="contextPath" value="<%=request.getContextPath()%>"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Insert title here</title>

<!-- Favicon-->
<link rel="icon" type="image/x-icon" href="assets/favicon.ico" />

<!-- Bootstrap icons-->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css"
	rel="stylesheet" />
	
<!-- Core theme CSS (includes Bootstrap)-->
<link href="${contextPath }/resources/css/styles.css" rel="stylesheet" />
<style type="text/css">
	.searchText{
		width: 300px; height: 39px;  border:4px solid #4ea0d8;  
		border-radius: 10px; outline: none;  margin: 0 auto;
		}
	#searchButton{ margin: 0 auto;}
	.search{position: relative; text-align: center; top:20px; }
	
	.category{list-style: none; display: flex; margin: 30px 0 0 350px; top:20px; }
	div ul li{margin: 0 3px; padding: 10px 30px;}
	div ul li a{text-decoration: none; color: black;  }
	div ul li a:hover{
		color:blue;padding-bottom: 3px;/*a태그 밑줄과 글씨 간격*/
		border-bottom: 1px solid blue; transition:all 0.25s;
		text-decoration: none;
	}
	
	
</style>
</head>
<body>
	<!-- Navigation-->
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container px-4 px-lg-5">
			<a class="navbar-brand" href="#!">logo 넣는 곳</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
					<li class="nav-item">
						<a class="nav-link active" aria-current="page" href="${ contextPath }/main">Home</a></li>
					<li class="nav-item">
						<a class="nav-link" href="#!">login</a></li>
					<li class="nav-item">
						<a class="nav-link" href="#!">join</a></li>
					<li class="nav-item">
						<a class="nav-link" href="${ contextPath }/mypage/myCart">myPage</a></li>
					<li class="nav-item dropdown">
						<a class="nav-link dropdown-toggle" id="navbarDropdown" href="#"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">Shop</a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item" href="#!">All Products</a></li>
							<li><hr class="dropdown-divider" /></li>
							<li><a class="dropdown-item" href="#!">Popular Items</a></li>
							<li><a class="dropdown-item" href="#!">New Arrivals</a></li>
						</ul></li>
					
				</ul>
				<form class="d-flex" action="${ contextPath }/mypage/myCart">
					<button class="btn btn-outline-dark" type="submit">
						<i class="bi-cart-fill me-1"></i> Cart 
						<span class="badge bg-dark text-white ms-1 rounded-pill">0</span>
					</button>
				</form>
			</div>
		</div>
	</nav>
	
	<!-- Header-->
	<header class="bg-dark py-5">
		<div class="container px-4 px-lg-5 my-5">
			<div class="text-center text-white">
				<h1 class="display-4 fw-bolder">전자기기 대여 사이트</h1>
				<p class="lead fw-normal text-white-50 mb-0">With this shop
					homepage template</p>
			</div>
		</div>
	</header>
	<span class="search">
		<form action="">
			<input class="searchText" type="text">
			
			<button type="button" class="btn btn-outline-primary" id="searchButton">검색</button>
		</form>
	</span>
	<div class="category1">
		<ul class="category">
			<li>
				<a href="#">휴대폰</a>
			</li>
			<li>
				<a href="#">테블릿PC</a>
			</li>
			<li>
				<a href="#">노트북</a>
			</li>
			<li>
				<a href="#">카메라</a>
			</li>
			<li>
				<a href="#">스마트 워치</a>
			</li>
			<li>
				<a href="#">전동 퀵보드</a>
			</li>
			<li>
				<a href="#">카메라</a>
			</li>
			
		</ul>
	</div>
	
	
	<!-- Bootstrap core JS-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
	
	<!-- Core theme JS-->
	<script src="js/scripts.js"></script>
</body>
</html>
