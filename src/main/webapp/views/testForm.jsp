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
<h2>글 작성</h2>
<form action="insertOk">
	<table>
		<tr>
		<tr>
			<tr>
				<th>제목</th>
				<td><input type="text" name="boardtitle" 
							id="boardtitle" /></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea rows="20" cols="60" name="boardcontent" 
							id="boardcontent" /></textarea></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><input type="text" name="boardwrite" 
							id="boardwrite" /></td>
			</tr>
			<tr>
				<td colspan="2">
				<input type="submit" value="입력" id="btn"/>
				</td>
			</tr>
	</table>
</form>
</body>
</html>