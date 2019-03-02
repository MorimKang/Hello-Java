<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String strId1 = "apple";
		String strId2 = "orange";
		
		/* 세션 설정 */
		session.setAttribute("logId1",strId1);
		session.setAttribute("logId2",strId2);
	%>
세션에 속성을 설정하였습니다<br>
<a href="viewSession1.jsp">세션정보확인</a>
</body>
</html>