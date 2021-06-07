<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">



<style type="text/css">
	.wrap{width: 1200px;height: 400px; margin: -490px 0 0 240px;}
	.button{margin-left: 1000px;}
	.container{margin-top: 20px;}
	#b3{margin-top: 10px; margin-left: 10px;}
	.t{width: 1500px; height: 1000px;  margin: auto;}
</style>
<script type="text/javascript">
	function input() {
		location.href='adminProductInput'
	}
</script>
</head>
<body>
	<c:import url="../header.jsp"/>	
	<div class="t">
<jsp:include page="../adminCategory/category.jsp" />
<div class="wrap">
	<h1 >상품관리</h1>
	<div class="button">
		<button type="button" class="btn btn-outline-primary" id="b1" onclick="">선택삭제</button>
		<button type="button" class="btn btn-outline-primary" id="b2" onclick="">전체삭제</button>
	</div>
	
	<div class="container">        
	  <table class="table table-striped">
	    <thead>
	      <tr>
	      	<th></th>
	        <th>상품번호</th>
	        <th>상품명</th>
	        <th>상품가격</th>
	        <th>등록일자</th>
	      </tr>
	    </thead>
	    <tbody>
	    <c:forEach var="#" items="#">
	      <tr>
	      	<td><input type="checkbox" name="choice"></td>
	        <td>123</td><!-- db에 있는 값 가져오기 -->
	        <td><a href="adminProductModify">[삼성전자] 갤럭시 노트9</a></td>
	        <td>20000원</td>
	        <td>21-05-13</td>
	      </tr>
	     </c:forEach>
	    </tbody>
	  </table>
	</div>
	<button type="button" class="btn btn-outline-primary" id="b3" onclick="input()">상품등록</button>
	
</div>
</div>
	<c:import url="../footer.jsp"/>
	
	<!-- Bootstrap core JS-->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>

	<!-- Core theme JS-->
	<script src="js/scripts.js"></script>
</body>
</html>