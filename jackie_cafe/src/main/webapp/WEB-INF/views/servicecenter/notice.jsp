<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>JACKIE CAFE</title>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
</head>
<style>
.container {
  display: grid;
  grid-template-columns: 1fr;
  grid-template-rows: auto;
  grid-gap: 10px;
}
</style>

<body>
 <%@ include file="/WEB-INF/views/menu.jsp" %>
 <%@ include file="/WEB-INF/views/login.jsp" %>
 
<div class="container">
<h1> </h1>
<table style="border:1px solid #ccc">
	<thead>
		<tr>
			<th scope="col">글번호</th>
			<th scope="col">분류</th>
			<th scope="col">제목</th>
			<th scope="col">등록일</th>
		</tr>
	</thead>
	<tbody>
		<c:choose>
			<c:when test="${fn:length(list) > 0}">
				<c:forEach items="${list }" var="row">
					<tr>
						<td>${row.IDX }</td>
						<td>${row.CATEGORY }</td>
						<td><a href = "/jackie_cafe/servicecenter/notice_detail.do?IDX=${row.IDX }">${row.TITLE }</a></td>
						<td>${row.CREAT_DT }</td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td>조회된 결과가 없습니다.</td>
				</tr>
			</c:otherwise>
		</c:choose>
	</tbody>
</table>
</div>
<button type="button" style="float: right;"onclick="location.href='/jackie_cafe/servicecenter/notice_write.do'">관리자 글 작성</button>
</body>
</html>