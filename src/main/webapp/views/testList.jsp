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
<h2>게시판</h2>
<table border="1px">
	<thead>
		<tr>
		<th>글번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>날짜</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="i" items="${list }">
		<tr>
		<c:url var="link" value="testRead">
			<c:param name="boardno" value="${i.boardno }" />
		</c:url>
		<td><a href="${link }">${i.boardno }</a></td>
		<td>${i.boardtitle }</td>
		<td>${i.boardwrite }</td>
		<td>${i.boarddate }</td>
		</tr>
	</c:forEach>
	</tbody>
</table>
<a href="testInsert"><input type="button" value="글 작성" id="btn" ></a>
</body>
</html>