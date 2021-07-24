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
<form name="form1" action="updateOk">
	<table border="1">
		<caption>글 수정</caption>
		<tr>
			<td>제목</td>
			<td><input type="text" name="boardtitle" id="boardtitle" 
				value="<c:out value="${data.boardtitle }" /> "></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea rows="20" cols="60" name="boardcontent" id="boardcontent" /><c:out value="${data.boardcontent }"/></textarea></td>
		</tr>
	</table>
	<input type="hidden" name="boardno" 
		value="<c:out value="${data.boardno }" /> ">
	<a href="#" onclick="form1.submit()">저장</a>
</form>
</body>
</html>