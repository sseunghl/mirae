package com.emp.mariadb;

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


@WebServlet("/EmpProcess")
public class EmpProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public EmpProcess() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String str= request.getParameter("action");//CRUD를 구분하기 위해 전달
		request.setCharacterEncoding("UTF-8");//utf-8로 변환해라
		if(str.equals("insert")) {//입력 id,name, salary를 받아라
			int id= Integer.parseInt(request.getParameter("id"),10);
			String name= request.getParameter("name");
			float salary = Float.parseFloat(request.getParameter("salary"));
			//jsp 코드를 복잡하게 하지 않고 데이터만 전달
			EmpDTO dto = new EmpDTO();
			dto.setId(id);
			dto.setName(name);
			dto.setSalary(salary);
			
			EmpDAO dao=new EmpDAO();
			boolean bool = dao.registerEmp(dto);
			PrintWriter out= response.getWriter();
			// 전달할 데이터가 없기 때문에 간단한 Redirect 호출
			if(bool) response.sendRedirect("./Success.html");// 다 처리한 다음에 Success.html로 넘어감, 웹페이지로 다시 출력
			else out.println("입력에 실패하였습니다.");
			
		}
		else if(str.equals("select")) {
			EmpDAO dao = new EmpDAO();//db접속
			ArrayList<EmpDTO> vec = new ArrayList<EmpDTO>();
			vec = dao.getRecords(1,5);//db에 접속해서 가져온 데이터,getRecord는 empDao에 있음 
			request.setAttribute("data1", vec);// 속성으로 데이터를 추가, dispatcher는 request를 자동으로 넘겨줌
			// RequestDispatcher 객체를 얻어서 forwqrding하는 절차
			ServletContext context = this.getServletContext();//context: 환경, 설정정보
			//응답페이지로 데이터 전달
			RequestDispatcher dispatcher=
					context.getRequestDispatcher("/43_showemp.jsp");//dispatcher에서 자동으로 넘어옴
			dispatcher.forward(request, response);//이 값이 43_showemp(응답페이지)로 감
			
		}
		else if(str.equals("update")) {
			EmpDAO dao = new EmpDAO();//db 접속
			
			int id=Integer.parseInt(request.getParameter("id"));
			String name=request.getParameter("name");
			float salary=Float.parseFloat(request.getParameter("salary"));
			EmpDTO dto = new EmpDTO();
			dto.setName(name);
			dto.setSalary(salary);
			dto.setId(id);
			boolean bool = dao.updateEmp(dto);
			PrintWriter out= response.getWriter();
			// 전달할 데이터가 없기 때문에 간단한 Redirect 호출
			if(bool) {response.sendRedirect("./Success.html");}
			else {out.println("입력에 실패하였습니다.");
				  out.println("<a href = '43_EmpMenu.html'>메뉴로 돌아가기</a>");
			}
			
		}
		else if(str.equals("delete")){
			EmpDAO dao = new EmpDAO();//db 접속
			String name = request.getParameter("name");
			EmpDTO dto = new EmpDTO();
			dto.setName(name);
			
			boolean bool = dao.deleteEmp(dto);
			PrintWriter out= response.getWriter();
			// 전달할 데이터가 없기 때문에 간단한 Redirect 호출
			if(bool) {response.sendRedirect("./Success.html");}
			else {out.println("입력에 실패하였습니다.");
				  
			}
			
		}
		else {
			response.sendRedirect("43_EmpMenu.html");//4개의 메뉴가 있는 페이지를 작성
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
