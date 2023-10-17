<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.lang.*, com.emp.mariadb.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//데이터 파싱
	int id=Integer.parseInt(request.getParameter("id"));
	String name=request.getParameter("name");
	float salary=Float.parseFloat(request.getParameter("salary"));
	//데이터 처리
	EmpDAO dao = new EmpDAO();
	EmpDTO dto = new EmpDTO();
	dto.setName(name);
	dto.setSalary(salary);
	dto.setId(id);
	Boolean bool = dao.updateEmp(dto);
%>
<%
	if(bool==false){%>
	<h3>수정에 실패하였습니다.</h3>
<%}else { %>
		<h3> 수정에 성공하였습니다.</h3>
<%}%>
</body>
</html>