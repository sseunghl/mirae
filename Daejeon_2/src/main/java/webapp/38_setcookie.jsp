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
	Cookie inname = new Cookie("inname", request.getParameter("inname"));
	Cookie inaddr = new Cookie("inaddr", request.getParameter("inaddr"));
	
	inname.setMaxAge(60*60*24); // 1일 저장
	inaddr.setMaxAge(60*60*24);
	//require (get 함수들만)
	response.addCookie(inname); //header 파일 : 포멧, 정보, 쿠키(set 함수)
	response.addCookie(inaddr);
%>
<ul>
	<li><p><b>이름 : </b>
		<%= request.getParameter("inname") %>
	</p></li>
	<li><p><b>주소 : </b>
		<%= request.getParameter("inaddr") %>
	</p></li>
</ul>
</body>
</html>