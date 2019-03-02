<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	request.setCharacterEncoding("UTF-8");//post방식의 한글처리
	
	String str = request.getParameter("str");
	String num = request.getParameter("num");
	String printword = "";
	
	int i = 0;
	while(i < Integer.parseInt(num)){	
		printword += str;
		i++;
	}
%>
<body>
<%=printword%>
</body>
</html>