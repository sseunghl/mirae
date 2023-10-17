package com.sungjuk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SysloginServlet")
public class SysloginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SysloginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		SysloginDao dao=new SysloginDao();
		
		String userID=request.getParameter("userID");
		String password=request.getParameter("password");
		
		String user = request.getParameter("user");

		String pwd = request.getParameter("pwd");
		if(userID.equals(user) && password.equals(pwd)) { //성공, //Select,update,delete

			HttpSession session = request.getSession(); //세션 : 새로운 유저마다 생성, 로그아웃하고 사이트 나갈 때까지 유지

			session.setAttribute("user", "korea");

			session.setMaxInactiveInterval(60); //setMaxInactiveInterval(30*60) : 30분까지만 유지

			Cookie userName = new Cookie("user",user); //Cookie : 웹 브라우저에 저장

			userName.setMaxAge(60); //setMaxAge(30*60) : 30분까지만 저장

			response.addCookie(userName); //보내기만하면 웹 브라우저에서 자동 저장

			//response.sendRedirect("LoginSuccess.jsp");
			response.sendRedirect("sungjukmenu.jsp");
		}

		else { //실패

			//chainning

			RequestDispatcher rd = getServletContext().getRequestDispatcher("/loginmenu.html");

			PrintWriter out = response.getWriter(); //출력 객체 생성

			//두개의 결과를 결합해서 출력

			out.println("<font color=red>id와 password가 잘못되었습니다.</font>"); 

			rd.include(request, response); //include : 

		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
