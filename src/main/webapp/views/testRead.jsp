<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>boardRead.jsp</h2>
	<table border="1">
		<caption>상세보기</caption>
		<tr>
			<th>글번호</th>
			<td><c:out value="${data.boardno }"/></td>
		</tr>
		<tr>
			<th>제목</th>
			<td><c:out value="${data.boardtitle }"/></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><c:out value="${data.boardcontent }"/></td>
		</tr>
		<tr>
			<th>작성자</th>
			<td><c:out value="${data.boardwrite }"/></td>
		</tr>
		<tr>
			<th>날짜</th>
			<td><c:out value="${data.boarddate }"/></td>
		</tr>
	</table>
	<a href="#" onclick="history.back(-1)">돌아가기</a>
	<a href="testDelete?boardno=<c:out value="${data.boardno }" />">삭제</a>
	<a href="testUpdate?boardno=<c:out value="${data.boardno }" />">수정</a>

</body>
</html>