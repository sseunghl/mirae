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
String name=request.getParameter("uname");
out.print("Welcome "+name);
//setAttribute(name,value) : name(내가 임의로 설정 가능)의 속성값을 value로 지정
pageContext.setAttribute("user",name,PageContext.SESSION_SCOPE);
%>
</body>
</html>