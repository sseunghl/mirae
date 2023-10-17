package com.student.mariadb;

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

@WebServlet("/StudentProcess")
public class StudentProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public StudentProcess() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String str= request.getParameter("action");//CRUD를 구분하기 위해 전달
		request.setCharacterEncoding("UTF-8");//utf-8로 변환해라
		if(str.equals("insert")) {//입력 id,name, salary를 받아라
			
			String name= request.getParameter("name");
			int kor = Integer.parseInt(request.getParameter("kor"));
			int mat = Integer.parseInt(request.getParameter("mat"));
			int eng = Integer.parseInt(request.getParameter("eng"));
			String schoolcode=request.getParameter("schoolcode");
			//jsp 코드를 복잡하게 하지 않고 데이터만 전달
			StudentDTO dto = new StudentDTO();
			
			dto.setName(name);
			dto.setKor(kor);
			dto.setMat(mat);
			dto.setEng(eng);
			dto.setSchoolcode(schoolcode);
			
			StudentDAO dao=new StudentDAO();
			boolean bool = dao.registerStu(dto);
			PrintWriter out= response.getWriter();
			// 전달할 데이터가 없기 때문에 간단한 Redirect 호출
			if(bool) response.sendRedirect("./StuSuccess.html");// 다 처리한 다음에 Success.html로 넘어감, 웹페이지로 다시 출력
			else out.println("입력에 실패하였습니다.");
			
		}
		else if(str.equals("select")) {
			StudentDAO dao = new StudentDAO();//db접속
			ArrayList<StudentDTO> vec = new ArrayList<StudentDTO>();
			vec = dao.getRecords(1,5);//db에 접속해서 가져온 데이터,getRecord는 empDao에 있음 
			request.setAttribute("data1", vec);// 속성으로 데이터를 추가, dispatcher는 request를 자동으로 넘겨줌
			// RequestDispatcher 객체를 얻어서 forwqrding하는 절차
			ServletContext context = this.getServletContext();//context: 환경, 설정정보
			//응답페이지로 데이터 전달
			RequestDispatcher dispatcher=
					context.getRequestDispatcher("/44_showSung.jsp");//dispatcher에서 자동으로 넘어옴
			dispatcher.forward(request, response);//이 값이 43_showemp(응답페이지)로 감
			
		}
		else if(str.equals("update")) {
			StudentDAO dao = new StudentDAO();//db 접속
			
			int bunho=Integer.parseInt(request.getParameter("BUNHO"));
			String name=request.getParameter("name");
			int kor=Integer.parseInt(request.getParameter("kor"));
			int mat=Integer.parseInt(request.getParameter("mat"));
			int eng=Integer.parseInt(request.getParameter("eng"));
			String schoolcode=request.getParameter("schoolcode");
			
			StudentDTO dto = new StudentDTO();
			dto.setName(name);
			dto.setKor(kor);
			dto.setMat(mat);
			dto.setEng(eng);
			
			
			
			boolean bool = dao.updateStu(dto);
			PrintWriter out= response.getWriter();
			// 전달할 데이터가 없기 때문에 간단한 Redirect 호출
			if(bool) {response.sendRedirect("./StuSuccess.html");}
			else {out.println("입력에 실패하였습니다.");
				  out.println("<a href = '44_sungMenu.html'>메뉴로 돌아가기</a>");
			}
			
		}
		else if(str.equals("delete")){
			StudentDAO dao = new StudentDAO();//db 접속
			String name = request.getParameter("name");
			StudentDTO dto = new StudentDTO();
			dto.setName(name);
			
			boolean bool = dao.deleteStu(dto);
			PrintWriter out= response.getWriter();
			// 전달할 데이터가 없기 때문에 간단한 Redirect 호출
			if(bool) {response.sendRedirect("./StuSuccess.html");}
			else {out.println("입력에 실패하였습니다.");
				  
			}
			
		}
		else {
			response.sendRedirect("44_sungMenu.html");//4개의 메뉴가 있는 페이지를 작성
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
