<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>수정</h3>
	<div>
		<p>
		<center>
		<form action="42_update_receive.jsp">
		<table width="40%" border="1">
			<caption><h3>이름 급여 수정 !</h3></caption>
			<tr>
				<th width="30%">번호</th>
				<td width="70%" align="center">
				<input type="text" name="id" size="27%"/>
				</td>
			</tr>
			<tr>
				<th width="30%">이름</th>
				<td width="70%" align="center">
				<input type="text" name="name" size="27%"/>
				</td>
			</tr>
			<tr>
				<th width="30%">급여</th>
				<td width="70%" align="center">
				<input type="text" name="salary" size="27%"/>
				</td>
			</tr>
		</table>
		<br/>
		<table>
			<tr>
				<td align="right">
				<input type="hidden" id="action" name="action" value="update">
				<input type="submit" value="수정 시작"/>
				</td>
			</tr>
		</table>
		</form>
		</center>
		</p>
	</div>
</body>
</html>