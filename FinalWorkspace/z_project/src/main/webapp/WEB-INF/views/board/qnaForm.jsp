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
	aside { float: left; width: 200px; padding: 0 0 0 5px; }
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
<<<<<<< HEAD
<<<<<<< HEAD:FinalWorkspace/z_project/src/main/webapp/WEB-INF/views/board/qnaForm.jsp
=======
>>>>>>> kim
		<h3>문의글 작성</h3>
			<form action="${ contextPath }/board/qnaSave" method="post" enctype="multipart/form-data">
				<b>작성자</b><br>
				<input type="text" name="member_id" value="" readonly><hr> <!-- 읽기 전용, 수정 불가 -->
				<b>제목</b><br>
				<input type="text" name="enquiry_subject" size="50"><hr>
				<b>내용</b><br>
				<textarea rows="10" cols="50" name="enquiry_content"></textarea><hr>
				<input type="submit" value="글쓰기">
				<input type="button" value="취소" onclick="history.back()">
			</form>
			
<<<<<<< HEAD
=======
		<h3>문의 수정</h3>
			<div>
				<table border="1">
					<tr><td><img src="" style="width: 50px; height: 50px"></td><td>상품명</td></tr>
					<tr><td>아이디 ( 수정불가 )</td></tr>
					<tr><td><textarea rows="" cols="" placeholder="내용을 입력해주세요"></textarea></td></tr>
					<tr><th colspan="2">
						<button type="button" onclick="#">수정</button>
						<button type="button" onclick="history.back()">취소</button>
				</table>
			</div>
>>>>>>> kim:FinalWorkspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/z_project/WEB-INF/views/mypage/enquiryForm.jsp
=======
>>>>>>> kim
		</div>
	</section>
	<c:import url="../footer.jsp"/>
	
	<!-- Bootstrap core JS-->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>

	<!-- Core theme JS-->
	<script src="js/scripts.js"></script>
</body>
</html>