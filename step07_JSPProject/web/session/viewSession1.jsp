<%@page import="java.util.Enumeration"%>
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
		Enumeration ob = session.getAttributeNames();
		while (ob.hasMoreElements()) {
			String name = (String) ob.nextElement();
			String value = (String) session.getAttribute(name);

			out.print("session name: " + name + "<br>");
			out.print("session value: " + value + "<br>");
			out.print("session id: " + session.getId() + "<br><br>");
			
// 			if(name.equals("logId1")){
// 				session.removeAttribute("logId1");
// 			} 
		}
		session.invalidate(); //모든 세션 종료
	%>
	<a href="viewSession2.jsp">다음페이지</a>
</body>
</html>