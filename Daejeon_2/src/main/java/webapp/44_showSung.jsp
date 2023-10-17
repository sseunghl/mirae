<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*,com.student.mariadb.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	ArrayList<StudentDTO>vec= new ArrayList<StudentDTO>();
	vec= (ArrayList<StudentDTO>) request.getAttribute("data1");
%>
<h3>주소록</h3>
<a href = "http://localhost:8080/Daejeon_2/44_sungMenu.html"> 메뉴로 돌아가기</a>
<table border=1>
	<tr>
		<th>번호</th><th>이름</th><th>국어</th><th>수학</th><th>영어</th><th>학교번호</th>
	</tr>
<%
Iterator iterator = vec.iterator();
while (iterator.hasNext()){
	StudentDTO dto = (StudentDTO) iterator.next();

%>	
<tr>
	<td> <%= dto.getBunho() %></td>
	<td> <%=dto.getName() %> </td>
	<td> <%=dto.getKor() %></td>
	<td> <%=dto.getMat() %></td>
	<td> <%=dto.getEng() %></td>
	<td> <%=dto.getSchoolcode() %></td>
	
</tr>
<% }%>
</body>
</html>