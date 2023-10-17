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
	out.println("환영 : "+request.getParameter("uname"));
//request.getParameter(a) : a라는 이름을 가진 것의 value 값을 가져와라
%>
<ul>
	<li><p><b>이름:</b>
		<%=request.getParameter("name") %></p>
	</li>
</ul>
<% // 입출력하는 데이터와 네트워크 전송데이터는 문자열
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	int num3 = num1+num2;
	out.println("두수의 합 = "+num3);
%>
</body>
</html>