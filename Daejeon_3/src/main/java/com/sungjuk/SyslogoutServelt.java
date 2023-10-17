package com.sungjuk;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SyslogoutServelt")
public class SyslogoutServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SyslogoutServelt() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//response.getWriter().append("Served at: ").append(request.getContextPath());

		response.setContentType("text/html");

		Cookie[] cookies = request.getCookies();

		

		if(cookies != null){

			for(Cookie cookie : cookies){

				if(cookie.getName().equals("JSESSIONID")) {

					System.out.println("JSESSIONID ="+cookie.getValue());

					break;

				}

			}

	}

		HttpSession session = request.getSession(false);

		System.out.println("User = "+session.getAttribute("user"));

		if(session != null) {

			session.invalidate();

			response.sendRedirect("loginmenu.html");

		}

		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
