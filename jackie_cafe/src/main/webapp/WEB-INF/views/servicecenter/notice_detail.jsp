<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="row" style="margin-bottom:20px; margin-left:1px;">
<div class="col-lg-12">
<h1 class="page-header">상세 페이지</h1>
</div>
</div>

<div class="panel" style="margin-left:1px;">
<div id="contAreaBox">
<div class="panel">
<div class="panel-body">
<form role="form" action="/board/create_action" method="post">
<div class="table-responsive" style="text-align:center;">
<table id="datatable-scroller"
	class="table table-bordered tbl_Form">
	<caption></caption>
	<colgroup>
		<col width="250px" />
		<col />
	</colgroup>
	<tbody>
		<tr>
			<th class="active" >분류</th>
			<td>
			${noticeContents. CATEGORY}
			</td>
		</tr>
		<tr>
			<th class="active">제목</th>
			<td>
			${noticeContents. TITLE}
			</td>
		</tr>
		<tr>
			<th class="active" >내용</th>
			<td>
			${noticeContents. CONTENTS}
			</td>
		</tr>
		<tr>
			<th class="active" >생성일</th>
			<td>
			${noticeContents. CREAT_DT}
			</td>
		</tr>
		
	</tbody>
</table>
</div>

<div style="margin-left:1px;">
</div>
</form>
</div>
</div>
</div>
</div>
<img src="${pageContext.request.contextPath}/image/${noticeContents. IDX}.jpg" />
</body>
</html>