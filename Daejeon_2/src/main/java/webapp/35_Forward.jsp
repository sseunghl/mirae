<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name = "홍성윤";
	String bloodtype = request.getParameter("bloodtype");
%>
<jsp:forward page='<%=bloodtype + ".jsp"%>'>
	<jsp:param name="name"  value="<%=name%>"  />
</jsp:forward>