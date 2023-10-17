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
	String question [] = {"설문 : 1. 다른 사람들에게 자신을 소개하는 것을 어려워합니다. ",
			"설문 : 2. 종종 주변을 무시하거나 잊어 버리는 생각에 빠지곤 합니다. ",
			"설문 : 3. 이메일에 가능한 빨리 회신하려고 하고 지저분한 편지함을 참을 수 없습니다.",
			"설문 : 4. 중압감을 받을 때에도 쉽게 침착하게 집중력을 유지할 수 있습니다.",
			"설문 : 5. 보통 대화를 먼저 시작하지 않습니다.",
			"설문 : 6. 순전히 호기심 때문에 행동을 하는 경우는 거의 없습니다."}; 
	String answer [] = {"매우 그렇다","그렇다","보통이다","아니다","매우 아니다"};
	int solve[]={1,1,1,2,1,2};
	int i=0;
	int j=1;
	String groupname="";
	String selname="";
%>
<form method=post action="39_설문응답2.jsp">
<table>
	<%
		for(String data : question){
			groupname = "mind"+i;
	%>
			<tr>
				<td colspan=5>설문 : "<%= data %>"</td>
			</tr>
			<tr>
				<%
					for(String str : answer){
						if(solve[i]==1){ 
							selname="sel"+j;}
						else{
							int order = 6-j;
							selname="sel"+order;
						}
				%>
						<td><input type="radio" name=<%=groupname %> value=<%=selname %>> <label><%=str%></label></td>
						<%
						j+=1;
					}
					%>
			</tr>
			<%
			j=1;
			i+=1; // i값의 의미는 문항 수 mind1, mind2 ...... mind6
		}
	i=-1;
	%>	 
</table>
<!--  <input type="hidden" name="mind_count"  value="<%=i %>">-->
<input type="submit" value="전송">
</form>
</body>
</html>