package com.sungjuk;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SungjukServlet") // <- SungjukServlet = new SungjukServlet();
public class SungjukServlet extends HttpServlet { //servlet에 대한 인스턴스
	private static final long serialVersionUID = 1L;

    public SungjukServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		String str = request.getParameter("action");
		
		if(str.equals("insert")) {
			String name = request.getParameter("name");
			int kor = Integer.parseInt(request.getParameter("kor"));
			int mat = Integer.parseInt(request.getParameter("mat"));
			int eng = Integer.parseInt(request.getParameter("eng"));
			String schoolcode = request.getParameter("schoolcode");
			
			SungjukDto dto = new SungjukDto();
			dto.setName(name);
			dto.setKor(kor);
			dto.setMat(mat);
			dto.setEng(eng);
			dto.setSchoolcode(schoolcode);
			
			SungjukDao dao = new SungjukDao();
			int result=dao.registerMember(dto);
			PrintWriter out = response.getWriter(); //out 객체
			if(result==0) response.sendRedirect("success.html");
			else out.println("입력에 실패하였습니다.");
			
		}
		else if(str.equals("select")) {
			//servlet에서 하는 일 : Dao 호출
			SungjukDao dao = new SungjukDao();
			ArrayList<SungjukDto> vec = new ArrayList<SungjukDto>();
			vec = dao.selectMember();
			request.setAttribute("studentsungjuk",	vec);
			//데이터 전달 방식 1. requestDispatcher 2. response.sendredirect
			ServletContext context = this.getServletContext();
			RequestDispatcher dispatcher = context.getRequestDispatcher("/showsungjuk.jsp");
			dispatcher.forward(request, response);
		}
		else if(str.equals("update")) {
			//번호 이름 국어 수학 영어
			SungjukDao dao = new SungjukDao();
			int bunho = Integer.parseInt(request.getParameter("bunho"));
			String name = request.getParameter("name");
			int kor = Integer.parseInt(request.getParameter("kor"));
			int mat = Integer.parseInt(request.getParameter("mat"));
			int eng = Integer.parseInt(request.getParameter("eng"));
			
			SungjukDto dto = new SungjukDto();
			dto.setBunho(bunho);
			dto.setName(name);
			dto.setKor(kor);
			dto.setMat(mat);
			dto.setEng(eng);
			
			int result = dao.updateMember(dto);
			PrintWriter out = response.getWriter();
			if(result==0)	response.sendRedirect("success.html");
			else out.println("수정 실패");
		}
		else if(str.equals("delete")) {
			String name = request.getParameter("name");
			SungjukDto dto = new SungjukDto();
			dto.setName(name);
			
			SungjukDao dao = new SungjukDao();
			int result = dao.deleteMember(dto);
			PrintWriter out = response.getWriter();
			if(result==0)	response.sendRedirect("success.html");
			else out.println("삭제 실패");
		}
		else response.sendRedirect("/sungjukmenu.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}