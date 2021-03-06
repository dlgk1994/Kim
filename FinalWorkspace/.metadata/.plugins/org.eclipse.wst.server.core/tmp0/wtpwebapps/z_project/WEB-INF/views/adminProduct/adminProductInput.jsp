<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<!-- 글 입력 창 -->
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<!-- include summernote css/js -->
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>



    
    
<style type="text/css">
	.wrap{width: 1200px;height: 800px; margin: -490px 0 0 140px;}
	.t{width: 1500px; height: 1000px;  margin: auto;}
	.subTitle{margin-left: 450px; font-size: 40px;}
	.iTitle{margin: 20px 0 0 100px; height: 20px; }
	/* .#ProName{margin: 100px 0 0 500px} */

	.inpuptTile{width: 400px;}
	.t{width: 1500px; height: 1000px;  margin: auto; }
	.category1{margin: 20px 0 0 100px; border: 1px solid black;}
	.category2{margin: 40px 0 0 100px; border: 1px solid black;}
	
	.thumbnail{width:150px; height:200px; margin: -300px 0 0 900px; }
	
	
	.summernote1{width: 1000px; margin: 60px 0 0 100px; }
	
	.file{margin: 0 0 0 100px;}
	
	.button{margin: 10px 0 0 900px;}
	#ok{font-size: 16px;}
	#cancel{font-size: 16px;}
</style>

<script type="text/javascript">
	//summernoet
	$(document).ready(function() { /* 이거 없으면 summernote 없어짐 */
	  $('#summernote').summernote();
	});
	
	
	// 취소버튼
	function removeCheck() {
		 if (confirm("등록 취소하시겠습니까?") == true){    //확인
			 location.href='adminProductList'
		 }else{   //취소
		     return false;
		 }
		}

	//사진 업로드
	function readURL(input) {
		var file = input.files[0] // 파일에 대한 정보를 가지고 잇음
		if(file !=''){
			var reader = new FileReader() //첨부 사진 파일 읽기 위해
			reader.readAsDataURL(file) //파일의 정보를 토대로 파일을 읽고
			reader.onload = function(e) { //파일 로드한 값을 표현
				//e : 이벤트 안에 result값이 파일의 정보를 가지고 있다
				$("#preview").attr('src', e.target.result)
			}
		}
			
	}
	function readURL2(input) {
		var file = input.files[0] // 파일에 대한 정보를 가지고 잇음
		if(file !=''){
			var reader = new FileReader() //첨부 사진 파일 읽기 위해
			reader.readAsDataURL(file) //파일의 정보를 토대로 파일을 읽고
			reader.onload = function(e) { //파일 로드한 값을 표현
				//e : 이벤트 안에 result값이 파일의 정보를 가지고 있다
				$("#preview2").attr('src', e.target.result)
			}
		}
			
	}
	function productSave() {
		location.href='productSave'
	}
	
	

</script>
</head>
<body>
<jsp:include page="../header.jsp" />
<div class="t">
<jsp:include page="../adminCategory/category.jsp" />
	
<div class="wrap">
	<h1 class="subTitle" >상품등록</h1><!--                                             입력값 전달 -->
	<form action="${contextPath }/adminProduct/productSave" method="post" enctype="multipart/form-data">
		<div class="iTitle">
			글제목<br>
			<input type="text" name=productTitle class="inpuptTile">
		</div>
		
		<div id="ProName" style="margin: 50px 0 0 100px;">
			상품명<br>
			<input type="text" name="productName" class="inpuptTile">
		</div>
		
		<div>
			<select name="productCategory" class="category1">
				<option value="0">카테고리
				<option value="휴대폰">휴대폰
				<option value="스마트워치">스마트 워치
				<option value="블루투스 이어폰">블루투스 이어폰
				<option value="태블릿PC">태블릿PC
			</select>
		</div>
		
		<div>
			<select name="productCompany" class="category2">
				<option value="0">제조사
				<option value="삼성">삼성
				<option value="LG">LG
			</select>
		</div>
		
		<div style="margin: 10px 0 0 100px;">
			상품코드<br>
			<input type="text" name="productNum">
		</div>
		
		<div style="margin: 30px 0 0 100px;">
			상품가격<br>
			<input type="text" name="productPee">원
		</div>
		
		<div style="margin: 10px 0 0 100px; height: 100px;">
			상품수량<br>
			<input type="text" name="productQuantity">개
		</div>
		<div class="thumbnail" >
			<img alt="선택된 이미지 없음" src="D:\photo" id="preview" style="width:150px; height:200px;">
			<input type="file" name="productThumbnail" onchange="readURL(this);">
			<!-- src에 사진 저장할 경로(정하고) 입력 저장방법 알아보기-->
		</div>
		
		<div class="summernote1">
			<textarea rows="5" cols="5" id="summernote" name="productContent" placeholder="내용작성"></textarea>
		</div>
		
		
		<!-- <div class="file">		
			<input type="file" name="product_photo1" onchange="readURL2(this);">
		</div> -->
		
		
		<div class="button">
			<input type="submit" value="등록" class="btn btn-outline-primary" id="ok">
			<button type="button" class="btn btn-outline-primary" id="cancel" onclick="removeCheck()">취소</button>
		</div> 
	</form>
</div>
	</div>
<jsp:include page="../footer.jsp" />
	<!-- Bootstrap core JS-->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>

	<!-- Core theme JS-->
	<script src="js/scripts.js"></script>
</body>
</html>




































