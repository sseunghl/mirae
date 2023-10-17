package com.sungjuk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SysnewlogServlet")
public class SysnewlogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public SysnewlogServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());String str = request.getParameter("action");
		String str = request.getParameter("action");
		if(str.equals("insert")) {
			String userID = request.getParameter("name");
			String password = request.getParameter("password");
			String name=request.getParameter("name");
			
			SysloginDto dto = new SysloginDto();
			dto.setUserID(userID);
			dto.setPassword(password);
			dto.setName(name);
			
			SysloginDao dao = new SysloginDao();
			int result=dao.registerUser(dto);
			PrintWriter out = response.getWriter(); //out 객체
			if(result==0) response.sendRedirect("success.html");
			else out.println("입력에 실패하였습니다.");
			
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
