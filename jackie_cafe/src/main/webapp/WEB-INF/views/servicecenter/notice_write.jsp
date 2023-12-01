<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JACKIE CAFE 공지사항 관리자 글 작성</title>
</head>
<body>
<div class = "container">
	<table>
		<thead>
			<tr>
				<th scope="col">대분류</th>
				<th scope="col">글제목</th>
				<th scope="col">글내용</th>
				<th scope="col">첨부파일</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<form action = "/jackie_cafe/servicecenter/notice_insert.do" method ="POST">
					<td><input type = "text" name ="CATEGORY"></td>
					<td><input type = "text" name ="TITLE"></td>
					<td><input type = "text" name ="CONTENTS"></td>
					<td><input type = "text" name ="ATCH_NM"></td>
					<td><input type = "submit" value = "저장"></td>
				</form>
		 	</tr>
		</tbody>
	</table>
</div>

</body>
</html>