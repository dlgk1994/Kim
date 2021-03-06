<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style type="text/css">
	* {margin: 0; }
	.wrap{width: 1000px; margin: auto; }
	nav ul{list-style: none; display: flex;   justify-content: flex-end;}
	nav ul li { margin: 0 3px; padding: 10px 10px;  }
	nav ul li a { text-decoration: none; color: black; font-size: 13px;}
	nav ul li a:hover{color:orange;padding-bottom: 3px;
		border-bottom: 1px solid orange; transition:all 0.25s;}
	
	.title {margin: 20px auto;  color: black; text-align: center; font-size: 50px; }
	
	.search{position: relative; text-align: center;margin: 0 auto; }
	
	
	.category{list-style: none; display: flex; margin: 0 auto; }
	category ul li{margin: 0 3px; padding: 10px 30px;}
	category ul li a{text-decoration: none; color: black;  }
	category ul li a:hover{
		color:blue;padding-bottom: 3px;/*a태그 밑줄과 글씨 간격*/
		border-bottom: 1px solid blue; transition:all 0.25s;
		text-decoration: none;
	}
	
	
	.searchText{
		width: 300px; height: 39px;  border:4px solid #4ea0d8;  
		border-radius: 10px; outline: none;  margin: 0 auto;
		}
	#searchButton{ margin: 0 auto;}
	
	
</style>
</head>
<body>
<div class="wrap">
	
	<nav>
		<ul>
			<li>
				<a href="#">로그인</a>
			</li>
			<li>
				<a href="#">회원가입</a>
			</li>
			<li>
				<a href="#">마이페이지</a>
			</li>
			<li>
				<a href="#">장바구니</a>
			</li>
			
		</ul>
	</nav>
	<header class="title">	
		전자기기 대여사이트
	</header>
	<div class="search">
		<form action="">
			<input class="searchText" type="text">
			
			<button type="button" class="btn btn-outline-primary" id="searchButton">검색</button>
		</form>
	</div>

	
	<category>
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
	</category>
	
</div>
</body>
</html>



































