<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- summernote -->
<!-- include libraries(jQuery, bootstrap) -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<!-- include summernote css/js -->
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<script src="/js/summernote/summernote-lite.js"></script>
<script src="/js/summernote/lang/summernote-ko-KR.js"></script>

<link rel="stylesheet" href="/css/summernote/summernote-lite.css">



    
    
<style type="text/css">
	.wrap{width: 1200px;height: 800px; margin: -490px 0 0 140px;}
	.subTitle{margin-left: 100px;}
	.iTitle{margin: 20px 0 0 100px;}
	.inpuptTile{width: 400px;}
	.t{width: 1500px; height: 1000px;  margin: auto;}
	.category1{margin: 20px 0 0 100px; border: 1px solid black;}
	.category2{margin: 40px 0 0 100px; border: 1px solid black;}
	
	.thumbnail{width: 80px; height: 100px; border: 1px solid black; margin: -100px 0 0 900px;}
	.thumbnailFile{margin: 10px 0 0 900px;}
	
	.summernote1{width: 900px; margin: 40px 0 0 100px; }
	
	.file{margin: 0 0 0 100px;}
	
	.button{margin: 0 0 0 900px;}
	#ok{font-size: 16px;}
	#cancel{font-size: 16px;}
	.sumn{margin: 20px 0 0 100px;}
	
	.cate{font-size: 13pt; }
	.hed{font-size: 14pt; }
</style>

<script type="text/javascript">
	
	$(document).ready(function() {
		//여기 아래 부분
		$('#summernote').summernote({
			  height: 300,                 // 에디터 높이
			  width : 1000,
			  minHeight: null,             // 최소 높이
			  maxHeight: null,             // 최대 높이
			  focus: true,                  // 에디터 로딩후 포커스를 맞출지 여부
			  lang: "utf-8",					// 한글 설정
			  
	          
		});
	});
	
	function removeCheck() {
		 if (confirm("등록 취소하시겠습니까?") == true){    //확인
			 location.href='adminProductList'
		 }else{   //취소
		     return false;
		 }
		}

</script>
</head>
<body>
<div class="hed">
<c:import url="../header.jsp"/>	
</div>
<div class="t">

	<div class="cate">
		<jsp:include page="../adminCategory/category.jsp" />
	</div>
	<div class="wrap">
		<h1 class="subTitle">상품등록</h1>
		
		<div class="iTitle">
			<input type="text" name="title" class="inpuptTile">
		</div>
		<div>
			<select name="category1" class="category1" >
				<option value="0">카테고리
				<option value="1">휴대폰
				<option value="2">스마트 워치
				<option value="3">블루투스 이어폰
				<option value="4">태블릿PC
			</select>
		</div>
		
		<div>
			<select name="category2" class="category2">
				<option value="0">제조사
				<option value="1">삼성
				<option value="2">LG
				<option value="3">애플
				<option value="4">소니
			</select>
		</div>
		
		<div class="thumbnail">
			<img alt="" src="">
		</div>
		<div class="thumbnailFile">
		 <form id="form1" runat="server">
	        <input type='file' id="myFileUp" />
	     </form>
		</div>
		
		
		
		
		<!-- form 안에 에디터를 사용하는 경우 (보통 이경우를 많이 사용하는듯)-->
		<div class="sumn">
			<form method="post">
	  			<textarea id="summernote" name="editordata"></textarea>
			</form>	
		</div>
		
		<div class="file">
			<form id="form1" runat="server" name="file">
		    	<input type='file' id="myFileUp" />
		    </form>
		    <form id="form2" runat="server">
		    	<input type='file' id="myFileUp" />
		    </form>
		    <form id="form3" runat="server">
		    	<input type='file' id="myFileUp" />
		    </form>
		    <form id="form4" runat="server">
		    	<input type='file' id="myFileUp" />
		    </form>
		</div>
		
		
		<div class="button">
			<button type="button" class="btn btn-outline-primary" id="ok" onclick="">등록</button>
			<button type="button" class="btn btn-outline-primary" id="cancel" onclick="removeCheck()">취소</button>
		</div>
	</div>
</div>
<jsp:include page="../footer.jsp" />
	<!-- Bootstrap core JS-->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>

	<!-- Core theme JS-->
	<script src="js/scripts.js"></script>
</body>
</html>




































